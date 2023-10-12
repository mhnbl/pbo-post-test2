package com.gym.entitiesmanager;

public class Trainer extends EntitiesManager{
    private final int id;
    private String name;
    private String specialization;

    public Trainer(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Trainer ID: " + id + ", Name: " + name + ", Specialization: " + specialization;
    }
}
