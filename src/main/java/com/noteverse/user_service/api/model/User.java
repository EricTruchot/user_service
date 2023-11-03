package com.noteverse.user_service.api.model;

public class User {

    private int id_user;
    private String name_user;
    private int age_user;
    private String email_user;

    public User(int id_user, String name_user, int age_user, String email_user) {
        this.id_user = id_user;
        this.name_user = name_user;
        this.age_user = age_user;
        this.email_user = email_user;
    }

    public int getId() {
        return id_user;
    }

    public void setId(int id_user) {
        this.id_user = id_user;
    }

    public String getName() {
        return name_user;
    }

    public void setName(String name_user) {
        this.name_user = name_user;
    }

    public int getAge() {
        return age_user;
    }

    public void setAge(int age_user) {
        this.age_user = age_user;
    }

    public String getEmail() {
        return email_user;
    }

    public void setEmail(String email_user) {
        this.email_user = email_user;
    }
}