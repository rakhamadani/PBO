package Jobsheet6.Tugas;

public class TiketKereta extends Tiket {
    private int nomorGerbong;
    private String nomorKursi;

    public TiketKereta() {
    }

    public TiketKereta(String kodeTiket, String namaPenumpang, String rute, int hargaDasar,
            int nomorGerbong, String nomorKursi) {
        super(kodeTiket, namaPenumpang, rute, hargaDasar);
        this.nomorGerbong = nomorGerbong;
        this.nomorKursi = nomorKursi;
    }

    public void tampilTiketKereta() {
        System.out.println("==================== Tiket Kereta ====================");
        super.tampilTiket();
        System.out.println("Nomor Gerbong = " + nomorGerbong);
        System.out.println("Nomor Kursi = " + nomorKursi);
        System.out.println("Total Bayar = " + hargaDasar);
        System.out.println("=========================================================");
    }
}
