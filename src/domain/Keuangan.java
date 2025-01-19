package domain;

public class Keuangan {
    private double totalTagihan;
    private double totalPembayaran;

    public Keuangan(double totalTagihan) {
        this.totalTagihan = totalTagihan;
        this.totalPembayaran = 0;
    }

    public void bayar(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah pembayaran harus lebih dari 0.");
            return;
        }

        if (jumlah + totalPembayaran > totalTagihan) {
            System.out.println("Jumlah pembayaran melebihi tagihan.");
        } else {
            totalPembayaran += jumlah;
            System.out.println("Pembayaran sebesar " + jumlah + " berhasil.");
        }
    }

    public void tampilkanStatusKeuangan() {
        double sisaTagihan = totalTagihan - totalPembayaran;
        System.out.println("Total Tagihan: " + totalTagihan);
        System.out.println("Total Pembayaran: " + totalPembayaran);
        System.out.println("Sisa Tagihan: " + sisaTagihan);
    }
}
