package Jobsheet2;

/**
 * Kelas Dosen merepresentasikan data dan perilaku seorang dosen.
 * Menyimpan informasi identitas, status keaktifan, tahun bergabung,
 * dan bidang keahlian dosen.
 */
public class Dosen {

    /** ID unik dosen (contoh: "D01") */
    String idDosen;

    /** Nama lengkap dosen */
    String nama;

    /** Status keaktifan dosen (true = aktif, false = tidak aktif) */
    boolean statusAktif;

    /** Tahun dosen bergabung dengan institusi */
    int tahunBergabung;

    /** Bidang keahlian utama dosen */
    String bidangKeahlian;

    /**
     * Konstruktor default — membuat objek Dosen tanpa nilai awal.
     * Nilai atribut diisi secara manual setelah objek dibuat.
     */
    Dosen() {
    }

    /**
     * Konstruktor berparameter — membuat objek Dosen dengan nilai awal.
     *
     * @param idDosen        ID unik dosen
     * @param nama           Nama lengkap dosen
     * @param statusAktif    Status keaktifan dosen
     * @param tahunBergabung Tahun bergabung dosen
     * @param bidangKeahlian Bidang keahlian dosen
     */
    Dosen(String idDosen, String nama, boolean statusAktif,
            int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    /**
     * Menampilkan seluruh informasi dosen ke konsol.
     */
    void tampilInformasi() {
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama     : " + nama);
        System.out.println("Aktif    : " + statusAktif);
        System.out.println("Gabung   : " + tahunBergabung);
        System.out.println("Keahlian : " + bidangKeahlian);
        System.out.println("----------------------");
    }

    /**
     * Mengubah status keaktifan dosen.
     *
     * @param status Status baru (true = aktif, false = tidak aktif)
     */
    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    /**
     * Menghitung masa kerja dosen berdasarkan tahun sekarang.
     *
     * @param tahunSekarang Tahun saat ini
     * @return Jumlah tahun masa kerja
     */
    int hitungMasaKerja(int tahunSekarang) {
        return tahunSekarang - tahunBergabung;
    }

    /**
     * Mengubah bidang keahlian dosen.
     *
     * @param bidang Bidang keahlian baru
     */
    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}