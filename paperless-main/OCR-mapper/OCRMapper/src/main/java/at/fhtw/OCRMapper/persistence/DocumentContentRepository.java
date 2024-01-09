package at.fhtw.OCRMapper.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentContentRepository extends JpaRepository<DocumentContent, Long> {
}
