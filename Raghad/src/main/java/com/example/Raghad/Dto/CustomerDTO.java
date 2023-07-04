package com.example.Raghad.Dto;

import java.time.LocalDate;

public class CustomerDTO {

    public CustomerDTO(){

    }
    public CustomerDTO(Long id, String firstName, String lastName, LocalDate bornAtDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bornAtDate = bornAtDate;
    }

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBornAtDate() {
        return bornAtDate;
    }

    public void setBornAtDate(LocalDate bornAtDate) {
        this.bornAtDate = bornAtDate;
    }

    private String firstName;
    private String lastName;
    private LocalDate bornAtDate;

}
