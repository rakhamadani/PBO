public class Barang2 {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon; // Nilai diskon dalam % (misal: 10 untuk 10%)

    // Method untuk menghitung harga jual
    public int hitungHargaJual() {
        return (int) (hargaDasar - ((diskon / 100) * hargaDasar));
    }

    // Method untuk menampilkan data barang
    public void tampilData() {
        System.out.println("Kode Barang  : " + kode);
        System.out.println("Nama Barang  : " + namaBarang);
        System.out.println("Harga Dasar  : Rp " + hargaDasar);
        System.out.println("Diskon       : " + diskon + "%");
        System.out.println("Harga Jual   : Rp " + hitungHargaJual());
    }
}