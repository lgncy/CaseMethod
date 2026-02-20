package Jobsheet2;

public class DosenMain {
    public static void main(String[] args) {

        // buat objek pakai konstruktor default, data diisi manual
        Dosen d1 = new Dosen();
        d1.idDosen = "D01";
        d1.nama = "Pak Andi";
        d1.statusAktif = true;
        d1.tahunBergabung = 2018;
        d1.bidangKeahlian = "AI";

        d1.tampilInformasi();
        System.out.println("Masa kerja: " + d1.hitungMasaKerja(2026) + " tahun");
        System.out.println();

        // buat objek pakai konstruktor berparameter
        Dosen d2 = new Dosen("D02", "Bu Sari", false, 2015, "Jaringan");

        d2.tampilInformasi();

        // ubah status dan keahlian, lalu tampilkan lagi
        d2.setStatusAktif(true);
        d2.ubahKeahlian("Cloud Computing");
        d2.tampilInformasi();
    }
}