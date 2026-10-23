package Jobsheet6.Tugas;

public class TestTiket {
    public static void main(String[] args) {
        TiketKereta tiketKereta = new TiketKereta("KA-001", "Andi", "Malang - Jakarta", 350000, 3, "12A");
        tiketKereta.tampilTiketKereta();

        TiketDomestik tiketDomestik = new TiketDomestik(
                "GA-102",
                "Ani",
                "Surabaya - Denpasar",
                900000,
                "Garuda Indonesia",
                25,
                25000,
                75000
        );
        tiketDomestik.tampilTiketDomestik();

        TiketInternasional tiketInternasional = new TiketInternasional(
                "SG-205",
                "Bud",
                "Jakarta - Singapura",
                2500000,
                "Singapore Airlines",
                20,
                25000,
                "C1234567",
                150000
        );
        tiketInternasional.tampilTiketInternasional();
    }
}
