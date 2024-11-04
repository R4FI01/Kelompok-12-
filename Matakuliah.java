import java.util.ArrayList;
public class Matakuliah {
    protected String Nama;
    protected int sks;
    private ArrayList<Matakuliah> daftarMatakuliah;

    public Matakuliah(String Nama, int sks ){
        this.Nama = Nama;
        this.sks = sks;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public String getNama() {
        return Nama;
    }

    public int getSks() {
        return sks;
    }

    public void tampilkanDaftarMatakuliah() {
        System.out.println("Daftar Matakuliah :");
        for (Matakuliah matakuliah : daftarMatakuliah) {
            System.out.println(matakuliah.getNama());
        }
    }
}
