from django.contrib import admin
from guardian.admin import GuardedModelAdmin

from documents.models import Correspondent
from documents.models import Document
from documents.models import DocumentType
from documents.models import Note
from documents.models import PaperlessTask
from documents.models import SavedView
from documents.models import SavedViewFilterRule
from documents.models import ShareLink
from documents.models import StoragePath
from documents.models import Tag


class CorrespondentAdmin(GuardedModelAdmin):
    list_display = ("name", "match", "matching_algorithm")
    list_filter = ("matching_algorithm",)
    list_editable = ("match", "matching_algorithm")


class TagAdmin(GuardedModelAdmin):
    list_display = ("name", "color", "match", "matching_algorithm")
    list_filter = ("color", "matching_algorithm")
    list_editable = ("color", "match", "matching_algorithm")


class DocumentTypeAdmin(GuardedModelAdmin):
    list_display = ("name", "match", "matching_algorithm")
    list_filter = ("matching_algorithm",)
    list_editable = ("match", "matching_algorithm")


class DocumentAdmin(GuardedModelAdmin):
    search_fields = ("correspondent__name", "title", "content", "tags__name")
    readonly_fields = (
        "added",
        "modified",
        "mime_type",
        "storage_type",
        "filename",
        "checksum",
        "archive_filename",
        "archive_checksum",
        "original_filename",
    )

    list_display_links = ("title",)

    list_display = ("id", "title", "mime_type", "filename", "archive_filename")

    list_filter = (
        ("mime_type"),
        ("archive_serial_number", admin.EmptyFieldListFilter),
        ("archive_filename", admin.EmptyFieldListFilter),
    )

    filter_horizontal = ("tags",)

    ordering = ["-id"]

    date_hierarchy = "created"

    def has_add_permission(self, request):
        return False

    def created_(self, obj):
        return obj.created.date().strftime("%Y-%m-%d")

    created_.short_description = "Created"

    def delete_queryset(self, request, queryset):
        from documents import index

        with index.open_index_writer() as writer:
            for o in queryset:
                index.remove_document(writer, o)

        super().delete_queryset(request, queryset)

    def delete_model(self, request, obj):
        from documents import index

        index.remove_document_from_index(obj)
        super().delete_model(request, obj)

    def save_model(self, request, obj, form, change):
        from documents import index

        index.add_or_update_document(obj)
        super().save_model(request, obj, form, change)


class RuleInline(admin.TabularInline):
    model = SavedViewFilterRule


class SavedViewAdmin(GuardedModelAdmin):
    list_display = ("name", "owner")

    inlines = [RuleInline]


class StoragePathInline(admin.TabularInline):
    model = StoragePath


class StoragePathAdmin(GuardedModelAdmin):
    list_display = ("name", "path", "match", "matching_algorithm")
    list_filter = ("path", "matching_algorithm")
    list_editable = ("path", "match", "matching_algorithm")


class TaskAdmin(admin.ModelAdmin):
    list_display = ("task_id", "task_file_name", "task_name", "date_done", "status")
    list_filter = ("status", "date_done", "task_file_name", "task_name")
    search_fields = ("task_name", "task_id", "status")
    readonly_fields = (
        "task_id",
        "task_file_name",
        "task_name",
        "status",
        "date_created",
        "date_started",
        "date_done",
        "result",
    )


class NotesAdmin(GuardedModelAdmin):
    list_display = ("user", "created", "note", "document")
    list_filter = ("created", "user")
    list_display_links = ("created",)


class ShareLinksAdmin(GuardedModelAdmin):
    list_display = ("created", "expiration", "document")
    list_filter = ("created", "expiration", "owner")
    list_display_links = ("created",)


admin.site.register(Correspondent, CorrespondentAdmin)
admin.site.register(Tag, TagAdmin)
admin.site.register(DocumentType, DocumentTypeAdmin)
admin.site.register(Document, DocumentAdmin)
admin.site.register(SavedView, SavedViewAdmin)
admin.site.register(StoragePath, StoragePathAdmin)
admin.site.register(PaperlessTask, TaskAdmin)
admin.site.register(Note, NotesAdmin)
admin.site.register(ShareLink, ShareLinksAdmin)
