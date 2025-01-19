package domain;

public class MahasiswaPortal {
    private String nama;
    private String npm;
    private String email;
    private String password;
    private SistemInformasi sistemInformasi;

    public MahasiswaPortal(String nama, String npm, String email, String password, SistemInformasi sistemInformasi) {
        this.nama = nama;
        this.npm = npm;
        this.email = email;
        this.password = password;
        this.sistemInformasi = sistemInformasi;
    }

    public boolean validateLogin(String inputEmail, String inputPassword) {
        if (email == null || password == null) {
            return false;
        }
        return email.equals(inputEmail) && password.equals(inputPassword);
    }

    public SistemInformasi getSistemInformasi() {
        return sistemInformasi;
    }
}
