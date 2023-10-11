/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gymmanagement;
import gymEntities.Member;
import gymEntities.Trainer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ACER TRAVELMATE
 */
public class GymManager {
    private ArrayList<Member> members;
    private ArrayList<Trainer> trainers;
    private Scanner scanner;
    

    public GymManager() {
        members = new ArrayList<>();
        trainers = new ArrayList<>();
        scanner = new Scanner(System.in); 
        
        // Menambahkan data awal untuk member
        addMember("Nabil", 19);
        addMember("Rahman", 35);
        addMember("Budi", 25);
        addMember("Doni", 18);
        addMember("Irfan", 19);

        // Menambahkan data awal untuk trainer
        addTrainer("Jeri", 5);
        addTrainer("Emma", 8);
        addTrainer("Gilang", 2);
        addTrainer("Dimas", 3);
        addTrainer("Billy", 2);
    }

    public void run() {
        
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nMenu:");
            System.out.println("1. Kelola Member");
            System.out.println("2. Kelola Trainer");
            System.out.println("3. Keluar");
            System.out.print("Pilihan   : ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Clear the newline character

            switch (choice) {
                case 1:
                    memberMenu();
                    break;
                case 2:
                    trainerMenu();
                    break;
                case 3:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public void memberMenu() {
        boolean isMemberMenuRunning = true;
        while (isMemberMenuRunning) {
            System.out.println("\nMenu Kelola Member:");
            System.out.println("1. Tambah Member");
            System.out.println("2. List Member");
            System.out.println("3. Edit Member");
            System.out.println("4. Hapus Member");
            System.out.println("5. Kembali ke Menu Utama");
            System.out.print("Pilihan   : ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Clear the newline character

            switch (choice) {
                case 1:
                    System.out.print("Nama Member: ");
                    String memberName = scanner.nextLine();
                    System.out.print("Usia Member: ");
                    int memberAge = scanner.nextInt();
                    addMember(memberName, memberAge);
                    System.out.println("Member baru ditambahkan.");
                    break;
                case 2:
                    listMembers();
                    break;
                case 3:
                    listMembers();
                    System.out.print("Index Member yang akan diubah: ");
                    int editMemberIndex = scanner.nextInt();
                    scanner.nextLine();  // Clear the newline character
                    System.out.print("Nama Baru Member: ");
                    String newMemberName = scanner.nextLine();
                    System.out.print("Usia Baru Member: ");
                    int newMemberAge = scanner.nextInt();
                    updateMember(editMemberIndex, newMemberName, newMemberAge);
                    break;
                case 4:
                    System.out.print("Index Member yang akan dihapus: ");
                    int deleteMemberIndex = scanner.nextInt();
                    deleteMember(deleteMemberIndex);
                    break;
                case 5:
                    isMemberMenuRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public void trainerMenu() {
        boolean isTrainerMenuRunning = true;
        while (isTrainerMenuRunning) {
            System.out.println("\nMenu Kelola Trainer:");
            System.out.println("1. Tambah Trainer");
            System.out.println("2. List Trainer");
            System.out.println("3. Edit Trainer");
            System.out.println("4. Hapus Trainer");
            System.out.println("5. Kembali ke Menu Utama");
            System.out.print("Pilihan   : ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Clear the newline character

            switch (choice) {
                case 1:
                    System.out.print("Nama Trainer: ");
                    String trainerName = scanner.nextLine();
                    System.out.print("Tahun Pengalaman Trainer: ");
                    int trainerExperience = scanner.nextInt();
                    addTrainer(trainerName, trainerExperience);
                    System.out.println("Trainer baru ditambahkan.");
                    break;
                case 2:
                    listTrainers();
                    break;
                case 3:
                    listTrainers();
                    System.out.print("Index Trainer yang akan diubah: ");
                    int editTrainerIndex = scanner.nextInt();
                    scanner.nextLine();  // Clear the newline character
                    System.out.print("Nama Baru Trainer: ");
                    String newTrainerName = scanner.nextLine();
                    System.out.print("Tahun Pengalaman Baru Trainer: ");
                    int newTrainerExperience = scanner.nextInt();
                    updateTrainer(editTrainerIndex, newTrainerName, newTrainerExperience);
                    break;
                case 4:
                    System.out.print("Index Trainer yang akan dihapus: ");
                    int deleteTrainerIndex = scanner.nextInt();
                    deleteTrainer(deleteTrainerIndex);
                    break;
                case 5:
                    isTrainerMenuRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public final void addMember(String name, int age) {
        Member member = new Member(name, age);
        members.add(member);
        
    }

    public final void addTrainer(String name, int experienceYears) {
        Trainer trainer = new Trainer(name, experienceYears);
        trainers.add(trainer);
        
    }

    public void listMembers() {
        System.out.println("Daftar Member:");
        for (int i = 0; i < members.size(); i++) {
            Member member = members.get(i);
            System.out.println((i + 1) + ". Nama: " + member.getName() + ", Usia: " + member.getAge());
        }
    }

    public void listTrainers() {
         System.out.println("Daftar Trainer:");
        for (int i = 0; i < trainers.size(); i++) {
            Trainer trainer = trainers.get(i);
            System.out.println((i + 1) + ". Nama: " + trainer.getName() + ", Tahun Pengalaman: " + trainer.getExperienceYears());
        }
    }

    public void updateMember(int index, String name, int age) {
        if (index >= 1 && index <= members.size()) {
            Member member = members.get(index - 1);
            member.setName(name);
            member.setAge(age);
            System.out.println("Data Member berhasil diubah.");
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    public void updateTrainer(int index, String name, int experienceYears) {
        if (index >= 1 && index <= trainers.size()) {
            Trainer trainer = trainers.get(index - 1);
            trainer.setName(name);
            trainer.setExperienceYears(experienceYears);
            System.out.println("Data Trainer berhasil diubah.");
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    public void deleteMember(int index) {
        if (index >= 1 && index <= members.size()) {
            members.remove(index - 1);
            System.out.println("Member berhasil dihapus.");
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    public void deleteTrainer(int index) {
        if (index >= 1 && index <= trainers.size()) {
            trainers.remove(index - 1);
            System.out.println("Trainer berhasil dihapus.");
        } else {
            System.out.println("Index tidak valid.");
        }
    }
}