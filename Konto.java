package banksystem;

import java.util.ArrayList;
import java.util.List;

public class Konto extends Bank {
    private int iban;
    private double kontostand;
    private Kunde kunde;
    private Bank bank;
    private double dispolimit;
    private List<String> transaktionsliste;

    public Konto() {
    }

    public Konto(Bank bank, int iban, double kontostand, double dispolimit, Kunde kunde) {
        this.setKunde(kunde);
        this.setIban(iban);
        this.setKontostand(kontostand);
        this.setBank(bank);
        this.transaktionsliste = new ArrayList<>();
        this.setDispolimit(dispolimit);
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
    public Kunde getKunde() {
        return kunde;
    }
    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }
    public Bank getBank() {
        return bank;
    }
    public void setBank(Bank bank) {
        this.bank = bank;
    }
    public List<String> getTransaktionsliste() {
        return transaktionsliste;
    }

    public void printTransaktionen() {
        System.out.println("Transaktionen für Konto " + this.getIban() + ":");
        for (String transaktion : transaktionsliste) {
            System.out.println(transaktion);
        }
    }
    public void addTransaktion(String transaktion) {
        this.transaktionsliste.add(transaktion);
    }
    public void setDispolimit(double dispolimit) {
        this.dispolimit = dispolimit;
    }
    public String kontoinformationenAnzeigenString() {
        return "IBAN: " + getIban() + "\nKontostand: " + getKontostand() + "€";
    }
    public void einzahlung(double betrag) {
        if (betrag <= 0) {
            return;
        }
        this.kontostand += betrag;
        this.transaktionsliste.add("Einzahlung: +" + betrag + " €");
    }
    public void abheben(double betrag) {
        if (betrag <= 0) {
            return;
        }
        this.kontostand -= betrag;
        this.transaktionsliste.add("Abhebung: " + betrag + " €");
    }
    public boolean transaktion(double betrag, Konto empfaenger, int blz, int iban) {
        if (betrag > 2000) {
            System.out.println("Abgelehnt: Der Betrag " + betrag + " liegt über dem Dispolimit.");
            return false;
        }
        if (this.kontostand - betrag < -this.dispolimit) {
            System.out.println("Abgelehnt: Dispolimit überschritten.\nKontostand: " + getKontostand());
            return false;
        }
        this.kontostand -= betrag;
        empfaenger.kontostand += betrag;
        this.transaktionsliste.add("Überweisung an Konto " + empfaenger.getIban() + ": -" + betrag + " €");
        empfaenger.addTransaktion("Eingang von Konto " + this.getIban() + ": +" + betrag + " €");
        for(int i = 0; i <= 2; i++) {
            System.out.println("Haben Sie einen Moment Geduld...\n");
        }
        System.out.println("Überweisung erfolgreich: " + betrag + " € an Konto " + empfaenger.getIban());
        return true;
    }
}
