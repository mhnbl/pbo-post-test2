# Pbo Post Test2
___
**Nama** :  Muhammad Nabil

**NIM** :  2209116056

**Kelas** :  A2
___
## Kelas Gym/ Main Class

Kelas ini berfungsi untuk mengelola entitas seperti member, trainer, dan equipment. Pengguna dapat memilih opsi dari menu utama (1-4), dan sesuai dengan pilihan, mereka akan diarahkan ke sub-menu yang sesuai untuk mengelola entitas tersebut.

Setiap sub-menu (Member, Trainer, Equipment) memiliki opsi yang memungkinkan pengguna untuk menambah, mengedit, menghapus, atau menampilkan entitas sesuai dengan jenisnya. Selain itu, ada opsi "Kembali ke Menu Utama" yang memungkinkan pengguna kembali ke menu utama.

___
Berikut adalah penjelasan rinci tentang kelas Gym:

### Menu Utama
![Screenshot 2023-10-12 164930](https://github.com/mhnbl/pbo-post-test2/assets/125839542/d99a9a03-0d50-4507-894d-5a0ccf01af5b)

* Pada segmen ini, dideklarasikan paket yang digunakan dan mengimpor kelas yang dibutuhkan.
* EntitiesManager adalah kelas yang digunakan untuk mengelola entitas seperti member, trainer, dan equipment.
* Fungsi main adalah titik masuk utama program.
* Membuat instansi dari EntitiesManager untuk mengelola data entitas.
* Membuat instansi dari Scanner untuk menerima input pengguna.
* Program berada dalam loop tak terbatas (while (true)) untuk menampilkan menu dan mengelola pilihan pengguna.

![Screenshot 2023-10-12 165405](https://github.com/mhnbl/pbo-post-test2/assets/125839542/0ea06363-994e-498c-9f70-8a69e71c80e1)

* Segmen ini mencetak menu utama ke layar.
* Meminta pengguna memilih opsi (1-4) dan membaca pilihannya menggunakan scanner.

![Screenshot 2023-10-12 165500](https://github.com/mhnbl/pbo-post-test2/assets/125839542/5368a5a8-c41a-43a5-a80d-d83af786f8e1)

* Segmen ini adalah bagian dari switch statement yang menangani pilihan pengguna dari menu utama.
* Setiap case memanggil fungsi yang sesuai untuk mengelola member, trainer, atau equipment atau keluar dari program jika dipilih.
* default akan dijalankan jika pengguna memasukkan pilihan yang tidak valid.

Segmen 5, 6, dan 7 adalah implementasi fungsi handleMemberMenu, handleTrainerMenu, dan handleEquipmentMenu. Masing-masing memiliki struktur serupa, yaitu mencetak submenu, menerima pilihan pengguna, dan menjalankan tindakan sesuai pilihan tersebut.

___

### Sub-Menu
![Screenshot 2023-10-12 165711](https://github.com/mhnbl/pbo-post-test2/assets/125839542/124e524e-fd04-4b74-b9ee-0b254688bd46)

Fungsi handleMemberMenu digunakan untuk mengelola entitas "Member" dalam aplikasi

![Screenshot 2023-10-12 165724](https://github.com/mhnbl/pbo-post-test2/assets/125839542/b6363ba2-7f0a-41c5-96c0-938f76edd5fb)

* Jika pengguna memilih "Tambah Member" (case 1), program meminta nama dan usia member baru, dan kemudian menggunakan manager.addMember untuk menambahkan member baru.
* Jika pengguna memilih "Edit Member" (case 2), program meminta ID member yang akan diedit, kemudian meminta nama dan usia baru, dan akhirnya menggunakan manager.editMember untuk mengubah data member yang ada.
  
![Screenshot 2023-10-12 165729](https://github.com/mhnbl/pbo-post-test2/assets/125839542/fe8c8dba-ff32-4953-b8b8-752313b842a9)

* Jika pengguna memilih "Hapus Member" (case 3), program meminta ID member yang akan dihapus dan menggunakan manager.deleteMember untuk menghapus member tersebut.
* Jika pengguna memilih "Tampilkan Member" (case 4), program menggunakan manager.displayMembers untuk menampilkan daftar semua member.


Fungsi HandleTrainerMenu & HandleEquipmentMenu memiliki struktur serupa dengan segmen-segmen yang telah dijelaskan di atas. Masing-masing memberian opsi mengelola entitas Trainer dan Equipment.

___
___ 

## Kelas EntitiesManager

Kelas EntitiesManager adalah bagian dari sistem manajemen gym yang bertanggung jawab untuk mengelola entitas seperti member, trainer, dan equipment. Kelas ini menyediakan metode-metode untuk menambah, mengubah, menghapus, dan menampilkan data entitas-entitas tersebut.

![Screenshot 2023-10-12 170805](https://github.com/mhnbl/pbo-post-test2/assets/125839542/6ef528ef-7e36-48ea-815c-12119e1dbacd)

* Di segmen ini, kita mendeklarasikan kelas EntitiesManager yang bertanggung jawab untuk mengelola entitas seperti Member, Trainer, dan Equipment.
* Terdapat tiga list (members, trainers, equipmentList) yang digunakan untuk menyimpan entitas-entitas tersebut.
* Ada tiga counter (memberIdCounter, trainerIdCounter, equipmentIdCounter) yang digunakan untuk menghasilkan ID unik untuk setiap entitas yang ditambahkan.

### AddMember

![image](https://github.com/mhnbl/pbo-post-test2/assets/125839542/2b8a9be9-d161-4507-b6e4-ca8610fc0de8)

* Fungsi ini digunakan untuk menambahkan member baru.
* Membuat instansi Member dengan menggunakan ID yang di-generate, nama, dan usia yang diberikan.
* Member yang baru ditambahkan ke dalam list members.
* Counter memberIdCounter ditingkatkan agar ID selanjutnya unik.
* Program mencetak pesan konfirmasi bahwa member telah ditambahkan.

### EditMember

![Screenshot 2023-10-12 171138](https://github.com/mhnbl/pbo-post-test2/assets/125839542/281c62e3-54f3-4514-bcfe-98bb42c88d8d)

* Fungsi ini digunakan untuk mengubah data seorang member berdasarkan ID member yang diberikan.
* Menggunakan loop for-each untuk mencari member dengan ID yang sesuai.
* Jika member ditemukan, data member diubah dengan nama dan usia yang baru.
* Jika member tidak ditemukan, program mencetak pesan bahwa member dengan ID yang diberikan tidak ditemukan.

### DeleteMember

![Screenshot 2023-10-12 171237](https://github.com/mhnbl/pbo-post-test2/assets/125839542/acbb103a-56b3-4c34-9c41-746ac73f2a73)

* Fungsi ini digunakan untuk menghapus seorang member berdasarkan ID member yang diberikan.
* Menggunakan removeIf untuk menghapus member dari list jika ID member sesuai dengan yang diberikan.
* Program mencetak pesan konfirmasi bahwa member telah dihapus.

### DisplayMember

![Screenshot 2023-10-12 171330](https://github.com/mhnbl/pbo-post-test2/assets/125839542/301021a0-294d-4174-8d6f-ca7d6fd10bd8)

* Fungsi ini digunakan untuk menampilkan daftar semua member.
* Mencetak judul "=== Daftar Member ===" ke layar.
* Menggunakan loop for-each untuk mencetak data semua member yang ada.


Fungsi-fungsi lain seperti addTrainer, editTrainer, deleteTrainer, displayTrainers, addEquipment, editEquipment, deleteEquipment, dan displayEquipment memiliki struktur serupa dengan segmen-segmen yang telah dijelaskan di atas. Masing-masing fungsi mengelola entitas Trainer dan Equipment.

___
___
## Kelas Member, Trainer, Equipment
Keiga kelas member, Trainet, dan Equipment memiliki struktur serupa dengan fungsi-fungsi yang sama yaitu berisi getter dan setteryang menjadikan kelas tersebut sebagai objek.
Berikut penjelasan untuk kelas Member:

![image](https://github.com/mhnbl/pbo-post-test2/assets/125839542/c05913ca-5d62-4625-af70-94dba42e43f0)

* Di segmen ini, kita mendefinisikan kelas Member, yang merupakan bagian dari sistem manajemen gym.
* Kelas Member adalah subclass dari EntitiesManager, yang berarti itu memiliki akses ke metode dan properti yang didefinisikan dalam EntitiesManager.

![Screenshot 2023-10-12 171959](https://github.com/mhnbl/pbo-post-test2/assets/125839542/83d26e32-0df7-4a62-843b-3bcacb6399d4)

* Konstruktor digunakan untuk membuat objek Member baru.
* Menerima tiga parameter: ID, nama, dan usia.
* Nilai-nilai ini digunakan untuk menginisialisasi properti id, nama, dan usia pada objek Member.

![Screenshot 2023-10-12 172044](https://github.com/mhnbl/pbo-post-test2/assets/125839542/4abde2b2-6a92-405b-a081-b8ba00a1edc7)

* Getter dan setter digunakan untuk mengakses dan mengubah properti id, nama, dan usia dari luar kelas Member.
* Getter digunakan untuk mengambil nilai properti.
* Setter digunakan untuk mengatur nilai properti dengan nilai yang baru.

![Screenshot 2023-10-12 172114](https://github.com/mhnbl/pbo-post-test2/assets/125839542/54bde9fd-ffa1-4bdf-bd12-6c66d7cdad77)

* Metode toString digunakan untuk menggambarkan objek Member sebagai string.
* Ini akan digunakan ketika objek Member harus dicetak sebagai teks.
* Metode mengembalikan string yang berisi informasi ID, nama, dan usia.

Kelas Member adalah representasi dari entitas member dalam aplikasi manajemen gym. Properti-properti seperti ID, nama, dan usia dapat diakses dan diubah dengan menggunakan getter dan setter, dan objek Member dapat dijelaskan sebagai string menggunakan metode toString. Hal ini memungkinkan untuk menambah, mengubah, menghapus, dan menampilkan data member dalam aplikasi.

___
___
## Output

  * Menu Utama

    ![Screenshot 2023-10-12 173830](https://github.com/mhnbl/pbo-post-test2/assets/125839542/4337c040-202e-45ea-9045-b987f6ed37b0)

  * Kelola Member

    ![Screenshot 2023-10-12 173957](https://github.com/mhnbl/pbo-post-test2/assets/125839542/94e86a11-1722-48be-920c-0992c55070e4)

  * Tambah Member

    ![Screenshot 2023-10-12 173957](https://github.com/mhnbl/pbo-post-test2/assets/125839542/7e260f9e-ca18-43ad-8bfc-8c184ab4d50e)

  * Edit Member
   
    ![Screenshot 2023-10-12 174318](https://github.com/mhnbl/pbo-post-test2/assets/125839542/dbfa2592-3bfd-4486-b76a-d827cdbc2862)

  * Hapus Member
    
    ![Screenshot 2023-10-12 174425](https://github.com/mhnbl/pbo-post-test2/assets/125839542/aac9838b-8c71-42a4-9e06-fcb4b703797c)

  * Tampilkan Member

    ![Screenshot 2023-10-12 174524](https://github.com/mhnbl/pbo-post-test2/assets/125839542/00d06462-3d63-4017-995d-d604055463f6)
