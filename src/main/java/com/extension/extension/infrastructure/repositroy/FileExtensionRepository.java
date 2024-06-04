package com.extension.extension.infrastructure.repositroy;

import com.extension.extension.infrastructure.entity.FileExtensionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FileExtensionRepository extends JpaRepository<FileExtensionEntity, Long> {

    boolean existsByName(String name);
}
