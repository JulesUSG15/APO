package TP1;

public class Main {
    public static void main(String[] args) {
        Classe c = new Classe(10);
        c.afficherEtudiants();
        System.out.println(c.aDeuxEtudiantsNeLeMemeJour());

        Etudiant e1 = new Etudiant("Antoine", "Maxime");
        Etudiant e2 = new Etudiant("Ponton", "Mathieu");
        Etudiant e3 = new Etudiant("Ginhac", "Jules");

        c.ajouterEtudiant(e1);
        c.ajouterEtudiant(e2);
        c.ajouterEtudiant(e3);

        c.afficherEtudiants();
        System.out.println(c.aDeuxEtudiantsNeLeMemeJour());

    }  
}
