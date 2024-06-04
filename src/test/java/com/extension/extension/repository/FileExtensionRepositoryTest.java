package com.extension.extension.repository;

import com.extension.extension.infrastructure.entity.FileExtensionEntity;
import com.extension.extension.infrastructure.repositroy.FileExtensionRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

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
        Assertions.assertThat(entity).isSameAs(saveExtension);
        Assertions.assertThat(entity.getName()).isEqualTo(saveExtension.getName());
        Assertions.assertThat(entity.getId()).isEqualTo(saveExtension.getId());
        Assertions.assertThat(exists).isTrue();
    }
}
