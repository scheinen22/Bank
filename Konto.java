package banksystem;

public class Konto {
    private int iban;
    private double kontostand;

    public Konto() {
    }

    public Konto(int iban, double kontostand) {
        this.iban = iban;
    }
    public int getIban() {
        return iban;
    }
    public void setIban(int iban) {
        this.iban = iban;
    }
    public double getKontostand() {
        return kontostand;
    }
    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }
}
