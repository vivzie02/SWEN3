# Changelog

## paperless-ngx 1.17.4

### Bug Fixes

- Fix: ghostscript rendering error doesnt trigger frontend failure message [@shamoon](https://github.com/shamoon) ([#4092](https://github.com/paperless-ngx/paperless-ngx/pull/4092))

### All App Changes

- Fix: ghostscript rendering error doesnt trigger frontend failure message [@shamoon](https://github.com/shamoon) ([#4092](https://github.com/paperless-ngx/paperless-ngx/pull/4092))

## paperless-ngx 1.17.3

### Bug Fixes

- Fix: When PDF/A rendering fails, add a consideration for the user to add args to override [@stumpylog](https://github.com/stumpylog) ([#4083](https://github.com/paperless-ngx/paperless-ngx/pull/4083))

### Dependencies

- Chore: update frontend PDF viewer (including pdf-js) [@shamoon](https://github.com/shamoon) ([#4065](https://github.com/paperless-ngx/paperless-ngx/pull/4065))

### Maintenance

- Dev: Upload code coverage in the same job [@stumpylog](https://github.com/stumpylog) ([#4084](https://github.com/paperless-ngx/paperless-ngx/pull/4084))

### All App Changes

<details>
<summary>3 changes</summary>

- Fix: When PDF/A rendering fails, add a consideration for the user to add args to override [@stumpylog](https://github.com/stumpylog) ([#4083](https://github.com/paperless-ngx/paperless-ngx/pull/4083))
- Chore: update frontend PDF viewer (including pdf-js) [@shamoon](https://github.com/shamoon) ([#4065](https://github.com/paperless-ngx/paperless-ngx/pull/4065))
- Chore: Prepare for Python 3.11 support [@stumpylog](https://github.com/stumpylog) ([#4066](https://github.com/paperless-ngx/paperless-ngx/pull/4066))
</details>

## paperless-ngx 1.17.2

### Features

- Enhancement: Allow to set a prefix for keys and channels in redis [@amo13](https://github.com/amo13) ([#3993](https://github.com/paperless-ngx/paperless-ngx/pull/3993))

### Bug Fixes

- Fix: Increase the HTTP timeouts for Tika/Gotenberg to maximum task time [@stumpylog](https://github.com/stumpylog) ([#4061](https://github.com/paperless-ngx/paperless-ngx/pull/4061))
- Fix: Allow adding an SSL certificate for IMAP SSL context [@stumpylog](https://github.com/stumpylog) ([#4048](https://github.com/paperless-ngx/paperless-ngx/pull/4048))
- Fix: tag creation sometimes retained search text [@shamoon](https://github.com/shamoon) ([#4038](https://github.com/paperless-ngx/paperless-ngx/pull/4038))
- Fix: enforce permissions on bulk_edit operations [@shamoon](https://github.com/shamoon) ([#4007](https://github.com/paperless-ngx/paperless-ngx/pull/4007))

### All App Changes

<details>
<summary>6 changes</summary>

- Fix: Increase the HTTP timeouts for Tika/Gotenberg to maximum task time [@stumpylog](https://github.com/stumpylog) ([#4061](https://github.com/paperless-ngx/paperless-ngx/pull/4061))
- Enhancement: disable / hide some UI buttons / elements if insufficient permissions, show errors [@shamoon](https://github.com/shamoon) ([#4014](https://github.com/paperless-ngx/paperless-ngx/pull/4014))
- Fix: Allow adding an SSL certificate for IMAP SSL context [@stumpylog](https://github.com/stumpylog) ([#4048](https://github.com/paperless-ngx/paperless-ngx/pull/4048))
- Fix: tag creation sometimes retained search text [@shamoon](https://github.com/shamoon) ([#4038](https://github.com/paperless-ngx/paperless-ngx/pull/4038))
- Fix: enforce permissions on bulk_edit operations [@shamoon](https://github.com/shamoon) ([#4007](https://github.com/paperless-ngx/paperless-ngx/pull/4007))
- Enhancement: Allow to set a prefix for keys and channels in redis [@amo13](https://github.com/amo13) ([#3993](https://github.com/paperless-ngx/paperless-ngx/pull/3993))
</details>

## paperless-ngx 1.17.1

### Features

- Fix / Enhancement: restrict status messages by owner if set \& improve 404 page [@shamoon](https://github.com/shamoon) ([#3959](https://github.com/paperless-ngx/paperless-ngx/pull/3959))
- Feature: Add Ukrainian translation [@shamoon](https://github.com/shamoon) ([#3941](https://github.com/paperless-ngx/paperless-ngx/pull/3941))

### Bug Fixes

- Fix: handle ASN = 0 on frontend cards [@shamoon](https://github.com/shamoon) ([#3988](https://github.com/paperless-ngx/paperless-ngx/pull/3988))
- Fix: improve light color filled primary button text legibility [@shamoon](https://github.com/shamoon) ([#3980](https://github.com/paperless-ngx/paperless-ngx/pull/3980))
- Fix / Enhancement: restrict status messages by owner if set \& improve 404 page [@shamoon](https://github.com/shamoon) ([#3959](https://github.com/paperless-ngx/paperless-ngx/pull/3959))
- Fix: handle very old date strings in correspondent list [@shamoon](https://github.com/shamoon) ([#3953](https://github.com/paperless-ngx/paperless-ngx/pull/3953))

### Documentation

- docs(bare-metal): add new dependency [@bin101](https://github.com/bin101) ([#3931](https://github.com/paperless-ngx/paperless-ngx/pull/3931))

### Dependencies

- Chore: Loosen Pipfile restriction on some packages and update them [@stumpylog](https://github.com/stumpylog) ([#3972](https://github.com/paperless-ngx/paperless-ngx/pull/3972))

### All App Changes

<details>
<summary>6 changes</summary>

- Fix: handle ASN = 0 on frontend cards [@shamoon](https://github.com/shamoon) ([#3988](https://github.com/paperless-ngx/paperless-ngx/pull/3988))
- Fix: improve light color filled primary button text legibility [@shamoon](https://github.com/shamoon) ([#3980](https://github.com/paperless-ngx/paperless-ngx/pull/3980))
- Fix / Enhancement: restrict status messages by owner if set \& improve 404 page [@shamoon](https://github.com/shamoon) ([#3959](https://github.com/paperless-ngx/paperless-ngx/pull/3959))
- Fix: handle very old date strings in correspondent list [@shamoon](https://github.com/shamoon) ([#3953](https://github.com/paperless-ngx/paperless-ngx/pull/3953))
- Chore: Reduces the 2 mail tests flakiness [@stumpylog](https://github.com/stumpylog) ([#3949](https://github.com/paperless-ngx/paperless-ngx/pull/3949))
- Feature: Add Ukrainian translation [@shamoon](https://github.com/shamoon) ([#3941](https://github.com/paperless-ngx/paperless-ngx/pull/3941))
</details>

## paperless-ngx 1.17.0

### Features

- Add support for additional UK date formats [@brainrecursion](https://github.com/brainrecursion) ([#3887](https://github.com/paperless-ngx/paperless-ngx/pull/3887))
- Add 'doc_pk' to PAPERLESS_FILENAME_FORMAT handling [@mechanarchy](https://github.com/mechanarchy) ([#3861](https://github.com/paperless-ngx/paperless-ngx/pull/3861))
- Feature: hover buttons for saved view widgets [@shamoon](https://github.com/shamoon) ([#3875](https://github.com/paperless-ngx/paperless-ngx/pull/3875))
- Feature: collate two single-sided multipage scans [@brakhane](https://github.com/brakhane) ([#3784](https://github.com/paperless-ngx/paperless-ngx/pull/3784))
- Feature: include global and object-level permissions in export / import [@shamoon](https://github.com/shamoon) ([#3672](https://github.com/paperless-ngx/paperless-ngx/pull/3672))
- Enhancement / Fix: Migrate encrypted png thumbnails to webp [@shamoon](https://github.com/shamoon) ([#3719](https://github.com/paperless-ngx/paperless-ngx/pull/3719))
- Feature: Add Slovak translation [@shamoon](https://github.com/shamoon) ([#3722](https://github.com/paperless-ngx/paperless-ngx/pull/3722))

### Bug Fixes

- Fix: cancel possibly slow queries on doc details [@shamoon](https://github.com/shamoon) ([#3925](https://github.com/paperless-ngx/paperless-ngx/pull/3925))
- Fix: note creation / deletion should respect doc permissions [@shamoon](https://github.com/shamoon) ([#3903](https://github.com/paperless-ngx/paperless-ngx/pull/3903))
- Fix: notes show persistent scrollbars [@shamoon](https://github.com/shamoon) ([#3904](https://github.com/paperless-ngx/paperless-ngx/pull/3904))
- Fix: Provide SSL context to IMAP client [@stumpylog](https://github.com/stumpylog) ([#3886](https://github.com/paperless-ngx/paperless-ngx/pull/3886))
- Fix/enhancement: permissions for mail rules \& accounts [@shamoon](https://github.com/shamoon) ([#3869](https://github.com/paperless-ngx/paperless-ngx/pull/3869))
- Fix: Classifier special case when no items are set to automatic matching [@stumpylog](https://github.com/stumpylog) ([#3858](https://github.com/paperless-ngx/paperless-ngx/pull/3858))
- Fix: issues with copy2 or copystat and SELinux permissions [@stumpylog](https://github.com/stumpylog) ([#3847](https://github.com/paperless-ngx/paperless-ngx/pull/3847))
- Fix: Parsing office document timestamps [@stumpylog](https://github.com/stumpylog) ([#3836](https://github.com/paperless-ngx/paperless-ngx/pull/3836))
- Fix: Add warning to install script need for permissions [@shamoon](https://github.com/shamoon) ([#3835](https://github.com/paperless-ngx/paperless-ngx/pull/3835))
- Fix interaction between API and barcode archive serial number [@stumpylog](https://github.com/stumpylog) ([#3834](https://github.com/paperless-ngx/paperless-ngx/pull/3834))
- Enhancement / Fix: Migrate encrypted png thumbnails to webp [@shamoon](https://github.com/shamoon) ([#3719](https://github.com/paperless-ngx/paperless-ngx/pull/3719))
- Fix: add UI tour step padding [@hakimio](https://github.com/hakimio) ([#3791](https://github.com/paperless-ngx/paperless-ngx/pull/3791))
- Fix: translate file tasks types in footer [@shamoon](https://github.com/shamoon) ([#3749](https://github.com/paperless-ngx/paperless-ngx/pull/3749))
- Fix: limit ng-select size for addition of filter button [@shamoon](https://github.com/shamoon) ([#3731](https://github.com/paperless-ngx/paperless-ngx/pull/3731))

### Documentation

- Documentation: improvements to grammar, spelling, indentation [@mechanarchy](https://github.com/mechanarchy) ([#3844](https://github.com/paperless-ngx/paperless-ngx/pull/3844))

### Maintenance

- Bump stumpylog/image-cleaner-action from 0.1.0 to 0.2.0 [@dependabot](https://github.com/dependabot) ([#3910](https://github.com/paperless-ngx/paperless-ngx/pull/3910))
- Chore: group frontend angular dependabot updates [@shamoon](https://github.com/shamoon) ([#3750](https://github.com/paperless-ngx/paperless-ngx/pull/3750))

### Dependencies

<details>
<summary>17 changes</summary>

- Chore: Bump the frontend-angular-dependencies group in /src-ui with 11 updates [@shamoon](https://github.com/shamoon) ([#3918](https://github.com/paperless-ngx/paperless-ngx/pull/3918))
- Bump stumpylog/image-cleaner-action from 0.1.0 to 0.2.0 [@dependabot](https://github.com/dependabot) ([#3910](https://github.com/paperless-ngx/paperless-ngx/pull/3910))
- Bump the frontend-eslint-dependencies group in /src-ui with 3 updates [@dependabot](https://github.com/dependabot) ([#3911](https://github.com/paperless-ngx/paperless-ngx/pull/3911))
- Bump tslib from 2.6.0 to 2.6.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#3909](https://github.com/paperless-ngx/paperless-ngx/pull/3909))
- Bump jest-environment-jsdom from 29.5.0 to 29.6.2 in /src-ui [@dependabot](https://github.com/dependabot) ([#3916](https://github.com/paperless-ngx/paperless-ngx/pull/3916))
- Bump [@<!---->types/node from 20.3.3 to 20.4.5 in /src-ui @dependabot](https://github.com/<!---->types/node from 20.3.3 to 20.4.5 in /src-ui @dependabot) ([#3915](https://github.com/paperless-ngx/paperless-ngx/pull/3915))
- Bump bootstrap from 5.3.0 to 5.3.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#3914](https://github.com/paperless-ngx/paperless-ngx/pull/3914))
- Bump [@<!---->playwright/test from 1.36.1 to 1.36.2 in /src-ui @dependabot](https://github.com/<!---->playwright/test from 1.36.1 to 1.36.2 in /src-ui @dependabot) ([#3912](https://github.com/paperless-ngx/paperless-ngx/pull/3912))
- Bump the frontend-jest-dependencies group in /src-ui with 1 update [@dependabot](https://github.com/dependabot) ([#3906](https://github.com/paperless-ngx/paperless-ngx/pull/3906))
- Chore: Update dependencies [@stumpylog](https://github.com/stumpylog) ([#3883](https://github.com/paperless-ngx/paperless-ngx/pull/3883))
- Chore: Update Python dependencies [@stumpylog](https://github.com/stumpylog) ([#3842](https://github.com/paperless-ngx/paperless-ngx/pull/3842))
- Bump the frontend-angular-dependencies group in /src-ui with 16 updates [@dependabot](https://github.com/dependabot) ([#3826](https://github.com/paperless-ngx/paperless-ngx/pull/3826))
- Bump [@<!---->typescript-eslint/eslint-plugin from 5.60.1 to 6.1.0 in /src-ui @dependabot](https://github.com/<!---->typescript-eslint/eslint-plugin from 5.60.1 to 6.1.0 in /src-ui @dependabot) ([#3829](https://github.com/paperless-ngx/paperless-ngx/pull/3829))
- Bump jest and [@<!---->types/jest in /src-ui @dependabot](https://github.com/<!---->types/jest in /src-ui @dependabot) ([#3828](https://github.com/paperless-ngx/paperless-ngx/pull/3828))
- Bump [@<!---->playwright/test from 1.36.0 to 1.36.1 in /src-ui @dependabot](https://github.com/<!---->playwright/test from 1.36.0 to 1.36.1 in /src-ui @dependabot) ([#3827](https://github.com/paperless-ngx/paperless-ngx/pull/3827))
- Bump semver from 5.7.1 to 5.7.2 in /src-ui [@dependabot](https://github.com/dependabot) ([#3793](https://github.com/paperless-ngx/paperless-ngx/pull/3793))
- Chore: Bump Angular to v16 and other frontend packages [@dependabot](https://github.com/dependabot) ([#3727](https://github.com/paperless-ngx/paperless-ngx/pull/3727))
</details>

### All App Changes

<details>
<summary>35 changes</summary>

- Fix: cancel possibly slow queries on doc details [@shamoon](https://github.com/shamoon) ([#3925](https://github.com/paperless-ngx/paperless-ngx/pull/3925))
- [BUG] Set office document creation date with timezone, if it is naive [@a17t](https://github.com/a17t) ([#3760](https://github.com/paperless-ngx/paperless-ngx/pull/3760))
- Fix: note creation / deletion should respect doc permissions [@shamoon](https://github.com/shamoon) ([#3903](https://github.com/paperless-ngx/paperless-ngx/pull/3903))
- Chore: Bump the frontend-angular-dependencies group in /src-ui with 11 updates [@shamoon](https://github.com/shamoon) ([#3918](https://github.com/paperless-ngx/paperless-ngx/pull/3918))
- Bump the frontend-eslint-dependencies group in /src-ui with 3 updates [@dependabot](https://github.com/dependabot) ([#3911](https://github.com/paperless-ngx/paperless-ngx/pull/3911))
- Bump tslib from 2.6.0 to 2.6.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#3909](https://github.com/paperless-ngx/paperless-ngx/pull/3909))
- Bump jest-environment-jsdom from 29.5.0 to 29.6.2 in /src-ui [@dependabot](https://github.com/dependabot) ([#3916](https://github.com/paperless-ngx/paperless-ngx/pull/3916))
- Bump [@<!---->types/node from 20.3.3 to 20.4.5 in /src-ui @dependabot](https://github.com/<!---->types/node from 20.3.3 to 20.4.5 in /src-ui @dependabot) ([#3915](https://github.com/paperless-ngx/paperless-ngx/pull/3915))
- Bump bootstrap from 5.3.0 to 5.3.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#3914](https://github.com/paperless-ngx/paperless-ngx/pull/3914))
- Bump [@<!---->playwright/test from 1.36.1 to 1.36.2 in /src-ui @dependabot](https://github.com/<!---->playwright/test from 1.36.1 to 1.36.2 in /src-ui @dependabot) ([#3912](https://github.com/paperless-ngx/paperless-ngx/pull/3912))
- Bump the frontend-jest-dependencies group in /src-ui with 1 update [@dependabot](https://github.com/dependabot) ([#3906](https://github.com/paperless-ngx/paperless-ngx/pull/3906))
- Fix: notes show persistent scrollbars [@shamoon](https://github.com/shamoon) ([#3904](https://github.com/paperless-ngx/paperless-ngx/pull/3904))
- Add support for additional UK date formats [@brainrecursion](https://github.com/brainrecursion) ([#3887](https://github.com/paperless-ngx/paperless-ngx/pull/3887))
- Add 'doc_pk' to PAPERLESS_FILENAME_FORMAT handling [@mechanarchy](https://github.com/mechanarchy) ([#3861](https://github.com/paperless-ngx/paperless-ngx/pull/3861))
- Fix: Provide SSL context to IMAP client [@stumpylog](https://github.com/stumpylog) ([#3886](https://github.com/paperless-ngx/paperless-ngx/pull/3886))
- Feature: hover buttons for saved view widgets [@shamoon](https://github.com/shamoon) ([#3875](https://github.com/paperless-ngx/paperless-ngx/pull/3875))
- Fix/enhancement: permissions for mail rules \& accounts [@shamoon](https://github.com/shamoon) ([#3869](https://github.com/paperless-ngx/paperless-ngx/pull/3869))
- Chore: typing improvements [@stumpylog](https://github.com/stumpylog) ([#3860](https://github.com/paperless-ngx/paperless-ngx/pull/3860))
- Fix: Classifier special case when no items are set to automatic matching [@stumpylog](https://github.com/stumpylog) ([#3858](https://github.com/paperless-ngx/paperless-ngx/pull/3858))
- Fix: issues with copy2 or copystat and SELinux permissions [@stumpylog](https://github.com/stumpylog) ([#3847](https://github.com/paperless-ngx/paperless-ngx/pull/3847))
- Chore: Update Python dependencies [@stumpylog](https://github.com/stumpylog) ([#3842](https://github.com/paperless-ngx/paperless-ngx/pull/3842))
- Feature: include global and object-level permissions in export / import [@shamoon](https://github.com/shamoon) ([#3672](https://github.com/paperless-ngx/paperless-ngx/pull/3672))
- Fix: Parsing office document timestamps [@stumpylog](https://github.com/stumpylog) ([#3836](https://github.com/paperless-ngx/paperless-ngx/pull/3836))
- Fix interaction between API and barcode archive serial number [@stumpylog](https://github.com/stumpylog) ([#3834](https://github.com/paperless-ngx/paperless-ngx/pull/3834))
- Bump the frontend-angular-dependencies group in /src-ui with 16 updates [@dependabot](https://github.com/dependabot) ([#3826](https://github.com/paperless-ngx/paperless-ngx/pull/3826))
- Enhancement / Fix: Migrate encrypted png thumbnails to webp [@shamoon](https://github.com/shamoon) ([#3719](https://github.com/paperless-ngx/paperless-ngx/pull/3719))
- Bump [@<!---->typescript-eslint/eslint-plugin from 5.60.1 to 6.1.0 in /src-ui @dependabot](https://github.com/<!---->typescript-eslint/eslint-plugin from 5.60.1 to 6.1.0 in /src-ui @dependabot) ([#3829](https://github.com/paperless-ngx/paperless-ngx/pull/3829))
- Bump jest and [@<!---->types/jest in /src-ui @dependabot](https://github.com/<!---->types/jest in /src-ui @dependabot) ([#3828](https://github.com/paperless-ngx/paperless-ngx/pull/3828))
- Bump [@<!---->playwright/test from 1.36.0 to 1.36.1 in /src-ui @dependabot](https://github.com/<!---->playwright/test from 1.36.0 to 1.36.1 in /src-ui @dependabot) ([#3827](https://github.com/paperless-ngx/paperless-ngx/pull/3827))
- Bump semver from 5.7.1 to 5.7.2 in /src-ui [@dependabot](https://github.com/dependabot) ([#3793](https://github.com/paperless-ngx/paperless-ngx/pull/3793))
- Fix: add UI tour step padding [@hakimio](https://github.com/hakimio) ([#3791](https://github.com/paperless-ngx/paperless-ngx/pull/3791))
- Fix: translate file tasks types in footer [@shamoon](https://github.com/shamoon) ([#3749](https://github.com/paperless-ngx/paperless-ngx/pull/3749))
- Feature: Add Slovak translation [@shamoon](https://github.com/shamoon) ([#3722](https://github.com/paperless-ngx/paperless-ngx/pull/3722))
- Fix: limit ng-select size for addition of filter button [@shamoon](https://github.com/shamoon) ([#3731](https://github.com/paperless-ngx/paperless-ngx/pull/3731))
- Chore: Bump Angular to v16 and other frontend packages [@dependabot](https://github.com/dependabot) ([#3727](https://github.com/paperless-ngx/paperless-ngx/pull/3727))
</details>

## paperless-ngx 1.16.5

### Features

- Feature: support barcode upscaling for better detection of small barcodes [@bmachek](https://github.com/bmachek) ([#3655](https://github.com/paperless-ngx/paperless-ngx/pull/3655))

### Bug Fixes

- Fix: owner removed when set_permissions passed on object create [@shamoon](https://github.com/shamoon) ([#3702](https://github.com/paperless-ngx/paperless-ngx/pull/3702))

### All App Changes

<details>
<summary>2 changes</summary>

- Feature: support barcode upscaling for better detection of small barcodes [@bmachek](https://github.com/bmachek) ([#3655](https://github.com/paperless-ngx/paperless-ngx/pull/3655))
- Fix: owner removed when set_permissions passed on object create [@shamoon](https://github.com/shamoon) ([#3702](https://github.com/paperless-ngx/paperless-ngx/pull/3702))
</details>

## paperless-ngx 1.16.4

### Bug Fixes

- Fix: prevent button wrapping when sidebar narrows in MS Edge [@shamoon](https://github.com/shamoon) ([#3682](https://github.com/paperless-ngx/paperless-ngx/pull/3682))
- Fix: Handling for filenames with non-ascii and no content attribute [@stumpylog](https://github.com/stumpylog) ([#3695](https://github.com/paperless-ngx/paperless-ngx/pull/3695))
- Fix: Generation of thumbnails for existing stored emails [@stumpylog](https://github.com/stumpylog) ([#3696](https://github.com/paperless-ngx/paperless-ngx/pull/3696))
- Fix: Use row gap for filter editor [@kleinweby](https://github.com/kleinweby) ([#3662](https://github.com/paperless-ngx/paperless-ngx/pull/3662))

### Documentation

- Documentation: update API docs re permissions [@shamoon](https://github.com/shamoon) ([#3697](https://github.com/paperless-ngx/paperless-ngx/pull/3697))

### Maintenance

- Chore: Updates codecov configuration for the flag settings and notification delay [@stumpylog](https://github.com/stumpylog) ([#3656](https://github.com/paperless-ngx/paperless-ngx/pull/3656))

### All App Changes

<details>
<summary>4 changes</summary>

- Fix: prevent button wrapping when sidebar narrows in MS Edge [@shamoon](https://github.com/shamoon) ([#3682](https://github.com/paperless-ngx/paperless-ngx/pull/3682))
- Fix: Handling for filenames with non-ascii and no content attribute [@stumpylog](https://github.com/stumpylog) ([#3695](https://github.com/paperless-ngx/paperless-ngx/pull/3695))
- Fix: Generation of thumbnails for existing stored emails [@stumpylog](https://github.com/stumpylog) ([#3696](https://github.com/paperless-ngx/paperless-ngx/pull/3696))
- Fix: Use row gap for filter editor [@kleinweby](https://github.com/kleinweby) ([#3662](https://github.com/paperless-ngx/paperless-ngx/pull/3662))
</details>

## paperless-ngx 1.16.3

### Bug Fixes

- Fix: Set user and home environment through supervisord [@stumpylog](https://github.com/stumpylog) ([#3638](https://github.com/paperless-ngx/paperless-ngx/pull/3638))
- Fix: Ignore errors when trying to copy the original file's stats [@stumpylog](https://github.com/stumpylog) ([#3652](https://github.com/paperless-ngx/paperless-ngx/pull/3652))
- Fix: Copy default thumbnail if thumbnail generation fails [@plu](https://github.com/plu) ([#3632](https://github.com/paperless-ngx/paperless-ngx/pull/3632))
- Fix: Set user and home environment through supervisord [@stumpylog](https://github.com/stumpylog) ([#3638](https://github.com/paperless-ngx/paperless-ngx/pull/3638))
- Fix: Fix quick install with external database not being fully ready [@stumpylog](https://github.com/stumpylog) ([#3637](https://github.com/paperless-ngx/paperless-ngx/pull/3637))

### Maintenance

- Chore: Update default Postgres version for new installs [@stumpylog](https://github.com/stumpylog) ([#3640](https://github.com/paperless-ngx/paperless-ngx/pull/3640))

### All App Changes

<details>
<summary>2 changes</summary>

- Fix: Ignore errors when trying to copy the original file's stats [@stumpylog](https://github.com/stumpylog) ([#3652](https://github.com/paperless-ngx/paperless-ngx/pull/3652))
- Fix: Copy default thumbnail if thumbnail generation fails [@plu](https://github.com/plu) ([#3632](https://github.com/paperless-ngx/paperless-ngx/pull/3632))
</details>

## paperless-ngx 1.16.2

### Bug Fixes

- Fix: Increase httpx operation timeouts to 30s [@stumpylog](https://github.com/stumpylog) ([#3627](https://github.com/paperless-ngx/paperless-ngx/pull/3627))
- Fix: Better error handling and checking when parsing documents via Tika [@stumpylog](https://github.com/stumpylog) ([#3617](https://github.com/paperless-ngx/paperless-ngx/pull/3617))

### Development

- Development: frontend unit testing [@shamoon](https://github.com/shamoon) ([#3597](https://github.com/paperless-ngx/paperless-ngx/pull/3597))

### Maintenance

- Chore: Bumps the CI/Docker pipenv version [@stumpylog](https://github.com/stumpylog) ([#3622](https://github.com/paperless-ngx/paperless-ngx/pull/3622))
- Chore: Set CI artifact retention days [@stumpylog](https://github.com/stumpylog) ([#3621](https://github.com/paperless-ngx/paperless-ngx/pull/3621))

### All App Changes

<details>
<summary>3 changes</summary>

- Fix: Increase httpx operation timeouts to 30s [@stumpylog](https://github.com/stumpylog) ([#3627](https://github.com/paperless-ngx/paperless-ngx/pull/3627))
- Fix: Better error handling and checking when parsing documents via Tika [@stumpylog](https://github.com/stumpylog) ([#3617](https://github.com/paperless-ngx/paperless-ngx/pull/3617))
- Development: frontend unit testing [@shamoon](https://github.com/shamoon) ([#3597](https://github.com/paperless-ngx/paperless-ngx/pull/3597))
</details>

## paperless-ngx 1.16.1

### Bug Fixes

- Fix: PIL ImportError on ARM devices with Docker [@stumpylog](https://github.com/stumpylog) ([#3605](https://github.com/paperless-ngx/paperless-ngx/pull/3605))

### Maintenance

- Chore: Enable the image cleanup action [@stumpylog](https://github.com/stumpylog) ([#3606](https://github.com/paperless-ngx/paperless-ngx/pull/3606))

## paperless-ngx 1.16.0

### Notable Changes

- Chore: Update base image to Debian bookworm [@stumpylog](https://github.com/stumpylog) ([#3469](https://github.com/paperless-ngx/paperless-ngx/pull/3469))

### Features

- Feature: Update to a simpler Tika library [@stumpylog](https://github.com/stumpylog) ([#3517](https://github.com/paperless-ngx/paperless-ngx/pull/3517))
- Feature: Allow to filter documents by original filename and checksum [@jayme-github](https://github.com/jayme-github) ([#3485](https://github.com/paperless-ngx/paperless-ngx/pull/3485))

### Bug Fixes

- Fix: return user first / last name from backend [@shamoon](https://github.com/shamoon) ([#3579](https://github.com/paperless-ngx/paperless-ngx/pull/3579))
- Fix use of `PAPERLESS_DB_TIMEOUT` for all db types [@shamoon](https://github.com/shamoon) ([#3576](https://github.com/paperless-ngx/paperless-ngx/pull/3576))
- Fix: handle mail rules with no filters on some imap servers [@shamoon](https://github.com/shamoon) ([#3554](https://github.com/paperless-ngx/paperless-ngx/pull/3554))

### Dependencies

- Chore: Python dependency updates (celery 5.3.0 in particular) [@stumpylog](https://github.com/stumpylog) ([#3584](https://github.com/paperless-ngx/paperless-ngx/pull/3584))

### All App Changes

<details>
<summary>8 changes</summary>

- Chore: Python dependency updates (celery 5.3.0 in particular) [@stumpylog](https://github.com/stumpylog) ([#3584](https://github.com/paperless-ngx/paperless-ngx/pull/3584))
- Fix: return user first / last name from backend [@shamoon](https://github.com/shamoon) ([#3579](https://github.com/paperless-ngx/paperless-ngx/pull/3579))
- Fix use of `PAPERLESS_DB_TIMEOUT` for all db types [@shamoon](https://github.com/shamoon) ([#3576](https://github.com/paperless-ngx/paperless-ngx/pull/3576))
- Fix: handle mail rules with no filters on some imap servers [@shamoon](https://github.com/shamoon) ([#3554](https://github.com/paperless-ngx/paperless-ngx/pull/3554))
- Chore: Copy file stats from original file [@stumpylog](https://github.com/stumpylog) ([#3551](https://github.com/paperless-ngx/paperless-ngx/pull/3551))
- Chore: Adds test for barcode ASN when it already exists [@stumpylog](https://github.com/stumpylog) ([#3550](https://github.com/paperless-ngx/paperless-ngx/pull/3550))
- Feature: Update to a simpler Tika library [@stumpylog](https://github.com/stumpylog) ([#3517](https://github.com/paperless-ngx/paperless-ngx/pull/3517))
- Feature: Allow to filter documents by original filename and checksum [@jayme-github](https://github.com/jayme-github) ([#3485](https://github.com/paperless-ngx/paperless-ngx/pull/3485))
</details>

## paperless-ngx 1.15.1

### Bug Fixes

- Fix incorrect colors in v1.15.0 [@shamoon](https://github.com/shamoon) ([#3523](https://github.com/paperless-ngx/paperless-ngx/pull/3523))

### All App Changes

- Fix incorrect colors in v1.15.0 [@shamoon](https://github.com/shamoon) ([#3523](https://github.com/paperless-ngx/paperless-ngx/pull/3523))

## paperless-ngx 1.15.0

### Features

- Feature: quick filters from document detail [@shamoon](https://github.com/shamoon) ([#3476](https://github.com/paperless-ngx/paperless-ngx/pull/3476))
- Feature: Add explanations to relative dates [@shamoon](https://github.com/shamoon) ([#3471](https://github.com/paperless-ngx/paperless-ngx/pull/3471))
- Enhancement: paginate frontend tasks [@shamoon](https://github.com/shamoon) ([#3445](https://github.com/paperless-ngx/paperless-ngx/pull/3445))
- Feature: Better encapsulation of barcode logic [@stumpylog](https://github.com/stumpylog) ([#3425](https://github.com/paperless-ngx/paperless-ngx/pull/3425))
- Enhancement: Improve frontend error handling [@shamoon](https://github.com/shamoon) ([#3413](https://github.com/paperless-ngx/paperless-ngx/pull/3413))

### Bug Fixes

- Fix: KeyError error on unauthenticated API calls \& persist authentication when enabled [@ajgon](https://github.com/ajgon) ([#3516](https://github.com/paperless-ngx/paperless-ngx/pull/3516))
- Fix: exclude consumer \& AnonymousUser users from export manifest [@shamoon](https://github.com/shamoon) ([#3487](https://github.com/paperless-ngx/paperless-ngx/pull/3487))
- Fix: prevent date suggestion search if disabled [@shamoon](https://github.com/shamoon) ([#3472](https://github.com/paperless-ngx/paperless-ngx/pull/3472))
- Sync Pipfile.lock based on latest Pipfile [@adamantike](https://github.com/adamantike) ([#3475](https://github.com/paperless-ngx/paperless-ngx/pull/3475))
- Fix: DocumentSerializer should return correct original filename [@jayme-github](https://github.com/jayme-github) ([#3473](https://github.com/paperless-ngx/paperless-ngx/pull/3473))
- consumer.py: read from original file (instead of temp copy) [@chrisblech](https://github.com/chrisblech) ([#3466](https://github.com/paperless-ngx/paperless-ngx/pull/3466))
- Bugfix: Catch an nltk AttributeError and handle it [@stumpylog](https://github.com/stumpylog) ([#3453](https://github.com/paperless-ngx/paperless-ngx/pull/3453))

### Documentation

- Adding doc on how to setup Fail2ban [@GuillaumeHullin](https://github.com/GuillaumeHullin) ([#3414](https://github.com/paperless-ngx/paperless-ngx/pull/3414))
- Docs: Fix typo [@MarcelBochtler](https://github.com/MarcelBochtler) ([#3437](https://github.com/paperless-ngx/paperless-ngx/pull/3437))
- [Documentation] Move nginx [@shamoon](https://github.com/shamoon) ([#3420](https://github.com/paperless-ngx/paperless-ngx/pull/3420))
- Documentation: Note possible dependency removal for bare metal [@stumpylog](https://github.com/stumpylog) ([#3408](https://github.com/paperless-ngx/paperless-ngx/pull/3408))

### Development

- Development: migrate frontend tests to playwright [@shamoon](https://github.com/shamoon) ([#3401](https://github.com/paperless-ngx/paperless-ngx/pull/3401))

### Dependencies

<details>
<summary>10 changes</summary>

- Bump eslint from 8.39.0 to 8.41.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#3513](https://github.com/paperless-ngx/paperless-ngx/pull/3513))
- Bump concurrently from 8.0.1 to 8.1.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#3510](https://github.com/paperless-ngx/paperless-ngx/pull/3510))
- Bump [@<!---->ng-bootstrap/ng-bootstrap from 14.1.0 to 14.2.0 in /src-ui @dependabot](https://github.com/<!---->ng-bootstrap/ng-bootstrap from 14.1.0 to 14.2.0 in /src-ui @dependabot) ([#3507](https://github.com/paperless-ngx/paperless-ngx/pull/3507))
- Bump [@<!---->popperjs/core from 2.11.7 to 2.11.8 in /src-ui @dependabot](https://github.com/<!---->popperjs/core from 2.11.7 to 2.11.8 in /src-ui @dependabot) ([#3508](https://github.com/paperless-ngx/paperless-ngx/pull/3508))
- Bump [@<!---->typescript-eslint/parser from 5.59.2 to 5.59.8 in /src-ui @dependabot](https://github.com/<!---->typescript-eslint/parser from 5.59.2 to 5.59.8 in /src-ui @dependabot) ([#3505](https://github.com/paperless-ngx/paperless-ngx/pull/3505))
- Bump bootstrap from 5.2.3 to 5.3.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#3497](https://github.com/paperless-ngx/paperless-ngx/pull/3497))
- Bump [@<!---->typescript-eslint/eslint-plugin from 5.59.2 to 5.59.8 in /src-ui @dependabot](https://github.com/<!---->typescript-eslint/eslint-plugin from 5.59.2 to 5.59.8 in /src-ui @dependabot) ([#3500](https://github.com/paperless-ngx/paperless-ngx/pull/3500))
- Bump tslib from 2.5.0 to 2.5.2 in /src-ui [@dependabot](https://github.com/dependabot) ([#3501](https://github.com/paperless-ngx/paperless-ngx/pull/3501))
- Bump [@<!---->types/node from 18.16.3 to 20.2.5 in /src-ui @dependabot](https://github.com/<!---->types/node from 18.16.3 to 20.2.5 in /src-ui @dependabot) ([#3498](https://github.com/paperless-ngx/paperless-ngx/pull/3498))
- Bump [@<!---->playwright/test from 1.33.0 to 1.34.3 in /src-ui @dependabot](https://github.com/<!---->playwright/test from 1.33.0 to 1.34.3 in /src-ui @dependabot) ([#3499](https://github.com/paperless-ngx/paperless-ngx/pull/3499))
</details>

### All App Changes

<details>
<summary>22 changes</summary>

- Fix: KeyError error on unauthenticated API calls \& persist authentication when enabled [@ajgon](https://github.com/ajgon) ([#3516](https://github.com/paperless-ngx/paperless-ngx/pull/3516))
- Bump eslint from 8.39.0 to 8.41.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#3513](https://github.com/paperless-ngx/paperless-ngx/pull/3513))
- Bump concurrently from 8.0.1 to 8.1.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#3510](https://github.com/paperless-ngx/paperless-ngx/pull/3510))
- Bump [@<!---->ng-bootstrap/ng-bootstrap from 14.1.0 to 14.2.0 in /src-ui @dependabot](https://github.com/<!---->ng-bootstrap/ng-bootstrap from 14.1.0 to 14.2.0 in /src-ui @dependabot) ([#3507](https://github.com/paperless-ngx/paperless-ngx/pull/3507))
- Bump [@<!---->popperjs/core from 2.11.7 to 2.11.8 in /src-ui @dependabot](https://github.com/<!---->popperjs/core from 2.11.7 to 2.11.8 in /src-ui @dependabot) ([#3508](https://github.com/paperless-ngx/paperless-ngx/pull/3508))
- Bump [@<!---->typescript-eslint/parser from 5.59.2 to 5.59.8 in /src-ui @dependabot](https://github.com/<!---->typescript-eslint/parser from 5.59.2 to 5.59.8 in /src-ui @dependabot) ([#3505](https://github.com/paperless-ngx/paperless-ngx/pull/3505))
- Bump bootstrap from 5.2.3 to 5.3.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#3497](https://github.com/paperless-ngx/paperless-ngx/pull/3497))
- Bump [@<!---->typescript-eslint/eslint-plugin from 5.59.2 to 5.59.8 in /src-ui @dependabot](https://github.com/<!---->typescript-eslint/eslint-plugin from 5.59.2 to 5.59.8 in /src-ui @dependabot) ([#3500](https://github.com/paperless-ngx/paperless-ngx/pull/3500))
- Bump tslib from 2.5.0 to 2.5.2 in /src-ui [@dependabot](https://github.com/dependabot) ([#3501](https://github.com/paperless-ngx/paperless-ngx/pull/3501))
- Bump [@<!---->types/node from 18.16.3 to 20.2.5 in /src-ui @dependabot](https://github.com/<!---->types/node from 18.16.3 to 20.2.5 in /src-ui @dependabot) ([#3498](https://github.com/paperless-ngx/paperless-ngx/pull/3498))
- Bump [@<!---->playwright/test from 1.33.0 to 1.34.3 in /src-ui @dependabot](https://github.com/<!---->playwright/test from 1.33.0 to 1.34.3 in /src-ui @dependabot) ([#3499](https://github.com/paperless-ngx/paperless-ngx/pull/3499))
- Feature: quick filters from document detail [@shamoon](https://github.com/shamoon) ([#3476](https://github.com/paperless-ngx/paperless-ngx/pull/3476))
- Fix: exclude consumer \& AnonymousUser users from export manifest [@shamoon](https://github.com/shamoon) ([#3487](https://github.com/paperless-ngx/paperless-ngx/pull/3487))
- Fix: prevent date suggestion search if disabled [@shamoon](https://github.com/shamoon) ([#3472](https://github.com/paperless-ngx/paperless-ngx/pull/3472))
- Feature: Add explanations to relative dates [@shamoon](https://github.com/shamoon) ([#3471](https://github.com/paperless-ngx/paperless-ngx/pull/3471))
- Fix: DocumentSerializer should return correct original filename [@jayme-github](https://github.com/jayme-github) ([#3473](https://github.com/paperless-ngx/paperless-ngx/pull/3473))
- consumer.py: read from original file (instead of temp copy) [@chrisblech](https://github.com/chrisblech) ([#3466](https://github.com/paperless-ngx/paperless-ngx/pull/3466))
- Bugfix: Catch an nltk AttributeError and handle it [@stumpylog](https://github.com/stumpylog) ([#3453](https://github.com/paperless-ngx/paperless-ngx/pull/3453))
- Chore: Improves the logging mixin and allows it to be typed better [@stumpylog](https://github.com/stumpylog) ([#3451](https://github.com/paperless-ngx/paperless-ngx/pull/3451))
- Enhancement: paginate frontend tasks [@shamoon](https://github.com/shamoon) ([#3445](https://github.com/paperless-ngx/paperless-ngx/pull/3445))
- Add SSL Support for MariaDB [@kimdre](https://github.com/kimdre) ([#3444](https://github.com/paperless-ngx/paperless-ngx/pull/3444))
- Enhancement: Improve frontend error handling [@shamoon](https://github.com/shamoon) ([#3413](https://github.com/paperless-ngx/paperless-ngx/pull/3413))
</details>

## paperless-ngx 1.14.5

### Features

- Feature: owner filtering [@shamoon](https://github.com/shamoon) ([#3309](https://github.com/paperless-ngx/paperless-ngx/pull/3309))
- Enhancement: dynamic counts include all pages, hide for Any [@shamoon](https://github.com/shamoon) ([#3329](https://github.com/paperless-ngx/paperless-ngx/pull/3329))
- Enhancement: save tour completion, hide welcome widget [@shamoon](https://github.com/shamoon) ([#3321](https://github.com/paperless-ngx/paperless-ngx/pull/3321))

### Bug Fixes

- Fix: Adds better handling for files with invalid utf8 content [@stumpylog](https://github.com/stumpylog) ([#3387](https://github.com/paperless-ngx/paperless-ngx/pull/3387))
- Fix: respect permissions for autocomplete suggestions [@shamoon](https://github.com/shamoon) ([#3359](https://github.com/paperless-ngx/paperless-ngx/pull/3359))
- Fix: Transition to new library for finding IPs for failed logins [@stumpylog](https://github.com/stumpylog) ([#3382](https://github.com/paperless-ngx/paperless-ngx/pull/3382))
- [Security] Render frontend text as plain text [@shamoon](https://github.com/shamoon) ([#3366](https://github.com/paperless-ngx/paperless-ngx/pull/3366))
- Fix: default frontend to current owner, allow setting no owner on create [@shamoon](https://github.com/shamoon) ([#3347](https://github.com/paperless-ngx/paperless-ngx/pull/3347))
- Fix: dont perform mail actions when rule filename filter not met [@shamoon](https://github.com/shamoon) ([#3336](https://github.com/paperless-ngx/paperless-ngx/pull/3336))
- Fix: permission-aware bulk editing in 1.14.1+ [@shamoon](https://github.com/shamoon) ([#3345](https://github.com/paperless-ngx/paperless-ngx/pull/3345))

### Maintenance

- Chore: Rework workflows [@stumpylog](https://github.com/stumpylog) ([#3242](https://github.com/paperless-ngx/paperless-ngx/pull/3242))

### Dependencies

- Chore: Upgrade channels to v4 [@stumpylog](https://github.com/stumpylog) ([#3383](https://github.com/paperless-ngx/paperless-ngx/pull/3383))
- Chore: Upgrades Python dependencies to their latest allowed versions [@stumpylog](https://github.com/stumpylog) ([#3365](https://github.com/paperless-ngx/paperless-ngx/pull/3365))

### All App Changes

<details>
<summary>13 changes</summary>

- Fix: Adds better handling for files with invalid utf8 content [@stumpylog](https://github.com/stumpylog) ([#3387](https://github.com/paperless-ngx/paperless-ngx/pull/3387))
- Fix: respect permissions for autocomplete suggestions [@shamoon](https://github.com/shamoon) ([#3359](https://github.com/paperless-ngx/paperless-ngx/pull/3359))
- Chore: Upgrade channels to v4 [@stumpylog](https://github.com/stumpylog) ([#3383](https://github.com/paperless-ngx/paperless-ngx/pull/3383))
- Fix: Transition to new library for finding IPs for failed logins [@stumpylog](https://github.com/stumpylog) ([#3382](https://github.com/paperless-ngx/paperless-ngx/pull/3382))
- Feature: owner filtering [@shamoon](https://github.com/shamoon) ([#3309](https://github.com/paperless-ngx/paperless-ngx/pull/3309))
- [Security] Render frontend text as plain text [@shamoon](https://github.com/shamoon) ([#3366](https://github.com/paperless-ngx/paperless-ngx/pull/3366))
- Enhancement: dynamic counts include all pages, hide for Any [@shamoon](https://github.com/shamoon) ([#3329](https://github.com/paperless-ngx/paperless-ngx/pull/3329))
- Fix: default frontend to current owner, allow setting no owner on create [@shamoon](https://github.com/shamoon) ([#3347](https://github.com/paperless-ngx/paperless-ngx/pull/3347))
- [Fix] Position:fixed for .global-dropzone-overlay [@denilsonsa](https://github.com/denilsonsa) ([#3367](https://github.com/paperless-ngx/paperless-ngx/pull/3367))
- Fix: dont perform mail actions when rule filename filter not met [@shamoon](https://github.com/shamoon) ([#3336](https://github.com/paperless-ngx/paperless-ngx/pull/3336))
- Enhancement: save tour completion, hide welcome widget [@shamoon](https://github.com/shamoon) ([#3321](https://github.com/paperless-ngx/paperless-ngx/pull/3321))
- Fix: permission-aware bulk editing in 1.14.1+ [@shamoon](https://github.com/shamoon) ([#3345](https://github.com/paperless-ngx/paperless-ngx/pull/3345))
- Fix: Add proper testing for \*\_\_id\_\_in testing [@shamoon](https://github.com/shamoon) ([#3315](https://github.com/paperless-ngx/paperless-ngx/pull/3315))
</details>

## paperless-ngx 1.14.4

### Bug Fixes

- Fix: Inversion in tagged mail searching [@stumpylog](https://github.com/stumpylog) ([#3305](https://github.com/paperless-ngx/paperless-ngx/pull/3305))
- Fix dynamic count labels hidden in light mode [@shamoon](https://github.com/shamoon) ([#3303](https://github.com/paperless-ngx/paperless-ngx/pull/3303))

### All App Changes

<details>
<summary>3 changes</summary>

- New Crowdin updates [@paperlessngx-bot](https://github.com/paperlessngx-bot) ([#3298](https://github.com/paperless-ngx/paperless-ngx/pull/3298))
- Fix: Inversion in tagged mail searching [@stumpylog](https://github.com/stumpylog) ([#3305](https://github.com/paperless-ngx/paperless-ngx/pull/3305))
- Fix dynamic count labels hidden in light mode [@shamoon](https://github.com/shamoon) ([#3303](https://github.com/paperless-ngx/paperless-ngx/pull/3303))
</details>

## paperless-ngx 1.14.3

### Features

- Enhancement: better keyboard nav for filter/edit dropdowns [@shamoon](https://github.com/shamoon) ([#3227](https://github.com/paperless-ngx/paperless-ngx/pull/3227))

### Bug Fixes

- Bump filelock from 3.10.2 to 3.12.0 to fix permissions bug [@rbrownwsws](https://github.com/rbrownwsws) ([#3282](https://github.com/paperless-ngx/paperless-ngx/pull/3282))
- Fix: Handle cases where media files aren't all in the same filesystem [@stumpylog](https://github.com/stumpylog) ([#3261](https://github.com/paperless-ngx/paperless-ngx/pull/3261))
- Fix: Prevent erroneous warning when starting container [@stumpylog](https://github.com/stumpylog) ([#3262](https://github.com/paperless-ngx/paperless-ngx/pull/3262))
- Retain doc changes on tab switch after refresh doc [@shamoon](https://github.com/shamoon) ([#3243](https://github.com/paperless-ngx/paperless-ngx/pull/3243))
- Fix: Don't send Gmail related setting if the server doesn't support it [@stumpylog](https://github.com/stumpylog) ([#3240](https://github.com/paperless-ngx/paperless-ngx/pull/3240))
- Fix: close all docs on logout [@shamoon](https://github.com/shamoon) ([#3232](https://github.com/paperless-ngx/paperless-ngx/pull/3232))
- Fix: Respect superuser for advanced queries, test coverage for object perms [@shamoon](https://github.com/shamoon) ([#3222](https://github.com/paperless-ngx/paperless-ngx/pull/3222))
- Fix: ALLOWED_HOSTS logic being overwritten when \* is set [@ikaruswill](https://github.com/ikaruswill) ([#3218](https://github.com/paperless-ngx/paperless-ngx/pull/3218))

### Dependencies

<details>
<summary>7 changes</summary>

- Bump eslint from 8.38.0 to 8.39.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#3276](https://github.com/paperless-ngx/paperless-ngx/pull/3276))
- Bump [@<!---->typescript-eslint/parser from 5.58.0 to 5.59.2 in /src-ui @dependabot](https://github.com/<!---->typescript-eslint/parser from 5.58.0 to 5.59.2 in /src-ui @dependabot) ([#3278](https://github.com/paperless-ngx/paperless-ngx/pull/3278))
- Bump [@<!---->types/node from 18.15.11 to 18.16.3 in /src-ui @dependabot](https://github.com/<!---->types/node from 18.15.11 to 18.16.3 in /src-ui @dependabot) ([#3275](https://github.com/paperless-ngx/paperless-ngx/pull/3275))
- Bump rxjs from 7.8.0 to 7.8.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#3277](https://github.com/paperless-ngx/paperless-ngx/pull/3277))
- Bump [@<!---->typescript-eslint/eslint-plugin from 5.58.0 to 5.59.2 in /src-ui @dependabot](https://github.com/<!---->typescript-eslint/eslint-plugin from 5.58.0 to 5.59.2 in /src-ui @dependabot) ([#3274](https://github.com/paperless-ngx/paperless-ngx/pull/3274))
- Bump cypress from 12.9.0 to 12.11.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#3268](https://github.com/paperless-ngx/paperless-ngx/pull/3268))
- Bulk bump angular packages to 15.2.8 in /src-ui [@dependabot](https://github.com/dependabot) ([#3270](https://github.com/paperless-ngx/paperless-ngx/pull/3270))
</details>

### All App Changes

<details>
<summary>14 changes</summary>

- Bump eslint from 8.38.0 to 8.39.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#3276](https://github.com/paperless-ngx/paperless-ngx/pull/3276))
- Bump [@<!---->typescript-eslint/parser from 5.58.0 to 5.59.2 in /src-ui @dependabot](https://github.com/<!---->typescript-eslint/parser from 5.58.0 to 5.59.2 in /src-ui @dependabot) ([#3278](https://github.com/paperless-ngx/paperless-ngx/pull/3278))
- Bump [@<!---->types/node from 18.15.11 to 18.16.3 in /src-ui @dependabot](https://github.com/<!---->types/node from 18.15.11 to 18.16.3 in /src-ui @dependabot) ([#3275](https://github.com/paperless-ngx/paperless-ngx/pull/3275))
- Bump rxjs from 7.8.0 to 7.8.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#3277](https://github.com/paperless-ngx/paperless-ngx/pull/3277))
- Bump [@<!---->typescript-eslint/eslint-plugin from 5.58.0 to 5.59.2 in /src-ui @dependabot](https://github.com/<!---->typescript-eslint/eslint-plugin from 5.58.0 to 5.59.2 in /src-ui @dependabot) ([#3274](https://github.com/paperless-ngx/paperless-ngx/pull/3274))
- Bump cypress from 12.9.0 to 12.11.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#3268](https://github.com/paperless-ngx/paperless-ngx/pull/3268))
- Bulk bump angular packages to 15.2.8 in /src-ui [@dependabot](https://github.com/dependabot) ([#3270](https://github.com/paperless-ngx/paperless-ngx/pull/3270))
- Fix: Handle cases where media files aren't all in the same filesystem [@stumpylog](https://github.com/stumpylog) ([#3261](https://github.com/paperless-ngx/paperless-ngx/pull/3261))
- Retain doc changes on tab switch after refresh doc [@shamoon](https://github.com/shamoon) ([#3243](https://github.com/paperless-ngx/paperless-ngx/pull/3243))
- Fix: Don't send Gmail related setting if the server doesn't support it [@stumpylog](https://github.com/stumpylog) ([#3240](https://github.com/paperless-ngx/paperless-ngx/pull/3240))
- Fix: close all docs on logout [@shamoon](https://github.com/shamoon) ([#3232](https://github.com/paperless-ngx/paperless-ngx/pull/3232))
- Enhancement: better keyboard nav for filter/edit dropdowns [@shamoon](https://github.com/shamoon) ([#3227](https://github.com/paperless-ngx/paperless-ngx/pull/3227))
- Fix: Respect superuser for advanced queries, test coverage for object perms [@shamoon](https://github.com/shamoon) ([#3222](https://github.com/paperless-ngx/paperless-ngx/pull/3222))
- Fix: ALLOWED_HOSTS logic being overwritten when \* is set [@ikaruswill](https://github.com/ikaruswill) ([#3218](https://github.com/paperless-ngx/paperless-ngx/pull/3218))
</details>

## paperless-ngx 1.14.2

### Features

- Feature: Finnish translation [@shamoon](https://github.com/shamoon) ([#3215](https://github.com/paperless-ngx/paperless-ngx/pull/3215))

### Bug Fixes

- Fix: Load saved views from app frame, not dashboard [@shamoon](https://github.com/shamoon) ([#3211](https://github.com/paperless-ngx/paperless-ngx/pull/3211))
- Fix: advanced search or date searching + doc type/correspondent/storage path broken [@shamoon](https://github.com/shamoon) ([#3209](https://github.com/paperless-ngx/paperless-ngx/pull/3209))
- Fix MixedContentTypeError in add_inbox_tags handler [@e1mo](https://github.com/e1mo) ([#3212](https://github.com/paperless-ngx/paperless-ngx/pull/3212))

### All App Changes

<details>
<summary>4 changes</summary>

- Feature: Finnish translation [@shamoon](https://github.com/shamoon) ([#3215](https://github.com/paperless-ngx/paperless-ngx/pull/3215))
- Fix: Load saved views from app frame, not dashboard [@shamoon](https://github.com/shamoon) ([#3211](https://github.com/paperless-ngx/paperless-ngx/pull/3211))
- Fix: advanced search or date searching + doc type/correspondent/storage path broken [@shamoon](https://github.com/shamoon) ([#3209](https://github.com/paperless-ngx/paperless-ngx/pull/3209))
- Fix MixedContentTypeError in add_inbox_tags handler [@e1mo](https://github.com/e1mo) ([#3212](https://github.com/paperless-ngx/paperless-ngx/pull/3212))
</details>

## paperless-ngx 1.14.1

### Bug Fixes

- Fix: reduce frequency of permissions queries to speed up v1.14.0 [@shamoon](https://github.com/shamoon) ([#3201](https://github.com/paperless-ngx/paperless-ngx/pull/3201))
- Fix: permissions-aware statistics [@shamoon](https://github.com/shamoon) ([#3199](https://github.com/paperless-ngx/paperless-ngx/pull/3199))
- Fix: Use document owner for matching if set [@shamoon](https://github.com/shamoon) ([#3198](https://github.com/paperless-ngx/paperless-ngx/pull/3198))
- Fix: respect permissions on document view actions [@shamoon](https://github.com/shamoon) ([#3174](https://github.com/paperless-ngx/paperless-ngx/pull/3174))
- Increment API version for 1.14.1+ [@shamoon](https://github.com/shamoon) ([#3191](https://github.com/paperless-ngx/paperless-ngx/pull/3191))
- Fix: dropdown Private items with empty set [@shamoon](https://github.com/shamoon) ([#3189](https://github.com/paperless-ngx/paperless-ngx/pull/3189))
- Documentation: add note for macOS [@shamoon](https://github.com/shamoon) ([#3190](https://github.com/paperless-ngx/paperless-ngx/pull/3190))
- Fix: make the importer a little more robust against some errors [@stumpylog](https://github.com/stumpylog) ([#3188](https://github.com/paperless-ngx/paperless-ngx/pull/3188))
- Fix: Specify backend for auto-login [@shamoon](https://github.com/shamoon) ([#3163](https://github.com/paperless-ngx/paperless-ngx/pull/3163))
- Fix: StoragePath missing the owned or granted filter [@stumpylog](https://github.com/stumpylog) ([#3180](https://github.com/paperless-ngx/paperless-ngx/pull/3180))
- Fix: Redis socket connections fail due to redis-py [@stumpylog](https://github.com/stumpylog) ([#3176](https://github.com/paperless-ngx/paperless-ngx/pull/3176))
- Fix: Handle delete mail action with no filters [@shamoon](https://github.com/shamoon) ([#3161](https://github.com/paperless-ngx/paperless-ngx/pull/3161))
- Fix typos and wrong version number in doc [@FizzyMUC](https://github.com/FizzyMUC) ([#3171](https://github.com/paperless-ngx/paperless-ngx/pull/3171))

### Documentation

- Documentation: add note for macOS [@shamoon](https://github.com/shamoon) ([#3190](https://github.com/paperless-ngx/paperless-ngx/pull/3190))
- Fix typos and wrong version number in doc [@FizzyMUC](https://github.com/FizzyMUC) ([#3171](https://github.com/paperless-ngx/paperless-ngx/pull/3171))

### Maintenance

- Chore: Fix isort not running, upgrade to the latest black [@stumpylog](https://github.com/stumpylog) ([#3177](https://github.com/paperless-ngx/paperless-ngx/pull/3177))

### All App Changes

<details>
<summary>11 changes</summary>

- Fix: reduce frequency of permissions queries to speed up v1.14.0 [@shamoon](https://github.com/shamoon) ([#3201](https://github.com/paperless-ngx/paperless-ngx/pull/3201))
- Fix: permissions-aware statistics [@shamoon](https://github.com/shamoon) ([#3199](https://github.com/paperless-ngx/paperless-ngx/pull/3199))
- Fix: Use document owner for matching if set [@shamoon](https://github.com/shamoon) ([#3198](https://github.com/paperless-ngx/paperless-ngx/pull/3198))
- Chore: Fix isort not running, upgrade to the latest black [@stumpylog](https://github.com/stumpylog) ([#3177](https://github.com/paperless-ngx/paperless-ngx/pull/3177))
- Fix: respect permissions on document view actions [@shamoon](https://github.com/shamoon) ([#3174](https://github.com/paperless-ngx/paperless-ngx/pull/3174))
- Increment API version for 1.14.1+ [@shamoon](https://github.com/shamoon) ([#3191](https://github.com/paperless-ngx/paperless-ngx/pull/3191))
- Fix: dropdown Private items with empty set [@shamoon](https://github.com/shamoon) ([#3189](https://github.com/paperless-ngx/paperless-ngx/pull/3189))
- Fix: make the importer a little more robust against some errors [@stumpylog](https://github.com/stumpylog) ([#3188](https://github.com/paperless-ngx/paperless-ngx/pull/3188))
- Fix: Specify backend for auto-login [@shamoon](https://github.com/shamoon) ([#3163](https://github.com/paperless-ngx/paperless-ngx/pull/3163))
- Fix: StoragePath missing the owned or granted filter [@stumpylog](https://github.com/stumpylog) ([#3180](https://github.com/paperless-ngx/paperless-ngx/pull/3180))
- Fix: Handle delete mail action with no filters [@shamoon](https://github.com/shamoon) ([#3161](https://github.com/paperless-ngx/paperless-ngx/pull/3161))
</details>

## paperless-ngx 1.14.0

### Notable Changes

- Feature: multi-user permissions [@shamoon](https://github.com/shamoon) ([#2147](https://github.com/paperless-ngx/paperless-ngx/pull/2147))

### Features

- Feature: Stronger typing for file consumption [@stumpylog](https://github.com/stumpylog) ([#2744](https://github.com/paperless-ngx/paperless-ngx/pull/2744))
- Feature: double-click docs [@shamoon](https://github.com/shamoon) ([#2966](https://github.com/paperless-ngx/paperless-ngx/pull/2966))
- feature: Add support for zxing as barcode scanning lib [@margau](https://github.com/margau) ([#2907](https://github.com/paperless-ngx/paperless-ngx/pull/2907))
- Feature: Enable images to be released on Quay.io [@stumpylog](https://github.com/stumpylog) ([#2972](https://github.com/paperless-ngx/paperless-ngx/pull/2972))
- Feature: test mail account [@shamoon](https://github.com/shamoon) ([#2949](https://github.com/paperless-ngx/paperless-ngx/pull/2949))
- Feature: Capture celery and kombu logs to a file [@stumpylog](https://github.com/stumpylog) ([#2954](https://github.com/paperless-ngx/paperless-ngx/pull/2954))
- Fix: Resolve Redis connection issues with ACLs [@stumpylog](https://github.com/stumpylog) ([#2939](https://github.com/paperless-ngx/paperless-ngx/pull/2939))
- Feature: Allow mail account to use access tokens [@stumpylog](https://github.com/stumpylog) ([#2930](https://github.com/paperless-ngx/paperless-ngx/pull/2930))
- Fix: Consumer polling could overwhelm database [@stumpylog](https://github.com/stumpylog) ([#2922](https://github.com/paperless-ngx/paperless-ngx/pull/2922))
- Feature: Improved statistics widget [@shamoon](https://github.com/shamoon) ([#2910](https://github.com/paperless-ngx/paperless-ngx/pull/2910))
- Enhancement: rename comments to notes and improve notes UI [@shamoon](https://github.com/shamoon) ([#2904](https://github.com/paperless-ngx/paperless-ngx/pull/2904))
- Allow psql client certificate authentication [@Ongy](https://github.com/Ongy) ([#2899](https://github.com/paperless-ngx/paperless-ngx/pull/2899))
- Enhancement: support filtering multiple correspondents, doctypes \& storage paths [@shamoon](https://github.com/shamoon) ([#2893](https://github.com/paperless-ngx/paperless-ngx/pull/2893))
- Feature: Change celery serializer to pickle [@stumpylog](https://github.com/stumpylog) ([#2861](https://github.com/paperless-ngx/paperless-ngx/pull/2861))
- Feature: Allow naming to include owner and original name [@stumpylog](https://github.com/stumpylog) ([#2873](https://github.com/paperless-ngx/paperless-ngx/pull/2873))
- Feature: Allows filtering email by the TO value(s) as well [@stumpylog](https://github.com/stumpylog) ([#2871](https://github.com/paperless-ngx/paperless-ngx/pull/2871))
- Feature: owner-aware unique model name constraint [@shamoon](https://github.com/shamoon) ([#2827](https://github.com/paperless-ngx/paperless-ngx/pull/2827))
- Feature/2396 better mail actions [@jonaswinkler](https://github.com/jonaswinkler) ([#2718](https://github.com/paperless-ngx/paperless-ngx/pull/2718))
- Feature: Reduce classifier memory usage somewhat during training [@stumpylog](https://github.com/stumpylog) ([#2733](https://github.com/paperless-ngx/paperless-ngx/pull/2733))
- Feature: Add PAPERLESS_OCR_SKIP_ARCHIVE_FILE config setting [@bdr99](https://github.com/bdr99) ([#2743](https://github.com/paperless-ngx/paperless-ngx/pull/2743))
- Feature: dynamic document counts in dropdowns [@shamoon](https://github.com/shamoon) ([#2704](https://github.com/paperless-ngx/paperless-ngx/pull/2704))
- Allow setting the ASN on document upload [@stumpylog](https://github.com/stumpylog) ([#2713](https://github.com/paperless-ngx/paperless-ngx/pull/2713))
- Feature: Log failed login attempts [@shamoon](https://github.com/shamoon) ([#2359](https://github.com/paperless-ngx/paperless-ngx/pull/2359))
- Feature: Rename documents when storage path format changes [@stumpylog](https://github.com/stumpylog) ([#2696](https://github.com/paperless-ngx/paperless-ngx/pull/2696))
- Feature: update error message colors \& show on document failures [@shamoon](https://github.com/shamoon) ([#2689](https://github.com/paperless-ngx/paperless-ngx/pull/2689))
- Feature: multi-user permissions [@shamoon](https://github.com/shamoon) ([#2147](https://github.com/paperless-ngx/paperless-ngx/pull/2147))

### Bug Fixes

- Fix: Allow setting additional Django settings for proxies [@stumpylog](https://github.com/stumpylog) ([#3135](https://github.com/paperless-ngx/paperless-ngx/pull/3135))
- Fix: Use exclude instead of difference for mariadb [@shamoon](https://github.com/shamoon) ([#2983](https://github.com/paperless-ngx/paperless-ngx/pull/2983))
- Fix: permissions display should not show users with inherited permissions \& unable to change owner [@shamoon](https://github.com/shamoon) ([#2818](https://github.com/paperless-ngx/paperless-ngx/pull/2818))
- Fix: Resolve Redis connection issues with ACLs [@stumpylog](https://github.com/stumpylog) ([#2939](https://github.com/paperless-ngx/paperless-ngx/pull/2939))
- Fix: unable to edit correspondents (in ) [@shamoon](https://github.com/shamoon) ([#2938](https://github.com/paperless-ngx/paperless-ngx/pull/2938))
- Fix: Consumer polling could overwhelm database [@stumpylog](https://github.com/stumpylog) ([#2922](https://github.com/paperless-ngx/paperless-ngx/pull/2922))
- Fix: Chrome struggles with commas [@stumpylog](https://github.com/stumpylog) ([#2892](https://github.com/paperless-ngx/paperless-ngx/pull/2892))
- Fix formatting in Setup documentation page [@igrybkov](https://github.com/igrybkov) ([#2880](https://github.com/paperless-ngx/paperless-ngx/pull/2880))
- Fix: logout on change password via frontend [@shamoon](https://github.com/shamoon) ([#2863](https://github.com/paperless-ngx/paperless-ngx/pull/2863))
- Fix: give superuser full doc perms [@shamoon](https://github.com/shamoon) ([#2820](https://github.com/paperless-ngx/paperless-ngx/pull/2820))
- Fix: Append Gmail labels instead of replacing [@stumpylog](https://github.com/stumpylog) ([#2860](https://github.com/paperless-ngx/paperless-ngx/pull/2860))
- Fix: Ensure email date is made aware during action processing [@stumpylog](https://github.com/stumpylog) ([#2837](https://github.com/paperless-ngx/paperless-ngx/pull/2837))
- Fix: disable bulk edit dialog buttons during operation [@shamoon](https://github.com/shamoon) ([#2819](https://github.com/paperless-ngx/paperless-ngx/pull/2819))
- fix database locked error [@jonaswinkler](https://github.com/jonaswinkler) ([#2808](https://github.com/paperless-ngx/paperless-ngx/pull/2808))
- Fix: Disable suggestions for read-only docs [@shamoon](https://github.com/shamoon) ([#2813](https://github.com/paperless-ngx/paperless-ngx/pull/2813))
- Update processed mail migration [@shamoon](https://github.com/shamoon) ([#2804](https://github.com/paperless-ngx/paperless-ngx/pull/2804))
- Fix: Ensure scratch directory exists before using [@stumpylog](https://github.com/stumpylog) ([#2775](https://github.com/paperless-ngx/paperless-ngx/pull/2775))
- Don't submit owner via API on document upload [@jonaswinkler](https://github.com/jonaswinkler) ([#2777](https://github.com/paperless-ngx/paperless-ngx/pull/2777))
- Fix: only offer log files that exist [@shamoon](https://github.com/shamoon) ([#2739](https://github.com/paperless-ngx/paperless-ngx/pull/2739))
- Fix: permissions editing and initial view issues [@shamoon](https://github.com/shamoon) ([#2717](https://github.com/paperless-ngx/paperless-ngx/pull/2717))
- Fix: reset saved view ID on quickFilter [@shamoon](https://github.com/shamoon) ([#2703](https://github.com/paperless-ngx/paperless-ngx/pull/2703))
- Fix: bulk edit reset apply button state [@shamoon](https://github.com/shamoon) ([#2701](https://github.com/paperless-ngx/paperless-ngx/pull/2701))
- Fix: add missing i18n for mobile preview tab title [@nathanaelhoun](https://github.com/nathanaelhoun) ([#2692](https://github.com/paperless-ngx/paperless-ngx/pull/2692))

### Documentation

- Whitespace changes, making sure the example is correcly aligned [@denilsonsa](https://github.com/denilsonsa) ([#3089](https://github.com/paperless-ngx/paperless-ngx/pull/3089))
- Docs: Include additional information about barcodes [@stumpylog](https://github.com/stumpylog) ([#2889](https://github.com/paperless-ngx/paperless-ngx/pull/2889))
- Fix formatting in Setup documentation page [@igrybkov](https://github.com/igrybkov) ([#2880](https://github.com/paperless-ngx/paperless-ngx/pull/2880))
- [Documentation] Update docker-compose steps to support podman [@white-gecko](https://github.com/white-gecko) ([#2855](https://github.com/paperless-ngx/paperless-ngx/pull/2855))
- docs: better language code help [@tooomm](https://github.com/tooomm) ([#2830](https://github.com/paperless-ngx/paperless-ngx/pull/2830))
- Feature: Add an option to disable matching [@bdr99](https://github.com/bdr99) ([#2727](https://github.com/paperless-ngx/paperless-ngx/pull/2727))
- Docs: Remove outdated PAPERLESS_WORKER_RETRY [@shamoon](https://github.com/shamoon) ([#2694](https://github.com/paperless-ngx/paperless-ngx/pull/2694))
- Fix: add missing i18n for mobile preview tab title [@nathanaelhoun](https://github.com/nathanaelhoun) ([#2692](https://github.com/paperless-ngx/paperless-ngx/pull/2692))

### Maintenance

- Chore: Configure ruff as the primary linter for Python [@stumpylog](https://github.com/stumpylog) ([#2988](https://github.com/paperless-ngx/paperless-ngx/pull/2988))
- Feature: Enable images to be released on Quay.io [@stumpylog](https://github.com/stumpylog) ([#2972](https://github.com/paperless-ngx/paperless-ngx/pull/2972))
- Chore: Updates locked pipenv to latest version [@stumpylog](https://github.com/stumpylog) ([#2943](https://github.com/paperless-ngx/paperless-ngx/pull/2943))
- Chore: Properly collapse section in releases [@tooomm](https://github.com/tooomm) ([#2838](https://github.com/paperless-ngx/paperless-ngx/pull/2838))
- Chore: Don't include changelog PR for different releases [@tooomm](https://github.com/tooomm) ([#2832](https://github.com/paperless-ngx/paperless-ngx/pull/2832))
- Chore: Speed up frontend CI testing [@stumpylog](https://github.com/stumpylog) ([#2796](https://github.com/paperless-ngx/paperless-ngx/pull/2796))
- Bump leonsteinhaeuser/project-beta-automations from 2.0.1 to 2.1.0 [@dependabot](https://github.com/dependabot) ([#2789](https://github.com/paperless-ngx/paperless-ngx/pull/2789))

### Dependencies

<details>
<summary>15 changes</summary>

- Bump ng2-pdf-viewer from 9.1.4 to 9.1.5 in /src-ui [@dependabot](https://github.com/dependabot) ([#3109](https://github.com/paperless-ngx/paperless-ngx/pull/3109))
- Grouped bump angular packages from 15.2.6 to 15.2.7 in /src-ui [@dependabot](https://github.com/dependabot) ([#3108](https://github.com/paperless-ngx/paperless-ngx/pull/3108))
- Bump typescript from 4.8.4 to 4.9.5 in /src-ui [@dependabot](https://github.com/dependabot) ([#3071](https://github.com/paperless-ngx/paperless-ngx/pull/3071))
- Bulk Bump npm packages 04.23 [@dependabot](https://github.com/dependabot) ([#3068](https://github.com/paperless-ngx/paperless-ngx/pull/3068))
- Bump wait-on from 6.0.1 to 7.0.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#2990](https://github.com/paperless-ngx/paperless-ngx/pull/2990))
- Bulk bump angular packages to 15.2.5 in /src-ui [@dependabot](https://github.com/dependabot) ([#2991](https://github.com/paperless-ngx/paperless-ngx/pull/2991))
- Bump [@<!---->types/node from 18.11.18 to 18.15.11 in /src-ui @dependabot](https://github.com/<!---->types/node from 18.11.18 to 18.15.11 in /src-ui @dependabot) ([#2993](https://github.com/paperless-ngx/paperless-ngx/pull/2993))
- Bump [@<!---->ng-select/ng-select from 10.0.3 to 10.0.4 in /src-ui @dependabot](https://github.com/<!---->ng-select/ng-select from 10.0.3 to 10.0.4 in /src-ui @dependabot) ([#2992](https://github.com/paperless-ngx/paperless-ngx/pull/2992))
- Bump [@<!---->typescript-eslint/eslint-plugin from 5.50.0 to 5.57.0 in /src-ui @dependabot](https://github.com/<!---->typescript-eslint/eslint-plugin from 5.50.0 to 5.57.0 in /src-ui @dependabot) ([#2989](https://github.com/paperless-ngx/paperless-ngx/pull/2989))
- Chore: Update cryptography to latest version [@stumpylog](https://github.com/stumpylog) ([#2891](https://github.com/paperless-ngx/paperless-ngx/pull/2891))
- Chore: Update to qpdf 11.3.0 in Docker image [@stumpylog](https://github.com/stumpylog) ([#2862](https://github.com/paperless-ngx/paperless-ngx/pull/2862))
- Bump leonsteinhaeuser/project-beta-automations from 2.0.1 to 2.1.0 [@dependabot](https://github.com/dependabot) ([#2789](https://github.com/paperless-ngx/paperless-ngx/pull/2789))
- Bump zone.js from 0.11.8 to 0.12.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#2793](https://github.com/paperless-ngx/paperless-ngx/pull/2793))
- Bump [@<!---->typescript-eslint/parser from 5.50.0 to 5.54.0 in /src-ui @dependabot](https://github.com/<!---->typescript-eslint/parser from 5.50.0 to 5.54.0 in /src-ui @dependabot) ([#2792](https://github.com/paperless-ngx/paperless-ngx/pull/2792))
- Bulk Bump angular packages to 15.2.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#2788](https://github.com/paperless-ngx/paperless-ngx/pull/2788))
</details>

### All App Changes

<details>
<summary>72 changes</summary>

- Feature: Catalan translation [@shamoon](https://github.com/shamoon) ([#3146](https://github.com/paperless-ngx/paperless-ngx/pull/3146))
- Fix: Allow setting additional Django settings for proxies [@stumpylog](https://github.com/stumpylog) ([#3135](https://github.com/paperless-ngx/paperless-ngx/pull/3135))
- Fix: Increase mail account password field length [@stumpylog](https://github.com/stumpylog) ([#3134](https://github.com/paperless-ngx/paperless-ngx/pull/3134))
- Fix: respect permissions for matching suggestions [@shamoon](https://github.com/shamoon) ([#3103](https://github.com/paperless-ngx/paperless-ngx/pull/3103))
- Bump ng2-pdf-viewer from 9.1.4 to 9.1.5 in /src-ui [@dependabot](https://github.com/dependabot) ([#3109](https://github.com/paperless-ngx/paperless-ngx/pull/3109))
- Grouped bump angular packages from 15.2.6 to 15.2.7 in /src-ui [@dependabot](https://github.com/dependabot) ([#3108](https://github.com/paperless-ngx/paperless-ngx/pull/3108))
- Fix: update PaperlessTask on hard failures [@shamoon](https://github.com/shamoon) ([#3062](https://github.com/paperless-ngx/paperless-ngx/pull/3062))
- Bump typescript from 4.8.4 to 4.9.5 in /src-ui [@dependabot](https://github.com/dependabot) ([#3071](https://github.com/paperless-ngx/paperless-ngx/pull/3071))
- Bulk Bump npm packages 04.23 [@dependabot](https://github.com/dependabot) ([#3068](https://github.com/paperless-ngx/paperless-ngx/pull/3068))
- Fix: Hide UI tour steps if user doesnt have permissions [@shamoon](https://github.com/shamoon) ([#3060](https://github.com/paperless-ngx/paperless-ngx/pull/3060))
- Fix: Hide Permissions tab if user cannot view users [@shamoon](https://github.com/shamoon) ([#3061](https://github.com/paperless-ngx/paperless-ngx/pull/3061))
- v1.14.0 delete document fixes [@shamoon](https://github.com/shamoon) ([#3020](https://github.com/paperless-ngx/paperless-ngx/pull/3020))
- Bump wait-on from 6.0.1 to 7.0.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#2990](https://github.com/paperless-ngx/paperless-ngx/pull/2990))
- Fix: inline plaintext docs to enforce styling [@shamoon](https://github.com/shamoon) ([#3013](https://github.com/paperless-ngx/paperless-ngx/pull/3013))
- Chore: Configure ruff as the primary linter for Python [@stumpylog](https://github.com/stumpylog) ([#2988](https://github.com/paperless-ngx/paperless-ngx/pull/2988))
- Bulk bump angular packages to 15.2.5 in /src-ui [@dependabot](https://github.com/dependabot) ([#2991](https://github.com/paperless-ngx/paperless-ngx/pull/2991))
- Bump [@<!---->types/node from 18.11.18 to 18.15.11 in /src-ui @dependabot](https://github.com/<!---->types/node from 18.11.18 to 18.15.11 in /src-ui @dependabot) ([#2993](https://github.com/paperless-ngx/paperless-ngx/pull/2993))
- Bump [@<!---->ng-select/ng-select from 10.0.3 to 10.0.4 in /src-ui @dependabot](https://github.com/<!---->ng-select/ng-select from 10.0.3 to 10.0.4 in /src-ui @dependabot) ([#2992](https://github.com/paperless-ngx/paperless-ngx/pull/2992))
- Bump [@<!---->typescript-eslint/eslint-plugin from 5.50.0 to 5.57.0 in /src-ui @dependabot](https://github.com/<!---->typescript-eslint/eslint-plugin from 5.50.0 to 5.57.0 in /src-ui @dependabot) ([#2989](https://github.com/paperless-ngx/paperless-ngx/pull/2989))
- Feature: Stronger typing for file consumption [@stumpylog](https://github.com/stumpylog) ([#2744](https://github.com/paperless-ngx/paperless-ngx/pull/2744))
- Fix: Use exclude instead of difference for mariadb [@shamoon](https://github.com/shamoon) ([#2983](https://github.com/paperless-ngx/paperless-ngx/pull/2983))
- Fix: permissions display should not show users with inherited permissions \& unable to change owner [@shamoon](https://github.com/shamoon) ([#2818](https://github.com/paperless-ngx/paperless-ngx/pull/2818))
- Feature: double-click docs [@shamoon](https://github.com/shamoon) ([#2966](https://github.com/paperless-ngx/paperless-ngx/pull/2966))
- feature: Add support for zxing as barcode scanning lib [@margau](https://github.com/margau) ([#2907](https://github.com/paperless-ngx/paperless-ngx/pull/2907))
- Feature: test mail account [@shamoon](https://github.com/shamoon) ([#2949](https://github.com/paperless-ngx/paperless-ngx/pull/2949))
- Feature: Capture celery and kombu logs to a file [@stumpylog](https://github.com/stumpylog) ([#2954](https://github.com/paperless-ngx/paperless-ngx/pull/2954))
- Fix: Resolve Redis connection issues with ACLs [@stumpylog](https://github.com/stumpylog) ([#2939](https://github.com/paperless-ngx/paperless-ngx/pull/2939))
- Feature: Allow mail account to use access tokens [@stumpylog](https://github.com/stumpylog) ([#2930](https://github.com/paperless-ngx/paperless-ngx/pull/2930))
- Fix: Consumer polling could overwhelm database [@stumpylog](https://github.com/stumpylog) ([#2922](https://github.com/paperless-ngx/paperless-ngx/pull/2922))
- Feature: Improved statistics widget [@shamoon](https://github.com/shamoon) ([#2910](https://github.com/paperless-ngx/paperless-ngx/pull/2910))
- Enhancement: rename comments to notes and improve notes UI [@shamoon](https://github.com/shamoon) ([#2904](https://github.com/paperless-ngx/paperless-ngx/pull/2904))
- Allow psql client certificate authentication [@Ongy](https://github.com/Ongy) ([#2899](https://github.com/paperless-ngx/paperless-ngx/pull/2899))
- Enhancement: support filtering multiple correspondents, doctypes \& storage paths [@shamoon](https://github.com/shamoon) ([#2893](https://github.com/paperless-ngx/paperless-ngx/pull/2893))
- Fix: frontend handle private tags, doctypes, correspondents [@shamoon](https://github.com/shamoon) ([#2839](https://github.com/paperless-ngx/paperless-ngx/pull/2839))
- Fix: Chrome struggles with commas [@stumpylog](https://github.com/stumpylog) ([#2892](https://github.com/paperless-ngx/paperless-ngx/pull/2892))
- Feature: Change celery serializer to pickle [@stumpylog](https://github.com/stumpylog) ([#2861](https://github.com/paperless-ngx/paperless-ngx/pull/2861))
- Feature: Allow naming to include owner and original name [@stumpylog](https://github.com/stumpylog) ([#2873](https://github.com/paperless-ngx/paperless-ngx/pull/2873))
- Feature: Allows filtering email by the TO value(s) as well [@stumpylog](https://github.com/stumpylog) ([#2871](https://github.com/paperless-ngx/paperless-ngx/pull/2871))
- Fix: logout on change password via frontend [@shamoon](https://github.com/shamoon) ([#2863](https://github.com/paperless-ngx/paperless-ngx/pull/2863))
- Fix: give superuser full doc perms [@shamoon](https://github.com/shamoon) ([#2820](https://github.com/paperless-ngx/paperless-ngx/pull/2820))
- Fix: Append Gmail labels instead of replacing [@stumpylog](https://github.com/stumpylog) ([#2860](https://github.com/paperless-ngx/paperless-ngx/pull/2860))
- Feature: owner-aware unique model name constraint [@shamoon](https://github.com/shamoon) ([#2827](https://github.com/paperless-ngx/paperless-ngx/pull/2827))
- Chore: Create list parsing utility for settings [@stumpylog](https://github.com/stumpylog) ([#2816](https://github.com/paperless-ngx/paperless-ngx/pull/2816))
- Fix: Ensure email date is made aware during action processing [@stumpylog](https://github.com/stumpylog) ([#2837](https://github.com/paperless-ngx/paperless-ngx/pull/2837))
- Chore: Convert more code to pathlib [@stumpylog](https://github.com/stumpylog) ([#2817](https://github.com/paperless-ngx/paperless-ngx/pull/2817))
- Fix: disable bulk edit dialog buttons during operation [@shamoon](https://github.com/shamoon) ([#2819](https://github.com/paperless-ngx/paperless-ngx/pull/2819))
- fix database locked error [@jonaswinkler](https://github.com/jonaswinkler) ([#2808](https://github.com/paperless-ngx/paperless-ngx/pull/2808))
- Fix: Disable suggestions for read-only docs [@shamoon](https://github.com/shamoon) ([#2813](https://github.com/paperless-ngx/paperless-ngx/pull/2813))
- update django.po messages [@jonaswinkler](https://github.com/jonaswinkler) ([#2806](https://github.com/paperless-ngx/paperless-ngx/pull/2806))
- Update processed mail migration [@shamoon](https://github.com/shamoon) ([#2804](https://github.com/paperless-ngx/paperless-ngx/pull/2804))
- Feature/2396 better mail actions [@jonaswinkler](https://github.com/jonaswinkler) ([#2718](https://github.com/paperless-ngx/paperless-ngx/pull/2718))
- Bump zone.js from 0.11.8 to 0.12.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#2793](https://github.com/paperless-ngx/paperless-ngx/pull/2793))
- Bump [@<!---->typescript-eslint/parser from 5.50.0 to 5.54.0 in /src-ui @dependabot](https://github.com/<!---->typescript-eslint/parser from 5.50.0 to 5.54.0 in /src-ui @dependabot) ([#2792](https://github.com/paperless-ngx/paperless-ngx/pull/2792))
- Bulk Bump angular packages to 15.2.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#2788](https://github.com/paperless-ngx/paperless-ngx/pull/2788))
- Fix: Ensure scratch directory exists before using [@stumpylog](https://github.com/stumpylog) ([#2775](https://github.com/paperless-ngx/paperless-ngx/pull/2775))
- Don't submit owner via API on document upload [@jonaswinkler](https://github.com/jonaswinkler) ([#2777](https://github.com/paperless-ngx/paperless-ngx/pull/2777))
- Feature: Reduce classifier memory usage somewhat during training [@stumpylog](https://github.com/stumpylog) ([#2733](https://github.com/paperless-ngx/paperless-ngx/pull/2733))
- Chore: Setup for mypy typing checks [@stumpylog](https://github.com/stumpylog) ([#2742](https://github.com/paperless-ngx/paperless-ngx/pull/2742))
- Feature: Add PAPERLESS_OCR_SKIP_ARCHIVE_FILE config setting [@bdr99](https://github.com/bdr99) ([#2743](https://github.com/paperless-ngx/paperless-ngx/pull/2743))
- Fix: only offer log files that exist [@shamoon](https://github.com/shamoon) ([#2739](https://github.com/paperless-ngx/paperless-ngx/pull/2739))
- Feature: dynamic document counts in dropdowns [@shamoon](https://github.com/shamoon) ([#2704](https://github.com/paperless-ngx/paperless-ngx/pull/2704))
- Fix: permissions editing and initial view issues [@shamoon](https://github.com/shamoon) ([#2717](https://github.com/paperless-ngx/paperless-ngx/pull/2717))
- Fix: reset saved view ID on quickFilter [@shamoon](https://github.com/shamoon) ([#2703](https://github.com/paperless-ngx/paperless-ngx/pull/2703))
- Feature: Add an option to disable matching [@bdr99](https://github.com/bdr99) ([#2727](https://github.com/paperless-ngx/paperless-ngx/pull/2727))
- Chore: Improve clarity of some test asserting [@stumpylog](https://github.com/stumpylog) ([#2714](https://github.com/paperless-ngx/paperless-ngx/pull/2714))
- Allow setting the ASN on document upload [@stumpylog](https://github.com/stumpylog) ([#2713](https://github.com/paperless-ngx/paperless-ngx/pull/2713))
- Fix: bulk edit reset apply button state [@shamoon](https://github.com/shamoon) ([#2701](https://github.com/paperless-ngx/paperless-ngx/pull/2701))
- Feature: Log failed login attempts [@shamoon](https://github.com/shamoon) ([#2359](https://github.com/paperless-ngx/paperless-ngx/pull/2359))
- Feature: Rename documents when storage path format changes [@stumpylog](https://github.com/stumpylog) ([#2696](https://github.com/paperless-ngx/paperless-ngx/pull/2696))
- Feature: update error message colors \& show on document failures [@shamoon](https://github.com/shamoon) ([#2689](https://github.com/paperless-ngx/paperless-ngx/pull/2689))
- Feature: multi-user permissions [@shamoon](https://github.com/shamoon) ([#2147](https://github.com/paperless-ngx/paperless-ngx/pull/2147))
- Fix: add missing i18n for mobile preview tab title [@nathanaelhoun](https://github.com/nathanaelhoun) ([#2692](https://github.com/paperless-ngx/paperless-ngx/pull/2692))
</details>

## paperless-ngx 1.13.0

### Features

- Feature: allow disable warn on close saved view with changes [@shamoon](https://github.com/shamoon) ([#2681](https://github.com/paperless-ngx/paperless-ngx/pull/2681))
- Feature: Add option to enable response compression [@stumpylog](https://github.com/stumpylog) ([#2621](https://github.com/paperless-ngx/paperless-ngx/pull/2621))
- Feature: split documents on ASN barcode [@muued](https://github.com/muued) ([#2554](https://github.com/paperless-ngx/paperless-ngx/pull/2554))

### Bug Fixes

- Fix: Ignore path filtering didn't handle sub directories [@stumpylog](https://github.com/stumpylog) ([#2674](https://github.com/paperless-ngx/paperless-ngx/pull/2674))
- Bugfix: Generation of secret key hangs during install script [@stumpylog](https://github.com/stumpylog) ([#2657](https://github.com/paperless-ngx/paperless-ngx/pull/2657))
- Fix: Remove files produced by barcode splitting when completed [@stumpylog](https://github.com/stumpylog) ([#2648](https://github.com/paperless-ngx/paperless-ngx/pull/2648))
- Fix: add missing storage path placeholders [@shamoon](https://github.com/shamoon) ([#2651](https://github.com/paperless-ngx/paperless-ngx/pull/2651))
- Fix long dropdown contents break document detail column view [@shamoon](https://github.com/shamoon) ([#2638](https://github.com/paperless-ngx/paperless-ngx/pull/2638))
- Fix: tags dropdown should stay closed when removing [@shamoon](https://github.com/shamoon) ([#2625](https://github.com/paperless-ngx/paperless-ngx/pull/2625))
- Bugfix: Configure scheduled tasks to expire after some time [@stumpylog](https://github.com/stumpylog) ([#2614](https://github.com/paperless-ngx/paperless-ngx/pull/2614))
- Bugfix: Limit management list pagination maxSize to 5 [@Kaaybi](https://github.com/Kaaybi) ([#2618](https://github.com/paperless-ngx/paperless-ngx/pull/2618))
- Fix: Don't crash on bad ASNs during indexing [@stumpylog](https://github.com/stumpylog) ([#2586](https://github.com/paperless-ngx/paperless-ngx/pull/2586))
- Fix: Prevent mktime OverflowError except in even more rare caes [@stumpylog](https://github.com/stumpylog) ([#2574](https://github.com/paperless-ngx/paperless-ngx/pull/2574))
- Bugfix: Whoosh relative date queries weren't handling timezones [@stumpylog](https://github.com/stumpylog) ([#2566](https://github.com/paperless-ngx/paperless-ngx/pull/2566))
- Fix importing files with non-ascii names [@Kexogg](https://github.com/Kexogg) ([#2555](https://github.com/paperless-ngx/paperless-ngx/pull/2555))

### Documentation

- Chore: update recommended Gotenberg to 7.8, docs note possible incompatibility [@shamoon](https://github.com/shamoon) ([#2608](https://github.com/paperless-ngx/paperless-ngx/pull/2608))
- [Documentation] Add v1.12.2 changelog [@github-actions](https://github.com/github-actions) ([#2553](https://github.com/paperless-ngx/paperless-ngx/pull/2553))

### Maintenance

- Chore: Faster Docker image cleanup [@stumpylog](https://github.com/stumpylog) ([#2687](https://github.com/paperless-ngx/paperless-ngx/pull/2687))
- Chore: Remove duplicated folder [@stumpylog](https://github.com/stumpylog) ([#2561](https://github.com/paperless-ngx/paperless-ngx/pull/2561))
- Chore: Switch test coverage to Codecov [@stumpylog](https://github.com/stumpylog) ([#2582](https://github.com/paperless-ngx/paperless-ngx/pull/2582))
- Bump docker/build-push-action from 3 to 4 [@dependabot](https://github.com/dependabot) ([#2576](https://github.com/paperless-ngx/paperless-ngx/pull/2576))
- Chore: Run tests which require convert in the CI [@stumpylog](https://github.com/stumpylog) ([#2570](https://github.com/paperless-ngx/paperless-ngx/pull/2570))

- Feature: split documents on ASN barcode [@muued](https://github.com/muued) ([#2554](https://github.com/paperless-ngx/paperless-ngx/pull/2554))
- Bugfix: Whoosh relative date queries weren't handling timezones [@stumpylog](https://github.com/stumpylog) ([#2566](https://github.com/paperless-ngx/paperless-ngx/pull/2566))
- Fix importing files with non-ascii names [@Kexogg](https://github.com/Kexogg) ([#2555](https://github.com/paperless-ngx/paperless-ngx/pull/2555))

## paperless-ngx 1.12.2

_Note: Version 1.12.x introduced searching of comments which will work for comments added after the upgrade but a reindex of the search index is required in order to be able to search
older comments. The Docker image will automatically perform this reindex, bare metal installations will have to perform this manually, see [the docs](https://docs.paperless-ngx.com/administration/#index)._

### Bug Fixes

- Bugfix: Allow pre-consume scripts to modify incoming file [@stumpylog](https://github.com/stumpylog) ([#2547](https://github.com/paperless-ngx/paperless-ngx/pull/2547))
- Bugfix: Return to page based barcode scanning [@stumpylog](https://github.com/stumpylog) ([#2544](https://github.com/paperless-ngx/paperless-ngx/pull/2544))
- Fix: Try to prevent title debounce overwriting [@shamoon](https://github.com/shamoon) ([#2543](https://github.com/paperless-ngx/paperless-ngx/pull/2543))
- Fix comment search highlight + multi-word search [@shamoon](https://github.com/shamoon) ([#2542](https://github.com/paperless-ngx/paperless-ngx/pull/2542))
- Bugfix: Request PDF/A format from Gotenberg [@stumpylog](https://github.com/stumpylog) ([#2530](https://github.com/paperless-ngx/paperless-ngx/pull/2530))
- Fix: Trigger reindex for pre-existing comments [@shamoon](https://github.com/shamoon) ([#2519](https://github.com/paperless-ngx/paperless-ngx/pull/2519))

### Documentation

- Bugfix: Allow pre-consume scripts to modify incoming file [@stumpylog](https://github.com/stumpylog) ([#2547](https://github.com/paperless-ngx/paperless-ngx/pull/2547))
- Fix: Trigger reindex for pre-existing comments [@shamoon](https://github.com/shamoon) ([#2519](https://github.com/paperless-ngx/paperless-ngx/pull/2519))
- Minor updates to development documentation [@clemensrieder](https://github.com/clemensrieder) ([#2474](https://github.com/paperless-ngx/paperless-ngx/pull/2474))
- [Documentation] Add v1.12.1 changelog [@github-actions](https://github.com/github-actions) ([#2515](https://github.com/paperless-ngx/paperless-ngx/pull/2515))

### Maintenance

- Chore: Fix tag cleaner to work with attestations [@stumpylog](https://github.com/stumpylog) ([#2532](https://github.com/paperless-ngx/paperless-ngx/pull/2532))
- Chore: Make installers statically versioned [@stumpylog](https://github.com/stumpylog) ([#2517](https://github.com/paperless-ngx/paperless-ngx/pull/2517))

### All App Changes

- Bugfix: Allow pre-consume scripts to modify incoming file [@stumpylog](https://github.com/stumpylog) ([#2547](https://github.com/paperless-ngx/paperless-ngx/pull/2547))
- Bugfix: Return to page based barcode scanning [@stumpylog](https://github.com/stumpylog) ([#2544](https://github.com/paperless-ngx/paperless-ngx/pull/2544))
- Fix: Try to prevent title debounce overwriting [@shamoon](https://github.com/shamoon) ([#2543](https://github.com/paperless-ngx/paperless-ngx/pull/2543))
- Fix comment search highlight + multi-word search [@shamoon](https://github.com/shamoon) ([#2542](https://github.com/paperless-ngx/paperless-ngx/pull/2542))
- Bugfix: Request PDF/A format from Gotenberg [@stumpylog](https://github.com/stumpylog) ([#2530](https://github.com/paperless-ngx/paperless-ngx/pull/2530))

## paperless-ngx 1.12.1

### Bug Fixes

- Fix: comments not showing in search until after manual reindex in v1.12 [@shamoon](https://github.com/shamoon) ([#2513](https://github.com/paperless-ngx/paperless-ngx/pull/2513))
- Fix: date range search broken in 1.12 [@shamoon](https://github.com/shamoon) ([#2509](https://github.com/paperless-ngx/paperless-ngx/pull/2509))

### Documentation

- [Documentation] Add v1.12.0 changelog [@github-actions](https://github.com/github-actions) ([#2507](https://github.com/paperless-ngx/paperless-ngx/pull/2507))

### Maintenance

- Moves back to the main release-drafter now that it does what we wanted [@stumpylog](https://github.com/stumpylog) ([#2503](https://github.com/paperless-ngx/paperless-ngx/pull/2503))

### All App Changes

- Fix: comments not showing in search until after manual reindex in v1.12 [@shamoon](https://github.com/shamoon) ([#2513](https://github.com/paperless-ngx/paperless-ngx/pull/2513))
- Fix: date range search broken in 1.12 [@shamoon](https://github.com/shamoon) ([#2509](https://github.com/paperless-ngx/paperless-ngx/pull/2509))

## paperless-ngx 1.12.0

### Features

- New document_exporter options [@mhelleboid](https://github.com/mhelleboid) ([#2448](https://github.com/paperless-ngx/paperless-ngx/pull/2448))
- Read ASN from barcode on page [@peterkappelt](https://github.com/peterkappelt) ([#2437](https://github.com/paperless-ngx/paperless-ngx/pull/2437))
- Add AppleMail color tag support [@clemensrieder](https://github.com/clemensrieder) ([#2407](https://github.com/paperless-ngx/paperless-ngx/pull/2407))
- Feature: Retain original filename on upload [@stumpylog](https://github.com/stumpylog) ([#2404](https://github.com/paperless-ngx/paperless-ngx/pull/2404))
- Feature: Control scheduled tasks via cron expressions [@stumpylog](https://github.com/stumpylog) ([#2403](https://github.com/paperless-ngx/paperless-ngx/pull/2403))
- Simplify json parsing in build scripts [@tribut](https://github.com/tribut) ([#2370](https://github.com/paperless-ngx/paperless-ngx/pull/2370))
- Feature: include comments in advanced search [@shamoon](https://github.com/shamoon) ([#2351](https://github.com/paperless-ngx/paperless-ngx/pull/2351))

### Bug Fixes

- Fix: limit asn integer size [@shamoon](https://github.com/shamoon) ([#2498](https://github.com/paperless-ngx/paperless-ngx/pull/2498))
- Bugfix: Rescales images for better barcode locating [@stumpylog](https://github.com/stumpylog) ([#2468](https://github.com/paperless-ngx/paperless-ngx/pull/2468))
- Fix: fix downgrade migration [@shamoon](https://github.com/shamoon) ([#2494](https://github.com/paperless-ngx/paperless-ngx/pull/2494))
- Fix: Allow setting mailrule order from frontend [@shamoon](https://github.com/shamoon) ([#2459](https://github.com/paperless-ngx/paperless-ngx/pull/2459))
- Fix: tag color ordering [@shamoon](https://github.com/shamoon) ([#2456](https://github.com/paperless-ngx/paperless-ngx/pull/2456))
- Fix: Better Handle arbitrary ISO 8601 strings after celery serializing [@shamoon](https://github.com/shamoon) ([#2441](https://github.com/paperless-ngx/paperless-ngx/pull/2441))
- Use correct canonical path for nltk_data [@amo13](https://github.com/amo13) ([#2429](https://github.com/paperless-ngx/paperless-ngx/pull/2429))
- Fix: Include optional socket file in release [@stumpylog](https://github.com/stumpylog) ([#2409](https://github.com/paperless-ngx/paperless-ngx/pull/2409))
- Fix: display rtl content in correct direction [@shamoon](https://github.com/shamoon) ([#2302](https://github.com/paperless-ngx/paperless-ngx/pull/2302))
- Fixed endpoint count in Docs The REST API [@PascalSenn](https://github.com/PascalSenn) ([#2386](https://github.com/paperless-ngx/paperless-ngx/pull/2386))
- Fix subpath for websockets [@tribut](https://github.com/tribut) ([#2371](https://github.com/paperless-ngx/paperless-ngx/pull/2371))
- Fix: Make missing environment from file files informational only [@stumpylog](https://github.com/stumpylog) ([#2368](https://github.com/paperless-ngx/paperless-ngx/pull/2368))
- Bugfix: Backend tests weren't using correct Python version [@stumpylog](https://github.com/stumpylog) ([#2363](https://github.com/paperless-ngx/paperless-ngx/pull/2363))
- Fix: preview content remains hidden on mobile [@shamoon](https://github.com/shamoon) ([#2346](https://github.com/paperless-ngx/paperless-ngx/pull/2346))
- Bugfix: Removal of alpha channel truncates multipage TIFFs [@stumpylog](https://github.com/stumpylog) ([#2335](https://github.com/paperless-ngx/paperless-ngx/pull/2335))
- Documentation: update build instructions to remove deprecated [@shamoon](https://github.com/shamoon) ([#2334](https://github.com/paperless-ngx/paperless-ngx/pull/2334))

### Documentation

- Docs: Fix typo - docker-compose.yml file name in setup doc [@muli](https://github.com/muli) ([#2477](https://github.com/paperless-ngx/paperless-ngx/pull/2477))
- document existence of document_thumbnails [@frrad](https://github.com/frrad) ([#2470](https://github.com/paperless-ngx/paperless-ngx/pull/2470))
- Add optional sudo command to bare metal docs [@shamoon](https://github.com/shamoon) ([#2464](https://github.com/paperless-ngx/paperless-ngx/pull/2464))
- Fix link [@edenhaus](https://github.com/edenhaus) ([#2458](https://github.com/paperless-ngx/paperless-ngx/pull/2458))
- Documentation: Fix comment re bare metal runserver command [@shamoon](https://github.com/shamoon) ([#2420](https://github.com/paperless-ngx/paperless-ngx/pull/2420))
- Fix formatting of config variable in docs [@peterkappelt](https://github.com/peterkappelt) ([#2445](https://github.com/paperless-ngx/paperless-ngx/pull/2445))
- Update docs nginx reverse proxy example [@Sprinterfreak](https://github.com/Sprinterfreak) ([#2443](https://github.com/paperless-ngx/paperless-ngx/pull/2443))
- [Documentation] Add note re for dev server [@shamoon](https://github.com/shamoon) ([#2387](https://github.com/paperless-ngx/paperless-ngx/pull/2387))
- Fixed endpoint count in Docs The REST API [@PascalSenn](https://github.com/PascalSenn) ([#2386](https://github.com/paperless-ngx/paperless-ngx/pull/2386))
- [ Docs] Update bare metal setup instructions [@natrius](https://github.com/natrius) ([#2281](https://github.com/paperless-ngx/paperless-ngx/pull/2281))
- [Docs] Add Paperless Mobile app to docs [@astubenbord](https://github.com/astubenbord) ([#2378](https://github.com/paperless-ngx/paperless-ngx/pull/2378))
- Tiny spelling change [@veverkap](https://github.com/veverkap) ([#2369](https://github.com/paperless-ngx/paperless-ngx/pull/2369))
- Documentation: update build instructions to remove deprecated [@shamoon](https://github.com/shamoon) ([#2334](https://github.com/paperless-ngx/paperless-ngx/pull/2334))
- [Documentation] Add note that PAPERLESS_URL cant contain a path [@shamoon](https://github.com/shamoon) ([#2319](https://github.com/paperless-ngx/paperless-ngx/pull/2319))
- [Documentation] Add v1.11.3 changelog [@github-actions](https://github.com/github-actions) ([#2311](https://github.com/paperless-ngx/paperless-ngx/pull/2311))

### Maintenance

- Fix: Include optional socket file in release [@stumpylog](https://github.com/stumpylog) ([#2409](https://github.com/paperless-ngx/paperless-ngx/pull/2409))
- Chore: remove helm chart code [@shamoon](https://github.com/shamoon) ([#2388](https://github.com/paperless-ngx/paperless-ngx/pull/2388))
- Simplify json parsing in build scripts [@tribut](https://github.com/tribut) ([#2370](https://github.com/paperless-ngx/paperless-ngx/pull/2370))
- Bugfix: Backend tests weren't using correct Python version [@stumpylog](https://github.com/stumpylog) ([#2363](https://github.com/paperless-ngx/paperless-ngx/pull/2363))
- Bump tj-actions/changed-files from 34 to 35 [@dependabot](https://github.com/dependabot) ([#2303](https://github.com/paperless-ngx/paperless-ngx/pull/2303))

### Dependencies

<details>
<summary>4 changes</summary>

- Chore: Backend library updates [@stumpylog](https://github.com/stumpylog) ([#2401](https://github.com/paperless-ngx/paperless-ngx/pull/2401))
- Bump tj-actions/changed-files from 34 to 35 [@dependabot](https://github.com/dependabot) ([#2303](https://github.com/paperless-ngx/paperless-ngx/pull/2303))
- Bump [@<!---->typescript-eslint/parser from 5.43.0 to 5.47.1 in /src-ui @dependabot](https://github.com/<!---->typescript-eslint/parser from 5.43.0 to 5.47.1 in /src-ui @dependabot) ([#2306](https://github.com/paperless-ngx/paperless-ngx/pull/2306))
- Bump [@<!---->typescript-eslint/eslint-plugin from 5.43.0 to 5.47.1 in /src-ui @dependabot](https://github.com/<!---->typescript-eslint/eslint-plugin from 5.43.0 to 5.47.1 in /src-ui @dependabot) ([#2308](https://github.com/paperless-ngx/paperless-ngx/pull/2308))
</details>

### All App Changes

- New document_exporter options [@mhelleboid](https://github.com/mhelleboid) ([#2448](https://github.com/paperless-ngx/paperless-ngx/pull/2448))
- Fix: limit asn integer size [@shamoon](https://github.com/shamoon) ([#2498](https://github.com/paperless-ngx/paperless-ngx/pull/2498))
- Fix: fix downgrade migration [@shamoon](https://github.com/shamoon) ([#2494](https://github.com/paperless-ngx/paperless-ngx/pull/2494))
- Read ASN from barcode on page [@peterkappelt](https://github.com/peterkappelt) ([#2437](https://github.com/paperless-ngx/paperless-ngx/pull/2437))
- Fix: Allow setting mailrule order from frontend [@shamoon](https://github.com/shamoon) ([#2459](https://github.com/paperless-ngx/paperless-ngx/pull/2459))
- Chore: Update to Angular 15 \& associated frontend deps [@shamoon](https://github.com/shamoon) ([#2411](https://github.com/paperless-ngx/paperless-ngx/pull/2411))
- Fix: tag color ordering [@shamoon](https://github.com/shamoon) ([#2456](https://github.com/paperless-ngx/paperless-ngx/pull/2456))
- Fix: Better Handle arbitrary ISO 8601 strings after celery serializing [@shamoon](https://github.com/shamoon) ([#2441](https://github.com/paperless-ngx/paperless-ngx/pull/2441))
- Use correct canonical path for nltk_data [@amo13](https://github.com/amo13) ([#2429](https://github.com/paperless-ngx/paperless-ngx/pull/2429))
- Add AppleMail color tag support [@clemensrieder](https://github.com/clemensrieder) ([#2407](https://github.com/paperless-ngx/paperless-ngx/pull/2407))
- Chore: Convert document exporter to use pathlib [@stumpylog](https://github.com/stumpylog) ([#2416](https://github.com/paperless-ngx/paperless-ngx/pull/2416))
- Feature: Retain original filename on upload [@stumpylog](https://github.com/stumpylog) ([#2404](https://github.com/paperless-ngx/paperless-ngx/pull/2404))
- Feature: Control scheduled tasks via cron expressions [@stumpylog](https://github.com/stumpylog) ([#2403](https://github.com/paperless-ngx/paperless-ngx/pull/2403))
- Fix: display rtl content in correct direction [@shamoon](https://github.com/shamoon) ([#2302](https://github.com/paperless-ngx/paperless-ngx/pull/2302))
- Fix subpath for websockets [@tribut](https://github.com/tribut) ([#2371](https://github.com/paperless-ngx/paperless-ngx/pull/2371))
- Bugfix: Backend tests weren't using correct Python version [@stumpylog](https://github.com/stumpylog) ([#2363](https://github.com/paperless-ngx/paperless-ngx/pull/2363))
- Feature: include comments in advanced search [@shamoon](https://github.com/shamoon) ([#2351](https://github.com/paperless-ngx/paperless-ngx/pull/2351))
- Chore: More frontend tests [@shamoon](https://github.com/shamoon) ([#2352](https://github.com/paperless-ngx/paperless-ngx/pull/2352))
- Chore: Fixing up some minor annoyances [@stumpylog](https://github.com/stumpylog) ([#2348](https://github.com/paperless-ngx/paperless-ngx/pull/2348))
- Bugfix: Removal of alpha channel truncates multipage TIFFs [@stumpylog](https://github.com/stumpylog) ([#2335](https://github.com/paperless-ngx/paperless-ngx/pull/2335))
- Documentation: update build instructions to remove deprecated [@shamoon](https://github.com/shamoon) ([#2334](https://github.com/paperless-ngx/paperless-ngx/pull/2334))
- Add Arabic language to frontend [@KhaledEmad7](https://github.com/KhaledEmad7) ([#2313](https://github.com/paperless-ngx/paperless-ngx/pull/2313))
- Bump [@<!---->typescript-eslint/parser from 5.43.0 to 5.47.1 in /src-ui @dependabot](https://github.com/<!---->typescript-eslint/parser from 5.43.0 to 5.47.1 in /src-ui @dependabot) ([#2306](https://github.com/paperless-ngx/paperless-ngx/pull/2306))
- Bump [@<!---->typescript-eslint/eslint-plugin from 5.43.0 to 5.47.1 in /src-ui @dependabot](https://github.com/<!---->typescript-eslint/eslint-plugin from 5.43.0 to 5.47.1 in /src-ui @dependabot) ([#2308](https://github.com/paperless-ngx/paperless-ngx/pull/2308))

## paperless-ngx 1.11.3

### Breaking Changes

_Note: PR #2279 could represent a breaking change to the API which may affect third party applications that were only checking the `post_document` endpoint for e.g. result = 'OK' as opposed to e.g. HTTP status = 200_

- Bugfix: Return created task ID when posting document to API [@stumpylog](https://github.com/stumpylog) ([#2279](https://github.com/paperless-ngx/paperless-ngx/pull/2279))

### Bug Fixes

- Bugfix: Fix no content when processing some RTL files [@stumpylog](https://github.com/stumpylog) ([#2295](https://github.com/paperless-ngx/paperless-ngx/pull/2295))
- Bugfix: Handle email dates maybe being naive [@stumpylog](https://github.com/stumpylog) ([#2293](https://github.com/paperless-ngx/paperless-ngx/pull/2293))
- Fix: live filterable dropdowns broken in 1.11.x [@shamoon](https://github.com/shamoon) ([#2292](https://github.com/paperless-ngx/paperless-ngx/pull/2292))
- Bugfix: Reading environment from files didn't work for management commands [@stumpylog](https://github.com/stumpylog) ([#2261](https://github.com/paperless-ngx/paperless-ngx/pull/2261))
- Bugfix: Return created task ID when posting document to API [@stumpylog](https://github.com/stumpylog) ([#2279](https://github.com/paperless-ngx/paperless-ngx/pull/2279))

### All App Changes

- Bugfix: Fix no content when processing some RTL files [@stumpylog](https://github.com/stumpylog) ([#2295](https://github.com/paperless-ngx/paperless-ngx/pull/2295))
- Bugfix: Handle email dates maybe being naive [@stumpylog](https://github.com/stumpylog) ([#2293](https://github.com/paperless-ngx/paperless-ngx/pull/2293))
- Fix: live filterable dropdowns broken in 1.11.x [@shamoon](https://github.com/shamoon) ([#2292](https://github.com/paperless-ngx/paperless-ngx/pull/2292))
- Bugfix: Return created task ID when posting document to API [@stumpylog](https://github.com/stumpylog) ([#2279](https://github.com/paperless-ngx/paperless-ngx/pull/2279))

## paperless-ngx 1.11.2

Versions 1.11.1 and 1.11.2 contain bug fixes from v1.11.0 that prevented use of the new email consumption feature

### Bug Fixes

- Fix frontend mailrule missing consumption scope parameter [@shamoon](https://github.com/shamoon) ([#2280](https://github.com/paperless-ngx/paperless-ngx/pull/2280))
- Fix: missing frontend email attachment options [@shamoon](https://github.com/shamoon) ([#2272](https://github.com/paperless-ngx/paperless-ngx/pull/2272))
- Fix: edit dialog creation in v1.11.0 [@shamoon](https://github.com/shamoon) ([#2273](https://github.com/paperless-ngx/paperless-ngx/pull/2273))

### All App Changes

- Fix frontend mailrule missing consumption scope parameter [@shamoon](https://github.com/shamoon) ([#2280](https://github.com/paperless-ngx/paperless-ngx/pull/2280))
- Fix: missing frontend email attachment options [@shamoon](https://github.com/shamoon) ([#2272](https://github.com/paperless-ngx/paperless-ngx/pull/2272))
- Fix: edit dialog creation in v1.11.0 [@shamoon](https://github.com/shamoon) ([#2273](https://github.com/paperless-ngx/paperless-ngx/pull/2273))

## paperless-ngx 1.11.0

### Notable Changes

- Feature: frontend paperless mail [@shamoon](https://github.com/shamoon) ([#2000](https://github.com/paperless-ngx/paperless-ngx/pull/2000))
- Feature: Ability to consume mails and eml files [@p-h-a-i-l](https://github.com/p-h-a-i-l) ([#848](https://github.com/paperless-ngx/paperless-ngx/pull/848))

### Features

- Chore: Downgrade hiredis to 2.0.0 [@stumpylog](https://github.com/stumpylog) ([#2262](https://github.com/paperless-ngx/paperless-ngx/pull/2262))
- Add ability to provide the configuration file path using an env variable [@hashworks](https://github.com/hashworks) ([#2241](https://github.com/paperless-ngx/paperless-ngx/pull/2241))
- Feature: Adds option to allow a user to export directly to a zipfile [@stumpylog](https://github.com/stumpylog) ([#2004](https://github.com/paperless-ngx/paperless-ngx/pull/2004))
- Feature: Adds PaperlessTask admin page interface [@stumpylog](https://github.com/stumpylog) ([#2184](https://github.com/paperless-ngx/paperless-ngx/pull/2184))
- Feature: speed up frontend by truncating content [@shamoon](https://github.com/shamoon) ([#2028](https://github.com/paperless-ngx/paperless-ngx/pull/2028))
- Feature: Allow bulk download API to follow file name formatting [@stumpylog](https://github.com/stumpylog) ([#2003](https://github.com/paperless-ngx/paperless-ngx/pull/2003))
- Feature: Bake NLTK into Docker image [@stumpylog](https://github.com/stumpylog) ([#2129](https://github.com/paperless-ngx/paperless-ngx/pull/2129))
- Feature: frontend paperless mail [@shamoon](https://github.com/shamoon) ([#2000](https://github.com/paperless-ngx/paperless-ngx/pull/2000))
- Feature: Ability to consume mails and eml files [@p-h-a-i-l](https://github.com/p-h-a-i-l) ([#848](https://github.com/paperless-ngx/paperless-ngx/pull/848))

### Bug Fixes

- Bugfix: Handle RTL languages better [@stumpylog](https://github.com/stumpylog) ([#1665](https://github.com/paperless-ngx/paperless-ngx/pull/1665))
- Fixed typo in docs [@mendelk](https://github.com/mendelk) ([#2256](https://github.com/paperless-ngx/paperless-ngx/pull/2256))
- Fix: support in advanced search, fix tags filter badge count for excluded [@shamoon](https://github.com/shamoon) ([#2205](https://github.com/paperless-ngx/paperless-ngx/pull/2205))
- Bugfix: Don't run system checks on migrate [@stumpylog](https://github.com/stumpylog) ([#2183](https://github.com/paperless-ngx/paperless-ngx/pull/2183))
- Bugfix: Decoding task signals could fail on datetime type [@stumpylog](https://github.com/stumpylog) ([#2058](https://github.com/paperless-ngx/paperless-ngx/pull/2058))

### Documentation

- Fixed typo in docs [@mendelk](https://github.com/mendelk) ([#2256](https://github.com/paperless-ngx/paperless-ngx/pull/2256))
- Docs: More fixes and improvements [@tooomm](https://github.com/tooomm) ([#2203](https://github.com/paperless-ngx/paperless-ngx/pull/2203))
- Docs: Fix leftover issues from conversion [@tooomm](https://github.com/tooomm) ([#2172](https://github.com/paperless-ngx/paperless-ngx/pull/2172))
- Docs: Fix broken internal links [@tooomm](https://github.com/tooomm) ([#2165](https://github.com/paperless-ngx/paperless-ngx/pull/2165))
- Update setup.md [@Weltraumschaf](https://github.com/Weltraumschaf) ([#2157](https://github.com/paperless-ngx/paperless-ngx/pull/2157))
- Chore: Cleanup of new documentation [@stumpylog](https://github.com/stumpylog) ([#2137](https://github.com/paperless-ngx/paperless-ngx/pull/2137))
- [Documentation] Add v1.10.2 changelog [@github-actions](https://github.com/github-actions) ([#2114](https://github.com/paperless-ngx/paperless-ngx/pull/2114))

### Maintenance

- Chore: Adds notable label for release drafter [@stumpylog](https://github.com/stumpylog) ([#2200](https://github.com/paperless-ngx/paperless-ngx/pull/2200))
- Chore: Prevent forks from having failing CI runs by default [@tooomm](https://github.com/tooomm) ([#2166](https://github.com/paperless-ngx/paperless-ngx/pull/2166))
- Chore: migrate to eslint [@shamoon](https://github.com/shamoon) ([#2199](https://github.com/paperless-ngx/paperless-ngx/pull/2199))
- Feature: Adds PaperlessTask admin page interface [@stumpylog](https://github.com/stumpylog) ([#2184](https://github.com/paperless-ngx/paperless-ngx/pull/2184))
- Chore: Changes qpdf to be cross compiled for large speed up [@stumpylog](https://github.com/stumpylog) ([#2181](https://github.com/paperless-ngx/paperless-ngx/pull/2181))
- Chore: Decrease time to build pikepdf [@stumpylog](https://github.com/stumpylog) ([#2178](https://github.com/paperless-ngx/paperless-ngx/pull/2178))
- Chore: Minor CI cleanups [@stumpylog](https://github.com/stumpylog) ([#2175](https://github.com/paperless-ngx/paperless-ngx/pull/2175))

### All App Changes

- Add ability to provide the configuration file path using an env variable [@hashworks](https://github.com/hashworks) ([#2241](https://github.com/paperless-ngx/paperless-ngx/pull/2241))
- Fix: support in advanced search, fix tags filter badge count for excluded [@shamoon](https://github.com/shamoon) ([#2205](https://github.com/paperless-ngx/paperless-ngx/pull/2205))
- Chore: migrate to eslint [@shamoon](https://github.com/shamoon) ([#2199](https://github.com/paperless-ngx/paperless-ngx/pull/2199))
- Feature: Adds option to allow a user to export directly to a zipfile [@stumpylog](https://github.com/stumpylog) ([#2004](https://github.com/paperless-ngx/paperless-ngx/pull/2004))
- Feature: Adds PaperlessTask admin page interface [@stumpylog](https://github.com/stumpylog) ([#2184](https://github.com/paperless-ngx/paperless-ngx/pull/2184))
- Bugfix: Decoding task signals could fail on datetime type [@stumpylog](https://github.com/stumpylog) ([#2058](https://github.com/paperless-ngx/paperless-ngx/pull/2058))
- Feature: speed up frontend by truncating content [@shamoon](https://github.com/shamoon) ([#2028](https://github.com/paperless-ngx/paperless-ngx/pull/2028))
- Feature: Allow bulk download API to follow file name formatting [@stumpylog](https://github.com/stumpylog) ([#2003](https://github.com/paperless-ngx/paperless-ngx/pull/2003))
- Feature: Bake NLTK into Docker image [@stumpylog](https://github.com/stumpylog) ([#2129](https://github.com/paperless-ngx/paperless-ngx/pull/2129))
- Chore: Apply live testing backoff logic to new mail tests [@stumpylog](https://github.com/stumpylog) ([#2134](https://github.com/paperless-ngx/paperless-ngx/pull/2134))
- Feature: frontend paperless mail [@shamoon](https://github.com/shamoon) ([#2000](https://github.com/paperless-ngx/paperless-ngx/pull/2000))
- Feature: Ability to consume mails and eml files [@p-h-a-i-l](https://github.com/p-h-a-i-l) ([#848](https://github.com/paperless-ngx/paperless-ngx/pull/848))

## paperless-ngx 1.10.2

### Features

- Take ownership of k8s-at-home Helm chart [@alexander-bauer](https://github.com/alexander-bauer) ([#1947](https://github.com/paperless-ngx/paperless-ngx/pull/1947))

### Bug Fixes

- Bugfix: Language code checks around two part languages [@stumpylog](https://github.com/stumpylog) ([#2112](https://github.com/paperless-ngx/paperless-ngx/pull/2112))
- Bugfix: Redis socket compatibility didn't handle URLs with ports [@stumpylog](https://github.com/stumpylog) ([#2109](https://github.com/paperless-ngx/paperless-ngx/pull/2109))
- Bugfix: Incompatible URL schemes for socket based Redis [@stumpylog](https://github.com/stumpylog) ([#2092](https://github.com/paperless-ngx/paperless-ngx/pull/2092))
- Fix doc links in contributing [@tooomm](https://github.com/tooomm) ([#2102](https://github.com/paperless-ngx/paperless-ngx/pull/2102))

### Documentation

- Docs: Some more small MkDocs updates [@tooomm](https://github.com/tooomm) ([#2106](https://github.com/paperless-ngx/paperless-ngx/pull/2106))
- Chore: Cleans up documentation links [@stumpylog](https://github.com/stumpylog) ([#2104](https://github.com/paperless-ngx/paperless-ngx/pull/2104))
- Feature: Move docs to material-mkdocs [@shamoon](https://github.com/shamoon) ([#2067](https://github.com/paperless-ngx/paperless-ngx/pull/2067))
- Chore: Add v1.10.1 changelong [@shamoon](https://github.com/shamoon) ([#2082](https://github.com/paperless-ngx/paperless-ngx/pull/2082))

### Maintenance

- Take ownership of k8s-at-home Helm chart [@alexander-bauer](https://github.com/alexander-bauer) ([#1947](https://github.com/paperless-ngx/paperless-ngx/pull/1947))

### All App Changes

- Bugfix: Language code checks around two part languages [@stumpylog](https://github.com/stumpylog) ([#2112](https://github.com/paperless-ngx/paperless-ngx/pull/2112))
- Bugfix: Redis socket compatibility didn't handle URLs with ports [@stumpylog](https://github.com/stumpylog) ([#2109](https://github.com/paperless-ngx/paperless-ngx/pull/2109))
- Bugfix: Incompatible URL schemes for socket based Redis [@stumpylog](https://github.com/stumpylog) ([#2092](https://github.com/paperless-ngx/paperless-ngx/pull/2092))

## paperless-ngx 1.10.1

### Features

- Feature: Allows documents in WebP format [@stumpylog](https://github.com/stumpylog) ([#1984](https://github.com/paperless-ngx/paperless-ngx/pull/1984))

### Bug Fixes

- Fix: frontend tasks display in 1.10.0 [@shamoon](https://github.com/shamoon) ([#2073](https://github.com/paperless-ngx/paperless-ngx/pull/2073))
- Bugfix: Custom startup commands weren't run as root [@stumpylog](https://github.com/stumpylog) ([#2069](https://github.com/paperless-ngx/paperless-ngx/pull/2069))
- Bugfix: Add libatomic for armv7 compatibility [@stumpylog](https://github.com/stumpylog) ([#2066](https://github.com/paperless-ngx/paperless-ngx/pull/2066))
- Bugfix: Don't silence an exception when trying to handle file naming [@stumpylog](https://github.com/stumpylog) ([#2062](https://github.com/paperless-ngx/paperless-ngx/pull/2062))
- Bugfix: Some tesseract languages aren't detected as installed. [@stumpylog](https://github.com/stumpylog) ([#2057](https://github.com/paperless-ngx/paperless-ngx/pull/2057))

### Maintenance

- Chore: Use a maintained upload-release-asset [@stumpylog](https://github.com/stumpylog) ([#2055](https://github.com/paperless-ngx/paperless-ngx/pull/2055))

### Dependencies

  <details>
  <summary>5 changes</summary>

- Bump tslib from 2.4.0 to 2.4.1 in /src-ui @dependabot ([#2076](https://github.com/paperless-ngx/paperless-ngx/pull/2076))
- Bump @<!---->angular-builders/jest from 14.0.1 to 14.1.0 in /src-ui @dependabot ([#2079](https://github.com/paperless-ngx/paperless-ngx/pull/2079))
- Bump jest-preset-angular from 12.2.2 to 12.2.3 in /src-ui @dependabot ([#2078](https://github.com/paperless-ngx/paperless-ngx/pull/2078))
- Bump ngx-file-drop from 14.0.1 to 14.0.2 in /src-ui @dependabot ([#2080](https://github.com/paperless-ngx/paperless-ngx/pull/2080))
- Bump @<!---->ngneat/dirty-check-forms from 3.0.2 to 3.0.3 in /src-ui @dependabot ([#2077](https://github.com/paperless-ngx/paperless-ngx/pull/2077))
</details>

### All App Changes

- Bump tslib from 2.4.0 to 2.4.1 in /src-ui @dependabot ([#2076](https://github.com/paperless-ngx/paperless-ngx/pull/2076))
- Bump @<!---->angular-builders/jest from 14.0.1 to 14.1.0 in /src-ui @dependabot ([#2079](https://github.com/paperless-ngx/paperless-ngx/pull/2079))
- Bump jest-preset-angular from 12.2.2 to 12.2.3 in /src-ui @dependabot ([#2078](https://github.com/paperless-ngx/paperless-ngx/pull/2078))
- Bump ngx-file-drop from 14.0.1 to 14.0.2 in /src-ui @dependabot ([#2080](https://github.com/paperless-ngx/paperless-ngx/pull/2080))
- Bump @<!---->ngneat/dirty-check-forms from 3.0.2 to 3.0.3 in /src-ui @dependabot ([#2077](https://github.com/paperless-ngx/paperless-ngx/pull/2077))
- Fix: frontend tasks display in 1.10.0 [@shamoon](https://github.com/shamoon) ([#2073](https://github.com/paperless-ngx/paperless-ngx/pull/2073))
- Bugfix: Don't silence an exception when trying to handle file naming [@stumpylog](https://github.com/stumpylog) ([#2062](https://github.com/paperless-ngx/paperless-ngx/pull/2062))
- Bugfix: Some tesseract languages aren't detected as installed. [@stumpylog](https://github.com/stumpylog) ([#2057](https://github.com/paperless-ngx/paperless-ngx/pull/2057))

## paperless-ngx 1.10.0

### Features

- Feature: Capture stdout \& stderr of the pre/post consume scripts [@stumpylog](https://github.com/stumpylog) ([#1967](https://github.com/paperless-ngx/paperless-ngx/pull/1967))
- Feature: Allow running custom container initialization scripts [@stumpylog](https://github.com/stumpylog) ([#1838](https://github.com/paperless-ngx/paperless-ngx/pull/1838))
- Feature: Add more file name formatting options [@stumpylog](https://github.com/stumpylog) ([#1906](https://github.com/paperless-ngx/paperless-ngx/pull/1906))
- Feature: 1.9.2 UI tweaks [@shamoon](https://github.com/shamoon) ([#1886](https://github.com/paperless-ngx/paperless-ngx/pull/1886))
- Feature: Optional celery monitoring with Flower [@stumpylog](https://github.com/stumpylog) ([#1810](https://github.com/paperless-ngx/paperless-ngx/pull/1810))
- Feature: Save pending tasks for frontend [@stumpylog](https://github.com/stumpylog) ([#1816](https://github.com/paperless-ngx/paperless-ngx/pull/1816))
- Feature: Improved processing for automatic matching [@stumpylog](https://github.com/stumpylog) ([#1609](https://github.com/paperless-ngx/paperless-ngx/pull/1609))
- Feature: Transition to celery for background tasks [@stumpylog](https://github.com/stumpylog) ([#1648](https://github.com/paperless-ngx/paperless-ngx/pull/1648))
- Feature: UI Welcome Tour [@shamoon](https://github.com/shamoon) ([#1644](https://github.com/paperless-ngx/paperless-ngx/pull/1644))
- Feature: slim sidebar [@shamoon](https://github.com/shamoon) ([#1641](https://github.com/paperless-ngx/paperless-ngx/pull/1641))
- change default matching algo to auto and move to constant [@NiFNi](https://github.com/NiFNi) ([#1754](https://github.com/paperless-ngx/paperless-ngx/pull/1754))
- Feature: Enable end to end Tika testing in CI [@stumpylog](https://github.com/stumpylog) ([#1757](https://github.com/paperless-ngx/paperless-ngx/pull/1757))
- Feature: frontend update checking settings [@shamoon](https://github.com/shamoon) ([#1692](https://github.com/paperless-ngx/paperless-ngx/pull/1692))
- Feature: Upgrade to qpdf 11, pikepdf 6 \& ocrmypdf 14 [@stumpylog](https://github.com/stumpylog) ([#1642](https://github.com/paperless-ngx/paperless-ngx/pull/1642))

### Bug Fixes

- Bugfix: Fix created_date being a string [@stumpylog](https://github.com/stumpylog) ([#2023](https://github.com/paperless-ngx/paperless-ngx/pull/2023))
- Bugfix: Fixes an issue with mixed text and images when redoing OCR [@stumpylog](https://github.com/stumpylog) ([#2017](https://github.com/paperless-ngx/paperless-ngx/pull/2017))
- Bugfix: Always re-try barcodes with pdf2image [@stumpylog](https://github.com/stumpylog) ([#1953](https://github.com/paperless-ngx/paperless-ngx/pull/1953))
- Fix: using `CONSUMER_SUBDIRS_AS_TAGS` causes failure with Celery in `dev` [@shamoon](https://github.com/shamoon) ([#1942](https://github.com/paperless-ngx/paperless-ngx/pull/1942))
- Fix mail consumption broken in `dev` after move to celery [@shamoon](https://github.com/shamoon) ([#1934](https://github.com/paperless-ngx/paperless-ngx/pull/1934))
- Bugfix: Prevent file handling from running with stale data [@stumpylog](https://github.com/stumpylog) ([#1905](https://github.com/paperless-ngx/paperless-ngx/pull/1905))
- Chore: Reduce nuisance CI test failures [@stumpylog](https://github.com/stumpylog) ([#1922](https://github.com/paperless-ngx/paperless-ngx/pull/1922))
- Bugfix: Unintentional deletion of feature tagged Docker images [@stumpylog](https://github.com/stumpylog) ([#1896](https://github.com/paperless-ngx/paperless-ngx/pull/1896))
- Fix: independent control of saved views [@shamoon](https://github.com/shamoon) ([#1868](https://github.com/paperless-ngx/paperless-ngx/pull/1868))
- Fix: frontend relative date searches [@shamoon](https://github.com/shamoon) ([#1865](https://github.com/paperless-ngx/paperless-ngx/pull/1865))
- Chore: Fixes pipenv issues [@stumpylog](https://github.com/stumpylog) ([#1873](https://github.com/paperless-ngx/paperless-ngx/pull/1873))
- Bugfix: Handle password protected PDFs during barcode detection [@stumpylog](https://github.com/stumpylog) ([#1858](https://github.com/paperless-ngx/paperless-ngx/pull/1858))
- Fix: Allows configuring barcodes with pdf2image instead of pikepdf [@stumpylog](https://github.com/stumpylog) ([#1857](https://github.com/paperless-ngx/paperless-ngx/pull/1857))
- Bugfix: Reverts the change around skip_noarchive [@stumpylog](https://github.com/stumpylog) ([#1829](https://github.com/paperless-ngx/paperless-ngx/pull/1829))
- Fix: missing loadViewConfig breaks loading saved view [@shamoon](https://github.com/shamoon) ([#1792](https://github.com/paperless-ngx/paperless-ngx/pull/1792))
- Bugfix: Fallback to pdf2image if pikepdf fails [@stumpylog](https://github.com/stumpylog) ([#1745](https://github.com/paperless-ngx/paperless-ngx/pull/1745))
- Fix: creating new storage path on document edit fails to update menu [@shamoon](https://github.com/shamoon) ([#1777](https://github.com/paperless-ngx/paperless-ngx/pull/1777))
- Bugfix: Files containing barcodes uploaded via web are not consumed after splitting [@stumpylog](https://github.com/stumpylog) ([#1762](https://github.com/paperless-ngx/paperless-ngx/pull/1762))
- Bugfix: Fix email labeling for non-Gmail servers [@stumpylog](https://github.com/stumpylog) ([#1755](https://github.com/paperless-ngx/paperless-ngx/pull/1755))
- Fix: allow preview for .csv files [@shamoon](https://github.com/shamoon) ([#1744](https://github.com/paperless-ngx/paperless-ngx/pull/1744))
- Bugfix: csv recognition by consumer [@bin101](https://github.com/bin101) ([#1726](https://github.com/paperless-ngx/paperless-ngx/pull/1726))
- Bugfix: Include document title when a duplicate is detected [@stumpylog](https://github.com/stumpylog) ([#1696](https://github.com/paperless-ngx/paperless-ngx/pull/1696))
- Bugfix: Set MySql charset [@stumpylog](https://github.com/stumpylog) ([#1687](https://github.com/paperless-ngx/paperless-ngx/pull/1687))
- Mariadb compose files should use `PAPERLESS_DBPASS` [@shamoon](https://github.com/shamoon) ([#1683](https://github.com/paperless-ngx/paperless-ngx/pull/1683))

### Documentation

- Documentation: Update MariaDB docs to note some potential issues [@stumpylog](https://github.com/stumpylog) ([#2016](https://github.com/paperless-ngx/paperless-ngx/pull/2016))
- Documentation: Add note re MS exchange servers [@shamoon](https://github.com/shamoon) ([#1780](https://github.com/paperless-ngx/paperless-ngx/pull/1780))
- Chore: Updates Gotenberg versions [@stumpylog](https://github.com/stumpylog) ([#1768](https://github.com/paperless-ngx/paperless-ngx/pull/1768))
- Documentation: Tweak LinuxServer [@stumpylog](https://github.com/stumpylog) ([#1761](https://github.com/paperless-ngx/paperless-ngx/pull/1761))
- Documentation: Adds troubleshooting note about Kubernetes and ports [@stumpylog](https://github.com/stumpylog) ([#1731](https://github.com/paperless-ngx/paperless-ngx/pull/1731))
- Documentation: LinuxServer.io Migration [@stumpylog](https://github.com/stumpylog) ([#1733](https://github.com/paperless-ngx/paperless-ngx/pull/1733))
- [Documentation] Add v1.9.2 changelog [@github-actions](https://github.com/github-actions) ([#1671](https://github.com/paperless-ngx/paperless-ngx/pull/1671))

### Maintenance

- Bump tj-actions/changed-files from 32 to 34 [@dependabot](https://github.com/dependabot) ([#1915](https://github.com/paperless-ngx/paperless-ngx/pull/1915))
- Chore: Fix `dev` trying to build Pillow or lxml [@stumpylog](https://github.com/stumpylog) ([#1909](https://github.com/paperless-ngx/paperless-ngx/pull/1909))
- Chore: Fixes pipenv issues [@stumpylog](https://github.com/stumpylog) ([#1873](https://github.com/paperless-ngx/paperless-ngx/pull/1873))
- Chore: Simplified registry cleanup [@stumpylog](https://github.com/stumpylog) ([#1812](https://github.com/paperless-ngx/paperless-ngx/pull/1812))
- Chore: Fixing deprecated workflow commands [@stumpylog](https://github.com/stumpylog) ([#1786](https://github.com/paperless-ngx/paperless-ngx/pull/1786))
- Chore: Python library update + test fixes [@stumpylog](https://github.com/stumpylog) ([#1773](https://github.com/paperless-ngx/paperless-ngx/pull/1773))
- Chore: Updates Gotenberg versions [@stumpylog](https://github.com/stumpylog) ([#1768](https://github.com/paperless-ngx/paperless-ngx/pull/1768))
- Bump leonsteinhaeuser/project-beta-automations from 1.3.0 to 2.0.1 [@dependabot](https://github.com/dependabot) ([#1703](https://github.com/paperless-ngx/paperless-ngx/pull/1703))
- Bump tj-actions/changed-files from 29.0.2 to 31.0.2 [@dependabot](https://github.com/dependabot) ([#1702](https://github.com/paperless-ngx/paperless-ngx/pull/1702))
- Bump actions/checkout from 2 to 3 [@dependabot](https://github.com/dependabot) ([#1704](https://github.com/paperless-ngx/paperless-ngx/pull/1704))
- Bump actions/setup-python from 3 to 4 [@dependabot](https://github.com/dependabot) ([#1705](https://github.com/paperless-ngx/paperless-ngx/pull/1705))

### Dependencies

<details>
<summary>31 changes</summary>

- Bugfix: Downgrade cryptography for armv7 compatibility [@stumpylog](https://github.com/stumpylog) ([#1954](https://github.com/paperless-ngx/paperless-ngx/pull/1954))
- Chore: Bulk library updates + loosen restrictions [@stumpylog](https://github.com/stumpylog) ([#1949](https://github.com/paperless-ngx/paperless-ngx/pull/1949))
- Bump tj-actions/changed-files from 32 to 34 [@dependabot](https://github.com/dependabot) ([#1915](https://github.com/paperless-ngx/paperless-ngx/pull/1915))
- Bump scikit-learn from 1.1.2 to 1.1.3 [@dependabot](https://github.com/dependabot) ([#1903](https://github.com/paperless-ngx/paperless-ngx/pull/1903))
- Bump angular packages as bundle [@dependabot](https://github.com/dependabot) ([#1910](https://github.com/paperless-ngx/paperless-ngx/pull/1910))
- Bump ngx-ui-tour-ng-bootstrap from 11.0.0 to 11.1.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#1911](https://github.com/paperless-ngx/paperless-ngx/pull/1911))
- Bump jest-environment-jsdom from 29.1.2 to 29.2.2 in /src-ui [@dependabot](https://github.com/dependabot) ([#1914](https://github.com/paperless-ngx/paperless-ngx/pull/1914))
- Bump pillow from 9.2.0 to 9.3.0 [@dependabot](https://github.com/dependabot) ([#1904](https://github.com/paperless-ngx/paperless-ngx/pull/1904))
- Bump pytest from 7.1.3 to 7.2.0 [@dependabot](https://github.com/dependabot) ([#1902](https://github.com/paperless-ngx/paperless-ngx/pull/1902))
- Bump tox from 3.26.0 to 3.27.0 [@dependabot](https://github.com/dependabot) ([#1901](https://github.com/paperless-ngx/paperless-ngx/pull/1901))
- Bump zipp from 3.9.0 to 3.10.0 [@dependabot](https://github.com/dependabot) ([#1860](https://github.com/paperless-ngx/paperless-ngx/pull/1860))
- Bump pytest-env from 0.6.2 to 0.8.1 [@dependabot](https://github.com/dependabot) ([#1859](https://github.com/paperless-ngx/paperless-ngx/pull/1859))
- Bump sphinx from 5.2.3 to 5.3.0 [@dependabot](https://github.com/dependabot) ([#1817](https://github.com/paperless-ngx/paperless-ngx/pull/1817))
- Chore: downgrade channels-redis [@stumpylog](https://github.com/stumpylog) ([#1802](https://github.com/paperless-ngx/paperless-ngx/pull/1802))
- Chore: Update to qpdf 11.1.1 and update backend libraries [@stumpylog](https://github.com/stumpylog) ([#1749](https://github.com/paperless-ngx/paperless-ngx/pull/1749))
- Bump myst-parser from 0.18.0 to 0.18.1 [@dependabot](https://github.com/dependabot) ([#1738](https://github.com/paperless-ngx/paperless-ngx/pull/1738))
- Bump leonsteinhaeuser/project-beta-automations from 1.3.0 to 2.0.1 [@dependabot](https://github.com/dependabot) ([#1703](https://github.com/paperless-ngx/paperless-ngx/pull/1703))
- Bump tj-actions/changed-files from 29.0.2 to 31.0.2 [@dependabot](https://github.com/dependabot) ([#1702](https://github.com/paperless-ngx/paperless-ngx/pull/1702))
- Bump actions/checkout from 2 to 3 [@dependabot](https://github.com/dependabot) ([#1704](https://github.com/paperless-ngx/paperless-ngx/pull/1704))
- Bump actions/setup-python from 3 to 4 [@dependabot](https://github.com/dependabot) ([#1705](https://github.com/paperless-ngx/paperless-ngx/pull/1705))
- Bump rxjs from 7.5.6 to 7.5.7 in /src-ui [@dependabot](https://github.com/dependabot) ([#1720](https://github.com/paperless-ngx/paperless-ngx/pull/1720))
- Bump uuid from 8.3.2 to 9.0.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#1716](https://github.com/paperless-ngx/paperless-ngx/pull/1716))
- Bump ng2-pdf-viewer from 9.1.0 to 9.1.2 in /src-ui [@dependabot](https://github.com/dependabot) ([#1717](https://github.com/paperless-ngx/paperless-ngx/pull/1717))
- Bump ngx-color from 8.0.2 to 8.0.3 in /src-ui [@dependabot](https://github.com/dependabot) ([#1715](https://github.com/paperless-ngx/paperless-ngx/pull/1715))
- Bump concurrently from 7.3.0 to 7.4.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#1719](https://github.com/paperless-ngx/paperless-ngx/pull/1719))
- Bump [@<!---->types/node from 18.7.14 to 18.7.23 in /src-ui @dependabot](https://github.com/<!---->types/node from 18.7.14 to 18.7.23 in /src-ui @dependabot) ([#1718](https://github.com/paperless-ngx/paperless-ngx/pull/1718))
- Bump jest-environment-jsdom from 29.0.1 to 29.1.2 in /src-ui [@dependabot](https://github.com/dependabot) ([#1714](https://github.com/paperless-ngx/paperless-ngx/pull/1714))
- Bump [@<!---->angular/cli @<!---->angular/core @dependabot](https://github.com/<!---->angular/cli @<!---->angular/core @dependabot) ([#1708](https://github.com/paperless-ngx/paperless-ngx/pull/1708))
- Bump cypress from 10.7.0 to 10.9.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#1707](https://github.com/paperless-ngx/paperless-ngx/pull/1707))
- Bump bootstrap from 5.2.0 to 5.2.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#1710](https://github.com/paperless-ngx/paperless-ngx/pull/1710))
- Bump typescript from 4.7.4 to 4.8.4 in /src-ui [@dependabot](https://github.com/dependabot) ([#1706](https://github.com/paperless-ngx/paperless-ngx/pull/1706))
</details>

### All App Changes

- Add info that re-do OCR doesnt automatically refresh content [@shamoon](https://github.com/shamoon) ([#2025](https://github.com/paperless-ngx/paperless-ngx/pull/2025))
- Bugfix: Fix created_date being a string [@stumpylog](https://github.com/stumpylog) ([#2023](https://github.com/paperless-ngx/paperless-ngx/pull/2023))
- Bugfix: Fixes an issue with mixed text and images when redoing OCR [@stumpylog](https://github.com/stumpylog) ([#2017](https://github.com/paperless-ngx/paperless-ngx/pull/2017))
- Bugfix: Don't allow exceptions during date parsing to fail consume [@stumpylog](https://github.com/stumpylog) ([#1998](https://github.com/paperless-ngx/paperless-ngx/pull/1998))
- Feature: Capture stdout \& stderr of the pre/post consume scripts [@stumpylog](https://github.com/stumpylog) ([#1967](https://github.com/paperless-ngx/paperless-ngx/pull/1967))
- Bugfix: Always re-try barcodes with pdf2image [@stumpylog](https://github.com/stumpylog) ([#1953](https://github.com/paperless-ngx/paperless-ngx/pull/1953))
- Fix: using `CONSUMER_SUBDIRS_AS_TAGS` causes failure with Celery in `dev` [@shamoon](https://github.com/shamoon) ([#1942](https://github.com/paperless-ngx/paperless-ngx/pull/1942))
- Fix mail consumption broken in `dev` after move to celery [@shamoon](https://github.com/shamoon) ([#1934](https://github.com/paperless-ngx/paperless-ngx/pull/1934))
- Bugfix: Prevent file handling from running with stale data [@stumpylog](https://github.com/stumpylog) ([#1905](https://github.com/paperless-ngx/paperless-ngx/pull/1905))
- Chore: Reduce nuisance CI test failures [@stumpylog](https://github.com/stumpylog) ([#1922](https://github.com/paperless-ngx/paperless-ngx/pull/1922))
- Bump scikit-learn from 1.1.2 to 1.1.3 [@dependabot](https://github.com/dependabot) ([#1903](https://github.com/paperless-ngx/paperless-ngx/pull/1903))
- Bump angular packages as bundle [@dependabot](https://github.com/dependabot) ([#1910](https://github.com/paperless-ngx/paperless-ngx/pull/1910))
- Bump ngx-ui-tour-ng-bootstrap from 11.0.0 to 11.1.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#1911](https://github.com/paperless-ngx/paperless-ngx/pull/1911))
- Bump jest-environment-jsdom from 29.1.2 to 29.2.2 in /src-ui [@dependabot](https://github.com/dependabot) ([#1914](https://github.com/paperless-ngx/paperless-ngx/pull/1914))
- Feature: Add more file name formatting options [@stumpylog](https://github.com/stumpylog) ([#1906](https://github.com/paperless-ngx/paperless-ngx/pull/1906))
- Bump pillow from 9.2.0 to 9.3.0 [@dependabot](https://github.com/dependabot) ([#1904](https://github.com/paperless-ngx/paperless-ngx/pull/1904))
- Bump pytest from 7.1.3 to 7.2.0 [@dependabot](https://github.com/dependabot) ([#1902](https://github.com/paperless-ngx/paperless-ngx/pull/1902))
- Bump tox from 3.26.0 to 3.27.0 [@dependabot](https://github.com/dependabot) ([#1901](https://github.com/paperless-ngx/paperless-ngx/pull/1901))
- directly use rapidfuzz [@maxbachmann](https://github.com/maxbachmann) ([#1899](https://github.com/paperless-ngx/paperless-ngx/pull/1899))
- Feature: 1.9.2 UI tweaks [@shamoon](https://github.com/shamoon) ([#1886](https://github.com/paperless-ngx/paperless-ngx/pull/1886))
- Bump zipp from 3.9.0 to 3.10.0 [@dependabot](https://github.com/dependabot) ([#1860](https://github.com/paperless-ngx/paperless-ngx/pull/1860))
- Fix: independent control of saved views [@shamoon](https://github.com/shamoon) ([#1868](https://github.com/paperless-ngx/paperless-ngx/pull/1868))
- Fix: frontend relative date searches [@shamoon](https://github.com/shamoon) ([#1865](https://github.com/paperless-ngx/paperless-ngx/pull/1865))
- Django error W003 - MariaDB may not allow unique CharFields to have a max_length > 255. [@Sblop](https://github.com/Sblop) ([#1881](https://github.com/paperless-ngx/paperless-ngx/pull/1881))
- Bump pytest-env from 0.6.2 to 0.8.1 [@dependabot](https://github.com/dependabot) ([#1859](https://github.com/paperless-ngx/paperless-ngx/pull/1859))
- Fix: Allows configuring barcodes with pdf2image instead of pikepdf [@stumpylog](https://github.com/stumpylog) ([#1857](https://github.com/paperless-ngx/paperless-ngx/pull/1857))
- Feature: Save pending tasks for frontend [@stumpylog](https://github.com/stumpylog) ([#1816](https://github.com/paperless-ngx/paperless-ngx/pull/1816))
- Bugfix: Reverts the change around skip_noarchive [@stumpylog](https://github.com/stumpylog) ([#1829](https://github.com/paperless-ngx/paperless-ngx/pull/1829))
- Bump sphinx from 5.2.3 to 5.3.0 [@dependabot](https://github.com/dependabot) ([#1817](https://github.com/paperless-ngx/paperless-ngx/pull/1817))
- Fix: missing loadViewConfig breaks loading saved view [@shamoon](https://github.com/shamoon) ([#1792](https://github.com/paperless-ngx/paperless-ngx/pull/1792))
- Bugfix: Fallback to pdf2image if pikepdf fails [@stumpylog](https://github.com/stumpylog) ([#1745](https://github.com/paperless-ngx/paperless-ngx/pull/1745))
- Fix: creating new storage path on document edit fails to update menu [@shamoon](https://github.com/shamoon) ([#1777](https://github.com/paperless-ngx/paperless-ngx/pull/1777))
- Chore: Python library update + test fixes [@stumpylog](https://github.com/stumpylog) ([#1773](https://github.com/paperless-ngx/paperless-ngx/pull/1773))
- Feature: Improved processing for automatic matching [@stumpylog](https://github.com/stumpylog) ([#1609](https://github.com/paperless-ngx/paperless-ngx/pull/1609))
- Feature: Transition to celery for background tasks [@stumpylog](https://github.com/stumpylog) ([#1648](https://github.com/paperless-ngx/paperless-ngx/pull/1648))
- Feature: UI Welcome Tour [@shamoon](https://github.com/shamoon) ([#1644](https://github.com/paperless-ngx/paperless-ngx/pull/1644))
- Feature: slim sidebar [@shamoon](https://github.com/shamoon) ([#1641](https://github.com/paperless-ngx/paperless-ngx/pull/1641))
- Bugfix: Files containing barcodes uploaded via web are not consumed after splitting [@stumpylog](https://github.com/stumpylog) ([#1762](https://github.com/paperless-ngx/paperless-ngx/pull/1762))
- change default matching algo to auto and move to constant [@NiFNi](https://github.com/NiFNi) ([#1754](https://github.com/paperless-ngx/paperless-ngx/pull/1754))
- Bugfix: Fix email labeling for non-Gmail servers [@stumpylog](https://github.com/stumpylog) ([#1755](https://github.com/paperless-ngx/paperless-ngx/pull/1755))
- Feature: frontend update checking settings [@shamoon](https://github.com/shamoon) ([#1692](https://github.com/paperless-ngx/paperless-ngx/pull/1692))
- Fix: allow preview for .csv files [@shamoon](https://github.com/shamoon) ([#1744](https://github.com/paperless-ngx/paperless-ngx/pull/1744))
- Bump myst-parser from 0.18.0 to 0.18.1 [@dependabot](https://github.com/dependabot) ([#1738](https://github.com/paperless-ngx/paperless-ngx/pull/1738))
- Bugfix: csv recognition by consumer [@bin101](https://github.com/bin101) ([#1726](https://github.com/paperless-ngx/paperless-ngx/pull/1726))
- Bugfix: Include document title when a duplicate is detected [@stumpylog](https://github.com/stumpylog) ([#1696](https://github.com/paperless-ngx/paperless-ngx/pull/1696))
- Bump rxjs from 7.5.6 to 7.5.7 in /src-ui [@dependabot](https://github.com/dependabot) ([#1720](https://github.com/paperless-ngx/paperless-ngx/pull/1720))
- Bump uuid from 8.3.2 to 9.0.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#1716](https://github.com/paperless-ngx/paperless-ngx/pull/1716))
- Bump ng2-pdf-viewer from 9.1.0 to 9.1.2 in /src-ui [@dependabot](https://github.com/dependabot) ([#1717](https://github.com/paperless-ngx/paperless-ngx/pull/1717))
- Bump ngx-color from 8.0.2 to 8.0.3 in /src-ui [@dependabot](https://github.com/dependabot) ([#1715](https://github.com/paperless-ngx/paperless-ngx/pull/1715))
- Bump concurrently from 7.3.0 to 7.4.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#1719](https://github.com/paperless-ngx/paperless-ngx/pull/1719))
- Bump [@<!---->types/node from 18.7.14 to 18.7.23 in /src-ui @dependabot](https://github.com/<!---->types/node from 18.7.14 to 18.7.23 in /src-ui @dependabot) ([#1718](https://github.com/paperless-ngx/paperless-ngx/pull/1718))
- Bump jest-environment-jsdom from 29.0.1 to 29.1.2 in /src-ui [@dependabot](https://github.com/dependabot) ([#1714](https://github.com/paperless-ngx/paperless-ngx/pull/1714))
- Bump [@<!---->angular/cli @<!---->angular/core @dependabot](https://github.com/<!---->angular/cli @<!---->angular/core @dependabot) ([#1708](https://github.com/paperless-ngx/paperless-ngx/pull/1708))
- Bump cypress from 10.7.0 to 10.9.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#1707](https://github.com/paperless-ngx/paperless-ngx/pull/1707))
- Bump bootstrap from 5.2.0 to 5.2.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#1710](https://github.com/paperless-ngx/paperless-ngx/pull/1710))
- Bump typescript from 4.7.4 to 4.8.4 in /src-ui [@dependabot](https://github.com/dependabot) ([#1706](https://github.com/paperless-ngx/paperless-ngx/pull/1706))
- Bugfix: Set MySql charset [@stumpylog](https://github.com/stumpylog) ([#1687](https://github.com/paperless-ngx/paperless-ngx/pull/1687))

## paperless-ngx 1.9.2

### Bug Fixes

- Bugfix: Allow PAPERLESS_OCR_CLEAN=none [@shamoon](https://github.com/shamoon) ([#1670](https://github.com/paperless-ngx/paperless-ngx/pull/1670))

### All App Changes

- Chore: Bumps version numbers to 1.9.2 [@stumpylog](https://github.com/stumpylog) ([#1666](https://github.com/paperless-ngx/paperless-ngx/pull/1666))

## paperless-ngx 1.9.1

### Notes

- Version 1.9.1 incorrectly displays the version string as 1.9.0

### Bug Fixes

- Bugfix: Fixes missing OCR mode skip_noarchive [@stumpylog](https://github.com/stumpylog) ([#1645](https://github.com/paperless-ngx/paperless-ngx/pull/1645))
- Fix reset button padding on small screens [@shamoon](https://github.com/shamoon) ([#1646](https://github.com/paperless-ngx/paperless-ngx/pull/1646))

### Documentation

- Improve docs re [@janis-ax](https://github.com/janis-ax) ([#1625](https://github.com/paperless-ngx/paperless-ngx/pull/1625))
- [Documentation] Add v1.9.0 changelog [@github-actions](https://github.com/github-actions) ([#1639](https://github.com/paperless-ngx/paperless-ngx/pull/1639))

### All App Changes

- Bugfix: Fixes missing OCR mode skip_noarchive [@stumpylog](https://github.com/stumpylog) ([#1645](https://github.com/paperless-ngx/paperless-ngx/pull/1645))
- Fix reset button padding on small screens [@shamoon](https://github.com/shamoon) ([#1646](https://github.com/paperless-ngx/paperless-ngx/pull/1646))

## paperless-ngx 1.9.0

### Features

- Feature: Faster, less memory barcode handling [@stumpylog](https://github.com/stumpylog) ([#1594](https://github.com/paperless-ngx/paperless-ngx/pull/1594))
- Feature: Display django-q process names [@stumpylog](https://github.com/stumpylog) ([#1567](https://github.com/paperless-ngx/paperless-ngx/pull/1567))
- Feature: Add MariaDB support [@bckelly1](https://github.com/bckelly1) ([#543](https://github.com/paperless-ngx/paperless-ngx/pull/543))
- Feature: Simplify IMAP login for UTF-8 [@stumpylog](https://github.com/stumpylog) ([#1492](https://github.com/paperless-ngx/paperless-ngx/pull/1492))
- Feature: Even better re-do of OCR [@stumpylog](https://github.com/stumpylog) ([#1451](https://github.com/paperless-ngx/paperless-ngx/pull/1451))
- Feature: document comments [@tim-vogel](https://github.com/tim-vogel) ([#1375](https://github.com/paperless-ngx/paperless-ngx/pull/1375))
- Adding date suggestions to the documents details view [@Eckii24](https://github.com/Eckii24) ([#1367](https://github.com/paperless-ngx/paperless-ngx/pull/1367))
- Feature: Event driven consumer [@stumpylog](https://github.com/stumpylog) ([#1421](https://github.com/paperless-ngx/paperless-ngx/pull/1421))
- Feature: Adds storage paths to re-tagger command [@stumpylog](https://github.com/stumpylog) ([#1446](https://github.com/paperless-ngx/paperless-ngx/pull/1446))
- Feature: Preserve original filename in metadata [@GwynHannay](https://github.com/GwynHannay) ([#1440](https://github.com/paperless-ngx/paperless-ngx/pull/1440))
- Handle tags for gmail email accounts [@sisao](https://github.com/sisao) ([#1433](https://github.com/paperless-ngx/paperless-ngx/pull/1433))
- Update redis image [@tribut](https://github.com/tribut) ([#1436](https://github.com/paperless-ngx/paperless-ngx/pull/1436))
- PAPERLESS_REDIS may be set via docker secrets [@DennisGaida](https://github.com/DennisGaida) ([#1405](https://github.com/paperless-ngx/paperless-ngx/pull/1405))

### Bug Fixes

- paperless_cmd.sh: use exec to run supervisord [@lemmi](https://github.com/lemmi) ([#1617](https://github.com/paperless-ngx/paperless-ngx/pull/1617))
- Fix: Double barcode separation creates empty file [@stumpylog](https://github.com/stumpylog) ([#1596](https://github.com/paperless-ngx/paperless-ngx/pull/1596))
- Fix: Resolve issue with slow classifier [@stumpylog](https://github.com/stumpylog) ([#1576](https://github.com/paperless-ngx/paperless-ngx/pull/1576))
- Fix document comments not updating on document navigation [@shamoon](https://github.com/shamoon) ([#1566](https://github.com/paperless-ngx/paperless-ngx/pull/1566))
- Fix: Include storage paths in document exporter [@shamoon](https://github.com/shamoon) ([#1557](https://github.com/paperless-ngx/paperless-ngx/pull/1557))
- Chore: Cleanup and validate settings [@stumpylog](https://github.com/stumpylog) ([#1551](https://github.com/paperless-ngx/paperless-ngx/pull/1551))
- Bugfix: Better gunicorn settings for workers [@stumpylog](https://github.com/stumpylog) ([#1500](https://github.com/paperless-ngx/paperless-ngx/pull/1500))
- Fix actions button in tasks table [@shamoon](https://github.com/shamoon) ([#1488](https://github.com/paperless-ngx/paperless-ngx/pull/1488))
- Fix: Add missing filter rule types to SavedViewFilterRule model \& fix migrations [@shamoon](https://github.com/shamoon) ([#1463](https://github.com/paperless-ngx/paperless-ngx/pull/1463))
- Fix paperless.conf.example typo [@qcasey](https://github.com/qcasey) ([#1460](https://github.com/paperless-ngx/paperless-ngx/pull/1460))
- Bugfix: Fixes the creation of an archive file, even if noarchive was specified [@stumpylog](https://github.com/stumpylog) ([#1442](https://github.com/paperless-ngx/paperless-ngx/pull/1442))
- Fix: created_date should not be required [@shamoon](https://github.com/shamoon) ([#1412](https://github.com/paperless-ngx/paperless-ngx/pull/1412))
- Fix: dev backend testing [@stumpylog](https://github.com/stumpylog) ([#1420](https://github.com/paperless-ngx/paperless-ngx/pull/1420))
- Bugfix: Catch all exceptions during the task signals [@stumpylog](https://github.com/stumpylog) ([#1387](https://github.com/paperless-ngx/paperless-ngx/pull/1387))
- Fix: saved view page parameter [@shamoon](https://github.com/shamoon) ([#1376](https://github.com/paperless-ngx/paperless-ngx/pull/1376))
- Fix: Correct browser unsaved changes warning [@shamoon](https://github.com/shamoon) ([#1369](https://github.com/paperless-ngx/paperless-ngx/pull/1369))
- Fix: correct date pasting with other formats [@shamoon](https://github.com/shamoon) ([#1370](https://github.com/paperless-ngx/paperless-ngx/pull/1370))
- Bugfix: Allow webserver bind address to be configured [@stumpylog](https://github.com/stumpylog) ([#1358](https://github.com/paperless-ngx/paperless-ngx/pull/1358))
- Bugfix: Chain exceptions during exception handling [@stumpylog](https://github.com/stumpylog) ([#1354](https://github.com/paperless-ngx/paperless-ngx/pull/1354))
- Fix: missing tooltip translation \& filter editor wrapping [@shamoon](https://github.com/shamoon) ([#1305](https://github.com/paperless-ngx/paperless-ngx/pull/1305))
- Bugfix: Interaction between barcode and directories as tags [@stumpylog](https://github.com/stumpylog) ([#1303](https://github.com/paperless-ngx/paperless-ngx/pull/1303))

### Documentation

- [Beta] Paperless-ngx v1.9.0 Release Candidate [@stumpylog](https://github.com/stumpylog) ([#1560](https://github.com/paperless-ngx/paperless-ngx/pull/1560))
- docs/configuration: Fix binary variable defaults [@erikarvstedt](https://github.com/erikarvstedt) ([#1528](https://github.com/paperless-ngx/paperless-ngx/pull/1528))
- Info about installing on subpath [@viktor-c](https://github.com/viktor-c) ([#1350](https://github.com/paperless-ngx/paperless-ngx/pull/1350))
- Docs: move scanner \& software recs to GH wiki [@shamoon](https://github.com/shamoon) ([#1482](https://github.com/paperless-ngx/paperless-ngx/pull/1482))
- Docs: Update mobile scanner section [@tooomm](https://github.com/tooomm) ([#1467](https://github.com/paperless-ngx/paperless-ngx/pull/1467))
- Adding date suggestions to the documents details view [@Eckii24](https://github.com/Eckii24) ([#1367](https://github.com/paperless-ngx/paperless-ngx/pull/1367))
- docs: scanners: add Brother ads4700w [@ocelotsloth](https://github.com/ocelotsloth) ([#1450](https://github.com/paperless-ngx/paperless-ngx/pull/1450))
- Feature: Adds storage paths to re-tagger command [@stumpylog](https://github.com/stumpylog) ([#1446](https://github.com/paperless-ngx/paperless-ngx/pull/1446))
- Changes to Redis documentation [@Zerteax](https://github.com/Zerteax) ([#1441](https://github.com/paperless-ngx/paperless-ngx/pull/1441))
- Update scanners.rst [@glassbox-sco](https://github.com/glassbox-sco) ([#1430](https://github.com/paperless-ngx/paperless-ngx/pull/1430))
- Update scanners.rst [@derlucas](https://github.com/derlucas) ([#1415](https://github.com/paperless-ngx/paperless-ngx/pull/1415))
- Bugfix: Allow webserver bind address to be configured [@stumpylog](https://github.com/stumpylog) ([#1358](https://github.com/paperless-ngx/paperless-ngx/pull/1358))
- docs: fix small typo [@tooomm](https://github.com/tooomm) ([#1352](https://github.com/paperless-ngx/paperless-ngx/pull/1352))
- [Documentation] Add v1.8.0 changelog [@github-actions](https://github.com/github-actions) ([#1298](https://github.com/paperless-ngx/paperless-ngx/pull/1298))

### Maintenance

- [Beta] Paperless-ngx v1.9.0 Release Candidate [@stumpylog](https://github.com/stumpylog) ([#1560](https://github.com/paperless-ngx/paperless-ngx/pull/1560))
- paperless_cmd.sh: use exec to run supervisord [@lemmi](https://github.com/lemmi) ([#1617](https://github.com/paperless-ngx/paperless-ngx/pull/1617))
- Chore: Extended container image cleanup [@stumpylog](https://github.com/stumpylog) ([#1556](https://github.com/paperless-ngx/paperless-ngx/pull/1556))
- Chore: Smaller library images [@stumpylog](https://github.com/stumpylog) ([#1546](https://github.com/paperless-ngx/paperless-ngx/pull/1546))
- Bump tj-actions/changed-files from 24 to 29.0.2 [@dependabot](https://github.com/dependabot) ([#1493](https://github.com/paperless-ngx/paperless-ngx/pull/1493))
- Bugfix: Better gunicorn settings for workers [@stumpylog](https://github.com/stumpylog) ([#1500](https://github.com/paperless-ngx/paperless-ngx/pull/1500))
- [CI] Fix release drafter issues [@qcasey](https://github.com/qcasey) ([#1301](https://github.com/paperless-ngx/paperless-ngx/pull/1301))
- Fix: dev backend testing [@stumpylog](https://github.com/stumpylog) ([#1420](https://github.com/paperless-ngx/paperless-ngx/pull/1420))
- Chore: Exclude dependabot PRs from Project, set status to Needs Review [@qcasey](https://github.com/qcasey) ([#1397](https://github.com/paperless-ngx/paperless-ngx/pull/1397))
- Chore: Add to label PRs based on and title [@qcasey](https://github.com/qcasey) ([#1396](https://github.com/paperless-ngx/paperless-ngx/pull/1396))
- Chore: use pre-commit in the Ci workflow [@stumpylog](https://github.com/stumpylog) ([#1362](https://github.com/paperless-ngx/paperless-ngx/pull/1362))
- Chore: Fixes permissions for image tag cleanup [@stumpylog](https://github.com/stumpylog) ([#1315](https://github.com/paperless-ngx/paperless-ngx/pull/1315))
- Bump leonsteinhaeuser/project-beta-automations from 1.2.1 to 1.3.0 [@dependabot](https://github.com/dependabot) ([#1328](https://github.com/paperless-ngx/paperless-ngx/pull/1328))
- Bump tj-actions/changed-files from 23.1 to 24 [@dependabot](https://github.com/dependabot) ([#1329](https://github.com/paperless-ngx/paperless-ngx/pull/1329))
- Feature: Remove requirements.txt and use pipenv everywhere [@stumpylog](https://github.com/stumpylog) ([#1316](https://github.com/paperless-ngx/paperless-ngx/pull/1316))

### Dependencies

<details>
<summary>34 changes</summary>

- Bump pikepdf from 5.5.0 to 5.6.1 [@dependabot](https://github.com/dependabot) ([#1537](https://github.com/paperless-ngx/paperless-ngx/pull/1537))
- Bump black from 22.6.0 to 22.8.0 [@dependabot](https://github.com/dependabot) ([#1539](https://github.com/paperless-ngx/paperless-ngx/pull/1539))
- Bump tqdm from 4.64.0 to 4.64.1 [@dependabot](https://github.com/dependabot) ([#1540](https://github.com/paperless-ngx/paperless-ngx/pull/1540))
- Bump pytest from 7.1.2 to 7.1.3 [@dependabot](https://github.com/dependabot) ([#1538](https://github.com/paperless-ngx/paperless-ngx/pull/1538))
- Bump tj-actions/changed-files from 24 to 29.0.2 [@dependabot](https://github.com/dependabot) ([#1493](https://github.com/paperless-ngx/paperless-ngx/pull/1493))
- Bump angular packages, jest-preset-angular in src-ui [@dependabot](https://github.com/dependabot) ([#1502](https://github.com/paperless-ngx/paperless-ngx/pull/1502))
- Bump jest-environment-jsdom from 28.1.3 to 29.0.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#1507](https://github.com/paperless-ngx/paperless-ngx/pull/1507))
- Bump [@<!---->types/node from 18.6.3 to 18.7.14 in /src-ui @dependabot](https://github.com/<!---->types/node from 18.6.3 to 18.7.14 in /src-ui @dependabot) ([#1506](https://github.com/paperless-ngx/paperless-ngx/pull/1506))
- Bump [@<!---->angular-builders/jest from 14.0.0 to 14.0.1 in /src-ui @dependabot](https://github.com/<!---->angular-builders/jest from 14.0.0 to 14.0.1 in /src-ui @dependabot) ([#1505](https://github.com/paperless-ngx/paperless-ngx/pull/1505))
- Bump zone.js from 0.11.7 to 0.11.8 in /src-ui [@dependabot](https://github.com/dependabot) ([#1504](https://github.com/paperless-ngx/paperless-ngx/pull/1504))
- Bump ngx-color from 8.0.1 to 8.0.2 in /src-ui [@dependabot](https://github.com/dependabot) ([#1494](https://github.com/paperless-ngx/paperless-ngx/pull/1494))
- Bump cypress from 10.3.1 to 10.7.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#1496](https://github.com/paperless-ngx/paperless-ngx/pull/1496))
- Bump [@<!---->cypress/schematic from 2.0.0 to 2.1.1 in /src-ui @dependabot](https://github.com/<!---->cypress/schematic from 2.0.0 to 2.1.1 in /src-ui @dependabot) ([#1495](https://github.com/paperless-ngx/paperless-ngx/pull/1495))
- Bump [@<!---->popperjs/core from 2.11.5 to 2.11.6 in /src-ui @dependabot](https://github.com/<!---->popperjs/core from 2.11.5 to 2.11.6 in /src-ui @dependabot) ([#1498](https://github.com/paperless-ngx/paperless-ngx/pull/1498))
- Bump sphinx from 5.0.2 to 5.1.1 [@dependabot](https://github.com/dependabot) ([#1297](https://github.com/paperless-ngx/paperless-ngx/pull/1297))
- Chore: Bump Python dependencies [@stumpylog](https://github.com/stumpylog) ([#1445](https://github.com/paperless-ngx/paperless-ngx/pull/1445))
- Chore: Update Python deps [@stumpylog](https://github.com/stumpylog) ([#1391](https://github.com/paperless-ngx/paperless-ngx/pull/1391))
- Bump watchfiles from 0.15.0 to 0.16.1 [@dependabot](https://github.com/dependabot) ([#1285](https://github.com/paperless-ngx/paperless-ngx/pull/1285))
- Bump leonsteinhaeuser/project-beta-automations from 1.2.1 to 1.3.0 [@dependabot](https://github.com/dependabot) ([#1328](https://github.com/paperless-ngx/paperless-ngx/pull/1328))
- Bump tj-actions/changed-files from 23.1 to 24 [@dependabot](https://github.com/dependabot) ([#1329](https://github.com/paperless-ngx/paperless-ngx/pull/1329))
- Bump cypress from 10.3.0 to 10.3.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#1342](https://github.com/paperless-ngx/paperless-ngx/pull/1342))
- Bump ngx-color from 7.3.3 to 8.0.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#1343](https://github.com/paperless-ngx/paperless-ngx/pull/1343))
- Bump [@<!---->angular/cli from 14.0.4 to 14.1.0 in /src-ui @dependabot](https://github.com/<!---->angular/cli from 14.0.4 to 14.1.0 in /src-ui @dependabot) ([#1330](https://github.com/paperless-ngx/paperless-ngx/pull/1330))
- Bump [@<!---->types/node from 18.0.0 to 18.6.3 in /src-ui @dependabot](https://github.com/<!---->types/node from 18.0.0 to 18.6.3 in /src-ui @dependabot) ([#1341](https://github.com/paperless-ngx/paperless-ngx/pull/1341))
- Bump jest-preset-angular from 12.1.0 to 12.2.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#1340](https://github.com/paperless-ngx/paperless-ngx/pull/1340))
- Bump concurrently from 7.2.2 to 7.3.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#1326](https://github.com/paperless-ngx/paperless-ngx/pull/1326))
- Bump ng2-pdf-viewer from 9.0.0 to 9.1.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#1337](https://github.com/paperless-ngx/paperless-ngx/pull/1337))
- Bump jest-environment-jsdom from 28.1.2 to 28.1.3 in /src-ui [@dependabot](https://github.com/dependabot) ([#1336](https://github.com/paperless-ngx/paperless-ngx/pull/1336))
- Bump ngx-file-drop from 13.0.0 to 14.0.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#1331](https://github.com/paperless-ngx/paperless-ngx/pull/1331))
- Bump jest and [@<!---->types/jest in /src-ui @dependabot](https://github.com/<!---->types/jest in /src-ui @dependabot) ([#1333](https://github.com/paperless-ngx/paperless-ngx/pull/1333))
- Bump bootstrap from 5.1.3 to 5.2.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#1327](https://github.com/paperless-ngx/paperless-ngx/pull/1327))
- Bump typescript from 4.6.4 to 4.7.4 in /src-ui [@dependabot](https://github.com/dependabot) ([#1324](https://github.com/paperless-ngx/paperless-ngx/pull/1324))
- Bump ts-node from 10.8.1 to 10.9.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#1325](https://github.com/paperless-ngx/paperless-ngx/pull/1325))
- Bump rxjs from 7.5.5 to 7.5.6 in /src-ui [@dependabot](https://github.com/dependabot) ([#1323](https://github.com/paperless-ngx/paperless-ngx/pull/1323))
</details>

### All App Changes

- [Beta] Paperless-ngx v1.9.0 Release Candidate [@stumpylog](https://github.com/stumpylog) ([#1560](https://github.com/paperless-ngx/paperless-ngx/pull/1560))
- Feature: Faster, less memory barcode handling [@stumpylog](https://github.com/stumpylog) ([#1594](https://github.com/paperless-ngx/paperless-ngx/pull/1594))
- Fix: Consume directory permissions were not updated [@stumpylog](https://github.com/stumpylog) ([#1605](https://github.com/paperless-ngx/paperless-ngx/pull/1605))
- Fix: Double barcode separation creates empty file [@stumpylog](https://github.com/stumpylog) ([#1596](https://github.com/paperless-ngx/paperless-ngx/pull/1596))
- Fix: Parsing Tika documents fails with AttributeError [@stumpylog](https://github.com/stumpylog) ([#1591](https://github.com/paperless-ngx/paperless-ngx/pull/1591))
- Fix: Resolve issue with slow classifier [@stumpylog](https://github.com/stumpylog) ([#1576](https://github.com/paperless-ngx/paperless-ngx/pull/1576))
- Feature: Display django-q process names [@stumpylog](https://github.com/stumpylog) ([#1567](https://github.com/paperless-ngx/paperless-ngx/pull/1567))
- Fix document comments not updating on document navigation [@shamoon](https://github.com/shamoon) ([#1566](https://github.com/paperless-ngx/paperless-ngx/pull/1566))
- Feature: Add MariaDB support [@bckelly1](https://github.com/bckelly1) ([#543](https://github.com/paperless-ngx/paperless-ngx/pull/543))
- Fix: Include storage paths in document exporter [@shamoon](https://github.com/shamoon) ([#1557](https://github.com/paperless-ngx/paperless-ngx/pull/1557))
- Chore: Cleanup and validate settings [@stumpylog](https://github.com/stumpylog) ([#1551](https://github.com/paperless-ngx/paperless-ngx/pull/1551))
- Bump pikepdf from 5.5.0 to 5.6.1 [@dependabot](https://github.com/dependabot) ([#1537](https://github.com/paperless-ngx/paperless-ngx/pull/1537))
- Bump black from 22.6.0 to 22.8.0 [@dependabot](https://github.com/dependabot) ([#1539](https://github.com/paperless-ngx/paperless-ngx/pull/1539))
- Bump tqdm from 4.64.0 to 4.64.1 [@dependabot](https://github.com/dependabot) ([#1540](https://github.com/paperless-ngx/paperless-ngx/pull/1540))
- Bump pytest from 7.1.2 to 7.1.3 [@dependabot](https://github.com/dependabot) ([#1538](https://github.com/paperless-ngx/paperless-ngx/pull/1538))
- Bump angular packages, jest-preset-angular in src-ui [@dependabot](https://github.com/dependabot) ([#1502](https://github.com/paperless-ngx/paperless-ngx/pull/1502))
- Bump jest-environment-jsdom from 28.1.3 to 29.0.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#1507](https://github.com/paperless-ngx/paperless-ngx/pull/1507))
- Bump [@<!---->types/node from 18.6.3 to 18.7.14 in /src-ui @dependabot](https://github.com/<!---->types/node from 18.6.3 to 18.7.14 in /src-ui @dependabot) ([#1506](https://github.com/paperless-ngx/paperless-ngx/pull/1506))
- Bump [@<!---->angular-builders/jest from 14.0.0 to 14.0.1 in /src-ui @dependabot](https://github.com/<!---->angular-builders/jest from 14.0.0 to 14.0.1 in /src-ui @dependabot) ([#1505](https://github.com/paperless-ngx/paperless-ngx/pull/1505))
- Bump zone.js from 0.11.7 to 0.11.8 in /src-ui [@dependabot](https://github.com/dependabot) ([#1504](https://github.com/paperless-ngx/paperless-ngx/pull/1504))
- Bump ngx-color from 8.0.1 to 8.0.2 in /src-ui [@dependabot](https://github.com/dependabot) ([#1494](https://github.com/paperless-ngx/paperless-ngx/pull/1494))
- Bump cypress from 10.3.1 to 10.7.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#1496](https://github.com/paperless-ngx/paperless-ngx/pull/1496))
- Bump [@<!---->cypress/schematic from 2.0.0 to 2.1.1 in /src-ui @dependabot](https://github.com/<!---->cypress/schematic from 2.0.0 to 2.1.1 in /src-ui @dependabot) ([#1495](https://github.com/paperless-ngx/paperless-ngx/pull/1495))
- Bump [@<!---->popperjs/core from 2.11.5 to 2.11.6 in /src-ui @dependabot](https://github.com/<!---->popperjs/core from 2.11.5 to 2.11.6 in /src-ui @dependabot) ([#1498](https://github.com/paperless-ngx/paperless-ngx/pull/1498))
- Feature: Simplify IMAP login for UTF-8 [@stumpylog](https://github.com/stumpylog) ([#1492](https://github.com/paperless-ngx/paperless-ngx/pull/1492))
- Fix actions button in tasks table [@shamoon](https://github.com/shamoon) ([#1488](https://github.com/paperless-ngx/paperless-ngx/pull/1488))
- Fix: Add missing filter rule types to SavedViewFilterRule model \& fix migrations [@shamoon](https://github.com/shamoon) ([#1463](https://github.com/paperless-ngx/paperless-ngx/pull/1463))
- Feature: Even better re-do of OCR [@stumpylog](https://github.com/stumpylog) ([#1451](https://github.com/paperless-ngx/paperless-ngx/pull/1451))
- Feature: document comments [@tim-vogel](https://github.com/tim-vogel) ([#1375](https://github.com/paperless-ngx/paperless-ngx/pull/1375))
- Adding date suggestions to the documents details view [@Eckii24](https://github.com/Eckii24) ([#1367](https://github.com/paperless-ngx/paperless-ngx/pull/1367))
- Bump sphinx from 5.0.2 to 5.1.1 [@dependabot](https://github.com/dependabot) ([#1297](https://github.com/paperless-ngx/paperless-ngx/pull/1297))
- Feature: Event driven consumer [@stumpylog](https://github.com/stumpylog) ([#1421](https://github.com/paperless-ngx/paperless-ngx/pull/1421))
- Bugfix: Fixes the creation of an archive file, even if noarchive was specified [@stumpylog](https://github.com/stumpylog) ([#1442](https://github.com/paperless-ngx/paperless-ngx/pull/1442))
- Feature: Adds storage paths to re-tagger command [@stumpylog](https://github.com/stumpylog) ([#1446](https://github.com/paperless-ngx/paperless-ngx/pull/1446))
- Feature: Preserve original filename in metadata [@GwynHannay](https://github.com/GwynHannay) ([#1440](https://github.com/paperless-ngx/paperless-ngx/pull/1440))
- Handle tags for gmail email accounts [@sisao](https://github.com/sisao) ([#1433](https://github.com/paperless-ngx/paperless-ngx/pull/1433))
- Fix: should not be required [@shamoon](https://github.com/shamoon) ([#1412](https://github.com/paperless-ngx/paperless-ngx/pull/1412))
- Bugfix: Catch all exceptions during the task signals [@stumpylog](https://github.com/stumpylog) ([#1387](https://github.com/paperless-ngx/paperless-ngx/pull/1387))
- Fix: saved view page parameter [@shamoon](https://github.com/shamoon) ([#1376](https://github.com/paperless-ngx/paperless-ngx/pull/1376))
- Fix: Correct browser unsaved changes warning [@shamoon](https://github.com/shamoon) ([#1369](https://github.com/paperless-ngx/paperless-ngx/pull/1369))
- Fix: correct date pasting with other formats [@shamoon](https://github.com/shamoon) ([#1370](https://github.com/paperless-ngx/paperless-ngx/pull/1370))
- Chore: use pre-commit in the Ci workflow [@stumpylog](https://github.com/stumpylog) ([#1362](https://github.com/paperless-ngx/paperless-ngx/pull/1362))
- Bugfix: Chain exceptions during exception handling [@stumpylog](https://github.com/stumpylog) ([#1354](https://github.com/paperless-ngx/paperless-ngx/pull/1354))
- Bump watchfiles from 0.15.0 to 0.16.1 [@dependabot](https://github.com/dependabot) ([#1285](https://github.com/paperless-ngx/paperless-ngx/pull/1285))
- Bump cypress from 10.3.0 to 10.3.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#1342](https://github.com/paperless-ngx/paperless-ngx/pull/1342))
- Bump ngx-color from 7.3.3 to 8.0.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#1343](https://github.com/paperless-ngx/paperless-ngx/pull/1343))
- Bump [@<!---->angular/cli from 14.0.4 to 14.1.0 in /src-ui @dependabot](https://github.com/<!---->angular/cli from 14.0.4 to 14.1.0 in /src-ui @dependabot) ([#1330](https://github.com/paperless-ngx/paperless-ngx/pull/1330))
- Bump [@<!---->types/node from 18.0.0 to 18.6.3 in /src-ui @dependabot](https://github.com/<!---->types/node from 18.0.0 to 18.6.3 in /src-ui @dependabot) ([#1341](https://github.com/paperless-ngx/paperless-ngx/pull/1341))
- Bump jest-preset-angular from 12.1.0 to 12.2.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#1340](https://github.com/paperless-ngx/paperless-ngx/pull/1340))
- Bump concurrently from 7.2.2 to 7.3.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#1326](https://github.com/paperless-ngx/paperless-ngx/pull/1326))
- Bump ng2-pdf-viewer from 9.0.0 to 9.1.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#1337](https://github.com/paperless-ngx/paperless-ngx/pull/1337))
- Bump jest-environment-jsdom from 28.1.2 to 28.1.3 in /src-ui [@dependabot](https://github.com/dependabot) ([#1336](https://github.com/paperless-ngx/paperless-ngx/pull/1336))
- Bump ngx-file-drop from 13.0.0 to 14.0.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#1331](https://github.com/paperless-ngx/paperless-ngx/pull/1331))
- Bump jest and [@<!---->types/jest in /src-ui @dependabot](https://github.com/<!---->types/jest in /src-ui @dependabot) ([#1333](https://github.com/paperless-ngx/paperless-ngx/pull/1333))
- Bump bootstrap from 5.1.3 to 5.2.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#1327](https://github.com/paperless-ngx/paperless-ngx/pull/1327))
- Bump typescript from 4.6.4 to 4.7.4 in /src-ui [@dependabot](https://github.com/dependabot) ([#1324](https://github.com/paperless-ngx/paperless-ngx/pull/1324))
- Bump ts-node from 10.8.1 to 10.9.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#1325](https://github.com/paperless-ngx/paperless-ngx/pull/1325))
- Bump rxjs from 7.5.5 to 7.5.6 in /src-ui [@dependabot](https://github.com/dependabot) ([#1323](https://github.com/paperless-ngx/paperless-ngx/pull/1323))
- Fix: missing tooltip translation \& filter editor wrapping [@shamoon](https://github.com/shamoon) ([#1305](https://github.com/paperless-ngx/paperless-ngx/pull/1305))
- Feature: Remove requirements.txt and use pipenv everywhere [@stumpylog](https://github.com/stumpylog) ([#1316](https://github.com/paperless-ngx/paperless-ngx/pull/1316))
- Bugfix: Interaction between barcode and directories as tags [@stumpylog](https://github.com/stumpylog) ([#1303](https://github.com/paperless-ngx/paperless-ngx/pull/1303))

## paperless-ngx 1.8.0

### Features

- Feature use env vars in pre post scripts [@ziprandom](https://github.com/ziprandom) ([#1154](https://github.com/paperless-ngx/paperless-ngx/pull/1154))
- frontend task queue [@shamoon](https://github.com/shamoon) ([#1020](https://github.com/paperless-ngx/paperless-ngx/pull/1020))
- Fearless scikit-learn updates [@stumpylog](https://github.com/stumpylog) ([#1082](https://github.com/paperless-ngx/paperless-ngx/pull/1082))
- Adds support for Docker secrets [@stumpylog](https://github.com/stumpylog) ([#1034](https://github.com/paperless-ngx/paperless-ngx/pull/1034))
- make frontend timezone un-aware [@shamoon](https://github.com/shamoon) ([#957](https://github.com/paperless-ngx/paperless-ngx/pull/957))
- Change document thumbnails to WebP [@stumpylog](https://github.com/stumpylog) ([#1127](https://github.com/paperless-ngx/paperless-ngx/pull/1127))
- Fork django-q to update dependencies [@stumpylog](https://github.com/stumpylog) ([#1014](https://github.com/paperless-ngx/paperless-ngx/pull/1014))
- Fix: Rework query params logic [@shamoon](https://github.com/shamoon) ([#1000](https://github.com/paperless-ngx/paperless-ngx/pull/1000))
- Enhancement: show note on language change and offer reload [@shamoon](https://github.com/shamoon) ([#1030](https://github.com/paperless-ngx/paperless-ngx/pull/1030))
- Include error information when Redis connection fails [@stumpylog](https://github.com/stumpylog) ([#1016](https://github.com/paperless-ngx/paperless-ngx/pull/1016))
- frontend settings saved to database [@shamoon](https://github.com/shamoon) ([#919](https://github.com/paperless-ngx/paperless-ngx/pull/919))
- Add "Created" as additional (optional) parameter for post_documents [@eingemaischt](https://github.com/eingemaischt) ([#965](https://github.com/paperless-ngx/paperless-ngx/pull/965))
- Convert Changelog to markdown, auto-commit future changelogs [@qcasey](https://github.com/qcasey) ([#935](https://github.com/paperless-ngx/paperless-ngx/pull/935))
- allow all ASN filtering functions [@shamoon](https://github.com/shamoon) ([#920](https://github.com/paperless-ngx/paperless-ngx/pull/920))
- gunicorn: Allow IPv6 sockets [@vlcty](https://github.com/vlcty) ([#924](https://github.com/paperless-ngx/paperless-ngx/pull/924))
- initial app loading indicators [@shamoon](https://github.com/shamoon) ([#899](https://github.com/paperless-ngx/paperless-ngx/pull/899))

### Bug Fixes

- Fix: dropdown selected items not visible again [@shamoon](https://github.com/shamoon) ([#1261](https://github.com/paperless-ngx/paperless-ngx/pull/1261))
- [CI] Fix automatic changelog generation on release [@qcasey](https://github.com/qcasey) ([#1249](https://github.com/paperless-ngx/paperless-ngx/pull/1249))
- Fix: Prevent duplicate api calls on text filtering [@shamoon](https://github.com/shamoon) ([#1133](https://github.com/paperless-ngx/paperless-ngx/pull/1133))
- make frontend timezone un-aware [@shamoon](https://github.com/shamoon) ([#957](https://github.com/paperless-ngx/paperless-ngx/pull/957))
- Feature / fix quick toggleable filters [@shamoon](https://github.com/shamoon) ([#1122](https://github.com/paperless-ngx/paperless-ngx/pull/1122))
- Chore: Manually downgrade reportlab (and update everything else) [@stumpylog](https://github.com/stumpylog) ([#1116](https://github.com/paperless-ngx/paperless-ngx/pull/1116))
- Bugfix: Don't assume default Docker folders [@stumpylog](https://github.com/stumpylog) ([#1088](https://github.com/paperless-ngx/paperless-ngx/pull/1088))
- Bugfix: Better sanity check messages [@stumpylog](https://github.com/stumpylog) ([#1049](https://github.com/paperless-ngx/paperless-ngx/pull/1049))
- Fix vertical margins between pages of pdf viewer [@shamoon](https://github.com/shamoon) ([#1081](https://github.com/paperless-ngx/paperless-ngx/pull/1081))
- Bugfix: Pass debug setting on to django-q [@stumpylog](https://github.com/stumpylog) ([#1058](https://github.com/paperless-ngx/paperless-ngx/pull/1058))
- Bugfix: Don't assume the document has a title set [@stumpylog](https://github.com/stumpylog) ([#1057](https://github.com/paperless-ngx/paperless-ngx/pull/1057))
- Bugfix: Corrects the setting of max pixel size for OCR [@stumpylog](https://github.com/stumpylog) ([#1008](https://github.com/paperless-ngx/paperless-ngx/pull/1008))
- better date pasting [@shamoon](https://github.com/shamoon) ([#1007](https://github.com/paperless-ngx/paperless-ngx/pull/1007))
- Enhancement: Alphabetize tags by default [@shamoon](https://github.com/shamoon) ([#1017](https://github.com/paperless-ngx/paperless-ngx/pull/1017))
- Fix: Rework query params logic [@shamoon](https://github.com/shamoon) ([#1000](https://github.com/paperless-ngx/paperless-ngx/pull/1000))
- Fix: add translation for some un-translated tooltips [@shamoon](https://github.com/shamoon) ([#995](https://github.com/paperless-ngx/paperless-ngx/pull/995))
- Change npm --no-optional to --omit=optional [@shamoon](https://github.com/shamoon) ([#986](https://github.com/paperless-ngx/paperless-ngx/pull/986))
- Add `myst-parser` to fix readthedocs [@qcasey](https://github.com/qcasey) ([#982](https://github.com/paperless-ngx/paperless-ngx/pull/982))
- Fix: Title is changed after switching doc quickly [@shamoon](https://github.com/shamoon) ([#979](https://github.com/paperless-ngx/paperless-ngx/pull/979))
- Fix: warn when closing a document with unsaved changes due to max open docs [@shamoon](https://github.com/shamoon) ([#956](https://github.com/paperless-ngx/paperless-ngx/pull/956))
- Bugfix: Adds configurable intoify debounce time [@stumpylog](https://github.com/stumpylog) ([#953](https://github.com/paperless-ngx/paperless-ngx/pull/953))
- Bugfix: Fixes document filename date off by 1 issue [@stumpylog](https://github.com/stumpylog) ([#942](https://github.com/paperless-ngx/paperless-ngx/pull/942))
- fixes #<!---->949: change to MIME detection for files [@gador](https://github.com/gador) ([#962](https://github.com/paperless-ngx/paperless-ngx/pull/962))
- docs: fix some typos [@Berjou](https://github.com/Berjou) ([#948](https://github.com/paperless-ngx/paperless-ngx/pull/948))
- [Docs] Fix 2 small typos [@tooomm](https://github.com/tooomm) ([#946](https://github.com/paperless-ngx/paperless-ngx/pull/946))
- [Readme] Fix typo [@tooomm](https://github.com/tooomm) ([#941](https://github.com/paperless-ngx/paperless-ngx/pull/941))
- Fix: management pages plurals incorrect in other languages [@shamoon](https://github.com/shamoon) ([#939](https://github.com/paperless-ngx/paperless-ngx/pull/939))
- Fix: v1.7.1 frontend visual fixes [@shamoon](https://github.com/shamoon) ([#933](https://github.com/paperless-ngx/paperless-ngx/pull/933))
- Fix: unassigned query params ignored [@shamoon](https://github.com/shamoon) ([#930](https://github.com/paperless-ngx/paperless-ngx/pull/930))
- Fix: allow commas in non-multi rules query params [@shamoon](https://github.com/shamoon) ([#923](https://github.com/paperless-ngx/paperless-ngx/pull/923))
- Fix: Include version in export for better error messages [@stumpylog](https://github.com/stumpylog) ([#883](https://github.com/paperless-ngx/paperless-ngx/pull/883))
- Bugfix: Superuser Management Won't Reset Password [@stumpylog](https://github.com/stumpylog) ([#903](https://github.com/paperless-ngx/paperless-ngx/pull/903))
- Fix Ignore Date Parsing [@stumpylog](https://github.com/stumpylog) ([#721](https://github.com/paperless-ngx/paperless-ngx/pull/721))

### Documentation

- Feature use env vars in pre post scripts [@ziprandom](https://github.com/ziprandom) ([#1154](https://github.com/paperless-ngx/paperless-ngx/pull/1154))
- Add `myst-parser` to fix readthedocs [@qcasey](https://github.com/qcasey) ([#982](https://github.com/paperless-ngx/paperless-ngx/pull/982))
- Add "Created" as additional (optional) parameter for post_documents [@eingemaischt](https://github.com/eingemaischt) ([#965](https://github.com/paperless-ngx/paperless-ngx/pull/965))
- Bugfix: Adds configurable intoify debounce time [@stumpylog](https://github.com/stumpylog) ([#953](https://github.com/paperless-ngx/paperless-ngx/pull/953))
- docs: fix some typos [@Berjou](https://github.com/Berjou) ([#948](https://github.com/paperless-ngx/paperless-ngx/pull/948))
- [Docs] Fix 2 small typos [@tooomm](https://github.com/tooomm) ([#946](https://github.com/paperless-ngx/paperless-ngx/pull/946))
- Convert Changelog to markdown, auto-commit future changelogs [@qcasey](https://github.com/qcasey) ([#935](https://github.com/paperless-ngx/paperless-ngx/pull/935))
- [Readme] Fix typo [@tooomm](https://github.com/tooomm) ([#941](https://github.com/paperless-ngx/paperless-ngx/pull/941))

### Maintenance

- Adds support for Docker secrets [@stumpylog](https://github.com/stumpylog) ([#1034](https://github.com/paperless-ngx/paperless-ngx/pull/1034))
- Bugfix: Don't assume default Docker folders [@stumpylog](https://github.com/stumpylog) ([#1088](https://github.com/paperless-ngx/paperless-ngx/pull/1088))
- Include error information when Redis connection fails [@stumpylog](https://github.com/stumpylog) ([#1016](https://github.com/paperless-ngx/paperless-ngx/pull/1016))
- Fix: add translation for some un-translated tooltips [@shamoon](https://github.com/shamoon) ([#995](https://github.com/paperless-ngx/paperless-ngx/pull/995))
- gunicorn: Allow IPv6 sockets [@vlcty](https://github.com/vlcty) ([#924](https://github.com/paperless-ngx/paperless-ngx/pull/924))

### Dependencies

<details>
<summary>34 changes</summary>

- Fearless scikit-learn updates [@stumpylog](https://github.com/stumpylog) ([#1082](https://github.com/paperless-ngx/paperless-ngx/pull/1082))
- Bump pillow from 9.1.1 to 9.2.0 [@dependabot](https://github.com/dependabot) ([#1193](https://github.com/paperless-ngx/paperless-ngx/pull/1193))
- Bump watchdog from 2.1.8 to 2.1.9 [@dependabot](https://github.com/dependabot) ([#1132](https://github.com/paperless-ngx/paperless-ngx/pull/1132))
- Bump scikit-learn from 1.0.2 to 1.1.1 [@dependabot](https://github.com/dependabot) ([#992](https://github.com/paperless-ngx/paperless-ngx/pull/992))
- Bump setuptools from 62.3.3 to 62.6.0 [@dependabot](https://github.com/dependabot) ([#1150](https://github.com/paperless-ngx/paperless-ngx/pull/1150))
- Bump django-filter from 21.1 to 22.1 [@dependabot](https://github.com/dependabot) ([#1191](https://github.com/paperless-ngx/paperless-ngx/pull/1191))
- Bump actions/setup-python from 3 to 4 [@dependabot](https://github.com/dependabot) ([#1176](https://github.com/paperless-ngx/paperless-ngx/pull/1176))
- Bump sphinx from 4.5.0 to 5.0.2 [@dependabot](https://github.com/dependabot) ([#1151](https://github.com/paperless-ngx/paperless-ngx/pull/1151))
- Bump docker/metadata-action from 3 to 4 [@dependabot](https://github.com/dependabot) ([#1178](https://github.com/paperless-ngx/paperless-ngx/pull/1178))
- Bump tj-actions/changed-files from 22.1 to 23.1 [@dependabot](https://github.com/dependabot) ([#1179](https://github.com/paperless-ngx/paperless-ngx/pull/1179))
- Bump @<!---->angular/cli from 13.3.7 to 14.0.4 in /src-ui [@dependabot](https://github.com/dependabot) ([#1177](https://github.com/paperless-ngx/paperless-ngx/pull/1177))
- Bump cypress from 10.0.1 to 10.3.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#1187](https://github.com/paperless-ngx/paperless-ngx/pull/1187))
- Bump zone.js from 0.11.5 to 0.11.6 in /src-ui [@dependabot](https://github.com/dependabot) ([#1185](https://github.com/paperless-ngx/paperless-ngx/pull/1185))
- Bump ts-node from 10.8.0 to 10.8.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#1184](https://github.com/paperless-ngx/paperless-ngx/pull/1184))
- Bump jest-environment-jsdom from 28.1.0 to 28.1.2 in /src-ui [@dependabot](https://github.com/dependabot) ([#1175](https://github.com/paperless-ngx/paperless-ngx/pull/1175))
- Bump @<!---->types/node from 17.0.38 to 18.0.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#1183](https://github.com/paperless-ngx/paperless-ngx/pull/1183))
- Bump concurrently from 7.2.1 to 7.2.2 in /src-ui [@dependabot](https://github.com/dependabot) ([#1181](https://github.com/paperless-ngx/paperless-ngx/pull/1181))
- Bump jest-preset-angular from 12.0.1 to 12.1.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#1182](https://github.com/paperless-ngx/paperless-ngx/pull/1182))
- Bump jest and @<!---->types/jest in /src-ui [@dependabot](https://github.com/dependabot) ([#1180](https://github.com/paperless-ngx/paperless-ngx/pull/1180))
- Bump whitenoise from 6.1.0 to 6.2.0 [@dependabot](https://github.com/dependabot) ([#1103](https://github.com/paperless-ngx/paperless-ngx/pull/1103))
- Bump cypress from 9.6.1 to 10.0.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#1083](https://github.com/paperless-ngx/paperless-ngx/pull/1083))
- Bump docker/setup-qemu-action from 1 to 2 [@dependabot](https://github.com/dependabot) ([#1065](https://github.com/paperless-ngx/paperless-ngx/pull/1065))
- Bump docker/setup-buildx-action from 1 to 2 [@dependabot](https://github.com/dependabot) ([#1064](https://github.com/paperless-ngx/paperless-ngx/pull/1064))
- Bump docker/build-push-action from 2 to 3 [@dependabot](https://github.com/dependabot) ([#1063](https://github.com/paperless-ngx/paperless-ngx/pull/1063))
- Bump @<!---->cypress/schematic from 1.7.0 to 2.0.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#1075](https://github.com/paperless-ngx/paperless-ngx/pull/1075))
- Bump tj-actions/changed-files from 19 to 22.1 [@dependabot](https://github.com/dependabot) ([#1062](https://github.com/paperless-ngx/paperless-ngx/pull/1062))
- Bump concurrently from 7.1.0 to 7.2.1 in /src-ui [@dependabot](https://github.com/dependabot) ([#1073](https://github.com/paperless-ngx/paperless-ngx/pull/1073))
- Bump @<!---->types/jest from 27.4.1 to 27.5.2 in /src-ui [@dependabot](https://github.com/dependabot) ([#1074](https://github.com/paperless-ngx/paperless-ngx/pull/1074))
- Bump ts-node from 10.7.0 to 10.8.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#1070](https://github.com/paperless-ngx/paperless-ngx/pull/1070))
- Bump jest from 28.0.3 to 28.1.0 in /src-ui [@dependabot](https://github.com/dependabot) ([#1071](https://github.com/paperless-ngx/paperless-ngx/pull/1071))
- Chore: npm package updates 22-06-01 [@shamoon](https://github.com/shamoon) ([#1069](https://github.com/paperless-ngx/paperless-ngx/pull/1069))
- Bump docker/login-action from 1 to 2 [@dependabot](https://github.com/dependabot) ([#1061](https://github.com/paperless-ngx/paperless-ngx/pull/1061))
- Chore: Manually update dependencies [@stumpylog](https://github.com/stumpylog) ([#1013](https://github.com/paperless-ngx/paperless-ngx/pull/1013))
- Chore: Manually update all Python dependencies [@stumpylog](https://github.com/stumpylog) ([#973](https://github.com/paperless-ngx/paperless-ngx/pull/973))
</details>

## paperless-ngx 1.7.1

### Features

- (chore) Runs pyupgrade to Python 3.8+ [\@stumpylog](https://github.com/stumpylog) ([\#890](https://github.com/paperless-ngx/paperless-ngx/pull/890))
- Dockerfile Organization \& Enhancements [\@stumpylog](https://github.com/stumpylog) ([\#888](https://github.com/paperless-ngx/paperless-ngx/pull/888))
- mobile friendlier manage pages [\@shamoon](https://github.com/shamoon) ([\#873](https://github.com/paperless-ngx/paperless-ngx/pull/873))
- Use semver for release process [\@stumpylog](https://github.com/stumpylog) ([\#851](https://github.com/paperless-ngx/paperless-ngx/pull/851))
- Enable Docker Hub push [\@stumpylog](https://github.com/stumpylog) ([\#828](https://github.com/paperless-ngx/paperless-ngx/pull/828))
- Feature barcode tiff support [\@gador](https://github.com/gador) ([\#766](https://github.com/paperless-ngx/paperless-ngx/pull/766))
- Updates GHA workflow to rebuild intermediate images on changes [\@stumpylog](https://github.com/stumpylog) ([\#820](https://github.com/paperless-ngx/paperless-ngx/pull/820))
- Adds simple Python to wait for Redis broker to be ready [\@stumpylog](https://github.com/stumpylog) ([\#788](https://github.com/paperless-ngx/paperless-ngx/pull/788))
- Update GHA workflow to build all Docker images [\@stumpylog](https://github.com/stumpylog) ([\#761](https://github.com/paperless-ngx/paperless-ngx/pull/761))

### Bug Fixes

- Feature / fix saved view \& sort field query params [\@shamoon](https://github.com/shamoon) ([\#881](https://github.com/paperless-ngx/paperless-ngx/pull/881))
- Mobile friendlier manage pages [\@shamoon](https://github.com/shamoon) ([\#873](https://github.com/paperless-ngx/paperless-ngx/pull/873))
- Add timeout to healthcheck [\@shamoon](https://github.com/shamoon) ([\#880](https://github.com/paperless-ngx/paperless-ngx/pull/880))
- Always accept yyyy-mm-dd date inputs [\@shamoon](https://github.com/shamoon) ([\#864](https://github.com/paperless-ngx/paperless-ngx/pull/864))
- Fix local Docker image building [\@stumpylog](https://github.com/stumpylog) ([\#849](https://github.com/paperless-ngx/paperless-ngx/pull/849))
- Fix: show errors on invalid date input [\@shamoon](https://github.com/shamoon) ([\#862](https://github.com/paperless-ngx/paperless-ngx/pull/862))
- Fix: Older dates do not display on frontend [\@shamoon](https://github.com/shamoon) ([\#852](https://github.com/paperless-ngx/paperless-ngx/pull/852))
- Fixes IMAP UTF8 Authenication [\@stumpylog](https://github.com/stumpylog) ([\#725](https://github.com/paperless-ngx/paperless-ngx/pull/725))
- Fix password field remains visible [\@shamoon](https://github.com/shamoon) ([\#840](https://github.com/paperless-ngx/paperless-ngx/pull/840))
- Fixes Pillow build for armv7 [\@stumpylog](https://github.com/stumpylog) ([\#815](https://github.com/paperless-ngx/paperless-ngx/pull/815))
- Update frontend localization source file [\@shamoon](https://github.com/shamoon) ([\#814](https://github.com/paperless-ngx/paperless-ngx/pull/814))
- Fix install script extra OCR languages format [\@stumpylog](https://github.com/stumpylog) ([\#777](https://github.com/paperless-ngx/paperless-ngx/pull/777))

### Documentation

- Use semver for release process [\@stumpylog](https://github.com/stumpylog) ([\#851](https://github.com/paperless-ngx/paperless-ngx/pull/851))
- Deployment: Consolidate tika compose files [\@qcasey](https://github.com/qcasey) ([\#866](https://github.com/paperless-ngx/paperless-ngx/pull/866))
- Fix local Docker image building [\@stumpylog](https://github.com/stumpylog) ([\#849](https://github.com/paperless-ngx/paperless-ngx/pull/849))

### Maintenance

- Dockerfile Organization \& Enhancements [\@stumpylog](https://github.com/stumpylog) ([\#888](https://github.com/paperless-ngx/paperless-ngx/pull/888))
- Add timeout to healthcheck [\@shamoon](https://github.com/shamoon) ([\#880](https://github.com/paperless-ngx/paperless-ngx/pull/880))
- Use semver for release process [\@stumpylog](https://github.com/stumpylog) ([\#851](https://github.com/paperless-ngx/paperless-ngx/pull/851))
- Deployment: Consolidate tika compose files [\@qcasey](https://github.com/qcasey) ([\#866](https://github.com/paperless-ngx/paperless-ngx/pull/866))
- Fixes Pillow build for armv7 [\@stumpylog](https://github.com/stumpylog) ([\#815](https://github.com/paperless-ngx/paperless-ngx/pull/815))
- Update frontend localization source file [\@shamoon](https://github.com/shamoon) ([\#814](https://github.com/paperless-ngx/paperless-ngx/pull/814))
- Fix install script extra OCR languages format [\@stumpylog](https://github.com/stumpylog) ([\#777](https://github.com/paperless-ngx/paperless-ngx/pull/777))
- Adds simple Python to wait for Redis broker to be ready [\@stumpylog](https://github.com/stumpylog) ([\#788](https://github.com/paperless-ngx/paperless-ngx/pull/788))

### Dependencies

<details>
<summary>15 changes</summary>

- Bump tj-actions/changed-files from 18.7 to 19 @dependabot ([\#830](https://github.com/paperless-ngx/paperless-ngx/pull/830))
- Bump asgiref from 3.5.0 to 3.5.1 @dependabot ([\#867](https://github.com/paperless-ngx/paperless-ngx/pull/867))
- Bump jest from 27.5.1 to 28.0.3 in /src-ui @dependabot ([\#860](https://github.com/paperless-ngx/paperless-ngx/pull/860))
- Bump @<!---->ng-bootstrap/ng-bootstrap from 12.1.0 to 12.1.1 in /src-ui @dependabot ([\#861](https://github.com/paperless-ngx/paperless-ngx/pull/861))
- Bump @<!---->types/node from 17.0.27 to 17.0.29 in /src-ui @dependabot ([\#833](https://github.com/paperless-ngx/paperless-ngx/pull/833))
- Bump @<!---->ng-bootstrap/ng-bootstrap from 12.0.2 to 12.1.0 in /src-ui @dependabot ([\#834](https://github.com/paperless-ngx/paperless-ngx/pull/834))
- Bump pytest from 7.1.1 to 7.1.2 @dependabot ([\#806](https://github.com/paperless-ngx/paperless-ngx/pull/806))
- Bump github/codeql-action from 1 to 2 @dependabot ([\#792](https://github.com/paperless-ngx/paperless-ngx/pull/792))
- Bump imap-tools from 0.53.0 to 0.54.0 @dependabot ([\#758](https://github.com/paperless-ngx/paperless-ngx/pull/758))
- Bump ocrmypdf from 13.4.2 to 13.4.3 @dependabot ([\#757](https://github.com/paperless-ngx/paperless-ngx/pull/757))
- Bump importlib-resources from 5.6.0 to 5.7.1 @dependabot ([\#756](https://github.com/paperless-ngx/paperless-ngx/pull/756))
- Bump tox from 3.24.5 to 3.25.0 @dependabot ([\#692](https://github.com/paperless-ngx/paperless-ngx/pull/692))
- Bump cypress from 9.5.3 to 9.6.0 in /src-ui @dependabot ([\#800](https://github.com/paperless-ngx/paperless-ngx/pull/800))
- Bump angular \& tools to 13.3.4 or 13.3.3 [\@shamoon](https://github.com/shamoon) ([\#799](https://github.com/paperless-ngx/paperless-ngx/pull/799))
- Bump concurrently from 7.0.0 to 7.1.0 in /src-ui @dependabot ([\#797](https://github.com/paperless-ngx/paperless-ngx/pull/797))
</details>

## paperless-ngx 1.7.0

### Breaking Changes

- `PAPERLESS_URL` is now required when using a reverse proxy. See
  [\#674](https://github.com/paperless-ngx/paperless-ngx/pull/674).

### Features

- Allow setting more than one tag in mail rules
  [\@jonasc](https://github.com/jonasc) ([\#270](https://github.com/paperless-ngx/paperless-ngx/pull/270))
- Global drag'n'drop [\@shamoon](https://github.com/shamoon)
  ([\#283](https://github.com/paperless-ngx/paperless-ngx/pull/283))
- Fix: download buttons should disable while waiting
  [\@shamoon](https://github.com/shamoon) ([\#630](https://github.com/paperless-ngx/paperless-ngx/pull/630))
- Update checker [\@shamoon](https://github.com/shamoon) ([\#591](https://github.com/paperless-ngx/paperless-ngx/pull/591))
- Show prompt on password-protected pdfs
  [\@shamoon](https://github.com/shamoon) ([\#564](https://github.com/paperless-ngx/paperless-ngx/pull/564))
- Filtering query params aka browser navigation for filtering
  [\@shamoon](https://github.com/shamoon) ([\#540](https://github.com/paperless-ngx/paperless-ngx/pull/540))
- Clickable tags in dashboard widgets
  [\@shamoon](https://github.com/shamoon) ([\#515](https://github.com/paperless-ngx/paperless-ngx/pull/515))
- Add bottom pagination [\@shamoon](https://github.com/shamoon)
  ([\#372](https://github.com/paperless-ngx/paperless-ngx/pull/372))
- Feature barcode splitter [\@gador](https://github.com/gador)
  ([\#532](https://github.com/paperless-ngx/paperless-ngx/pull/532))
- App loading screen [\@shamoon](https://github.com/shamoon) ([\#298](https://github.com/paperless-ngx/paperless-ngx/pull/298))
- Use progress bar for delayed buttons
  [\@shamoon](https://github.com/shamoon) ([\#415](https://github.com/paperless-ngx/paperless-ngx/pull/415))
- Add minimum length for documents text filter
  [\@shamoon](https://github.com/shamoon) ([\#401](https://github.com/paperless-ngx/paperless-ngx/pull/401))
- Added nav buttons in the document detail view
  [\@GruberViktor](https://github.com/gruberviktor) ([\#273](https://github.com/paperless-ngx/paperless-ngx/pull/273))
- Improve date keyboard input [\@shamoon](https://github.com/shamoon)
  ([\#253](https://github.com/paperless-ngx/paperless-ngx/pull/253))
- Color theming [\@shamoon](https://github.com/shamoon) ([\#243](https://github.com/paperless-ngx/paperless-ngx/pull/243))
- Parse dates when entered without separators
  [\@GruberViktor](https://github.com/gruberviktor) ([\#250](https://github.com/paperless-ngx/paperless-ngx/pull/250))

### Bug Fixes

- Add "localhost" to ALLOWED_HOSTS
  [\@gador](https://github.com/gador) ([\#700](https://github.com/paperless-ngx/paperless-ngx/pull/700))
- Fix: scanners table [\@qcasey](https://github.com/qcasey) ([\#690](https://github.com/paperless-ngx/paperless-ngx/pull/690))
- Adds wait for file before consuming
  [\@stumpylog](https://github.com/stumpylog) ([\#483](https://github.com/paperless-ngx/paperless-ngx/pull/483))
- Fix: frontend document editing erases time data
  [\@shamoon](https://github.com/shamoon) ([\#654](https://github.com/paperless-ngx/paperless-ngx/pull/654))
- Increase length of SavedViewFilterRule
  [\@stumpylog](https://github.com/stumpylog) ([\#612](https://github.com/paperless-ngx/paperless-ngx/pull/612))
- Fixes attachment filename matching during mail fetching
  [\@stumpylog](https://github.com/stumpylog) ([\#680](https://github.com/paperless-ngx/paperless-ngx/pull/680))
- Add `PAPERLESS_URL` env variable & CSRF var
  [\@shamoon](https://github.com/shamoon) ([\#674](https://github.com/paperless-ngx/paperless-ngx/discussions/674))
- Fix: download buttons should disable while waiting
  [\@shamoon](https://github.com/shamoon) ([\#630](https://github.com/paperless-ngx/paperless-ngx/pull/630))
- Fixes downloaded filename, add more consumer ignore settings
  [\@stumpylog](https://github.com/stumpylog) ([\#599](https://github.com/paperless-ngx/paperless-ngx/pull/599))
- FIX BUG: case-sensitive matching was not possible
  [\@danielBreitlauch](https://github.com/danielbreitlauch) ([\#594](https://github.com/paperless-ngx/paperless-ngx/pull/594))
- Uses shutil.move instead of rename
  [\@gador](https://github.com/gador) ([\#617](https://github.com/paperless-ngx/paperless-ngx/pull/617))
- Fix npm deps 01.02.22 2 [\@shamoon](https://github.com/shamoon)
  ([\#610](https://github.com/paperless-ngx/paperless-ngx/discussions/610))
- Fix npm dependencies 01.02.22
  [\@shamoon](https://github.com/shamoon) ([\#600](https://github.com/paperless-ngx/paperless-ngx/pull/600))
- Fix issue 416: implement `PAPERLESS_OCR_MAX_IMAGE_PIXELS`
  [\@hacker-h](https://github.com/hacker-h) ([\#441](https://github.com/paperless-ngx/paperless-ngx/pull/441))
- Fix: exclude cypress from build in Dockerfile
  [\@FrankStrieter](https://github.com/FrankStrieter) ([\#526](https://github.com/paperless-ngx/paperless-ngx/pull/526))
- Corrections to pass pre-commit hooks
  [\@schnuffle](https://github.com/schnuffle) ([\#454](https://github.com/paperless-ngx/paperless-ngx/pull/454))
- Fix 311 unable to click checkboxes in document list
  [\@shamoon](https://github.com/shamoon) ([\#313](https://github.com/paperless-ngx/paperless-ngx/pull/313))
- Fix imap tools bug [\@stumpylog](https://github.com/stumpylog)
  ([\#393](https://github.com/paperless-ngx/paperless-ngx/pull/393))
- Fix filterable dropdown buttons arent translated
  [\@shamoon](https://github.com/shamoon) ([\#366](https://github.com/paperless-ngx/paperless-ngx/pull/366))
- Fix 224: "Auto-detected date is day before receipt date"
  [\@a17t](https://github.com/a17t) ([\#246](https://github.com/paperless-ngx/paperless-ngx/pull/246))
- Fix minor sphinx errors [\@shamoon](https://github.com/shamoon)
  ([\#322](https://github.com/paperless-ngx/paperless-ngx/pull/322))
- Fix page links hidden [\@shamoon](https://github.com/shamoon)
  ([\#314](https://github.com/paperless-ngx/paperless-ngx/pull/314))
- Fix: Include excluded items in dropdown count
  [\@shamoon](https://github.com/shamoon) ([\#263](https://github.com/paperless-ngx/paperless-ngx/pull/263))

### Translation

- [\@miku323](https://github.com/miku323) contributed to Slovenian
  translation
- [\@FaintGhost](https://github.com/FaintGhost) contributed to Chinese
  Simplified translation
- [\@DarkoBG79](https://github.com/DarkoBG79) contributed to Serbian
  translation
- [Kemal Secer](https://crowdin.com/profile/kemal.secer) contributed
  to Turkish translation
- [\@Prominence](https://github.com/Prominence) contributed to
  Belarusian translation

### Documentation

- Fix: scanners table [\@qcasey](https://github.com/qcasey) ([\#690](https://github.com/paperless-ngx/paperless-ngx/pull/690))
- Add `PAPERLESS_URL` env variable & CSRF var
  [\@shamoon](https://github.com/shamoon) ([\#674](https://github.com/paperless-ngx/paperless-ngx/pull/674))
- Fixes downloaded filename, add more consumer ignore settings
  [\@stumpylog](https://github.com/stumpylog) ([\#599](https://github.com/paperless-ngx/paperless-ngx/pull/599))
- Fix issue 416: implement `PAPERLESS_OCR_MAX_IMAGE_PIXELS`
  [\@hacker-h](https://github.com/hacker-h) ([\#441](https://github.com/paperless-ngx/paperless-ngx/pull/441))
- Fix minor sphinx errors [\@shamoon](https://github.com/shamoon)
  ([\#322](https://github.com/paperless-ngx/paperless-ngx/pull/322))

### Maintenance

- Add `PAPERLESS_URL` env variable & CSRF var
  [\@shamoon](https://github.com/shamoon) ([\#674](https://github.com/paperless-ngx/paperless-ngx/pull/674))
- Chore: Implement release-drafter action for Changelogs
  [\@qcasey](https://github.com/qcasey) ([\#669](https://github.com/paperless-ngx/paperless-ngx/pull/669))
- Chore: Add CODEOWNERS [\@qcasey](https://github.com/qcasey) ([\#667](https://github.com/paperless-ngx/paperless-ngx/pull/667))
- Support docker-compose v2 in install
  [\@stumpylog](https://github.com/stumpylog) ([\#611](https://github.com/paperless-ngx/paperless-ngx/pull/611))
- Add Belarusian localization [\@shamoon](https://github.com/shamoon)
  ([\#588](https://github.com/paperless-ngx/paperless-ngx/pull/588))
- Add Turkish localization [\@shamoon](https://github.com/shamoon)
  ([\#536](https://github.com/paperless-ngx/paperless-ngx/pull/536))
- Add Serbian localization [\@shamoon](https://github.com/shamoon)
  ([\#504](https://github.com/paperless-ngx/paperless-ngx/pull/504))
- Create PULL_REQUEST_TEMPLATE.md
  [\@shamoon](https://github.com/shamoon) ([\#304](https://github.com/paperless-ngx/paperless-ngx/pull/304))
- Add Chinese localization [\@shamoon](https://github.com/shamoon)
  ([\#247](https://github.com/paperless-ngx/paperless-ngx/pull/247))
- Add Slovenian language for frontend
  [\@shamoon](https://github.com/shamoon) ([\#315](https://github.com/paperless-ngx/paperless-ngx/pull/315))

## paperless-ngx 1.6.0

This is the first release of the revived paperless-ngx project 🎉. Thank
you to everyone on the paperless-ngx team for your initiative and
excellent teamwork!

Version 1.6.0 merges several pending PRs from jonaswinkler's repo and
includes new feature updates and bug fixes. Major backend and UI changes
include:

- Updated docs, scripts, CI, and containers to paperless-ngx.
- Updated Python and Angular dependencies.
- Dropped support for Python 3.7.
- Dropped support for Ansible playbooks (thanks
  [\@slankes](https://github.com/slankes) [\#109](https://github.com/paperless-ngx/paperless-ngx/pull/109)). If someone would
  like to continue supporting them, please see our [ansible
  repo](https://github.com/paperless-ngx/paperless-ngx-ansible).
- Python code is now required to use Black formatting (thanks
  [\@kpj](https://github.com/kpj) [\#168](https://github.com/paperless-ngx/paperless-ngx/pull/168)).
- [\@tribut](https://github.com/tribut) added support for a custom SSO
  logout redirect ([jonaswinkler\#1258](https://github.com/jonaswinkler/paperless-ng/pull/1258)). See
  `PAPERLESS_LOGOUT_REDIRECT_URL`.
- [\@shamoon](https://github.com/shamoon) added a loading indicator
  when document list is reloading ([jonaswinkler\#1297](https://github.com/jonaswinkler/paperless-ng/pull/1297)).
- [\@shamoon](https://github.com/shamoon) improved the PDF viewer on
  mobile ([\#2](https://github.com/paperless-ngx/paperless-ngx/pull/2)).
- [\@shamoon](https://github.com/shamoon) added 'any' / 'all' and
  'not' filtering with tags ([\#10](https://github.com/paperless-ngx/paperless-ngx/pull/10)).
- [\@shamoon](https://github.com/shamoon) added warnings for unsaved
  changes, with smart edit buttons ([\#13](https://github.com/paperless-ngx/paperless-ngx/pull/13)).
- [\@benjaminfrank](https://github.com/benjaminfrank) enabled a
  non-root access to port 80 via systemd ([\#18](https://github.com/paperless-ngx/paperless-ngx/pull/18)).
- [\@tribut](https://github.com/tribut) added simple "delete to
  trash" functionality ([\#24](https://github.com/paperless-ngx/paperless-ngx/pull/24)). See `PAPERLESS_TRASH_DIR`.
- [\@amenk](https://github.com/amenk) fixed the search box overlay
  menu on mobile ([\#32](https://github.com/paperless-ngx/paperless-ngx/pull/32)).
- [\@dblitt](https://github.com/dblitt) updated the login form to not
  auto-capitalize usernames ([\#36](https://github.com/paperless-ngx/paperless-ngx/pull/36)).
- [\@evilsidekick293](https://github.com/evilsidekick293) made the
  worker timeout configurable ([\#37](https://github.com/paperless-ngx/paperless-ngx/pull/37)). See `PAPERLESS_WORKER_TIMEOUT`.
- [\@Nicarim](https://github.com/Nicarim) fixed downloads of UTF-8
  formatted documents in Firefox ([\#56](https://github.com/paperless-ngx/paperless-ngx/pull/56)).
- [\@mweimerskirch](https://github.com/mweimerskirch) sorted the
  language dropdown by locale ([\#78](https://github.com/paperless-ngx/paperless-ngx/issues/78)).
- [\@mweimerskirch](https://github.com/mweimerskirch) enabled the
  Czech ([\#83](https://github.com/paperless-ngx/paperless-ngx/pull/83)) and Danish ([\#84](https://github.com/paperless-ngx/paperless-ngx/pull/84)) translations.
- [\@cschmatzler](https://github.com/cschmatzler) enabled specifying
  the webserver port ([\#124](https://github.com/paperless-ngx/paperless-ngx/pull/124)). See `PAPERLESS_PORT`.
- [\@muellermartin](https://github.com/muellermartin) fixed an error
  when uploading transparent PNGs ([\#133](https://github.com/paperless-ngx/paperless-ngx/pull/133)).
- [\@shamoon](https://github.com/shamoon) created a slick new logo
  ([\#165](https://github.com/paperless-ngx/paperless-ngx/pull/165)).
- [\@tim-vogel](https://github.com/tim-vogel) fixed exports missing
  groups ([\#193](https://github.com/paperless-ngx/paperless-ngx/pull/193)).

Known issues:

- 1.6.0 included a malformed package-lock.json, as a result users who
  want to build the docker image themselves need to change line 6 of
  the `Dockerfile` to
  `RUN npm update npm -g && npm install --legacy-peer-deps`.

Thank you to the following people for their documentation updates,
fixes, and comprehensive testing:

[\@m0veax](https://github.com/m0veax),
[\@a17t](https://github.com/a17t),
[\@fignew](https://github.com/fignew),
[\@muued](https://github.com/muued),
[\@bauerj](https://github.com/bauerj),
[\@isigmund](https://github.com/isigmund),
[\@denilsonsa](https://github.com/denilsonsa),
[\@mweimerskirch](https://github.com/mweimerskirch),
[\@alexander-bauer](https://github.com/alexander-bauer),
[\@apeltzer](https://github.com/apeltzer),
[\@tribut](https://github.com/tribut),
[\@yschroeder](https://github.com/yschroeder),
[\@gador](https://github.com/gador),
[\@sAksham-Ar](https://github.com/sAksham-Ar),
[\@sbrunner](https://github.com/sbrunner),
[\@philpagel](https://github.com/philpagel),
[\@davemachado](https://github.com/davemachado),
[\@2600box](https://github.com/2600box),
[\@qcasey](https://github.com/qcasey),
[\@Nicarim](https://github.com/Nicarim),
[\@kpj](https://github.com/kpj), [\@filcuk](https://github.com/filcuk),
[\@Timoms](https://github.com/Timoms),
[\@mattlamb99](https://github.com/mattlamb99),
[\@padraigkitterick](https://github.com/padraigkitterick),
[\@ajkavanagh](https://github.com/ajkavanagh),
[\@Tooa](https://github.com/Tooa),
[\@Unkn0wnCat](https://github.com/Unkn0wnCat),
[\@pewter77](https://github.com/pewter77),
[\@stumpylog](https://github.com/stumpylog),
[\@Toxix](https://github.com/Toxix),
[\@azapater](https://github.com/azapater),
[\@jschpp](https://github.com/jschpp)

Another big thanks to the people who have contributed translations:

- Michel Weimerskirch (michel_weimerskirch) suggested 31 translations
  into French and Luxembourgish.
- jo.vandeginste suggested 21 translations into Dutch.
- Lars Sørensen (Lrss) suggested 486 translations into Danish.
- Alex (Sky-Dragon) voted for 46 translations in German.
- Yannic Schröder (yschroeder) suggested 14 translations into German.
- David Morais Ferreira (DavidMoraisFerreira) voted for 10
  translations in Portuguese and Luxembourgish.
- David Morais Ferreira (DavidMoraisFerreira) suggested 88
  translations into French, German, Portuguese, Portuguese, Brazilian
  and Luxembourgish.
- 汪泠沣 (wlfcss) suggested 13 translations into Chinese Traditional.
- Lars Sørensen (Lrss) suggested 167 translations into Danish.
- Philmo67 suggested 11 translations into French.

## Paperless-ng

### paperless-ng 1.5.0

Support for Python 3.6 was dropped.

- Updated python dependencies.
- Base image of the docker image changed from Debian Buster to Debian
  Bullseye due to its recent release.
- The docker image now uses python 3.9.
- Added the Luxembourgish locale. Thanks for translating!
- [Daniel Albers](https://github.com/AlD) added support for making the
  files and folders ignored by the paperless consume folder scanner
  configurable. See `PAPERLESS_CONSUMER_IGNORE_PATTERNS`.

### paperless-ng 1.4.5

This is a maintenance release.

- Updated Python and Angular dependencies.
- Changed the algorithm that changes permissions during startup. This
  is still fast, and will hopefully cause less issues.
- Fixed an issue that would sometimes cause paperless to write an
  incomplete classification model file to disk.
- Fixed an issue with the OCRmyPDF parser that would always try to
  extract text with PDFminer even from non-PDF files.

### paperless-ng 1.4.4

- Drastically decreased the startup time of the docker container. The
  startup script adjusts file permissions of all data only if changes
  are required.
- Paperless mail: Added ability to specify the character set for each
  server.
- Document consumption: Ignore Mac OS specific files such as
  `.DS_STORE` and `._XXXXX.pdf`.
- Fixed an issue with the automatic matching algorithm that prevents
  paperless from consuming new files.
- Updated translations.

### paperless-ng 1.4.3

- Additions and changes
  - Added Swedish locale.
  - [Stéphane Brunner](https://github.com/sbrunner) added an option
    to disable the progress bars of all management commands.
  - [Jo Vandeginste](https://github.com/jovandeginste) added support
    for RTF documents to the Apache TIKA parser.
  - [Michael Shamoon](https://github.com/shamoon) added dark mode
    for the login and logout pages.
  - [Alexander Menk](https://github.com/amenk) added additional
    stylesheets for printing. You can now print any page of
    paperless and the print result will hide the page header,
    sidebar, and action buttons.
  - Added support for sorting when using full text search.
- Fixes
  - [puuu](https://github.com/puuu) fixed
    `PAPERLESS_FORCE_SCRIPT_NAME`. You can now host paperless on sub
    paths such as `https://localhost:8000/paperless/`.
  - Fixed an issue with the document consumer crashing on certain
    documents due to issues with pdfminer.six. This library is used
    for PDF text extraction.

### paperless-ng 1.4.2

- Fixed an issue with `sudo` that caused paperless to not start on
  many Raspberry Pi devices. Thank you
  [WhiteHatTux](https://github.com/WhiteHatTux)!

### paperless-ng 1.4.1

- Added Polish locale.
- Changed some parts of the Dockerfile to hopefully restore
  functionality on certain ARM devices.
- Updated python dependencies.
- [Michael Shamoon](https://github.com/shamoon) added a sticky filter
  / bulk edit bar.
- [sbrl](https://github.com/sbrl) changed the docker-entrypoint.sh
  script to increase compatibility with NFS shares.
- [Chris Nagy](https://github.com/what-name) added support for
  creating a super user by passing `PAPERLESS_ADMIN_USER` and
  `PAPERLESS_ADMIN_PASSWORD` as environment variables to the docker
  container.

### paperless-ng 1.4.0

- Docker images now use tesseract 4.1.1, which should fix a series of
  issues with OCR.
- The full text search now displays results using the default document
  list. This enables selection, filtering and bulk edit on search
  results.
- Changes
  - Firefox only: Highlight search query in PDF previews.
  - New URL pattern for accessing documents by ASN directly
    (<http://><paperless>/asn/123)
  - Added logging when executing pre\* and post-consume scripts.
  - Better error logging during document consumption.
  - Updated python dependencies.
  - Automatically inserts typed text when opening "Create new"
    dialogs on the document details page.
- Fixes
  - Fixed an issue with null characters in the document content.

!!! note

    The changed to the full text searching require you to reindex your
    documents. _The docker image does this automatically, you don't need to
    do anything._ To do this, execute the `document_index reindex`
    management command (see [Managing the document search index](/administration#index)).

### paperless-ng 1.3.2

- Added translation into Portuguese.
- Changes
  - The exporter now exports user accounts, mail accounts, mail
    rules and saved views as well.
- Fixes
  - Minor layout issues with document cards and the log viewer.
  - Fixed an issue with any/all/exact matching when characters used
    in regular expressions were used for the match.

### paperless-ng 1.3.1

- Added translation into Spanish and Russian.
- Other changes
  - ISO-8601 date format will now always show years with 4 digits.
  - Added the ability to search for a document with a specific ASN.
  - The document cards now display ASN, types and dates in a more
    organized way.
  - Added document previews when hovering over the preview button.
- Fixes
  - The startup check for write permissions now works properly on
    NFS shares.
  - Fixed an issue with the search results score indicator.
  - Paperless was unable to generate thumbnails for encrypted PDF
    files and failed. Paperless will now generate a default
    thumbnail for these files.
  - Fixed `AUTO_LOGIN_USERNAME`: Unable to perform POST/PUT/DELETE
    requests and unable to receive WebSocket messages.

### paperless-ng 1.3.0

This release contains new database migrations.

- Changes
  - The REST API is versioned from this point onwards. This will
    allow me to make changes without breaking existing clients. See
    the documentation about [API versioning](/api#api-versioning) for details.
  - Added a color picker for tag colors.
  - Added the ability to use the filter for searching the document
    content as well.
  - Added translations into Italian and Romanian. Thank you!
  - Close individual documents from the sidebar. Thanks to [Michael
    Shamoon](https://github.com/shamoon).
  - [BolkoSchreiber](https://github.com/BolkoSchreiber) added an
    option to disable/enable thumbnail inversion in dark mode.
  - [Simon Taddiken](https://github.com/skuzzle) added the ability
    to customize the header used for remote user authentication with
    SSO applications.
- Bug fixes
  - Fixed an issue with the auto matching algorithm when more than
    256 tags were used.

### paperless-ng 1.2.1

- [Rodrigo Avelino](https://github.com/rodavelino) translated
  Paperless into Portuguese (Brazil)!
- The date input fields now respect the currently selected date
  format.
- Added a fancy icon when adding paperless to the home screen on iOS
  devices. Thanks to [Joel Nordell](https://github.com/joelnordell).
- When using regular expression matching, the regular expression is
  now validated before saving the tag/correspondent/type.
- Regression fix: Dates on the front end did not respect date locale
  settings in some cases.

### paperless-ng 1.2.0

- Changes to the OCRmyPDF integration
  - Added support for deskewing and automatic rotation of
    incorrectly rotated pages. This is enabled by default, see
    [OCR settings](/configuration#ocr).
  - Better support for encrypted files.
  - Better support for various other PDF files: Paperless will now
    attempt to force OCR with safe options when OCR fails with the
    configured options.
  - Added an explicit option to skip cleaning with `unpaper`.
- Download multiple selected documents as a zip archive.
- The document list now remembers the current page.
- Improved responsiveness when switching between saved views and the
  document list.
- Increased the default wait time when observing files in the
  consumption folder with polling from 1 to 5 seconds. This will
  decrease the likelihood of paperless consuming partially written
  files.
- Fixed a crash of the document archiver management command when
  trying to process documents with unknown mime types.
- Paperless no longer depends on `libpoppler-cpp-dev`.

### paperless-ng 1.1.4

- Added English (GB) locale.
- Added ISO-8601 date display option.

### paperless-ng 1.1.3

- Added a docker-specific configuration option to adjust the number of
  worker processes of the web server. See
  [Docker options](/configuration#docker).
- Some more memory usage optimizations.
- Don't show inbox statistics if no inbox tag is defined.

### paperless-ng 1.1.2

- Always show top left corner of thumbnails, even for extra wide
  documents.
- Added a management command for executing the sanity checker
  directly. See [management utilities](/administration#sanity-checker).
- The weekly sanity check now reports messages in the log files.
- Fixed an issue with the metadata tab not reporting anything in case
  of missing files.
- Reverted a change from 1.1.0 that caused huge memory usage due to
  redis caching.
- Some memory usage optimizations.

### paperless-ng 1.1.1

This release contains new database migrations.

- Fixed a bug in the sanity checker that would cause it to display "x
  not in list" errors instead of actual issues.
- Fixed a bug with filename generation for archive filenames that
  would cause the archive files of two documents to overlap.
  - This happened when `PAPERLESS_FILENAME_FORMAT` is used and the
    filenames of two or more documents are the same, except for the
    file extension.
  - Paperless will now store the archive filename in the database as
    well instead of deriving it from the original filename, and use
    the same logic for detecting and avoiding filename clashes
    that's also used for original filenames.
  - The migrations will repair any missing archive files. If you're
    using tika, ensure that tika is running while performing the
    migration. Docker-compose will take care of that.
- Fixed a bug with thumbnail regeneration when TIKA integration was
  used.
- Added ASN as a placeholder field to the filename format.
- The docker image now comes with built-in shortcuts for most
  management commands. These are now the recommended way to execute
  management commands, since these also ensure that they're always
  executed as the paperless user and you're less likely to run into
  permission issues. See
  [management commands](/administration#management-commands).

### paperless-ng 1.1.0

- Document processing status

  - Paperless now shows the status of processing documents on the
    dashboard in real time.
  - Status notifications when
    - New documents are detected in the consumption folder, in
      mails, uploaded on the front end, or added with one of the
      mobile apps.
    - Documents are successfully added to paperless.
    - Document consumption failed (with error messages)
  - Configuration options to enable/disable individual
    notifications.

- Live updates to document lists and saved views when new documents
  are added.

  !!! tip

  For status notifications and live updates to work, paperless now
  requires an [ASGI](https://asgi.readthedocs.io/en/latest/)-enabled
  web server. The docker images uses `gunicorn` and an ASGI-enabled
  worker called [uvicorn](https://www.uvicorn.org/), and there is no
  need to configure anything.

  For bare metal installations, changes are required for the
  notifications to work. Adapt the service
  `paperless-webserver.service` to use the supplied `gunicorn.conf.py`
  configuration file and adapt the reference to the ASGI application
  as follows:

  ```
  ExecStart=/opt/paperless/.local/bin/gunicorn -c /opt/paperless/gunicorn.conf.py paperless.asgi:application
  ```

  Paperless will continue to work with WSGI, but you will not get any
  status notifications.

  Apache `mod_wsgi` users, see
  [this note](/faq#how-do-i-get-websocket-support-with-apache-mod_wsgi).

- Paperless now offers suggestions for tags, correspondents and types
  on the document detail page.

- Added an interactive easy install script that automatically
  downloads, configures and starts paperless with docker.

- Official support for Python 3.9.

- Other changes and fixes

  - Adjusted the default parallelization settings to run more than
    one task in parallel on systems with 4 or less cores. This
    addresses issues with paperless not consuming any new files when
    other tasks are running.
  - Fixed a rare race condition that would cause paperless to
    process incompletely written files when using the upload on the
    dashboard.
  - The document classifier no longer issues warnings and errors
    when auto matching is not used at all.
  - Better icon for document previews.
  - Better info section in the side bar.
  - Paperless no longer logs to the database. Instead, logs are
    written to rotating log files. This solves many "database is
    locked" issues on Raspberry Pi, especially when SQLite is used.
  - By default, log files are written to `PAPERLESS_DATA_DIR/log/`.
    Logging settings can be adjusted with `PAPERLESS_LOGGING_DIR`,
    `PAPERLESS_LOGROTATE_MAX_SIZE` and
    `PAPERLESS_LOGROTATE_MAX_BACKUPS`.

### paperless-ng 1.0.0

Nothing special about this release, but since there are relatively few
bug reports coming in, I think that this is reasonably stable.

- Document export
  - The document exporter has been rewritten to support updating an
    already existing export in place. This enables incremental
    backups with `rsync`.
  - The document exporter supports naming exported files according
    to `PAPERLESS_FILENAME_FORMAT`.
  - The document exporter locks the media directory and the database
    during execution to ensure that the resulting export is
    consistent.
  - See the [updated documentation](/administration#exporter) for more details.
- Other changes and additions
  - Added a language selector to the settings.
  - Added date format options to the settings.
  - Range selection with shift clicking is now possible in the
    document list.
  - Filtering correspondent, type and tag management pages by name.
  - Focus "Name" field in dialogs by default.

### paperless-ng 0.9.14

Starting with this version, releases are getting built automatically.
This release also comes with changes on how to install and update
paperless.

- Paperless now uses GitHub Actions to make releases and build docker
  images.
  - Docker images are available for amd64, armhf, and aarch64.
  - When you pull an image from Docker Hub, Docker will
    automatically select the correct image for you.
- Changes to docker installations and updates
  - The `-dockerfiles.tar.xz` release archive is gone. Instead,
    simply grab the docker files from `/docker/compose` in the
    repository if you wish to install paperless by pulling from the
    hub.
  - The docker compose files in `/docker/compose` were changed to
    always use the `latest` version automatically. In order to do
    further updates, simply do a `docker-compose pull`. The
    documentation has been updated.
  - The docker compose files were changed to restart paperless on
    system boot only if it was running before shutdown.
  - Documentation of the docker-compose files about what they do.
- Changes to bare metal installations and updates
  - The release archive is built exactly like before. However, the
    release now comes with already compiled translation messages and
    collected static files. Therefore, the update steps
    `compilemessages` and `collectstatic` are now obsolete.
- Other changes
  - A new configuration option `PAPERLESS_IGNORE_DATES` was added by
    [jayme-github](http://github.com/jayme-github). This can be used
    to instruct paperless to ignore certain dates (such as your date
    of birth) when guessing the date from the document content. This
    was actually introduced in 0.9.12, I just forgot to mention it
    in the changelog.
  - The filter drop downs now display selected entries on top of all
    other entries.
  - The PostgreSQL client now supports setting an explicit `sslmode`
    to force encryption of the connection to PostgreSQL.
  - The docker images now come with `jbig2enc`, which is a lossless
    image encoder for PDF documents and decreases the size of
    certain PDF/A documents.
  - When using any of the manual matching algorithms, paperless now
    logs messages about when and why these matching algorithms
    matched.
  - The default settings for parallelization in paperless were
    adjusted to always leave one CPU core free.
  - Added an option to the frontend to choose which method to use
    for displaying PDF documents.
- Fixes
  - An issue with the tika parser not picking up files from the
    consumption directory was fixed.
  - A couple changes to the dark mode and fixes to several other
    layout issues.
  - An issue with the drop downs for correspondents, tags and types
    not properly supporting filtering with special characters was
    fixed.
  - Fixed an issue with filenames of downloaded files: Dates where
    off by one day due to timezone issues.
  - Searching will continue to work even when the index returns
    non-existing documents. This resulted in "Document does not
    exist" errors before. Instead, a warning is logged, indicating
    the issue.
  - An issue with the consumer crashing when invalid regular
    expression were used was fixed.

### paperless-ng 0.9.13

- Fixed an issue with Paperless not starting due to the new Tika
  integration when `USERMAP_UID` and `USERMAP_GID` was used in the
  `docker-compose.env` file.

### paperless-ng 0.9.12

- Paperless localization
  - Thanks to the combined efforts of many users, Paperless is now
    available in English, Dutch, French and German.
- Thanks to [Jo Vandeginste](https://github.com/jovandeginste),
  Paperless has optional support for Office documents such as .docx,
  .doc, .odt and more.
  - See the [Tika settings](/configuration#tika) on how to enable this
    feature. This feature requires two additional services (one for
    parsing Office documents and metadata extraction and another for
    converting Office documents to PDF), and is therefore not enabled
    on default installations.
  - As with all other documents, paperless converts Office documents
    to PDF and stores both the original as well as the archived PDF.
- Dark mode
  - Thanks to [Michael Shamoon](https://github.com/shamoon),
    paperless now has a dark mode. Configuration is available in the
    settings.
- Other changes and additions
  - The PDF viewer now uses a local copy of some dependencies
    instead of fetching them from the internet. Thanks to
    [slorenz](https://github.com/sisao).
  - Revamped search bar styling thanks to [Michael
    Shamoon](https://github.com/shamoon).
  - Sorting in the document list by clicking on table headers.
  - A button was added to the document detail page that assigns a
    new ASN to a document.
  - Form field validation: When providing invalid input in a form
    (such as a duplicate ASN or no name), paperless now has visual
    indicators and clearer error messages about what's wrong.
  - Paperless disables buttons with network actions (such as save
    and delete) when a network action is active. This indicates that
    something is happening and prevents double clicking.
  - When using "Save & next", the title field is focussed
    automatically to better support keyboard editing.
  - E-Mail: Added filter rule parameters to allow inline attachments
    (watch out for mails with inlined images!) and attachment
    filename filters with wildcards.
  - Support for remote user authentication thanks to [Michael
    Shamoon](https://github.com/shamoon). This is useful for hiding
    Paperless behind single sign on applications such as
    [authelia](https://www.authelia.com/).
  - "Clear filters" has been renamed to "Reset filters" and now
    correctly restores the default filters on saved views. Thanks to
    [Michael Shamoon](https://github.com/shamoon)
- Fixes
  - Paperless was unable to save views when "Not assigned" was
    chosen in one of the filter dropdowns.
  - Clearer error messages when pre and post consumption scripts do
    not exist.
  - The post consumption script is executed later in the consumption
    process. Before the change, an ID was passed to the script
    referring to a document that did not yet exist in the database.

### paperless-ng 0.9.11

- Fixed an issue with the docker image not starting at all due to a
  configuration change of the web server.

### paperless-ng 0.9.10

- Bulk editing
  - Thanks to [Michael Shamoon](https://github.com/shamoon), we've
    got a new interface for the bulk editor.
  - There are some configuration options in the settings to alter
    the behavior.
- Other changes and additions
  - Thanks to [zjean](https://github.com/zjean), paperless now
    publishes a webmanifest, which is useful for adding the
    application to home screens on mobile devices.
  - The Paperless-ng logo now navigates to the dashboard.
  - Filter for documents that don't have any correspondents, types
    or tags assigned.
  - Tags, types and correspondents are now sorted case insensitive.
  - Lots of preparation work for localization support.
- Fixes
  - Added missing dependencies for Raspberry Pi builds.
  - Fixed an issue with plain text file consumption: Thumbnail
    generation failed due to missing fonts.
  - An issue with the search index reporting missing documents after
    bulk deletes was fixed.
  - Issue with the tag selector not clearing input correctly.
  - The consumer used to stop working when encountering an
    incomplete classifier model file.

!!! note

    The bulk delete operations did not update the search index. Therefore,
    documents that you deleted remained in the index and caused the search
    to return messages about missing documents when searching. Further bulk
    operations will properly update the index.

    However, this change is not retroactive: If you used the delete method
    of the bulk editor, you need to reindex your search index by
    [running the management command `document_index` with the argument `reindex`](/administration#index).

### paperless-ng 0.9.9

Christmas release!

- Bulk editing
  - Paperless now supports bulk editing.
  - The following operations are available: Add and remove
    correspondents, tags, document types from selected documents, as
    well as mass-deleting documents.
  - We've got a more fancy UI in the works that makes these
    features more accessible, but that's not quite ready yet.
- Searching
  - Paperless now supports searching for similar documents ("More
    like this") both from the document detail page as well as from
    individual search results.
  - A search score indicates how well a document matches the search
    query, or how similar a document is to a given reference
    document.
- Other additions and changes
  - Clarification in the UI that the fields "Match" and "Is
    insensitive" are not relevant for the Auto matching algorithm.
  - New select interface for tags, types and correspondents allows
    filtering. This also improves tag selection. Thanks again to
    [Michael Shamoon](https://github.com/shamoon)!
  - Page navigation controls for the document viewer, thanks to
    [Michael Shamoon](https://github.com/shamoon).
  - Layout changes to the small cards document list.
  - The dashboard now displays the username (or full name if
    specified in the admin) on the dashboard.
- Fixes
  - An error that caused the document importer to crash was fixed.
  - An issue with changes not being possible when
    `PAPERLESS_COOKIE_PREFIX` is used was fixed.
  - The date selection filters now allow manual entry of dates.
- Feature Removal
  - Most of the guesswork features have been removed. Paperless no
    longer tries to extract correspondents and tags from file names.

### paperless-ng 0.9.8

This release addresses two severe issues with the previous release.

- The delete buttons for document types, correspondents and tags were
  not working.
- The document section in the admin was causing internal server errors
  (500).

### paperless-ng 0.9.7

- Front end
  - Thanks to the hard work of [Michael
    Shamoon](https://github.com/shamoon), paperless now comes with a
    much more streamlined UI for filtering documents.
  - [Michael Shamoon](https://github.com/shamoon) replaced the
    document preview with another component. This should fix
    compatibility with Safari browsers.
  - Added buttons to the management pages to quickly show all
    documents with one specific tag, correspondent, or title.
  - Paperless now stores your saved views on the server and
    associates them with your user account. This means that you can
    access your views on multiple devices and have separate views
    for different users. You will have to recreate your views.
  - The GitHub and documentation links now open in new tabs/windows.
    Thanks to [rYR79435](https://github.com/rYR79435).
  - Paperless now generates default saved view names when saving
    views with certain filter rules.
  - Added a small version indicator to the front end.
- Other additions and changes
  - The new filename format field `{tag_list}` inserts a list of
    tags into the filename, separated by comma.
  - The `document_retagger` no longer removes inbox tags or tags
    without matching rules.
  - The new configuration option `PAPERLESS_COOKIE_PREFIX` allows
    you to run multiple instances of paperless on different ports.
    This option enables you to be logged in into multiple instances
    by specifying different cookie names for each instance.
- Fixes
  - Sometimes paperless would assign dates in the future to newly
    consumed documents.
  - The filename format fields `{created_month}` and `{created_day}`
    now use a leading zero for single digit values.
  - The filename format field `{tags}` can no longer be used without
    arguments.
  - Paperless was not able to consume many images (especially images
    from mobile scanners) due to missing DPI information. Paperless
    now assumes A4 paper size for PDF generation if no DPI
    information is present.
  - Documents with empty titles could not be opened from the table
    view due to the link being empty.
  - Fixed an issue with filenames containing special characters such
    as `:` not being accepted for upload.
  - Fixed issues with thumbnail generation for plain text files.

### paperless-ng 0.9.6

This release focusses primarily on many small issues with the UI.

- Front end
  - Paperless now has proper window titles.
  - Fixed an issue with the small cards when more than 7 tags were
    used.
  - Navigation of the "Show all" links adjusted. They navigate to
    the saved view now, if available in the sidebar.
  - Some indication on the document lists that a filter is active
    was added.
  - There's a new filter to filter for documents that do _not_ have
    a certain tag.
  - The file upload box now shows upload progress.
  - The document edit page was reorganized.
  - The document edit page shows various information about a
    document.
  - An issue with the height of the preview was fixed.
  - Table issues with too long document titles fixed.
- API
  - The API now serves file names with documents.
  - The API now serves various metadata about documents.
  - API documentation updated.
- Other
  - Fixed an issue with the docker image when a non-standard
    PostgreSQL port was used.
  - The docker image was trying check for installed languages before
    actually installing them.
  - `FILENAME_FORMAT` placeholder for document types.
  - The filename formatter is now less restrictive with file names
    and tries to conserve the original correspondents, types and
    titles as much as possible.
  - The filename formatter does not include the document ID in
    filenames anymore. It will rather append `_01`, `_02`, etc when
    it detects duplicate filenames.

!!! note

The changes to the filename format will apply to newly added documents
and changed documents. If you want all files to reflect these changes,
execute the `document_renamer` management command.

### paperless-ng 0.9.5

This release concludes the big changes I wanted to get rolled into
paperless. The next releases before 1.0 will focus on fixing issues,
primarily.

- OCR
  - Paperless now uses
    [OCRmyPDF](https://github.com/jbarlow83/OCRmyPDF) to perform OCR
    on documents. It still uses tesseract under the hood, but the
    PDF parser of Paperless has changed considerably and will behave
    different for some douments.
  - OCRmyPDF creates archived PDF/A documents with embedded text
    that can be selected in the front end.
  - Paperless stores archived versions of documents alongside with
    the originals. The originals can be accessed on the document
    edit page. If available, a dropdown menu will appear next to the
    download button.
  - Many of the configuration options regarding OCR have changed.
    See [OCR settings](/configuration#ocr) for details.
  - Paperless no longer guesses the language of your documents. It
    always uses the language that you specified with
    `PAPERLESS_OCR_LANGUAGE`. Be sure to set this to the language
    the majority of your documents are in. Multiple languages can be
    specified, but that requires more CPU time.
  - The management command [`document_archiver`](/administration#archiver)
    can be used to create archived versions for already existing documents.
- Tags from consumption folder.
  - Thanks to [jayme-github](https://github.com/jayme-github),
    paperless now consumes files from sub folders in the consumption
    folder and is able to assign tags based on the sub folders a
    document was found in. This can be configured with
    `PAPERLESS_CONSUMER_RECURSIVE` and
    `PAPERLESS_CONSUMER_SUBDIRS_AS_TAGS`.
- API
  - The API now offers token authentication.
  - The endpoint for uploading documents now supports specifying
    custom titles, correspondents, tags and types. This can be used
    by clients to override the default behavior of paperless. See
    [POSTing documents](/api#file-uploads).
  - The document endpoint of API now serves documents in this form:
    - correspondents, document types and tags are referenced by
      their ID in the fields `correspondent`, `document_type` and
      `tags`. The `*_id` versions are gone. These fields are
      read/write.
    - paperless does not serve nested tags, correspondents or
      types anymore.
- Front end
  - Paperless does some basic caching of correspondents, tags and
    types and will only request them from the server when necessary
    or when entirely reloading the page.
  - Document list fetching is about 10%-30% faster now, especially
    when lots of tags/correspondents are present.
  - Some minor improvements to the front end, such as document count
    in the document list, better highlighting of the current page,
    and improvements to the filter behavior.
- Fixes:
  - A bug with the generation of filenames for files with
    unsupported types caused the exporter and document saving to
    crash.
  - Mail handling no longer exits entirely when encountering errors.
    It will skip the account/rule/message on which the error
    occured.
  - Assigning correspondents from mail sender names failed for very
    long names. Paperless no longer assigns correspondents in these
    cases.

### paperless-ng 0.9.4

- Searching:
  - Paperless now supports searching by tags, types and dates and
    correspondents. In order to have this applied to your existing
    documents, you need to perform a `document_index reindex`
    management command (see [document search index](/administration#index))
    that adds the data to the search index. You only need to do this
    once, since the schema of the search index changed. Paperless
    keeps the index updated after that whenever something changes.
  - Paperless now has spelling corrections ("Did you mean") for
    miss-typed queries.
  - The documentation contains
    [information about the query syntax](/usage#basic-usage_searching).
- Front end:
  - Clickable tags, correspondents and types allow quick filtering
    for related documents.
  - Saved views are now editable.
  - Preview documents directly in the browser.
  - Navigation from the dashboard to saved views.
- Fixes:
  - A severe error when trying to use post consume scripts.
  - An error in the consumer that cause invalid messages of missing
    files to show up in the log.
- The documentation now contains information about bare metal installs
  and a section about how to setup the development environment.

### paperless-ng 0.9.3

- Setting `PAPERLESS_AUTO_LOGIN_USERNAME` replaces
  `PAPERLESS_DISABLE_LOGIN`. You have to specify your username.
- Added a simple sanity checker that checks your documents for missing
  or orphaned files, files with wrong checksums, inaccessible files,
  and documents with empty content.
- It is no longer possible to encrypt your documents. For the time
  being, paperless will continue to operate with already encrypted
  documents.
- Fixes:
  - Paperless now uses inotify again, since the watchdog was causing
    issues which I was not aware of.
  - Issue with the automatic classifier not working with only one
    tag.
  - A couple issues with the search index being opened to eagerly.
- Added lots of tests for various parts of the application.

### paperless-ng 0.9.2

- Major changes to the front end (colors, logo, shadows, layout of the
  cards, better mobile support)
- Paperless now uses mime types and libmagic detection to determine if
  a file type is supported and which parser to use. Removes all file
  type checks that where present in MANY different places in
  paperless.
- Mail consumer now correctly consumes documents even when their
  content type was not set correctly. (i.e. PDF documents with content
  type `application/octet-stream`)
- Basic sorting of mail rules added
- Much better admin for mail rule editing.
- Docker entrypoint script awaits the database server if it is
  configured.
- Disabled editing of logs.
- New setting `PAPERLESS_OCR_PAGES` limits the tesseract parser to the
  first n pages of scanned documents.
- Fixed a bug where tasks with too long task names would not show up
  in the admin.

### paperless-ng 0.9.1

- Moved documentation of the settings to the actual documentation.
- Updated release script to force the user to choose between SQLite
  and PostgreSQL. This avoids confusion when upgrading from paperless.

### paperless-ng 0.9.0

- **Deprecated:** GnuPG. [See this note on the state of GnuPG in paperless-ng.](/administration#encryption)
  This features will most likely be removed in future versions.
- **Added:** New frontend. Features:
  - Single page application: It's much more responsive than the
    django admin pages.
  - Dashboard. Shows recently scanned documents, or todo notes, or
    other documents at wish. Allows uploading of documents. Shows
    basic statistics.
  - Better document list with multiple display options.
  - Full text search with result highlighting, auto completion and
    scoring based on the query. It uses a document search index in
    the background.
  - Saveable filters.
  - Better log viewer.
- **Added:** Document types. Assign these to documents just as
  correspondents. They may be used in the future to perform automatic
  operations on documents depending on the type.
- **Added:** Inbox tags. Define an inbox tag and it will automatically
  be assigned to any new document scanned into the system.
- **Added:** Automatic matching. A new matching algorithm that
  automatically assigns tags, document types and correspondents to
  your documents. It uses a neural network trained on your data.
- **Added:** Archive serial numbers. Assign these to quickly find
  documents stored in physical binders.
- **Added:** Enabled the internal user management of django. This
  isn't really a multi user solution, however, it allows more than
  one user to access the website and set some basic permissions /
  renew passwords.
- **Modified \[breaking\]:** All new mail consumer with customizable
  filters, actions and multiple account support. Replaces the old mail
  consumer. The new mail consumer needs different configuration but
  can be configured to act exactly like the old consumer.
- **Modified:** Changes to the consumer:
  - Now uses the excellent watchdog library that should make sure
    files are discovered no matter what the platform is.
  - The consumer now uses a task scheduler to run consumption
    processes in parallel. This means that consuming many documents
    should be much faster on systems with many cores.
  - Concurrency is controlled with the new settings
    `PAPERLESS_TASK_WORKERS` and `PAPERLESS_THREADS_PER_WORKER`. See
    TODO for details on concurrency.
  - The consumer no longer blocks the database for extended periods
    of time.
  - An issue with tesseract running multiple threads per page and
    slowing down the consumer was fixed.
- **Modified \[breaking\]:** REST Api changes:
  - New filters added, other filters removed (case sensitive
    filters, slug filters)
  - Endpoints for thumbnails, previews and downloads replace the old
    `/fetch/` urls. Redirects are in place.
  - Endpoint for document uploads replaces the old `/push` url.
    Redirects are in place.
  - Foreign key relationships are now served as IDs, not as urls.
- **Modified \[breaking\]:** PostgreSQL:
  - If `PAPERLESS_DBHOST` is specified in the settings, paperless
    uses PostgreSQL instead of SQLite. Username, database and
    password all default to `paperless` if not specified.
- **Modified \[breaking\]:** document_retagger management command
  rework. See [Document retagger](/administration#retagger) for
  details. Replaces `document_correspondents` management command.
- **Removed \[breaking\]:** Reminders.
- **Removed:** All customizations made to the django admin pages.
- **Removed \[breaking\]:** The docker image no longer supports SSL.
  If you want to expose paperless to the internet, hide paperless
  behind a proxy server that handles SSL requests.
- **Internal changes:** Mostly code cleanup, including:
  - Rework of the code of the tesseract parser. This is now a lot
    cleaner.
  - Rework of the filename handling code. It was a mess.
  - Fixed some issues with the document exporter not exporting all
    documents when encountering duplicate filenames.
  - Added a task scheduler that takes care of checking mail,
    training the classifier, maintaining the document search index
    and consuming documents.
  - Updated dependencies. Now uses Pipenv all around.
  - Updated Dockerfile and docker-compose. Now uses `supervisord` to
    run everything paperless-related in a single container.
- **Settings:**
  - `PAPERLESS_FORGIVING_OCR` is now default and gone. Reason: Even
    if `langdetect` fails to detect a language, tesseract still does
    a very good job at ocr'ing a document with the default
    language. Certain language specifics such as umlauts may not get
    picked up properly.
  - `PAPERLESS_DEBUG` defaults to `false`.
  - The presence of `PAPERLESS_DBHOST` now determines whether to use
    PostgreSQL or SQLite.
  - `PAPERLESS_OCR_THREADS` is gone and replaced with
    `PAPERLESS_TASK_WORKERS` and `PAPERLESS_THREADS_PER_WORKER`.
    Refer to the config example for details.
  - `PAPERLESS_OPTIMIZE_THUMBNAILS` allows you to disable or enable
    thumbnail optimization. This is useful on less powerful devices.
- Many more small changes here and there. The usual stuff.

## Paperless

### 2.7.0

- [syntonym](https://github.com/syntonym) submitted a pull request to
  catch IMAP connection errors
  [\#475](https://github.com/the-paperless-project/paperless/pull/475).
- [Stéphane Brunner](https://github.com/sbrunner) added `psycopg2` to
  the Pipfile
  [\#489](https://github.com/the-paperless-project/paperless/pull/489).
  He also fixed a syntax error in `docker-compose.yml.example`
  [\#488](https://github.com/the-paperless-project/paperless/pull/488)
  and added [DjangoQL](https://github.com/ivelum/djangoql), which
  allows a litany of handy search functionality
  [\#492](https://github.com/the-paperless-project/paperless/pull/492).
- [CkuT](https://github.com/CkuT) and
  [JOKer](https://github.com/MasterofJOKers) hacked out a simple, but
  super-helpful optimisation to how the thumbnails are served up,
  improving performance considerably
  [\#481](https://github.com/the-paperless-project/paperless/pull/481).
- [tsia](https://github.com/tsia) added a few fields to the tags REST
  API.
  [\#483](https://github.com/the-paperless-project/paperless/pull/483).
- [Brian Cribbs](https://github.com/cribbstechnolog) improved the
  documentation to help people using Paperless over NFS
  [\#484](https://github.com/the-paperless-project/paperless/pull/484).
- [Brendan M. Sleight](https://github.com/bmsleight) updated the
  documentation to include a note for setting the `DEBUG` value. The
  `paperless.conf.example` file was also updated to mirror the project
  defaults.

### 2.6.1

- We now have a logo, complete with a favicon :-)
- Removed some problematic tests.
- Fix the docker-compose example config to include a shared consume
  volume so that using the push API will work for users of the Docker
  install. Thanks to [Colin Frei](https://github.com/colinfrei) for
  fixing this in
  [\#466](https://github.com/the-paperless-project/paperless/pull/466).
- [khrise](https://github.com/khrise) submitted a pull request to
  include the `added` property to the REST API
  [\#471](https://github.com/the-paperless-project/paperless/pull/471).

### 2.6.0

- Allow an infinite number of logs to be deleted. Thanks to
  [Ulli](https://github.com/Ulli2k) for noting the problem in
  [\#433](https://github.com/the-paperless-project/paperless/issues/433).
- Fix the `RecentCorrespondentsFilter` correspondents filter that was
  added in 2.4 to play nice with the defaults. Thanks to
  [tsia](https://github.com/tsia) and
  [Sblop](https://github.com/Sblop) who pointed this out.
  [\#423](https://github.com/the-paperless-project/paperless/issues/423).
- Updated dependencies to include (among other things) a security
  patch to requests.
- Fix text in sample data for tests so that the language guesser stops
  thinking that everything is in Catalan because we had _Lorem ipsum_
  in there.
- Tweaked the gunicorn sample command to use filesystem paths instead
  of Python paths.
  [\#441](https://github.com/the-paperless-project/paperless/pull/441)
- Added pretty colour boxes next to the hex values in the Tags
  section, thanks to a pull request from [Joshua
  Taillon](https://github.com/jat255)
  [\#442](https://github.com/the-paperless-project/paperless/pull/442).
- Added a `.editorconfig` file to better specify coding style.
- [Joshua Taillon](https://github.com/jat255) also added some logic to
  tie Paperless' date guessing logic into how it parses file names on
  import.
  [\#440](https://github.com/the-paperless-project/paperless/pull/440)

### 2.5.0

- **New dependency**: Paperless now optimises thumbnail generation
  with [optipng](https://optipng.sourceforge.net/), so you'll need to
  install that somewhere in your PATH or declare its location in
  `PAPERLESS_OPTIPNG_BINARY`. The Docker image has already been
  updated on the Docker Hub, so you just need to pull the latest one
  from there if you're a Docker user.
- "Login free" instances of Paperless were breaking whenever you
  tried to edit objects in the admin: adding/deleting tags or
  correspondents, or even fixing spelling. This was due to the "user
  hack" we were applying to sessions that weren't using a login, as
  that hack user didn't have a valid id. The fix was to attribute the
  first user id in the system to this hack user.
  [\#394](https://github.com/the-paperless-project/paperless/issues/394)
- A problem in how we handle slug values on Tags and Correspondents
  required a few changes to how we handle this field
  [\#393](https://github.com/the-paperless-project/paperless/issues/393):
  1.  Slugs are no longer editable. They're derived from the name of
      the tag or correspondent at save time, so if you wanna change
      the slug, you have to change the name, and even then you're
      restricted to the rules of the `slugify()` function. The slug
      value is still visible in the admin though.
  2.  I've added a migration to go over all existing tags &
      correspondents and rewrite the `.slug` values to ones conforming
      to the `slugify()` rules.
  3.  The consumption process now uses the same rules as `.save()` in
      determining a slug and using that to check for an existing
      tag/correspondent.
- An annoying bug in the date capture code was causing some bogus
  dates to be attached to documents, which in turn busted the UI.
  Thanks to [Andrew Peng](https://github.com/pengc99) for reporting
  this.
  [\#414](https://github.com/the-paperless-project/paperless/issues/414).
- A bug in the Dockerfile meant that Tesseract language files weren't
  being installed correctly. [euri10](https://github.com/euri10) was
  quick to provide a fix:
  [\#406](https://github.com/the-paperless-project/paperless/issues/406),
  [\#413](https://github.com/the-paperless-project/paperless/pull/413).
- Document consumption is now wrapped in a transaction as per an old
  ticket
  [\#262](https://github.com/the-paperless-project/paperless/issues/262).
- The `get_date()` functionality of the parsers has been consolidated
  onto the `DocumentParser` class since much of that code was
  redundant anyway.

### 2.4.0

- A new set of actions are now available thanks to
  [jonaswinkler](https://github.com/jonaswinkler)'s very first pull
  request! You can now do nifty things like tag documents in bulk, or
  set correspondents in bulk.
  [\#405](https://github.com/the-paperless-project/paperless/pull/405)
- The import/export system is now a little smarter. By default,
  documents are tagged as `unencrypted`, since exports are by their
  nature unencrypted. It's now in the import step that we decide the
  storage type. This allows you to export from an encrypted system and
  import into an unencrypted one, or vice-versa.
- The migration history has been slightly modified to accommodate
  PostgreSQL users. Additionally, you can now tell paperless to use
  PostgreSQL simply by declaring `PAPERLESS_DBUSER` in your
  environment. This will attempt to connect to your Postgres database
  without a password unless you also set `PAPERLESS_DBPASS`.
- A bug was found in the REST API filter system that was the result of
  an update of django-filter some time ago. This has now been patched
  in
  [\#412](https://github.com/the-paperless-project/paperless/issues/412).
  Thanks to [thepill](https://github.com/thepill) for spotting it!

### 2.3.0

- Support for consuming plain text & markdown documents was added by
  [Joshua Taillon](https://github.com/jat255)! This was a
  long-requested feature, and it's addition is likely to be greatly
  appreciated by the community:
  [\#395](https://github.com/the-paperless-project/paperless/pull/395)
  Thanks also to [David Martin](https://github.com/ddddavidmartin) for
  his assistance on the issue.
- [dubit0](https://github.com/dubit0) found & fixed a bug that
  prevented management commands from running before we had an
  operational database:
  [\#396](https://github.com/the-paperless-project/paperless/pull/396)
- Joshua also added a simple update to the thumbnail generation
  process to improve performance:
  [\#399](https://github.com/the-paperless-project/paperless/pull/399)
- As his last bit of effort on this release, Joshua also added some
  code to allow you to view the documents inline rather than download
  them as an attachment.
  [\#400](https://github.com/the-paperless-project/paperless/pull/400)
- Finally, [ahyear](https://github.com/ahyear) found a slip in the
  Docker documentation and patched it.
  [\#401](https://github.com/the-paperless-project/paperless/pull/401)

### 2.2.1

- [Kyle Lucy](https://github.com/kmlucy) reported a bug quickly after
  the release of 2.2.0 where we broke the `DISABLE_LOGIN` feature:
  [\#392](https://github.com/the-paperless-project/paperless/issues/392).

### 2.2.0

- Thanks to [dadosch](https://github.com/dadosch), [Wolfgang
  Mader](https://github.com/wmader), and [Tim
  Brooks](https://github.com/brookst) this is the first version of
  Paperless that supports Django 2.0! As a result of their hard work,
  you can now also run Paperless on Python 3.7 as well:
  [\#386](https://github.com/the-paperless-project/paperless/issues/386)
  &
  [\#390](https://github.com/the-paperless-project/paperless/pull/390).
- [Stéphane Brunner](https://github.com/sbrunner) added a few lines of
  code that made tagging interface a lot easier on those of us with
  lots of different tags:
  [\#391](https://github.com/the-paperless-project/paperless/pull/391).
- [Kilian Koeltzsch](https://github.com/kiliankoe) noticed a bug in
  how we capture & automatically create tags, so that's fixed now
  too:
  [\#384](https://github.com/the-paperless-project/paperless/issues/384).
- [erikarvstedt](https://github.com/erikarvstedt) tweaked the
  behaviour of the test suite to be better behaved for packaging
  environments:
  [\#383](https://github.com/the-paperless-project/paperless/pull/383).
- [Lukasz Soluch](https://github.com/LukaszSolo) added CORS support to
  make building a new Javascript-based front-end cleaner & easier:
  [\#387](https://github.com/the-paperless-project/paperless/pull/387).

### 2.1.0

- [Enno Lohmeier](https://github.com/elohmeier) added three simple
  features that make Paperless a lot more user (and developer)
  friendly:
  1.  There's a new search box on the front page:
      [\#374](https://github.com/the-paperless-project/paperless/pull/374).
  2.  The correspondents & tags pages now have a column showing the
      number of relevant documents:
      [\#375](https://github.com/the-paperless-project/paperless/pull/375).
  3.  The Dockerfile has been tweaked to build faster for those of us
      who are doing active development on Paperless using the Docker
      environment:
      [\#376](https://github.com/the-paperless-project/paperless/pull/376).
- You now also have the ability to customise the interface to your
  heart's content by creating a file called `overrides.css` and/or
  `overrides.js` in the root of your media directory. Thanks to [Mark
  McFate](https://github.com/SummittDweller) for this idea:
  [\#371](https://github.com/the-paperless-project/paperless/issues/371)

### 2.0.0

This is a big release as we've changed a core-functionality of
Paperless: we no longer encrypt files with GPG by default.

The reasons for this are many, but it boils down to that the encryption
wasn't really all that useful, as files on-disk were still accessible
so long as you had the key, and the key was most typically stored in the
config file. In other words, your files are only as safe as the
`paperless` user is. In addition to that, _the contents of the documents
were never encrypted_, so important numbers etc. were always accessible
simply by querying the database. Still, it was better than nothing, but
the consensus from users appears to be that it was more an annoyance
than anything else, so this feature is now turned off unless you
explicitly set a passphrase in your config file.

### Migrating from 1.x

Encryption isn't gone, it's just off for new users. So long as you
have `PAPERLESS_PASSPHRASE` set in your config or your environment,
Paperless should continue to operate as it always has. If however, you
want to drop encryption too, you only need to do two things:

1.  Run
    `./manage.py migrate && ./manage.py change_storage_type gpg unencrypted`.
    This will go through your entire database and Decrypt All The
    Things.
2.  Remove `PAPERLESS_PASSPHRASE` from your `paperless.conf` file, or
    simply stop declaring it in your environment.

Special thanks to [erikarvstedt](https://github.com/erikarvstedt),
[matthewmoto](https://github.com/matthewmoto), and
[mcronce](https://github.com/mcronce) who did the bulk of the work on
this big change.

### 1.4.0

- [Quentin Dawans](https://github.com/ovv) has refactored the document
  consumer to allow for some command-line options. Notably, you can
  now direct it to consume from a particular `--directory`, limit the
  `--loop-time`, set the time between mail server checks with
  `--mail-delta` or just run it as a one-off with `--one-shot`. See
  [\#305](https://github.com/the-paperless-project/paperless/issues/305)
  &
  [\#313](https://github.com/the-paperless-project/paperless/pull/313)
  for more information.
- Refactor the use of travis/tox/pytest/coverage into two files:
  `.travis.yml` and `setup.cfg`.
- Start generating requirements.txt from a Pipfile. I'll probably
  switch over to just using pipenv in the future.
- All for a alternative FreeBSD-friendly location for
  `paperless.conf`. Thanks to [Martin
  Arendtsen](https://github.com/Arendtsen) who provided this
  ([\#322](https://github.com/the-paperless-project/paperless/pull/322)).
- Document consumption events are now logged in the Django admin
  events log. Thanks to [CkuT](https://github.com/CkuT) for doing the
  legwork on this one and to [Quentin Dawans](https://github.com/ovv)
  & [David Martin](https://github.com/ddddavidmartin) for helping to
  coordinate & work out how the feature would be developed.
- [erikarvstedt](https://github.com/erikarvstedt) contributed a pull
  request
  ([\#328](https://github.com/the-paperless-project/paperless/pull/328))
  to add `--noreload` to the default server start process. This helps
  reduce the load imposed by the running webservice.
- Through some discussion on
  [\#253](https://github.com/the-paperless-project/paperless/issues/253)
  and
  [\#323](https://github.com/the-paperless-project/paperless/issues/323),
  we've removed a few of the hardcoded URL values to make it easier
  for people to host Paperless on a subdirectory. Thanks to [Quentin
  Dawans](https://github.com/ovv) and [Kyle
  Lucy](https://github.com/kmlucy) for helping to work this out.
- The clickable area for documents on the listing page has been
  increased to a more predictable space thanks to a glorious hack from
  [erikarvstedt](https://github.com/erikarvstedt) in
  [\#344](https://github.com/the-paperless-project/paperless/pull/344).
- [Strubbl](https://github.com/strubbl) noticed an annoying bug in the
  bash script wrapping the Docker entrypoint and fixed it with some
  very creating Bash skills:
  [\#352](https://github.com/the-paperless-project/paperless/pull/352).
- You can now use the search field to find documents by tag thanks to
  [thinkjk](https://github.com/thinkjk)'s _first ever issue_:
  [\#354](https://github.com/the-paperless-project/paperless/issues/354).
- Inotify is now being used to detect additions to the consume
  directory thanks to some excellent work from
  [erikarvstedt](https://github.com/erikarvstedt) on
  [\#351](https://github.com/the-paperless-project/paperless/pull/351)

### 1.3.0

- You can now run Paperless without a login, though you'll still have
  to create at least one user. This is thanks to a pull-request from
  [matthewmoto](https://github.com/matthewmoto):
  [\#295](https://github.com/the-paperless-project/paperless/pull/295).
  Note that logins are still required by default, and that you need to
  disable them by setting `PAPERLESS_DISABLE_LOGIN="true"` in your
  environment or in `/etc/paperless.conf`.
- Fix for
  [\#303](https://github.com/the-paperless-project/paperless/issues/303)
  where sketchily-formatted documents could cause the consumer to
  break and insert half-records into the database breaking all sorts
  of things. We now capture the return codes of both `convert` and
  `unpaper` and fail-out nicely.
- Fix for additional date types thanks to input from
  [Isaac](https://github.com/isaacsando) and code from
  [BastianPoe](https://github.com/BastianPoe)
  ([\#301](https://github.com/the-paperless-project/paperless/issues/301)).
- Fix for running migrations in the Docker container
  ([\#299](https://github.com/the-paperless-project/paperless/issues/299)).
  Thanks to [Georgi Todorov](https://github.com/TeraHz) for the fix
  ([\#300](https://github.com/the-paperless-project/paperless/pull/300))
  and to [Pit](https://github.com/pitkley) for the review.
- Fix for Docker cases where the issuing user is not UID 1000. This
  was a collaborative fix between [Jeffrey
  Portman](https://github.com/ChromoX) and
  [Pit](https://github.com/pitkley) in
  [\#311](https://github.com/the-paperless-project/paperless/pull/311)
  and
  [\#312](https://github.com/the-paperless-project/paperless/pull/312)
  to fix
  [\#306](https://github.com/the-paperless-project/paperless/issues/306).
- Patch the historical migrations to support MySQL's um,
  _interesting_ way of handing indexes
  ([\#308](https://github.com/the-paperless-project/paperless/issues/308)).
  Thanks to [Simon Taddiken](https://github.com/skuzzle) for reporting
  the problem and helping me find where to fix it.

### 1.2.0

- New Docker image, now based on Alpine, thanks to the efforts of
  [addadi](https://github.com/addadi) and
  [Pit](https://github.com/pitkley). This new image is dramatically
  smaller than the Debian-based one, and it also has [a new home on
  Docker Hub](https://hub.docker.com/r/danielquinn/paperless/). A
  proper thank-you to [Pit](https://github.com/pitkley) for hosting
  the image on his Docker account all this time, but after some
  discussion, we decided the image needed a more _official-looking_
  home.
- [BastianPoe](https://github.com/BastianPoe) has added the
  long-awaited feature to automatically skip the OCR step when the PDF
  already contains text. This can be overridden by setting
  `PAPERLESS_OCR_ALWAYS=YES` either in your `paperless.conf` or in the
  environment. Note that this also means that Paperless now requires
  `libpoppler-cpp-dev` to be installed. **Important**: You'll need to
  run `pip install -r requirements.txt` after the usual `git pull` to
  properly update.
- [BastianPoe](https://github.com/BastianPoe) has also contributed a
  monumental amount of work
  ([\#291](https://github.com/the-paperless-project/paperless/pull/291))
  to solving
  [\#158](https://github.com/the-paperless-project/paperless/issues/158):
  setting the document creation date based on finding a date in the
  document text.

### 1.1.0

- Fix for
  [\#283](https://github.com/the-paperless-project/paperless/issues/283),
  a redirect bug which broke interactions with paperless-desktop.
  Thanks to [chris-aeviator](https://github.com/chris-aeviator) for
  reporting it.
- Addition of an optional new financial year filter, courtesy of
  [David Martin](https://github.com/ddddavidmartin)
  [\#256](https://github.com/the-paperless-project/paperless/pull/256)
- Fixed a typo in how thumbnails were named in exports
  [\#285](https://github.com/the-paperless-project/paperless/pull/285),
  courtesy of [Dan Panzarella](https://github.com/pzl)

### 1.0.0

- Upgrade to Django 1.11. **You'll need to run \`\`pip install -r
  requirements.txt\`\` after the usual \`\`git pull\`\` to properly
  update**.
- Replace the templatetag-based hack we had for document listing in
  favour of a slightly less ugly solution in the form of another
  template tag with less copypasta.
- Support for multi-word-matches for auto-tagging thanks to an
  excellent patch from [ishirav](https://github.com/ishirav)
  [\#277](https://github.com/the-paperless-project/paperless/pull/277).
- Fixed a CSS bug reported by [Stefan Hagen](https://github.com/xkpd3)
  that caused an overlapping of the text and checkboxes under some
  resolutions
  [\#272](https://github.com/the-paperless-project/paperless/issues/272).
- Patched the Docker config to force the serving of static files.
  Credit for this one goes to [dev-rke](https://github.com/dev-rke)
  via
  [\#248](https://github.com/the-paperless-project/paperless/issues/248).
- Fix file permissions during Docker start up thanks to
  [Pit](https://github.com/pitkley) on
  [\#268](https://github.com/the-paperless-project/paperless/pull/268).
- Date fields in the admin are now expressed as HTML5 date fields
  thanks to [Lukas Winkler](https://github.com/Findus23)'s issue
  [\#278](https://github.com/the-paperless-project/paperless/issues/248)

### 0.8.0

- Paperless can now run in a subdirectory on a host (`/paperless`),
  rather than always running in the root (`/`) thanks to
  [maphy-psd](https://github.com/maphy-psd)'s work on
  [\#255](https://github.com/the-paperless-project/paperless/pull/255).

### 0.7.0

- **Potentially breaking change**: As per
  [\#235](https://github.com/the-paperless-project/paperless/issues/235),
  Paperless will no longer automatically delete documents attached to
  correspondents when those correspondents are themselves deleted.
  This was Django's default behaviour, but didn't make much sense in
  Paperless' case. Thanks to [Thomas
  Brueggemann](https://github.com/thomasbrueggemann) and [David
  Martin](https://github.com/ddddavidmartin) for their input on this
  one.
- Fix for
  [\#232](https://github.com/the-paperless-project/paperless/issues/232)
  wherein Paperless wasn't recognising `.tif` files properly. Thanks
  to [ayounggun](https://github.com/ayounggun) for reporting this one
  and to [Kusti Skytén](https://github.com/kskyten) for posting the
  correct solution in the GitHub issue.

### 0.6.0

- Abandon the shared-secret trick we were using for the POST API in
  favour of BasicAuth or Django session.
- Fix the POST API so it actually works.
  [\#236](https://github.com/the-paperless-project/paperless/issues/236)
- **Breaking change**: We've dropped the use of
  `PAPERLESS_SHARED_SECRET` as it was being used both for the API (now
  replaced with a normal auth) and form email polling. Now that we're
  only using it for email, this variable has been renamed to
  `PAPERLESS_EMAIL_SECRET`. The old value will still work for a while,
  but you should change your config if you've been using the email
  polling feature. Thanks to [Joshua
  Gilman](https://github.com/jmgilman) for all the help with this
  feature.

### 0.5.0

- Support for fuzzy matching in the auto-tagger & auto-correspondent
  systems thanks to [Jake Gysland](https://github.com/jgysland)'s
  patch
  [\#220](https://github.com/the-paperless-project/paperless/pull/220).
- Modified the Dockerfile to prepare an export directory
  ([\#212](https://github.com/the-paperless-project/paperless/pull/212)).
  Thanks to combined efforts from [Pit](https://github.com/pitkley)
  and [Strubbl](https://github.com/strubbl) in working out the kinks
  on this one.
- Updated the import/export scripts to include support for thumbnails.
  Big thanks to [CkuT](https://github.com/CkuT) for finding this
  shortcoming and doing the work to get it fixed in
  [\#224](https://github.com/the-paperless-project/paperless/pull/224).
- All of the following changes are thanks to [David
  Martin](https://github.com/ddddavidmartin): \* Bumped the dependency on pyocr to 0.4.7 so new users can make use
  of Tesseract 4 if they so prefer
  ([\#226](https://github.com/the-paperless-project/paperless/pull/226)).
  - Fixed a number of issues with the automated mail handler
    ([\#227](https://github.com/the-paperless-project/paperless/pull/227),
    [\#228](https://github.com/the-paperless-project/paperless/pull/228))
  - Amended the documentation for better handling of systemd service
    files
    ([\#229](https://github.com/the-paperless-project/paperless/pull/229))
  - Amended the Django Admin configuration to have nice headers
    ([\#230](https://github.com/the-paperless-project/paperless/pull/230))

### 0.4.1

- Fix for
  [\#206](https://github.com/the-paperless-project/paperless/issues/206)
  wherein the pluggable parser didn't recognise files with all-caps
  suffixes like `.PDF`

### 0.4.0

- Introducing reminders. See
  [\#199](https://github.com/the-paperless-project/paperless/issues/199)
  for more information, but the short explanation is that you can now
  attach simple notes & times to documents which are made available
  via the API. Currently, the default API (basically just the Django
  admin) doesn't really make use of this, but [Thomas
  Brueggemann](https://github.com/thomasbrueggemann) over at
  [Paperless
  Desktop](https://github.com/thomasbrueggemann/paperless-desktop) has
  said that he would like to make use of this feature in his project.

### 0.3.6

- Fix for
  [\#200](https://github.com/the-paperless-project/paperless/issues/200)
  (!!) where the API wasn't configured to allow updating the
  correspondent or the tags for a document.
- The `content` field is now optional, to allow for the edge case of a
  purely graphical document.
- You can no longer add documents via the admin. This never worked in
  the first place, so all I've done here is remove the link to the
  broken form.
- The consumer code has been heavily refactored to support a pluggable
  interface. Install a paperless consumer via pip and tell paperless
  about it with an environment variable, and you're good to go.
  Proper documentation is on its way.

### 0.3.5

- A serious facelift for the documents listing page wherein we drop
  the tabular layout in favour of a tiled interface.
- Users can now configure the number of items per page.
- Fix for
  [\#171](https://github.com/the-paperless-project/paperless/issues/171):
  Allow users to specify their own `SECRET_KEY` value.
- Moved the dotenv loading to the top of settings.py
- Fix for
  [\#112](https://github.com/the-paperless-project/paperless/issues/112):
  Added checks for binaries required for document consumption.

### 0.3.4

- Removal of django-suit due to a licensing conflict I bumped into in
  0.3.3. Note that you _can_ use Django Suit with Paperless, but only
  in a non-profit situation as their free license prohibits for-profit
  use. As a result, I can't bundle Suit with Paperless without
  conflicting with the GPL. Further development will be done against
  the stock Django admin.
- I shrunk the thumbnails a little 'cause they were too big for me,
  even on my high-DPI monitor.
- BasicAuth support for document and thumbnail downloads, as well as
  the Push API thanks to \@thomasbrueggemann. See
  [\#179](https://github.com/the-paperless-project/paperless/pull/179).

### 0.3.3

- Thumbnails in the UI and a Django-suit -based face-lift courtesy of
  \@ekw!
- Timezone, items per page, and default language are now all
  configurable, also thanks to \@ekw.

### 0.3.2

- Fix for
  [\#172](https://github.com/the-paperless-project/paperless/issues/172):
  defaulting ALLOWED_HOSTS to `["*"]` and allowing the user to set
  her own value via `PAPERLESS_ALLOWED_HOSTS` should the need arise.

### 0.3.1

- Added a default value for `CONVERT_BINARY`

### 0.3.0

- Updated to using django-filter 1.x
- Added some system checks so new users aren't confused by
  misconfigurations.
- Consumer loop time is now configurable for systems with slow writes.
  Just set `PAPERLESS_CONSUMER_LOOP_TIME` to a number of seconds. The
  default is 10.
- As per
  [\#44](https://github.com/the-paperless-project/paperless/issues/44),
  we've removed support for `PAPERLESS_CONVERT`, `PAPERLESS_CONSUME`,
  and `PAPERLESS_SECRET`. Please use `PAPERLESS_CONVERT_BINARY`,
  `PAPERLESS_CONSUMPTION_DIR`, and `PAPERLESS_SHARED_SECRET`
  respectively instead.

### 0.2.0

- [\#150](https://github.com/the-paperless-project/paperless/pull/150):
  The media root is now a variable you can set in `paperless.conf`.
- [\#148](https://github.com/the-paperless-project/paperless/pull/148):
  The database location (sqlite) is now a variable you can set in
  `paperless.conf`.
- [\#146](https://github.com/the-paperless-project/paperless/issues/146):
  Fixed a bug that allowed unauthorised access to the `/fetch` URL.
- [\#131](https://github.com/the-paperless-project/paperless/issues/131):
  Document files are now automatically removed from disk when they're
  deleted in Paperless.
- [\#121](https://github.com/the-paperless-project/paperless/issues/121):
  Fixed a bug where Paperless wasn't setting document creation time
  based on the file naming scheme.
- [\#81](https://github.com/the-paperless-project/paperless/issues/81):
  Added a hook to run an arbitrary script after every document is
  consumed.
- [\#98](https://github.com/the-paperless-project/paperless/issues/98):
  Added optional environment variables for ImageMagick so that it
  doesn't explode when handling Very Large Documents or when it's
  just running on a low-memory system. Thanks to [Florian
  Harr](https://github.com/evils) for his help on this one.
- [\#89](https://github.com/the-paperless-project/paperless/issues/89)
  Ported the auto-tagging code to correspondents as well. Thanks to
  [Justin Snyman](https://github.com/stringlytyped) for the pointers
  in the issue queue.
- Added support for guessing the date from the file name along with
  the correspondent, title, and tags. Thanks to [Tikitu de
  Jager](https://github.com/tikitu) for his pull request that I took
  forever to merge and to [Pit](https://github.com/pitkley) for his
  efforts on the regex front.
- [\#94](https://github.com/the-paperless-project/paperless/issues/94):
  Restored support for changing the created date in the UI. Thanks to
  [Martin Honermeyer](https://github.com/djmaze) and [Tim
  White](https://github.com/timwhite) for working with me on this.

### 0.1.1

- Potentially **Breaking Change**: All references to "sender" in the
  code have been renamed to "correspondent" to better reflect the
  nature of the property (one could quite reasonably scan a document
  before sending it to someone.)
- [\#67](https://github.com/the-paperless-project/paperless/issues/67):
  Rewrote the document exporter and added a new importer that allows
  for full metadata retention without depending on the file name and
  modification time. A big thanks to [Tikitu de
  Jager](https://github.com/tikitu),
  [Pit](https://github.com/pitkley), [Florian
  Jung](https://github.com/the01), and [Christopher
  Luu](https://github.com/nuudles) for their code snippets and
  contributing conversation that lead to this change.
- [\#20](https://github.com/the-paperless-project/paperless/issues/20):
  Added _unpaper_ support to help in cleaning up the scanned image
  before it's OCR'd. Thanks to [Pit](https://github.com/pitkley) for
  this one.
- [\#71](https://github.com/the-paperless-project/paperless/issues/71)
  Added (encrypted) thumbnails in anticipation of a proper UI.
- [\#68](https://github.com/the-paperless-project/paperless/issues/68):
  Added support for using a proper config file at
  `/etc/paperless.conf` and modified the systemd unit files to use it.
- Refactored the Vagrant installation process to use environment
  variables rather than asking the user to modify `settings.py`.
- [\#44](https://github.com/the-paperless-project/paperless/issues/44):
  Harmonise environment variable names with constant names.
- [\#60](https://github.com/the-paperless-project/paperless/issues/60):
  Setup logging to actually use the Python native logging framework.
- [\#53](https://github.com/the-paperless-project/paperless/issues/53):
  Fixed an annoying bug that caused `.jpeg` and `.JPG` images to be
  imported but made unavailable.

### 0.1.0

- Docker support! Big thanks to [Wayne
  Werner](https://github.com/waynew), [Brian
  Conn](https://github.com/TheConnMan), and [Tikitu de
  Jager](https://github.com/tikitu) for this one, and especially to
  [Pit](https://github.com/pitkley) who spearheadded this effort.
- A simple REST API is in place, but it should be considered unstable.
- Cleaned up the consumer to use temporary directories instead of a
  single scratch space. (Thanks [Pit](https://github.com/pitkley))
- Improved the efficiency of the consumer by parsing pages more
  intelligently and introducing a threaded OCR process (thanks again
  [Pit](https://github.com/pitkley)).
- [\#45](https://github.com/the-paperless-project/paperless/issues/45):
  Cleaned up the logic for tag matching. Reported by
  [darkmatter](https://github.com/darkmatter).
- [\#47](https://github.com/the-paperless-project/paperless/issues/47):
  Auto-rotate landscape documents. Reported by
  [Paul](https://github.com/polo2ro) and fixed by
  [Pit](https://github.com/pitkley).
- [\#48](https://github.com/the-paperless-project/paperless/issues/48):
  Matching algorithms should do so on a word boundary
  ([darkmatter](https://github.com/darkmatter))
- [\#54](https://github.com/the-paperless-project/paperless/issues/54):
  Documented the re-tagger ([zedster](https://github.com/zedster))
- [\#57](https://github.com/the-paperless-project/paperless/issues/57):
  Make sure file is preserved on import failure
  ([darkmatter](https://github.com/darkmatter))
- Added tox with pep8 checking

### 0.0.6

- Added support for parallel OCR (significant work from
  [Pit](https://github.com/pitkley))
- Sped up the language detection (significant work from
  [Pit](https://github.com/pitkley))
- Added simple logging

### 0.0.5

- Added support for image files as documents (png, jpg, gif, tiff)
- Added a crude means of HTTP POST for document imports
- Added IMAP mail support
- Added a re-tagging utility
- Documentation for the above as well as data migration

### 0.0.4

- Added automated tagging basted on keyword matching
- Cleaned up the document listing page
- Removed `User` and `Group` from the admin
- Added `pytz` to the list of requirements

### 0.0.3

- Added basic tagging

### 0.0.2

- Added language detection
- Added datestamps to `document_exporter`.
- Changed `settings.TESSERACT_LANGUAGE` to `settings.OCR_LANGUAGE`.

### 0.0.1

- Initial release
