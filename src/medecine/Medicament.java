package medecine;

public class Medicament {
    String nom;
    int prix;
    private static final int MEAN_LENGTH = 10;

    public Medicament(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
//        aspirine est un medicament (prix:10)
        System.out.println(this.nom + " est un medicament (prix:" + this.prix + ")");
    }

    static String lister(Medicament[] medicaments, boolean avecPrix) {
        StringBuilder sb = new StringBuilder(medicaments.length * (MEAN_LENGTH + (avecPrix ? 7 : 2)));
        for (Medicament medicament : medicaments) {
            sb
                    .append(", ")
                    .append(medicament.nom);
            if (avecPrix) {
                sb
                        .append(" (")
                        .append(medicament.prix)
                        .append(")");
            }

        }
        return sb.delete(0, 2).toString();
    }

    static int totaliser(Medicament[] medicaments) {
        int total = 0;
        for (Medicament medicament : medicaments) {
            total += medicament.prix;
        }
        return total;
    }
}
