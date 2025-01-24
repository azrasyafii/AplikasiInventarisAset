






public class Barang {
    private String id;
    private String namaBarang;
    private int jumlah;
    private double harga;

    public Barang(String id, String namaBarang, int jumlah, double harga) {
        this.id = id;
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    // Getter dan Setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNamaBarang() { return namaBarang; }
    public void setNamaBarang(String namaBarang) { this.namaBarang = namaBarang; }
    public int getJumlah() { return jumlah; }
    public void setJumlah(int jumlah) { this.jumlah = jumlah; }
    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }
}

