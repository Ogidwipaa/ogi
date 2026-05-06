package uts;

public class pesanan {
    int idBarang;
    item item;
    int jumlah;

    public pesanan(int idBarang, item item, int jumlah) {
        this.idBarang = idBarang;
        this.item = item;
        this.jumlah = jumlah;
    }

    public double getTotal() {
        return item.harga * jumlah;
    }
}