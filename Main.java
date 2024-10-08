package banksystem;

public class Main {
    public static void main(String[] args) {
        Konto konto = new Konto(new Bank(12345, "Sparkasse"), 432323, 28923.12, 2000, 2000, new Kunde("Jochen", "Schmidt", "21.12.2000", "Teststraße"));
        Konto konto2 = new Konto(new Bank(123456, "Sparkasse"), 2131, 31331.32, 2000, 2000, new Kunde("Kai", "Humboldt", "12.10.2000", "Bevingsweg"));
        Konto konto3 = new Konto(new Bank(123,"Deutsche Bank"), 9876, 0, 2000, 2000, new Kunde("Manuel", "Hammer", "16.04.1987", "Grafstraße"));
        // Überweisung geht problemlos durch.
        Bank.transfer(konto, konto2, 1832, 123456, 2131);
        // Überweisungslimit wird überschritten (2000€)
        Bank.transfer(konto2, konto, 2001, 12345, 432323);
        // Dispolimit wird überschritten (-2000€)
        Bank.transfer(konto3, konto, 2000, 12345, 432323);
        Bank.transfer(konto3, konto, 2000, 12345, 432323);
        // Überweisung geht nicht durch, da IBAN falsch, aber BLZ richtig
        Bank.transfer(konto2, konto, 1832, 12345, 4323232);
        // Überweisung geht nicht durch, da BLZ falsch, aber IBAN richtig
        Bank.transfer(konto2, konto, 1832, 123452, 432323);
        // Überweisung geht nicht durch, da BLZ und IBAN falsch
        Bank.transfer(konto2, konto, 1832, 123452, 4323231);
        // Fünf weitere Überweisungen mit Transaktionslisteausgabe
        for(int i = 0; i <= 4; i++) {
            Bank.transfer(konto2, konto, 15, 12345, 432323);
        }
        konto2.transaktionenString();
    }
}
