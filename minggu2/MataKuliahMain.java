package Jobsheet2;

public class MataKuliahMain {
    public static void main(String[] args) {

        // buat objek pakai konstruktor default, data diisi manual
        MataKuliah mk1 = new MataKuliah();
        mk1.kodeMK = "IF101";
        mk1.nama = "Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 4;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        System.out.println();

        // buat objek pakai konstruktor berparameter
        MataKuliah mk2 = new MataKuliah("IF102", "Basis Data", 3, 5);

        mk2.tampilInformasi();
        mk2.tambahJam(1);
        mk2.kurangiJam(10); // coba kurangi melebihi batas, harusnya gagal
    }
}