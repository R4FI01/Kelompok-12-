public class Main {
        public static void main(String[] args) {
            Mahasiswa mahasiswa = new Mahasiswa("Rafi", "06.2023.1.07701", "Teknik Informatika", "FTETI");

            MataKuliah mataKuliah = new MataKuliah("Pemrograman", 3);
            MataKuliah mataKuliah1 = new MataKuliah("Sistem Operasi", 3);
            MataKuliah mataKuliah2 = new MataKuliah("Struktur Data", 3);

            KHS khs = new KHS(87);
            KHS khs1 = new KHS(90);
            KHS khs2 = new KHS(88);
            KHS khs3 = new KHS(mahasiswa, 3.75);

            System.out.println("Nama Mahasiswa: " + mahasiswa.Nama);
            System.out.println("NPM: " + mahasiswa.NPM);
            System.out.println("Jurusan: " + mahasiswa.Jurusan);
            System.out.println("Fakultas: " + mahasiswa.Fakultas);

            System.out.println("\nDaftar Mata Kuliah yang Diambil:");
            System.out.println("Nama Mata Kuliah: " + mataKuliah.Nama + ", SKS: " + mataKuliah.sks);
            System.out.println("Nilai : " + khs.Nilai);
            System.out.println("Nama Mata Kuliah: " + mataKuliah1.Nama + ", SKS: " + mataKuliah1.sks);
            System.out.println("Nilai : " + khs1.Nilai);
            System.out.println("Nama Mata Kuliah: " + mataKuliah2.Nama + ", SKS: " + mataKuliah2.sks);
            System.out.println("Nilai : " + khs2.Nilai);

            System.out.println("\nIPK: " + khs3.IPK);
        }
}