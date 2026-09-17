public class EncapTest {
    public static void main(String args[]) {
        EncapDemo encap = new EncapDemo();
        
        encap.setName("Nathalie");
        encap.setAge(35);
        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());

        encap.setName("Budi");
        encap.setAge(15);
        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());
    }
}