package com.example.Raghad.Entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Customer(Long id, String firstName, String lastName, LocalDate bornAtDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bornAtDate = bornAtDate;
    }

    private String firstName;

    private String lastName;

    public Customer() {

    }

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

    private LocalDate bornAtDate;


}
