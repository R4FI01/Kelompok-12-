package domain;


public abstract class Mahasiswa {
    public String nama;
    protected String npm;
    protected String jurusan;
    protected String fakultas;

    public Mahasiswa(String nama, String npm, String jurusan, String fakultas) {
        this.nama = nama;
        this.npm = npm;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
    }

    public String getProfil() {
        return "Nama: " + nama + "\nNPM: " + npm + "\nJurusan: " + jurusan + "\nFakultas: " + fakultas;
    }

    public abstract String getJenisMahasiswa();

    public Object getNama() {
        return null;
    }
}