package banksystem;

public class Main {
    public static void main(String[] args) {
        Bank sparkasse = new Bank(213, 21321212);
        Konto konto = new Konto(223, 2);
        Kunde kunde1 = new Kunde("Ayri", "Eyri", 211224);
        kunde1.setKontostand(223175.52);
        kunde1.setIban(123123123);
        kunde1.kontoinformationenAnzeigen();
        System.out.println(sparkasse.getEckartennummer());
        sparkasse.setEckartennummer(1231981);
        System.out.println(sparkasse.getEckartennummer());
    }
}
