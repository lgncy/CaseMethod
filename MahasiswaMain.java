package Jobsheet2;

public class MahasiswaMain {
    public static void main(String[] args) {

        // buat objek pakai konstruktor default, data diisi manual
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = "123";
        mhs1.nama = "Wildan";
        mhs1.kelas = "TI-1A";
        mhs1.updateIpk(3.6);

        mhs1.tampilkanInformasi();

        // coba ubah kelas dan update IPK
        mhs1.ubahKelas("TI-1B");
        mhs1.updateIpk(3.2);
        mhs1.tampilkanInformasi();

        // buat objek pakai konstruktor berparameter
        Mahasiswa mhs2 = new Mahasiswa("456", "Budi", "TI-2A", 3.9);

        mhs2.tampilkanInformasi();
    }
}