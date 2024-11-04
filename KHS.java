public class KHS {
    protected Mahasiswa mahasiswa;
    protected int Nilai;
    protected double IPK;

    public KHS(int Nilai) {
        this.Nilai = Nilai;
    }

    public KHS(Mahasiswa mahasiswa, double IPK) {
        this.mahasiswa = mahasiswa;
        this.IPK = IPK;
    }

    public double getIPK() {
        return IPK;
    }
}
