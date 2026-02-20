package Jobsheet2;

/**
 * Kelas Mahasiswa merepresentasikan data dan perilaku seorang mahasiswa.
 * Menyimpan informasi NIM, nama, kelas, dan IPK, serta menyediakan
 * method untuk memperbarui dan menampilkan data tersebut.
 */
public class Mahasiswa {

    /** Nomor Induk Mahasiswa */
    String nim;

    /** Nama lengkap mahasiswa */
    String nama;

    /** Kelas yang diikuti mahasiswa (contoh: "TI-1A") */
    String kelas;

    /** Indeks Prestasi Kumulatif mahasiswa (rentang 0.0 – 4.0) */
    double ipk;

    /**
     * Konstruktor default — membuat objek Mahasiswa tanpa nilai awal.
     * Nilai atribut diisi secara manual setelah objek dibuat.
     */
    Mahasiswa() {
    }

    /**
     * Konstruktor berparameter — membuat objek Mahasiswa dengan nilai awal.
     *
     * @param nim   Nomor Induk Mahasiswa
     * @param nama  Nama lengkap mahasiswa
     * @param kelas Kelas mahasiswa
     * @param ipk   IPK mahasiswa (harus antara 0.0 dan 4.0)
     */
    Mahasiswa(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.updateIpk(ipk);
    }

    /**
     * Menampilkan seluruh informasi mahasiswa ke konsol,
     * termasuk nilai kinerja berdasarkan IPK.
     */
    void tampilkanInformasi() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
        System.out.println("Nilai Kinerja: " + nilaiKinerja(ipk));
        System.out.println("----------------------");
    }

    /**
     * Memindahkan mahasiswa ke kelas yang baru.
     *
     * @param kelasBaru Nama kelas tujuan
     */
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    /**
     * Memperbarui nilai IPK mahasiswa dengan validasi rentang.
     * IPK hanya diperbarui jika nilainya antara 0.0 dan 4.0.
     *
     * @param ipkBaru Nilai IPK baru
     */
    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    /**
     * Menentukan predikat kinerja mahasiswa berdasarkan IPK.
     *
     * @param ipk Nilai IPK yang akan dievaluasi
     * @return Predikat kinerja: "Sangat Baik", "Baik", "Cukup", atau "Kurang"
     */
    String nilaiKinerja(double ipk) {
        if (ipk >= 3.5)
            return "Sangat Baik";
        else if (ipk >= 3.0)
            return "Baik";
        else if (ipk >= 2.0)
            return "Cukup";
        else
            return "Kurang";
    }
}