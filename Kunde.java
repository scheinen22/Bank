package banksystem;

public class Kunde extends Konto {
    private String vorname;
    private String nachname;
    private String geburtsdatum;
    private String adresse;

    public Kunde(String vorname, String nachname, String geburtsdatum, String adresse) {
        this.setVorname(vorname);
        this.setNachname(nachname);
        this.setGeburtsdatum(geburtsdatum);
        this.setAdresse(adresse);
    }
    public String getVorname() {
        return vorname;
    }
    public String getNachname() {
        return nachname;
    }
    public String getGeburtsdatum() {
        return geburtsdatum;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String kundeninformationenAnzeigenString() {
        return "Vorname: " + this.getVorname() + "\nNachname: " + this.getNachname() + "\nGeburtsdatum: " + this.getGeburtsdatum() + "\nAdresse: " + this.getAdresse();
    }
}
