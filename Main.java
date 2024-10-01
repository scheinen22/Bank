package banksystem;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Konto konto = new Konto(new Bank(12345, "Sparkasse"), 432323, 28923.12, new Kunde("Jochen", "Schmidt", "21.12.2000", "Teststraße"));
        Konto konto2 = new Konto(new Bank(123456, "Sparkasse"), 2131, 31331, new Kunde("Kai", "Humboldt", "12.10.2000", "Bevingsweg"));
        Konto konto3 = new Konto(new Bank(123,"Deutsche Bank"), 9876, 1999, new Kunde("Manuel", "Hammer", "16.04.1987", "Grafstraße"));
        //bank.transfer(konto, konto2, 2000, 12345);
        bank.transfer(konto2, konto, 1832, 12345);
        konto.printTransaktionen();
        konto3.abheben(213);
        System.out.println(konto3.getKontostand());
        System.out.println(konto.getKontostand());




        /*
        System.out.println(konto.getBank().bankinformationenAnzeigenString());
        System.out.println(konto.getKunde().kundeninformationenAnzeigenString());
        System.out.println(konto.kontoinformationenAnzeigenString());
        konto.einzahlung(1000);
        System.out.println(konto.kontoinformationenAnzeigenString());
        konto.abheben(500);
        System.out.println(konto.getTransaktionsliste());

         */
    }
}
