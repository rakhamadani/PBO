public class MainKuis {
    public static void main(String[] args) {
        Roket rkt = new Roket("Jet", 9000);
        Generator gnr = new Generator(5000, 110);
        SpaceShuttle ss = new SpaceShuttle("Appollo99", 3500, rkt, gnr);

        System.out.println("Kode Space: " + ss.getKode());
        System.out.println("Tipe Roket: " + ss.getRoketUtama().getTipe());
        System.out.println("Voltase generator: " + ss.getGeneratorUtama().getVoltase());
    }
}
