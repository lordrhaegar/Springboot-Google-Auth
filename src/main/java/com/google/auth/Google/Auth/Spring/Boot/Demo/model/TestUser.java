package com.google.auth.Google.Auth.Spring.Boot.Demo.model;

import java.time.LocalDate;

public class TestUser {
    private Long id;
    private String name;
    private String email;
    private LocalDate birthDay;

    public TestUser(String name, String email, LocalDate birthDay) {
        this.name = name;
        this.email = email;
        this.birthDay = birthDay;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id + "\n" +
                ", name='" + name + "\n" +
                ", email='" + email + "\n" +
                ", birthDay=" + birthDay + "\n" +
                '}';
    }
}
