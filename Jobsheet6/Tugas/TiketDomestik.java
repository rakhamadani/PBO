package Jobsheet6.Tugas;

public class TiketDomestik extends TiketPesawat {
    private int pajakBandara;

    public TiketDomestik() {
    }

    public TiketDomestik(String kodeTiket, String namaPenumpang, String rute, int hargaDasar,
            String maskapai, int beratBagasi, int biayaBagasi, int pajakBandara) {
        super(kodeTiket, namaPenumpang, rute, hargaDasar, maskapai, beratBagasi, biayaBagasi);
        this.pajakBandara = pajakBandara;
    }

    public void tampilTiketDomestik() {
        System.out.println("==================== Tiket Pesawat Domestik ====================");
        super.tampilTiketPesawat();
        System.out.println("Pajak Bandara = " + pajakBandara);
        System.out.println("Total Bayar = " + (hargaDasar + biayaBagasi + pajakBandara));
        System.out.println("===============================================================");
    }
}
