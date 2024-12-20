package domain;

import java.util.ArrayList;

public class Mahasiswa {
    protected String nama;
    protected String npm;
    protected String jurusan;
    protected String fakultas;
    protected double ukt;
    protected KRS krs;
    protected KHS khs;

    public Mahasiswa(String nama, String npm, String jurusan, String fakultas, double ukt) {
        this.nama = nama;
        this.npm = npm;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.ukt = ukt;
        this.krs = new KRS();
        this.khs = new KHS();
    }

    public void tambahMatakuliahKeKRS(MataKuliah matakuliah) {
        krs.tambahMatakuliah(matakuliah);
    }

    public void salinKRSToKHS(double[] nilai) {
        ArrayList<MataKuliah> daftarMatakuliah = krs.getDaftarMatakuliah();
        for (int i = 0; i < daftarMatakuliah.size(); i++) {
            khs.tambahMatakuliah(daftarMatakuliah.get(i), nilai[i]);
        }
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NPM: " + npm);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Fakultas: " + fakultas);
        System.out.println("UKT: Rp " + ukt);
        krs.tampilkanKRS();
        khs.tampilkanKHS();
    }
}
