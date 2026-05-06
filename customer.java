package uts;

public class customer extends orang {
    private String email;
    private String alamat;

    public customer(String nama, String email, String alamat) {
        super(nama);
        this.email = email;
        this.alamat = alamat;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nEmail: " + email +
                "\nAlamat: " + alamat;
    }
}