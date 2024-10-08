package banksystem;

public class Bank {

    private int blz;
    private String bankname;

    public Bank() {
    }
    public Bank(int blz, String bankname) {
        this.setBlz(blz);
        this.setBankname(bankname);
    }
    public String getBankname() {
        return bankname;
    }
    public int getBlz() {
        return blz;
    }
    public void setBlz(int blz) {
        this.blz = blz;
    }
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }
    public String bankinformationenAnzeigenString() {
        return "BLZ: " + this.getBlz() + "\nBankname: " + this.getBankname();
    }
    public static void transfer(Konto sender, Konto empfaenger, double betrag, int blz, int iban) {
        if (empfaenger == null || empfaenger.getBank() == null || empfaenger.getBank().getBlz() <= 0) {
            System.out.println("Empfänger nicht vorhanden");
            return;
        }
        if (empfaenger.getBank().getBlz() != blz && empfaenger.getIban() != iban) {
            System.out.println("Überweisung fehlgeschlagen.\nIBAN und Bankleitzahl stimmen nicht überein.\n");
            return;
        }
        if (empfaenger.getBank().getBlz() != blz) {
            System.out.println("Überweisung fehlgeschlagen.\nBankleitzahl stimmt nicht überein.\n");
            return;
        }
        if (empfaenger.getIban() != iban) {
            System.out.println("Überweisung fehlgeschlagen.\nIBAN stimmt nicht überein.\n");
            return;
        }
        if (sender.transaktion(betrag, empfaenger, blz, iban)) {
            System.out.println("Überweisung von Konto " + sender.getIban() + " zu Konto " + empfaenger.getIban() + " abgeschlossen.\n");
        }
    }
}
