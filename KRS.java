package domain;

import java.util.ArrayList;

public class KRS {
    private ArrayList<MataKuliah> daftarMatakuliah;

    public KRS() {
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void tambahMatakuliah(MataKuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }

    public ArrayList<MataKuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }

    public void tampilkanKRS() {
        System.out.println("Daftar Mata Kuliah di KRS:");
        for (MataKuliah matkul : daftarMatakuliah) {
            System.out.println(matkul.getNama() + " - SKS: " + matkul.getSks());
        }
    }
}
