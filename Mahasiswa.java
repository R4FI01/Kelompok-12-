import java.util.ArrayList;

public class Mahasiswa {
    protected String Nama;
    protected String NPM;
    protected String Jurusan;
    protected String Fakultas;
    private ArrayList<Matakuliah> daftarMatakuliah;
    private KHS khs;
    private double UKT; // Atribut UKT

    public Mahasiswa(String Nama, String NPM, String Jurusan, String Fakultas, double UKT) {
        this.Nama = Nama;
        this.NPM = NPM;
        this.Jurusan = Jurusan;
        this.Fakultas = Fakultas;
        this.UKT = UKT;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void tambahMatakuliah(Matakuliah mataKuliah) {
        daftarMatakuliah.add(mataKuliah);
    }

    public void tampilkanDaftarMatakuliah() {
        System.out.println("Daftar Mata Kuliah yang Diambil oleh " + Nama + ":");
        for (Matakuliah matakuliah : daftarMatakuliah) {
            System.out.println("  - " + matakuliah.getNama() + ", SKS: " + matakuliah.getSks());
        }
    }

    public void setKHS(KHS khs) {
        this.khs = khs;
    }

    public double getIPK() {
        return khs != null ? khs.getIPK() : 0.0;
    }

    public double getUKT() {
        return UKT;
    }

    public void setUKT(double UKT) {
        this.UKT = UKT;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Mahasiswa: " + Nama);
        System.out.println("NPM: " + NPM);
        System.out.println("Jurusan: " + Jurusan);
        System.out.println("Fakultas: " + Fakultas);
        System.out.println("UKT: " + UKT);
        tampilkanDaftarMatakuliah();
        System.out.println("IPK: " + getIPK());
    }
}
