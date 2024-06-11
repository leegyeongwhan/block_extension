package com.extension.extension;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages =  "com.extension.extension.infrastructure.repository")
@EntityScan(basePackages =  "com.extension.extension.infrastructure.entity")
@Configuration
public class JpaAndEntityPackagePathConfig {
}
