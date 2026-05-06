package uts;

import java.text.NumberFormat;
import java.util.Locale;

public class struk {
    pesanan pesanan;
    payment payment;

    public struk(pesanan pesanan, payment payment) {
        this.pesanan = pesanan;
        this.payment = payment;
    }

    public void cetakStruk() {
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        System.out.println("\n===== STRUK PEMBELIAN =====");
        System.out.println("ID Barang   : " + pesanan.idBarang);
        System.out.println("Nama Barang : " + pesanan.item.namaBarang);
        System.out.println("Jumlah      : " + pesanan.jumlah);
        System.out.println("Total Harga : " + rupiah.format(pesanan.getTotal()));
        System.out.println("Dibayar     : " + rupiah.format(payment.jumlahBayar));
        System.out.println("Kembalian   : " + rupiah.format(payment.hitungKembalian()));
        System.out.println("===========================");
    }
}