package medecine;

public class Pharmacien {
    String prenom;
    Medicament medicament;
    Patient patient;

    public Pharmacien(String prenom) {
        this.prenom = prenom;
//        Paul est un pharmacien
        System.out.println(this.prenom + " est un pharmacien");
    }
    public void vendre(Patient patient, Medicament... medicaments){
        //    Paul vend aspirine (10) à Gilles
        System.out.println(this.prenom + " vend " + Medicament.lister(medicaments,true) + ") a " + patient.prenom);
    }
}
