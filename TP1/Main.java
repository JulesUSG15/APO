package TP1;

public class Main {
    public static void main(String[] args) {
        /* on crée une classe de 3 étudiants */
        Classe c = new Classe(3, true);
        /* on affiche les étudiants */
        c.afficherEtudiants();
        /* on crée 3 étudiants */
        Etudiant e1 = new Etudiant("Antoine", "Maxime");
        Etudiant e2 = new Etudiant("Ponton", "Mathieu");
        Etudiant e3 = new Etudiant("Ginhac", "Jules");
        /* on les ajoute à la classe */
        c.ajouterEtudiant(e1);
        c.ajouterEtudiant(e2);
        c.ajouterEtudiant(e3);
        /* on affiche les étudiants */
        c.afficherEtudiants();
        /* le nombre de test (statistique) à faire */
        int nbTest = 10000;
        /* la taille des classes à tester */
        int tailleClasse  = 30;
        /* le nombre de classes ayant des étudiants avec la même date de naissance */
        float sum = 0;
        /* on compte les tests positifs */
        for (int i=0;i<nbTest;i++)
            if ((new Classe(tailleClasse, true)).memeDateNaissance())
            sum+=1;
        /* et on affiche le résultat */
        System.out.println(sum/nbTest*100+"% de classes de "+tailleClasse+" étudiants ont des étudiants avec la même date de naissance (sur "+nbTest+" tests)");
    }  
}
