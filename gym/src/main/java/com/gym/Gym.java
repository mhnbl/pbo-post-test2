package com.gym;

import com.gym.entitiesmanager.EntitiesManager;
import java.util.Scanner;

public class Gym {
    public static void main(String[] args) {
        EntitiesManager manager = new EntitiesManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Gym/Fitness Management ===");
            System.out.println("1. Kelola Member");
            System.out.println("2. Kelola Trainer");
            System.out.println("3. Kelola Equipment");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character

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
            System.out.println("=== Kelola Member ===");
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
                }
                case 2 -> {
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
            System.out.println("=== Kelola Trainer ===");
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
                }
                case 2 -> {
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
            System.out.println("=== Kelola Equipment ===");
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
                }
                case 2 -> {
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
