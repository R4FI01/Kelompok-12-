public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa(
                "Rafi", "06.2023.1.07701",
                "Teknik Informatika", "FTETI", 6.0000000
        );

        Mahasiswa mahasiswaMalam = new MahasiswaKelasMalam(
                "Ricko", "06.2023.1.07675",
                "Teknik Informatika", "FTETI",6.5000000

        );

        Matakuliah mataKuliah1 = new Matakuliah("PBO", 3);
        Matakuliah mataKuliah2 = new Matakuliah("Sistem Operasi", 3);
        Matakuliah mataKuliah3 = new Matakuliah("Grafika Komputer", 3);
        Matakuliah matakuliah4 = new Matakuliah("Perancangan dan Analisis Algoritma",3);
        Matakuliah matakuliah5 = new Matakuliah("Ananlisi Perancanga Sistem",3);
        Matakuliah matakuliah6 = new Matakuliah("Komputasi Numerik",3);
        Matakuliah matakuliah7 = new Matakuliah("Praktikum PBO",3);
        Matakuliah matakuliah8 = new Matakuliah("Praktikum Sistem Operasi",3);

        mahasiswa.tambahMatakuliah(mataKuliah1);
        mahasiswa.tambahMatakuliah(mataKuliah2);
        mahasiswa.tambahMatakuliah(mataKuliah3);
        mahasiswa.tambahMatakuliah(matakuliah4);
        mahasiswa.tambahMatakuliah(matakuliah5);
        mahasiswa.tambahMatakuliah(matakuliah6);
        mahasiswa.tambahMatakuliah(matakuliah7);
        mahasiswa.tambahMatakuliah(matakuliah8);

        mahasiswaMalam.tambahMatakuliah(mataKuliah1);
        mahasiswaMalam.tambahMatakuliah(mataKuliah2);
        mahasiswaMalam.tambahMatakuliah(mataKuliah3);
        mahasiswaMalam.tambahMatakuliah(matakuliah4);
        mahasiswaMalam.tambahMatakuliah(matakuliah5);
        mahasiswaMalam.tambahMatakuliah(matakuliah6);
        mahasiswaMalam.tambahMatakuliah(matakuliah7);
        mahasiswaMalam.tambahMatakuliah(matakuliah8);

        KHS khsRafi = new KHS(mahasiswa, 3.75);
        KHS khsRicko = new KHS(mahasiswaMalam, 3.65);

        mahasiswa.setKHS(khsRafi);
        mahasiswaMalam.setKHS(khsRicko);

        System.out.println("=== Informasi Mahasiswa Reguler ===");
        mahasiswa.tampilkanInfo();

        System.out.println("\n=== Informasi Mahasiswa Kelas Malam ===");
        mahasiswaMalam.tampilkanInfo();
    }
}
