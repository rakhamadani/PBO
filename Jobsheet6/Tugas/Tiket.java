package Jobsheet6.Tugas;

public class Tiket {
    protected String kodeTiket;
    protected String namaPenumpang;
    protected String rute;
    protected int hargaDasar;

    public Tiket() {
    }

    public Tiket(String kodeTiket, String namaPenumpang, String rute, int hargaDasar) {
        this.kodeTiket = kodeTiket;
        this.namaPenumpang = namaPenumpang;
        this.rute = rute;
        this.hargaDasar = hargaDasar;
    }

    public void tampilTiket() {
        System.out.println("Kode Tiket = " + kodeTiket);
        System.out.println("Nama Penumpang = " + namaPenumpang);
        System.out.println("Rute = " + rute);
        System.out.println("Harga Dasar = " + hargaDasar);
    }
}
