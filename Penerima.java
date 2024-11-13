public class Penerima {
    private String nama;
    private double zakatDiterima;

    public Penerima(String nama, double zakatDiterima) {
        this.nama = nama;
        this.zakatDiterima = zakatDiterima;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getZakatDiterima() {
        return zakatDiterima;
    }

    public void setZakatDiterima(double zakatDiterima) {
        this.zakatDiterima = zakatDiterima;
    }
}