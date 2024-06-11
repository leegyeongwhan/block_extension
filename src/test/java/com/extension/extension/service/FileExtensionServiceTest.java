package com.extension.extension.service;

import com.extension.extension.ServiceWithDAOTestDefaultConfig;
import com.extension.extension.infrastructure.entity.FileExtensionEntity;
import com.extension.extension.infrastructure.repository.FileExtensionRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import({FileExtensionService.class, ServiceWithDAOTestDefaultConfig.class,
})
class FileExtensionServiceTest {

    @Autowired
    private FileExtensionRepository fileExtensionRepository;

    @Test
    void create() {
        //given
        FileExtensionEntity entity = new FileExtensionEntity(".exe");

        //when
        FileExtensionEntity save = fileExtensionRepository.save(entity);

        //then
        Assertions.assertEquals(".exe", save.getName());
    }

    @Test
    void delete() {

    }
}
