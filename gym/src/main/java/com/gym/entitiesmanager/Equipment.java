package com.gym.entitiesmanager;

public class Equipment extends EntitiesManager{
    private final int id;
    private String name;
    private int count;

    public Equipment(int id, String name, int count) {
        this.id = id;
        this.name = name;
        this.count = count;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Equipment ID: " + id + ", Name: " + name + ", Count: " + count;
    }
}
