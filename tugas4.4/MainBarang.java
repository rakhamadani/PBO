public class MainBarang {
    public static void main(String[] args) {
        Barang2 b = new Barang2();
        b.kode = "Barang 01";
        b.namaBarang = "Sepatu";
        b.hargaDasar = 200000;
        b.diskon = 15; // 15%

        b.tampilData();
    }
}