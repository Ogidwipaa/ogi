package uts;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Data barang
        item item1 = new item(1, "Laptop", 20000000);
        item item2 = new item(2, "Mouse", 150000);
        item item3 = new item(3, "Keyboard", 300000);

        int total = 0;
        String daftarBelanja = "";
        int pilihan;

        // Data customer
        String nama = "Ogi";
        String email = "ogidwipa@gmail.com";

        // Data kasir
        String namaKasir = "Admin";

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan Barang");
            System.out.println("2. Tambah Barang");
            System.out.println("3. Bayar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.println("\n=== DAFTAR BARANG ===");
                    System.out.println("1. Laptop - 20000000");
                    System.out.println("2. Mouse - 150000");
                    System.out.println("3. Keyboard - 300000");
                    break;

                case 2:
                    System.out.print("Masukkan ID barang: ");
                    int id = input.nextInt();

                    System.out.print("Masukkan jumlah: ");
                    int jumlah = input.nextInt();

                    item barangDipilih = null;

                    switch (id) {
                        case 1:
                            barangDipilih = item1;
                            break;
                        case 2:
                            barangDipilih = item2;
                            break;
                        case 3:
                            barangDipilih = item3;
                            break;
                        default:
                            System.out.println("ID tidak ditemukan!");
                    }

                    if (barangDipilih != null) {
                        int subtotal = barangDipilih.getHarga() * jumlah;
                        total += subtotal;

                        daftarBelanja += barangDipilih.getNamaBarang()
                                + " x" + jumlah
                                + " = " + subtotal + "\n";

                        System.out.println("Barang ditambahkan!");
                    }
                    break;

                case 3:
                    System.out.println("\n=== STRUK ===");
                    System.out.println(daftarBelanja);
                    System.out.println("Total: " + total);

                    System.out.print("Uang bayar: ");
                    int bayar = input.nextInt();

                    int kembalian = bayar - total;

                    System.out.println("Bayar: " + bayar);
                    System.out.println("Kembalian: " + kembalian);

                    // DATA PEMBELI
                    System.out.println("\n=== DATA PEMBELI ===");
                    System.out.println("Nama   : " + nama);
                    System.out.println("Email  : " + email);
                    System.out.println("Tanggal: " + LocalDate.now());

                    // DATA KASIR
                    System.out.println("\n=== DATA KASIR ===");
                    System.out.println("Nama Kasir : " + namaKasir);
            
                    System.out.println("\nTerima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 3);
    }
}