# 📚 Konsep Pemrograman Berbasis Obyek - Pertemuan Keempat

**Topik Utama:** CRUD, Exception Handling (*try-catch*, *throws*), dan *Custom Exception*

---

## 📑 Table of Contents
- [📝 CRUD (Create, Read, Update, Delete)](https://github.com/ervina0604/PBO4/blob/main/Crud.java)
- [❗ Exception Handling - *Try-Catch* dan *Throws*](https://github.com/ervina0604/PBO4/blob/main/TryThrow.java)
- [🚨 Custom Exception](https://github.com/ervina0604/PBO4/blob/main/VinaException.java)

---

## 📝 CRUD (Create, Read, Update, Delete)
CRUD adalah operasi dasar yang sering dilakukan dalam interaksi dengan database. Berikut adalah penjelasan dari operasi CRUD yang terdapat dalam program:

### ➕ **Create (Tambah Data)**
Operasi *Create* menambahkan data baru ke dalam database. Pada program ini, pengguna memasukkan detail dokter seperti ID, nama, alamat, dan email melalui *console*. Data yang dimasukkan akan disimpan ke dalam tabel `Dokter` dengan perintah SQL `INSERT`.

**Proses:**
- Koneksi ke database dibuat menggunakan `DriverManager.getConnection`.
- Data dimasukkan dengan menggunakan `PreparedStatement` dan di-*commit* setelah input selesai.
- Jika terjadi kesalahan, data yang dimasukkan akan dibatalkan dengan `conn.rollback()`.

### 🔄 **Read (Tampilkan Data)**
Operasi *Read* menampilkan seluruh data dari tabel `Dokter`. Pada kode ini, SQL `SELECT` digunakan untuk mengambil semua informasi dari tabel.

**Proses:**
- Koneksi ke database dibuat dan data dari tabel `dokter` ditampilkan satu per satu menggunakan `ResultSet`.

### 📝 **Update (Perbarui Data)**
Operasi *Update* memperbarui informasi data yang ada berdasarkan ID dokter. Pengguna memasukkan ID dokter, kemudian data yang ingin diubah (nama, alamat, email).

**Proses:**
- SQL `UPDATE` digunakan untuk mengubah data sesuai dengan ID yang dimasukkan.
- Jika ID yang diinput tidak ditemukan, pesan kesalahan akan muncul.

### ❌ **Delete (Hapus Data)**
Operasi *Delete* menghapus data dokter dari tabel berdasarkan ID yang dimasukkan.

**Proses:**
- SQL `DELETE` digunakan untuk menghapus data sesuai dengan ID dokter yang diberikan oleh pengguna.
- Jika data berhasil dihapus, pesan konfirmasi ditampilkan. Jika tidak, pengguna diberi tahu bahwa ID tersebut tidak ditemukan.

---

## ❗ Exception Handling - *Try-Catch* dan *Throws*

Exception handling adalah teknik untuk menangani kesalahan yang terjadi selama eksekusi program.

### 🛡️ **Try-Catch**
Pada program, `try-catch` digunakan untuk menangkap kesalahan yang mungkin terjadi, misalnya saat pembagian dengan nol atau kesalahan dalam operasi database. Kode yang rawan kesalahan ditempatkan di dalam blok `try`, dan jika ada kesalahan, blok `catch` akan menangkapnya.

#### Contoh:
- **Pembagian dengan Nol:** Dalam metode `bagiTryCatch`, jika pembagian dilakukan dengan bilangan nol, akan dilempar *ArithmeticException*, dan pesan kesalahan akan ditampilkan.

### 🚩 **Throws**
`throws` adalah cara untuk meneruskan kesalahan ke pemanggil metode. Dalam metode `bagiThrows`, jika terjadi kesalahan (seperti pembagian dengan nol), kesalahan ini tidak ditangani di dalam metode, tetapi dilempar ke pemanggil.

#### Contoh:
- Dalam `bagiThrows`, jika terjadi kesalahan pembagian dengan nol, kesalahan akan diteruskan, dan tanggung jawab penanganan ada pada pemanggil metode, seperti yang dilakukan dalam `main`.

---

## 🚨 Custom Exception
Custom Exception adalah pengecualian yang didefinisikan oleh pengguna sesuai dengan kebutuhan spesifik. Program ini mendemonstrasikan penggunaan custom exception bernama VinaException, yang digunakan untuk menangani kesalahan spesifik, yaitu pembagian dengan nol.

### Proses:
- VinaException: Merupakan subclass dari ArithmeticException, dirancang untuk melempar pesan kesalahan yang disesuaikan saat terjadi pembagian dengan nol.
  
---

## 🔍 Kesimpulan
- **CRUD** melibatkan operasi dasar untuk mengelola data dalam database, yaitu *Create, Read, Update*, dan *Delete*.
- **Exception Handling** dengan *try-catch* menangani kesalahan secara langsung di tempat terjadinya, sementara *throws* meneruskan kesalahan kepada pemanggil metode.
- **Custom Exception** memungkinkan pembuatan kesalahan yang lebih spesifik dan sesuai dengan kebutuhan program.

---

### 🚀 Selamat Belajar dan Menggunakan Konsep CRUD dan Exception Handling dalam Pemrograman! 💻
