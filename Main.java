package ui;

import domain.Mahasiswa;
import domain.MataKuliah;
import domain.MahasiswaKelasMalam;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswaBiasa = new Mahasiswa(
                "Rafi", "06.2023.1.07701",
                "Teknik Informatika", "FTETI", 7500000.0
        );

        Mahasiswa mahasiswaKelasMalam = new MahasiswaKelasMalam(
                "Ricko", "06.2023.1.07675",
                "Teknik Informatika", "FTETI", 8500000.0
        );

        MataKuliah matkul1 = new MataKuliah("PBO", 3);
        MataKuliah matkul2 = new MataKuliah("Sistem Operasi", 3);
        MataKuliah matkul3 = new MataKuliah("Grafika Komputer", 3);

        mahasiswaBiasa.tambahMatakuliahKeKRS(matkul1);
        mahasiswaBiasa.tambahMatakuliahKeKRS(matkul2);
        mahasiswaBiasa.tambahMatakuliahKeKRS(matkul3);

        mahasiswaKelasMalam.tambahMatakuliahKeKRS(matkul1);
        mahasiswaKelasMalam.tambahMatakuliahKeKRS(matkul2);
        mahasiswaKelasMalam.tambahMatakuliahKeKRS(matkul3);

        System.out.println("=== Informasi Mahasiswa Biasa ===");
        mahasiswaBiasa.tampilkanInfo();

        System.out.println("\n===  KHS (Mahasiswa Biasa) ===");
        mahasiswaBiasa.salinKRSToKHS(new double[]{85, 98, 90});
        mahasiswaBiasa.tampilkanInfo();

        System.out.println("\n=== Informasi Mahasiswa Kelas Malam ===");
        mahasiswaKelasMalam.tampilkanInfo();

        System.out.println("\n===  KHS (Mahasiswa Kelas Malam) ===");
        mahasiswaKelasMalam.salinKRSToKHS(new double[]{85, 89, 92});
        mahasiswaKelasMalam.tampilkanInfo();
    }
}
