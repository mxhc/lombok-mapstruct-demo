package com.halcom.lombokmapstructdemo.mapper;

import com.halcom.lombokmapstructdemo.dto.Dto;
import com.halcom.lombokmapstructdemo.entity.TestEntity;
import com.halcom.lombokmapstructdemo.repository.EmbeddedObjectRepository;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(
        uses = { CommonMappings.class, EmbeddedObjectRepository.class},
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface EntityMapper {
    
    // repository example
    @Mapping(source = "embeddedObjectId", target = "embeddedObject", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    TestEntity dtoToEntity(Dto dto);
    
}
