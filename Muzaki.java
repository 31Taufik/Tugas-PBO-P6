public class Muzaki {
    private String nama;
    private double jumlahUang;

    public Muzaki(String nama, double jumlahUang) {
        this.nama = nama;
        this.jumlahUang = jumlahUang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getJumlahUang() {
        return jumlahUang;
    }

    public void setJumlahUang(double jumlahUang) {
        this.jumlahUang = jumlahUang;
    }

    public double hitungZakat() {
        if (jumlahUang >= 6859394) {
            return jumlahUang * 0.025;
        } else {
            return 0;
        }
    }
}
