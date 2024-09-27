package banksystem;

public class Bank {

    private int blz;
    private int eckartennummer;

    public Bank() {
        System.out.println("Die Banksystem.Bank wurde gesetzt.");
    }

    public Bank(int blz, int eckartennummer) {
        this.blz = blz;
        this.eckartennummer = eckartennummer;
    }

    public int getEckartennummer() {
        return eckartennummer;

    }

    public int getBlz() {
        return blz;
    }

    public void setBlz(int blz) {
        this.blz = blz;
    }

    public void setEckartennummer(int eckartennummer) {
        this.eckartennummer = eckartennummer;
    }
}
