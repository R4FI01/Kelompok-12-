package domain;

public class Nilai {
    private double tugas;
    private double uts;
    private double uas;
    private double kehadiran;

    public Nilai(double tugas, double uts, double uas, double kehadiran) {
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
        this.kehadiran = kehadiran;
    }

    public double hitungNilaiAkhir() {
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.3) + (kehadiran * 0.1);
    }

    public String getGrade() {
        double nilaiAkhir = hitungNilaiAkhir();
        if (nilaiAkhir >= 85) return "A";
        else if (nilaiAkhir >= 70) return "B";
        else if (nilaiAkhir >= 55) return "C";
        else if (nilaiAkhir >= 40) return "D";
        else return "E";
    }

    public String getTugas() {
        return null;
    }

    public String getUTS() {
        return null;
    }

    public String getUAS() {
        return null;
    }

    public String getKehadiran() {
        return null;
    }
}