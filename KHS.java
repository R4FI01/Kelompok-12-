public class KHS {
        Mahasiswa mahasiswa;
        int Nilai;
        double IPK;

        public KHS(int Nilai) {
            this.Nilai = Nilai;
        }

        public KHS (Mahasiswa mahasiswa, double IPK) {
            this.mahasiswa = mahasiswa;
            this.IPK = IPK;
        }
}