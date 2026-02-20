package Jobsheet2;

/**
 * Kelas MataKuliah merepresentasikan data dan perilaku sebuah mata kuliah.
 * Menyimpan informasi kode mata kuliah, nama, jumlah SKS, dan total jam,
 * serta menyediakan method untuk memanipulasi data tersebut.
 */
public class MataKuliah {

    /** Kode unik mata kuliah (contoh: "IF101") */
    String kodeMK;

    /** Nama lengkap mata kuliah */
    String nama;

    /** Jumlah Satuan Kredit Semester */
    int sks;

    /** Total jam pertemuan per minggu */
    int jumlahJam;

    /**
     * Konstruktor default — membuat objek MataKuliah tanpa nilai awal.
     * Nilai atribut diisi secara manual setelah objek dibuat.
     */
    MataKuliah() {
    }

    /**
     * Konstruktor berparameter — membuat objek MataKuliah dengan nilai awal.
     *
     * @param kodeMK    Kode unik mata kuliah
     * @param nama      Nama mata kuliah
     * @param sks       Jumlah SKS
     * @param jumlahJam Total jam pertemuan
     */
    MataKuliah(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    /**
     * Menampilkan seluruh informasi mata kuliah ke konsol.
     */
    void tampilInformasi() {
        System.out.println("Kode MK   : " + kodeMK);
        System.out.println("Nama MK   : " + nama);
        System.out.println("SKS       : " + sks);
        System.out.println("JumlahJam : " + jumlahJam);
        System.out.println("----------------------");
    }

    /**
     * Mengubah jumlah SKS mata kuliah.
     *
     * @param sksBaru Nilai SKS yang baru
     */
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sks);
    }

    /**
     * Menambah jam pertemuan mata kuliah.
     *
     * @param jam Jumlah jam yang ditambahkan
     */
    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jam ditambah. Total jam: " + jumlahJam);
    }

    /**
     * Mengurangi jam pertemuan mata kuliah.
     * Pengurangan hanya dilakukan apabila sisa jam mencukupi.
     *
     * @param jam Jumlah jam yang dikurangi
     */
    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jam dikurangi. Total jam: " + jumlahJam);
        } else {
            System.out.println("Pengurangan gagal. Jam tidak cukup.");
        }
    }
}