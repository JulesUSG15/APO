package TP1;

public class Main {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("Antoine", "Maxime");
        System.out.println("Nom: " + e1.getNom());
        System.out.println("Prenom: " + e1.getPrenom());
        System.out.println("Num_etu: " + e1.getNumeroEtudiant());

        Classe c1 = new Classe();
        c1.ajouterEtudiant(e1);
        c1.ajouterEtudiant(new Etudiant("Ponton", "Mathieu"));
        c1.ajouterEtudiant(new Etudiant("Ginhac", "Jules"));
        c1.afficherEtudiants();
    }  
}
