package com.extension.extension.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Getter
@Entity
@Table(name = "file_extension")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FileExtensionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Builder
    protected FileExtensionEntity(String name) {
        this.name = name;
    }
}
