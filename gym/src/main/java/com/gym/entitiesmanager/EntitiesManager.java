package com.gym.entitiesmanager;

import java.util.ArrayList;
import java.util.List;

public class EntitiesManager {
    
    private List<Member> members = new ArrayList<>();
    private List<Trainer> trainers = new ArrayList<>();
    private List<Equipment> equipmentList = new ArrayList<>();
    

    private int memberIdCounter = 1;
    private int trainerIdCounter = 1;
    private int equipmentIdCounter = 1;

    public void addMember(String name, int age) {
        Member member = new Member(memberIdCounter, name, age);
        members.add(member);
        memberIdCounter++;
        
    }

    public void editMember(int memberId, String newName, int newAge) {
        for (Member member : members) {
            if (member.getId() == memberId) {
                member.setNama(newName);
                member.setUsia(newAge);
                System.out.println("Data member diubah: " + member);
                return;
            }
        }
        System.out.println("Member dengan ID " + memberId + " tidak ditemukan.");
    }

    public void deleteMember(int memberId) {
        members.removeIf(member -> member.getId() == memberId);
        System.out.println("Member dengan ID " + memberId + " telah dihapus.");
    }

    public void displayMembers() {
        System.out.println("\n=== Daftar Member ===");
        for (Member member : members) {
            System.out.println(member);
        }
    }

    public void addTrainer(String name, String specialization) {
        Trainer trainer = new Trainer(trainerIdCounter, name, specialization);
        trainers.add(trainer);
        trainerIdCounter++;
        
    }

    public void editTrainer(int trainerId, String newName, String newSpecialization) {
        for (Trainer trainer : trainers) {
            if (trainer.getId() == trainerId) {
                trainer.setName(newName);
                trainer.setSpecialization(newSpecialization);
                System.out.println("Data trainer diubah: " + trainer);
                return;
            }
        }
        System.out.println("Trainer dengan ID " + trainerId + " tidak ditemukan.");
    }

    public void deleteTrainer(int trainerId) {
        trainers.removeIf(trainer -> trainer.getId() == trainerId);
        System.out.println("Trainer dengan ID " + trainerId + " telah dihapus.");
    }

    public void displayTrainers() {
        System.out.println("\n=== Daftar Trainer ===");
        for (Trainer trainer : trainers) {
            System.out.println(trainer);
        }
    }

    public void addEquipment(String name, int count) {
        Equipment equipment = new Equipment(equipmentIdCounter, name, count);
        equipmentList.add(equipment);
        equipmentIdCounter++;
        
    }

    public void editEquipment(int equipmentId, String newName, int newCount) {
        for (Equipment equipment : equipmentList) {
            if (equipment.getId() == equipmentId) {
                equipment.setName(newName);
                equipment.setCount(newCount);
                System.out.println("Data equipment diubah: " + equipment);
                return;
            }
        }
        System.out.println("Equipment dengan ID " + equipmentId + " tidak ditemukan.");
    }

    public void deleteEquipment(int equipmentId) {
        equipmentList.removeIf(equipment -> equipment.getId() == equipmentId);
        System.out.println("Equipment dengan ID " + equipmentId + " telah dihapus.");
    }

    public void displayEquipment() {
        System.out.println("\n=== Daftar Equipment ===");
        for (Equipment equipment : equipmentList) {
            System.out.println(equipment);
        }
    }
}
