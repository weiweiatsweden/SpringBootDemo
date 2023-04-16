package com.wei.springbootdemo.Entities;


import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Members {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memberId")
    private int memberId;

    @Column(length=20, name = "firstName")
    private String firstName;
    private String lastName;
    @ManyToOne
    @JoinColumn(name = "addressId")
    private Address address;

    private String email;
    private String phone;
    @DateTimeFormat(pattern = "yyy-MM-dd")
    private String dateOfBirth;


    public Members() {
    }

    public Members(int memberId, String firstName, String lastName, Address address, String email, String phoneNumber, String dateOfBirth) {
        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;

        this.address = address;
        //String Address = address;

        this.email = email;
        this.phone = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
