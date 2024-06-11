package com.extension.extension.infrastructure.repository;

import com.extension.extension.infrastructure.entity.FileExtensionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileExtensionRepository extends JpaRepository<FileExtensionEntity, Long> {

    boolean existsByName(String name);
}
