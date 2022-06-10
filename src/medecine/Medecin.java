package medecine;

public class Medecin {
    String prenom;
    int tarif;

    Patient patient;

    Medecin medecin;
    Medicament medicament;

    public Medecin(String prenom, int tarif) {
        this.prenom = prenom;
        this.tarif = tarif;
//        Marc est un medecin (tarif:30)
        System.out.println(this.prenom + " est un medecin (tarif:" + this.tarif + ")");
    }

    public void recevoir(Patient patient) {
        this.patient = patient;
//        Marc recoit Gilles en consultation
        System.out.println(this.prenom + " recoit " + patient.prenom + " en consultation");
    }

    public void demanderPaiement() {
//        Marc demande 30 a Gilles
        System.out.println(this.prenom + " demande " + this.tarif + " a " + patient.prenom);
    }

    public void prescrire(Medicament... medicaments) {
//        Marc prescrit aspirine a Gilles
        System.out.println(this.prenom + " prescrit " + Medicament.lister(medicaments, false) + " a " + this.patient.prenom);
    }

}
