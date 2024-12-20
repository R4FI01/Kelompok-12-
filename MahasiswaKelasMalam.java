package domain;

public class MahasiswaKelasMalam extends Mahasiswa {

    public MahasiswaKelasMalam(String nama, String npm, String jurusan, String fakultas, double ukt) {
        super(nama, npm, jurusan, fakultas, ukt);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + " (Kelas Malam)");
        System.out.println("NPM: " + npm);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Fakultas: " + fakultas);
        System.out.println("UKT: Rp " + ukt);
        krs.tampilkanKRS();
        khs.tampilkanKHS();
    }
}
