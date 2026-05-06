package uts;

public class payment {
    double totalHarga;
    double jumlahBayar;

    public payment(double totalHarga, double jumlahBayar) {
        this.totalHarga = totalHarga;
        this.jumlahBayar = jumlahBayar;
    }

    public double hitungKembalian() {
        return jumlahBayar - totalHarga;
    }
}