public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return this.sudut;
    }
    

    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return this.sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(double sisiA, double sisiB, double sisiC) {
        return  sisiC = Math.sqrt(sisiA * sisiA + sisiB * sisiB);
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        System.out.println("Total sudut segitiga: " + segitiga.totalSudut(60));
        System.out.println("Total sudut segitiga: " + segitiga.totalSudut(60, 30));
        System.out.println("Keliling segitiga: " + segitiga.keliling(3, 4, 5));
        System.out.println("Keliling segitiga: " + segitiga.keliling(3.0, 4.0, 5.0));
    }

}
