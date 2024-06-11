package com.extension.extension.service;

import com.extension.extension.infrastructure.dto.AddCustomExtensionRequest;
import com.extension.extension.infrastructure.entity.FileExtensionEntity;
import com.extension.extension.infrastructure.repository.FileExtensionRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FileExtensionService {

    private final FileExtensionRepository fileExtensionRepository;

    @Transactional
    public FileExtensionEntity create(AddCustomExtensionRequest request) {
        FileExtensionEntity fileExtension = new FileExtensionEntity(request.name());
        return fileExtensionRepository.save(fileExtension);
    }

    @Transactional
    public void delete(Long FileExtentionId) {
        FileExtensionEntity fileExtension = fileExtensionRepository.findById(FileExtentionId).get();
        fileExtensionRepository.delete(fileExtension);
    }
}
