package Jobsheet4.Percobaan6;

public class MainPercobaan6 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Thinkpad");
        Printer printer = new Printer("Epson L3110");

        laptop.setPrinter(printer);

        laptop.cetakDokumen("Laporan.pdf");
    }
}
