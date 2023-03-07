package com.halcom.lombokmapstructdemo.entity;

import java.time.LocalDate;
import java.util.UUID;

public class Person {
    private UUID id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String address;
    private String controlEntityField;
    
    // format 25x02x2020
    private String createdAt;
    private String someField;
    
    public Person(UUID id, String firstName, String lastName, LocalDate dateOfBirth, String address, String controlEntityField, String createdAt, String someField) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.controlEntityField = controlEntityField;
        this.createdAt = createdAt;
        this.someField = someField;
    }
    
    public Person() {
    }
    
    public static PersonBuilder builder() {
        return new PersonBuilder();
    }
    
    public UUID getId() {
        return this.id;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public String getControlEntityField() {
        return this.controlEntityField;
    }
    
    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public String getSomeField() {
        return this.someField;
    }
    
    public void setId(UUID id) {
        this.id = id;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setControlEntityField(String controlEntityField) {
        this.controlEntityField = controlEntityField;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    
    public void setSomeField(String someField) {
        this.someField = someField;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (! (o instanceof Person person)) return false;
    
        if (! id.equals(person.id)) return false;
        if (! firstName.equals(person.firstName)) return false;
        if (! lastName.equals(person.lastName)) return false;
        if (! dateOfBirth.equals(person.dateOfBirth)) return false;
        if (! address.equals(person.address)) return false;
        if (! controlEntityField.equals(person.controlEntityField)) return false;
        if (! createdAt.equals(person.createdAt)) return false;
        return someField.equals(person.someField);
    }
    
    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + dateOfBirth.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + controlEntityField.hashCode();
        result = 31 * result + createdAt.hashCode();
        result = 31 * result + someField.hashCode();
        return result;
    }
    
    public String toString() {
        return "Person(id=" + this.getId() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", dateOfBirth=" + this.getDateOfBirth() + ", address=" + this.getAddress() + ", controlEntityField=" + this.getControlEntityField() + ", createdAt=" + this.getCreatedAt() + ", someField=" + this.getSomeField() + ")";
    }
    
    public static class PersonBuilder {
        private UUID id;
        private String firstName;
        private String lastName;
        private LocalDate dateOfBirth;
        private String address;
        private String controlEntityField;
        private String createdAt;
        private String someField;
        
        PersonBuilder() {
        }
        
        public PersonBuilder id(UUID id) {
            this.id = id;
            return this;
        }
        
        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        
        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        
        public PersonBuilder dateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }
        
        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }
        
        public PersonBuilder controlEntityField(String controlEntityField) {
            this.controlEntityField = controlEntityField;
            return this;
        }
        
        public PersonBuilder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        
        public PersonBuilder someField(String someField) {
            this.someField = someField;
            return this;
        }
        
        public Person build() {
            return new Person(id, firstName, lastName, dateOfBirth, address, controlEntityField, createdAt, someField);
        }
        
        public String toString() {
            return "Person.PersonBuilder(id=" + this.id + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", dateOfBirth=" + this.dateOfBirth + ", address=" + this.address + ", controlEntityField=" + this.controlEntityField + ", createdAt=" + this.createdAt + ", someField=" + this.someField + ")";
        }
    }
}
