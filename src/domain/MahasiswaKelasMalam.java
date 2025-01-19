package domain;

public class MahasiswaKelasMalam extends Mahasiswa {
    public MahasiswaKelasMalam(String nama, String npm, String jurusan, String fakultas) {
        super(nama, npm, jurusan, fakultas);
    }

    @Override
    public String getJenisMahasiswa() {
        return "Mahasiswa Kelas Malam (Dapat kuliah daring)";
    }
}

