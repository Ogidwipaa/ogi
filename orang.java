package uts;

public class orang {
    protected String nama;

    public orang(String nama) {
        this.nama = nama;
    }

    public String getInfo() {
        return "Nama: " + nama;
    }
}