package at.fhtw.OCRMapper.persistence;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.IdentityHashMap;

@Entity
@Builder
@Data
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
}
