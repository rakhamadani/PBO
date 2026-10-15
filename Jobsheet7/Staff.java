public class Staff extends Karyawan {
    private int lembur;
    private double gajiLembur;

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }
    
    public int getLembur() {
        return lembur;
    }

    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji() + lembur * gajiLembur;
    }

    public double getGaji() {
        return super.getGaji() + lembur * gajiLembur;
    }

    public void lihatInfo() {
        System.out.println("NIP\t\t: " + getNip());
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("Golongan\t: " + getGolongan());
        System.out.println("Jml Lembur\t: " + getLembur());
        System.out.printf("Gaji Lembur\t: %.0f\n ", getGajiLembur());
        System.out.printf("Gaji\t\t: %.0f\n ", getGaji());
    }
}
