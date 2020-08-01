package com.model;

public class Employee {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee() {
    }

    public String getDesignation() {
        return designation;
    }

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    private int id;
     private String name;
     private String designation;
}
