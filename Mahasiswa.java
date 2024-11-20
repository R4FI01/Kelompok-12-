public class Mahasiswa {
    private String nama;
    private String npm;
    private String jurusan;
    private String fakultas;
    private double ukt;
    private KHS khs;

    public Mahasiswa(String nama, String npm, String jurusan, String fakultas, double ukt) {
        this.nama = nama;
        this.npm = npm;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.ukt = ukt;
        this.khs = new KHS();
    }

    public void tambahMatakuliah(Matakuliah matakuliah, double nilai) {
        khs.tambahMatakuliah(matakuliah, nilai);
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NPM: " + npm);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Fakultas: " + fakultas);
        System.out.println("UKT: Rp " + ukt);
        khs.tampilkanKHS();
    }
}
