package banksystem;

public class Kunde extends Konto {
    private String vorname;
    private String nachname;
    private int geburtsdatum;

    public Kunde(String vorname, String nachname, int geburtsdatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
    }
    public String getVorname() {
        return vorname;
    }
    public String getNachname() {
        return nachname;
    }
    public int getGeburtsdatum() {
        return geburtsdatum;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public void setGeburtsdatum(int geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }
    public void kontoinformationenAnzeigen() {
        System.out.println("Vorname: " + this.getVorname());
        System.out.println("Nachname: " + this.getNachname());
        System.out.println("Geburtsdatum: " + this.getGeburtsdatum());
        System.out.println("Deine IBAN ist: " + this.getIban());
        System.out.println("Dein Kontostand beträgt: " + this.getKontostand() + "€");
    }
}
