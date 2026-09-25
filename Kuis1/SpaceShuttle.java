public class SpaceShuttle {
    private String kode;
    private int berat;
    private Roket rkt;
    private Generator gnr;

    public SpaceShuttle(String kode, int berat, Roket rkt, Generator gnr) {
        this.kode = kode;
        this.berat = berat;
        this.rkt = rkt;
        this.gnr = gnr;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    public void setRoketUtama(Roket rkt) {
        this.rkt = rkt;
    }

    public Roket getRoketUtama() {
        return rkt;
    }

    public void setGeneratorUtama(Generator gnr){
        this.gnr = gnr;
    }

    public Generator getGeneratorUtama(){
        return gnr;
    }

}
