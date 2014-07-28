package com.noveogroup.task2;

public class Employee {
    private String name;
    private String surname;
    private String skills;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}