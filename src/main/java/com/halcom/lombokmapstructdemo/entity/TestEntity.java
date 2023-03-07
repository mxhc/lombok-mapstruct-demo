package com.halcom.lombokmapstructdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TestEntity {
    
    private UUID id;
    private EmbeddedObject embeddedObject;
    private String someField;
    
}
