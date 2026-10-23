package Jobsheet6.Tugas;

public class TiketInternasional extends TiketPesawat {
    private String nomorPaspor;
    private int asuransi;

    public TiketInternasional() {
    }

    public TiketInternasional(String kodeTiket, String namaPenumpang, String rute, int hargaDasar,
            String maskapai, int beratBagasi, int biayaBagasi, String nomorPaspor, int asuransi) {
        super(kodeTiket, namaPenumpang, rute, hargaDasar, maskapai, beratBagasi, biayaBagasi);
        this.nomorPaspor = nomorPaspor;
        this.asuransi = asuransi;
    }

    public void tampilTiketInternasional() {
        System.out.println("==================== Tiket Pesawat Internasional ====================");
        super.tampilTiketPesawat();
        System.out.println("Nomor Paspor = " + nomorPaspor);
        System.out.println("Asuransi = " + asuransi);
        System.out.println("Total Bayar = " + (hargaDasar + biayaBagasi + asuransi));
        System.out.println("=======================================================================");
    }
}
