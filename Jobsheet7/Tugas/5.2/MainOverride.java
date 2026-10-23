public class MainOverride {
    public static void main(String[] args) {
        Manusia[] manusia = {new Dosen(), new Mahasiswa()};

        for (Manusia orang : manusia) {
            orang.bernafas();
            orang.makan();
        }

        ((Dosen) manusia[0]).lembur();
        ((Mahasiswa) manusia[1]).tidur();
    }
}
