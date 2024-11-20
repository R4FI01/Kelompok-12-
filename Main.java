public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa(
                "Rafi", "06.2023.1.07701",
                "Teknik Informatika", "FTETI", 7500000.00
        );

        Mahasiswa mahasiswaMalam = new MahasiswaKelasMalam(
                "Ricko", "06.2023.1.07675",
                "Teknik Informatika", "FTETI", 8500000.00
        );

        Matakuliah mataKuliah1 = new Matakuliah("PBO", 3);
        Matakuliah mataKuliah2 = new Matakuliah("Sistem Operasi", 3);
        Matakuliah mataKuliah3 = new Matakuliah("Grafika Komputer", 3);

        mahasiswa.tambahMatakuliah(mataKuliah1, 85.0);
        mahasiswa.tambahMatakuliah(mataKuliah2, 78.0);
        mahasiswa.tambahMatakuliah(mataKuliah3, 92.0);

        mahasiswaMalam.tambahMatakuliah(mataKuliah1, 65.0);
        mahasiswaMalam.tambahMatakuliah(mataKuliah2, 58.0);
        mahasiswaMalam.tambahMatakuliah(mataKuliah3, 72.0);

        System.out.println("=== Informasi Mahasiswa Reguler ===");
        mahasiswa.tampilkanInfo();

        System.out.println("\n=== Informasi Mahasiswa Kelas Malam ===");
        mahasiswaMalam.tampilkanInfo();
    }
}
