package domain;

public class Dosen {
    private String nama;
    private String nip;

    public Dosen(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    public String getDetailDosen() {
        return "Dosen: " + nama + " (nip: " + nip + ")";
    }
}