package domain;

public class MataKuliah {
    private String namaMatkul;
    protected int sks;
    private String jadwal;
    private int kapasitas;
    private int semester;
    private Dosen dosen;

    public MataKuliah(String namaMatkul, int sks, String jadwal, int kapasitas, int semester, Dosen dosen) {
        this.namaMatkul = namaMatkul;
        this.sks = sks;
        this.jadwal = jadwal;
        this.kapasitas = kapasitas;
        this.semester = semester;
        this.dosen = dosen;
    }

    public String getDetailMatkul() {
        return "Nama Matkul: " + namaMatkul + ", SKS: " + sks + ", Jadwal: " + jadwal + ", Kapasitas: " + kapasitas + ", Semester: " + semester + "\n" + dosen.getDetailDosen();
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public int getSks() {
        return sks;
    }

    public String getNama() {
        return namaMatkul;
    }
}