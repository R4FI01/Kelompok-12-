package domain;
import java.util.*;

public class SistemInformasi {
    private Mahasiswa mahasiswa;
    private Keuangan keuangan;
    private List<MataKuliah> krs = new ArrayList<>();
    private Map<MataKuliah, Nilai> nilaiMap = new HashMap<>();

    public SistemInformasi(Mahasiswa mahasiswa, double totalTagihan) {
        this.mahasiswa = mahasiswa;
        this.keuangan = new Keuangan(totalTagihan);
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public Keuangan getKeuangan() {
        return keuangan;
    }

    public List<MataKuliah> getKRS() {
        return krs;
    }

    public void isiKRS(MataKuliah matkul) {
        if (!krs.contains(matkul)) {
            krs.add(matkul);
            System.out.println("Mata kuliah " + matkul.getNama() + " berhasil ditambahkan ke KRS.");
        } else {
            System.out.println("Mata kuliah " + matkul.getNama() + " sudah ada di KRS.");
        }
    }

    public void hapusKRS(MataKuliah matkul) {
        if (krs.remove(matkul)) {
            System.out.println("Mata kuliah " + matkul.getNama() + " berhasil dihapus dari KRS.");
        } else {
            System.out.println("Mata kuliah " + matkul.getNama() + " tidak ditemukan di KRS.");
        }
    }

    public void tambahNilai(MataKuliah matkul, Nilai nilai) {
        nilaiMap.put(matkul, nilai);
    }

    public void tampilkanKRS() {
        System.out.println("\nKRS Mahasiswa:");
        for (MataKuliah matkul : krs) {
            System.out.println("- " + matkul.getDetailMatkul());
        }
    }

    public void tampilkanKHS() {
        if (krs.isEmpty()) {
            System.out.println("\nKHS Mahasiswa:\nBelum ada mata kuliah yang diambil.");
            return;
        }
        System.out.println("\nKHS Mahasiswa:");
        for (MataKuliah matkul : krs) {
            Nilai nilai = nilaiMap.get(matkul);
            if (nilai != null) {
                System.out.println("- " + matkul.getNama() + ": " + nilai.hitungNilaiAkhir());
            } else {
                System.out.println("- " + matkul.getNama() + ": Belum ada nilai.");
            }
        }
        System.out.println("IPK: " + hitungIPK());
    }

    public double hitungIPK() {
        double totalNilai = 0;
        int totalSKS = 0;

        for (MataKuliah matkul : krs) {
            Nilai nilai = nilaiMap.get(matkul);
            if (nilai != null) {
                totalNilai += nilai.hitungNilaiAkhir() * matkul.getSks();
                totalSKS += matkul.getSks();
            }
        }
        return (totalSKS > 0) ? (totalNilai / totalSKS) : 0.0;
    }
}
