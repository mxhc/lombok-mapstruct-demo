package com.halcom.lombokmapstructdemo.mapper;

import com.halcom.lombokmapstructdemo.dto.PersonDto;
import com.halcom.lombokmapstructdemo.entity.Person;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(
        uses = { CommonMappings.class},
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface PersonMapper {
    
    @Mapping(source = "controlEntityField", target = "controlDtoField")
    @Mapping(source = "someField", target = "someField2", qualifiedByName = "someFieldMapper")
    PersonDto entityToDto(Person person);
    
    @Mapping(target = "id", ignore = true)
    void updatePersonWithNonNullFields(@MappingTarget Person inHibSession, Person objectWithUpdatedValues);
}
