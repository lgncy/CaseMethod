# Jobsheet 2 - Pemrograman Berorientasi Objek

**Nama:** [Nama Mahasiswa]  
**NIM:** [NIM]  
**Kelas:** [Kelas]  
**Mata Kuliah:** Pemrograman Berorientasi Objek  
**Dosen Pengampu:** [Nama Dosen]

---

## Daftar File

| No | File | Keterangan |
|----|------|------------|
| 1 | `Dosen.java` | Class untuk menyimpan data dosen |
| 2 | `DosenMain.java` | Program utama untuk menjalankan class Dosen |
| 3 | `Mahasiswa.java` | Class untuk menyimpan data mahasiswa |
| 4 | `MahasiswaMain.java` | Program utama untuk menjalankan class Mahasiswa |
| 5 | `MataKuliah.java` | Class untuk menyimpan data mata kuliah |
| 6 | `MataKuliahMain.java` | Program utama untuk menjalankan class MataKuliah |

---

## Penjelasan Program

### 1. Dosen.java

Class ini saya buat untuk menyimpan data dosen. Atribut yang ada di sini adalah `idDosen`, `nama`, `statusAktif`, `tahunBergabung`, dan `bidangKeahlian`.

Saya membuat dua konstruktor:
- **Konstruktor default** → objek dibuat dulu, baru datanya diisi satu-satu
- **Konstruktor berparameter** → datanya langsung diisi waktu objek dibuat

Method yang ada:
- `tampilInformasi()` - untuk menampilkan semua data dosen
- `setStatusAktif()` - untuk mengubah status aktif dosen
- `hitungMasaKerja()` - menghitung sudah berapa tahun dosen bekerja
- `ubahKeahlian()` - untuk mengubah bidang keahlian dosen

---

### 2. Mahasiswa.java

Class untuk menyimpan data mahasiswa. Atributnya ada `nim`, `nama`, `kelas`, dan `ipk`.

Method yang saya buat:
- `tampilkanInformasi()` - menampilkan data mahasiswa sekaligus nilai kinerjanya
- `ubahKelas()` - untuk pindah kelas
- `updateIpk()` - untuk update IPK, tapi ada validasinya, kalau inputnya di luar 0.0 - 4.0 maka tidak akan tersimpan
- `nilaiKinerja()` - mengembalikan predikat berdasarkan nilai IPK

Predikat IPK yang saya gunakan:

| IPK | Predikat |
|-----|----------|
| >= 3.5 | Sangat Baik |
| >= 3.0 | Baik |
| >= 2.0 | Cukup |
| < 2.0 | Kurang |

---

### 3. MataKuliah.java

Class untuk data mata kuliah. Atributnya `kodeMK`, `nama`, `sks`, dan `jumlahJam`.

Method yang ada:
- `tampilInformasi()` - menampilkan semua data mata kuliah
- `ubahSKS()` - untuk mengubah jumlah SKS
- `tambahJam()` - menambah jam pertemuan
- `kurangiJam()` - mengurangi jam, tapi dicek dulu apakah jamnya cukup atau tidak

---

## Cara Menjalankan

Program ini menggunakan package `Jobsheet2`, jadi cara kompilasi dan menjalankannya sedikit berbeda dari biasanya.

**Kompilasi** (dari folder `Polinema/`):
```bash
javac "Semester 2/Dosen.java" "Semester 2/DosenMain.java" "Semester 2/Mahasiswa.java" "Semester 2/MahasiswaMain.java" "Semester 2/MataKuliah.java" "Semester 2/MataKuliahMain.java" -d .
```

**Menjalankan**:
```bash
java Jobsheet2.DosenMain
java Jobsheet2.MahasiswaMain
java Jobsheet2.MataKuliahMain
```

Atau bisa juga langsung lewat IDE (IntelliJ / VS Code) dengan klik tombol Run di file `*Main.java`.

---

## Kesimpulan

Dari jobsheet ini saya belajar cara membuat class di Java beserta atribut dan method-nya. Saya juga belajar perbedaan antara konstruktor default dan konstruktor berparameter, dan bagaimana cara membuat objek dari class yang sudah dibuat. Selain itu saya juga mencoba menambahkan validasi sederhana pada method `updateIpk()` agar nilai IPK yang dimasukkan tidak bisa di luar rentang yang wajar.
