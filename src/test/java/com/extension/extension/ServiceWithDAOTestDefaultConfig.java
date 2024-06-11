package com.extension.extension;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@TestConfiguration
@Configuration
@Import(JpaAndEntityPackagePathConfig.class)
public class ServiceWithDAOTestDefaultConfig {
}
