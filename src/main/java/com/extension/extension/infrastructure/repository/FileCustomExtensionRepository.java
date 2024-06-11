package com.extension.extension.infrastructure.repository;

import com.extension.extension.infrastructure.entity.FileCustomExtensionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileCustomExtensionRepository extends JpaRepository<FileCustomExtensionEntity, Long> {
}
