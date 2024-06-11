package com.extension.extension.repository;

import com.extension.extension.infrastructure.entity.FileExtensionEntity;
import com.extension.extension.infrastructure.repository.FileExtensionRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class FileExtensionRepositoryTest {

    @Autowired
    FileExtensionRepository fileExtensionRepository;

    @Test
    @DisplayName("existsByName test")
    void create() {
        // given, when
        FileExtensionEntity entity = FileExtensionEntity.builder()
                .name(".txt")
                .build();
        FileExtensionEntity saveExtension = fileExtensionRepository.save(entity);
        boolean exists = fileExtensionRepository.existsByName(saveExtension.getName());

        // then
        assertThat(entity).isSameAs(saveExtension);
        assertThat(entity.getName()).isEqualTo(saveExtension.getName());
        assertThat(entity.getId()).isEqualTo(saveExtension.getId());
        assertThat(exists).isTrue();
    }
}
