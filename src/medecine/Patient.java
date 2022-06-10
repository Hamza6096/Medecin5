package medecine;

import medecine.*;

public class Patient{
    String prenom;
    Maladie maladie;

    Pharmacien pharmacien;

    Medicament medicament;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Patient(String prenom) {
        this.prenom = prenom;
//        Gilles est un patient
        System.out.println(this.prenom + " est un patient");
    }

    public void contracter(Maladie maladie) {
        this.maladie = maladie;
//        Gilles contract la maladie grippe
        System.out.println(this.prenom + " contract la maladie " + maladie.nom);
    }

    public void payer(Medecin medecin) {
//        Gilles paie 30 a Marc
        System.out.println(this.prenom + " paie " + medecin.tarif + " a " + medecin.prenom);
    }
    public void payer(Pharmacien pharmacien, Medicament... medicaments) {
//        Gilles paie 10 à Paul
        System.out.println(this.prenom + " paie " + Medicament.totaliser(medicaments) + " a " + pharmacien.prenom);
    }
    public void guerir() {
//        Gilles guérit de la maladie grippe
        System.out.println(this.prenom + " guerit de la maladie " + maladie.nom );
    }
}
