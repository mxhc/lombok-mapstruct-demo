package com.halcom.lombokmapstructdemo.mapper;

import com.github.javafaker.Faker;
import com.halcom.lombokmapstructdemo.dto.PersonDto;
import com.halcom.lombokmapstructdemo.entity.Person;
import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class PersonMapperTest {
    
    public static Faker faker = new Faker();
    PersonMapper personMapper = new PersonMapperImpl();  // inace se radi autowire, posto je spring komponenta
    
    @Test
    void entityToDto() {
        Person person = getPerson();
        PersonDto personDto = personMapper.entityToDto(person);
        
        assertNotNull(personDto);
        
        assertEquals(person.getId(), personDto.getId());
        assertEquals(person.getFirstName().toUpperCase(), personDto.getFirstName());
        assertEquals(person.getLastName(), personDto.getLastName());
        assertNotNull(personDto.getDateOfBirth());
        assertEquals(person.getAddress(), personDto.getAddress());
        assertEquals(person.getControlEntityField(), personDto.getControlDtoField());
        assertEquals(CommonMappings.toDate(person.getCreatedAt()), personDto.getCreatedAt());
        assertEquals(person.getSomeField().toLowerCase(), personDto.getSomeField2());
    }
    
    @Test
    void updatePersonWithNonNullFields() {
        Person entity = getPerson();
        
        String controlField = entity.getControlEntityField();
        
        Person withUpdatedFields = Person.builder()
                .id(UUID.randomUUID())
                .lastName("some name")
                .createdAt("17x04x2016")
                .build();
        
        personMapper.updatePersonWithNonNullFields(entity, withUpdatedFields);
        
        // id is not updated
        assertNotEquals(withUpdatedFields.getId(), entity.getId());
        // updated fields
        assertEquals(withUpdatedFields.getLastName(), entity.getLastName());
        assertEquals(withUpdatedFields.getCreatedAt(), entity.getCreatedAt());
        // value didn't change
        assertEquals(controlField, entity.getControlEntityField());
    }
    
    public Person getPerson() {
        return Person.builder()
                .id(UUID.randomUUID())
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .address(faker.address().fullAddress())
                .someField(faker.hitchhikersGuideToTheGalaxy().quote())
                .dateOfBirth(faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate())
                .controlEntityField(faker.starTrek().specie())
                .createdAt("25x08x2021")
                .build();
    }
}