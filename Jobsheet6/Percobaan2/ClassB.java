package Jobsheet6.Percobaan2;

public class ClassB extends ClassA {
    
    private int z;

    public void setZ(int z) {
        this.z = z;
    }

    public void getNilaiZ() {
        System.out.println("nilai Z\t: " + z);
    }

    public void getJumlah() {
        System.out.println("jumlah\t: " + (getX() + getY() + z));
    }
}
