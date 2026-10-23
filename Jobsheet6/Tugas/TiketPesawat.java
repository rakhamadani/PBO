package Jobsheet6.Tugas;

public class TiketPesawat extends Tiket {
    protected String maskapai;
    protected int beratBagasi;
    protected int biayaBagasi;

    public TiketPesawat() {
    }

    public TiketPesawat(String kodeTiket, String namaPenumpang, String rute, int hargaDasar,
            String maskapai, int beratBagasi, int biayaBagasi) {
        super(kodeTiket, namaPenumpang, rute, hargaDasar);
        this.maskapai = maskapai;
        this.beratBagasi = beratBagasi;
        this.biayaBagasi = biayaBagasi;
    }

    public void tampilTiketPesawat() {
        super.tampilTiket();
        System.out.println("Maskapai = " + maskapai);
        System.out.println("Berat Bagasi = " + beratBagasi + " kg");
        System.out.println("Biaya Bagasi = " + biayaBagasi);
    }
}
