package com.gym.entitiesmanager;

public class Member extends EntitiesManager{
    private final int id;
    private String nama;
    private int usia;

    public Member(int id, String nama, int usia) {
        this.id = id;
        this.nama = nama;
        this.usia = usia;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Usia: " + usia;
    }
}
