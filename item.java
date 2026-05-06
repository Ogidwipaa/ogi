package uts;

public class item {
    int id;
    String namaBarang;
   int harga;

    item(int id, String namaBarang, int harga) {
        this.id = id;
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getHarga() {
        return harga;
    }
}