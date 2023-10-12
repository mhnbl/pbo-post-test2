package com.gym;

import com.gym.entitiesmanager.EntitiesManager;
import java.util.Scanner;

public class Gym {
    public static void main(String[] args) {
        EntitiesManager manager = new EntitiesManager();
        Scanner scanner = new Scanner(System.in);
        
        // Menambahkan data awal member
        manager.addMember("Rahman", 35);
        manager.addMember("Nabil", 19);
        manager.addMember("Tejo", 25);
        manager.addMember("Maulana", 17);

        // Menambahkan data awal trainer
        manager.addTrainer("Gilang", "Yoga");
        manager.addTrainer("Budi", "Crossfit");
        manager.addTrainer("Tara", "Weight loss");
        manager.addTrainer("Putra", "Conditioning");
        
        // Menambahkan data awal equipment
        manager.addEquipment("Treadmill", 6);
        manager.addEquipment("Dumbbells", 50);
        manager.addEquipment("Stationary Bike", 8);
        manager.addEquipment("Bench Press", 10);
        manager.addEquipment("Leg Curl", 4);
        manager.addEquipment("Yoga Mat", 23);
        
        
        while (true) {
            System.out.println("\n=== Gym/Fitness Management ===");
            System.out.println("1. Kelola Member");
            System.out.println("2. Kelola Trainer");
            System.out.println("3. Kelola Equipment");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    // Menu Kelola Member
                    handleMemberMenu(manager, scanner);
                    break;
                case 2:
                    // Menu Kelola Trainer
                    handleTrainerMenu(manager, scanner);
                    break;
                case 3:
                    // Menu Kelola Equipment
                    handleEquipmentMenu(manager, scanner);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    private static void handleMemberMenu(EntitiesManager manager, Scanner scanner) {
        while (true) {
            System.out.println("\n=== Kelola Member ===");
            System.out.println("1. Tambah Member");
            System.out.println("2. Edit Member");
            System.out.println("3. Hapus Member");
            System.out.println("4. Tampilkan Member");
            System.out.println("5. Kembali ke Menu Utama");
            System.out.print("Pilih menu (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character

            switch (choice) {
                case 1 -> {
                    // Tambah Member
                    System.out.print("Nama Member: ");
                    String memberName = scanner.nextLine();
                    System.out.print("Usia Member: ");
                    int memberAge = scanner.nextInt();
                    manager.addMember(memberName, memberAge);
                    System.out.println("Member ditambahkan ");
                }
                case 2 -> {
                    // Tampilkan Member
                    manager.displayMembers();
                    // Edit Member
                    System.out.print("ID Member yang akan diedit: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nama Baru: ");
                    String newMemberName = scanner.nextLine();
                    System.out.print("Usia Baru: ");
                    int newMemberAge = scanner.nextInt();
                    manager.editMember(memberId, newMemberName, newMemberAge);
                }
                case 3 -> {
                    // Tampilkan Member
                    manager.displayMembers();
                    // Hapus Member
                    System.out.print("ID Member yang akan dihapus: ");
                    int memberIdToDelete = scanner.nextInt();
                    manager.deleteMember(memberIdToDelete);
                }
                case 4 -> // Tampilkan Member
                    manager.displayMembers();
                case 5 -> {
                    return; // Kembali ke menu utama
                }
                default -> System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    private static void handleTrainerMenu(EntitiesManager manager, Scanner scanner) {
        while (true) {
            System.out.println("\n=== Kelola Trainer ===");
            System.out.println("1. Tambah Trainer");
            System.out.println("2. Edit Trainer");
            System.out.println("3. Hapus Trainer");
            System.out.println("4. Tampilkan Trainer");
            System.out.println("5. Kembali ke Menu Utama");
            System.out.print("Pilih menu (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character

            switch (choice) {
                case 1 -> {
                    // Tambah Trainer
                    System.out.print("Nama Trainer: ");
                    String trainerName = scanner.nextLine();
                    System.out.print("Spesialisasi Trainer: ");
                    String trainerSpecialization = scanner.nextLine();
                    manager.addTrainer(trainerName, trainerSpecialization);
                    System.out.println("Trainer ditambahkan ");
                }
                case 2 -> {
                    // Tampilkan Trainer
                    manager.displayTrainers();
                    // Edit Trainer
                    System.out.print("ID Trainer yang akan diedit: ");
                    int trainerId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nama Baru: ");
                    String newTrainerName = scanner.nextLine();
                    System.out.print("Spesialisasi Baru: ");
                    String newTrainerSpecialization = scanner.nextLine();
                    manager.editTrainer(trainerId, newTrainerName, newTrainerSpecialization);
                }
                case 3 -> {
                    // Tampilkan Trainer
                    manager.displayTrainers();
                    // Hapus Trainer
                    System.out.print("ID Trainer yang akan dihapus: ");
                    int trainerIdToDelete = scanner.nextInt();
                    manager.deleteTrainer(trainerIdToDelete);
                }
                case 4 -> // Tampilkan Trainer
                    manager.displayTrainers();
                case 5 -> {
                    return; // Kembali ke menu utama
                }
                default -> System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    private static void handleEquipmentMenu(EntitiesManager manager, Scanner scanner) {
        while (true) {
            System.out.println("\n=== Kelola Equipment ===");
            System.out.println("1. Tambah Equipment");
            System.out.println("2. Edit Equipment");
            System.out.println("3. Hapus Equipment");
            System.out.println("4. Tampilkan Equipment");
            System.out.println("5. Kembali ke Menu Utama");
            System.out.print("Pilih menu (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character

            switch (choice) {
                case 1 -> {
                    // Tambah Equipment
                    System.out.print("Nama Equipment: ");
                    String equipmentName = scanner.nextLine();
                    System.out.print("Jumlah Equipment: ");
                    int equipmentCount = scanner.nextInt();
                    manager.addEquipment(equipmentName, equipmentCount);
                    System.out.println("Equipment ditambahkan ");
                }
                case 2 -> {
                    // Tampilkan Equipment
                    manager.displayEquipment();
                    // Edit Equipment
                    System.out.print("ID Equipment yang akan diedit: ");
                    int equipmentId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nama Baru: ");
                    String newEquipmentName = scanner.nextLine();
                    System.out.print("Jumlah Baru: ");
                    int newEquipmentCount = scanner.nextInt();
                    manager.editEquipment(equipmentId, newEquipmentName, newEquipmentCount);
                }
                case 3 -> {
                    // Tampilkan Equipment
                    manager.displayEquipment();
                    // Hapus Equipment
                    System.out.print("ID Equipment yang akan dihapus: ");
                    int equipmentIdToDelete = scanner.nextInt();
                    manager.deleteEquipment(equipmentIdToDelete);
                }
                case 4 -> // Tampilkan Equipment
                    manager.displayEquipment();
                case 5 -> {
                    return; // Kembali ke menu utama
                }
                default -> System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}
