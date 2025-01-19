package domain;

public class MahasiswaReguler extends Mahasiswa {
    public MahasiswaReguler(String nama, String npm, String jurusan, String fakultas) {
        super(nama, npm, jurusan, fakultas);
    }

    @Override
    public String getJenisMahasiswa() {
        return "Mahasiswa Reguler";
    }
}

