package com.halcom.lombokmapstructdemo.mapper;

import com.halcom.lombokmapstructdemo.dto.Dto;
import com.halcom.lombokmapstructdemo.entity.TestEntity;
import com.halcom.lombokmapstructdemo.repository.EmbeddedObjectRepository;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class EntityMapperTest {
    
    @Test
    void dtoToEntity() {
        EntityMapper mapper = new EntityMapperImpl(new EmbeddedObjectRepository());
        
        Dto dto = Dto.builder()
                .id(UUID.randomUUID())
                .embeddedObjectId(UUID.randomUUID().toString())
                .someField("some text")
                .build();
        
        TestEntity testEntity = mapper.dtoToEntity(dto);
        
        assertNotNull(testEntity);
        
        assertEquals(dto.getId(), testEntity.getId());
        assertEquals(dto.getSomeField(), testEntity.getSomeField());
        assertEquals(dto.getEmbeddedObjectId(), testEntity.getEmbeddedObject().getId());
        assertNotNull(testEntity.getEmbeddedObject().getSomeValue());
        
    }
}