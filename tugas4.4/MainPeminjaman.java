public class MainPeminjaman {
    public static void main(String[] args) {
        Peminjaman p1 = new Peminjaman();
        p1.id = 1;
        p1.namaMember = "Budi";
        p1.namaGame = "Elden Ring";
        p1.harga = 20000;
        p1.lamaSewa = 3;

        p1.tampilData();
    }
}