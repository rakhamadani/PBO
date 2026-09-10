public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public double harga;
    public int lamaSewa;

    // Method untuk menghitung total harga bayar
    public double hitungHargaBayar() {
        return lamaSewa * harga;
    }

    // Method untuk menampilkan data peminjaman
    public void tampilData() {
        System.out.println("ID Peminjaman : " + id);
        System.out.println("Nama Member   : " + namaMember);
        System.out.println("Nama Game     : " + namaGame);
        System.out.println("Harga / Hari  : Rp " + harga);
        System.out.println("Lama Sewa     : " + lamaSewa + " hari");
        System.out.println("Total Bayar   : Rp " + hitungHargaBayar());
    }
}