import java.util.ArrayList;
import java.util.HashMap;

public class KHS {
    private ArrayList<Matakuliah> daftarMatakuliah;
    private HashMap<Matakuliah, Double> nilaiMatakuliah;
    private double ipk;

    public KHS() {
        this.daftarMatakuliah = new ArrayList<>();
        this.nilaiMatakuliah = new HashMap<>();
        this.ipk = 0.0;
    }

    public void tambahMatakuliah(Matakuliah matakuliah, double nilai) {
        daftarMatakuliah.add(matakuliah);
        nilaiMatakuliah.put(matakuliah, nilai);
        hitungIPK();
    }

    private void hitungIPK() {
        if (daftarMatakuliah.isEmpty()) {
            this.ipk = 0.0;
            return;
        }

        double totalBobot = 0.0;
        int totalSKS = 0;

        for (Matakuliah matkul : daftarMatakuliah) {
            double nilai = nilaiMatakuliah.get(matkul);
            double bobot = konversiKeBobot(nilai);
            totalBobot += bobot * matkul.getSks();
            totalSKS += matkul.getSks();
        }

        this.ipk = totalBobot / totalSKS;
    }

    private double konversiKeBobot(double nilai) {
        if (nilai >= 85) return 4.0; // A
        if (nilai >= 80) return 3.7; // A-
        if (nilai >= 75) return 3.3; // B+
        if (nilai >= 70) return 3.0; // B
        if (nilai >= 65) return 2.7; // B-
        if (nilai >= 60) return 2.3; // C+
        if (nilai >= 55) return 2.0; // C
        if (nilai >= 40) return 1.0; // D
        return 0.0;                   // E
    }

    private String konversiKeHuruf(double nilai) {
        if (nilai >= 85) return "A";
        if (nilai >= 80) return "A-";
        if (nilai >= 75) return "B+";
        if (nilai >= 70) return "B";
        if (nilai >= 65) return "B-";
        if (nilai >= 60) return "C+";
        if (nilai >= 55) return "C";
        if (nilai >= 40) return "D";
        return "E";
    }

    public double getIpk() {
        return ipk;
    }

    public void tampilkanKHS() {
        System.out.println("Daftar Mata Kuliah dan Nilai:");
        for (Matakuliah matkul : daftarMatakuliah) {
            double nilai = nilaiMatakuliah.get(matkul);
            String huruf = konversiKeHuruf(nilai);
            System.out.println(matkul.getNama() + " - SKS: " + matkul.getSks() + " - Nilai: " + nilai + " (" + huruf + ")");
        }
        System.out.printf("IPK: %.2f%n", ipk);
    }
}
