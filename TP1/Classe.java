package TP1;

import java.util.Arrays;

/**
 * Classe représentant une classe d'étudiants

 */
public class Classe {
    /**
     * L'étape de taille de tableau à ajouter à chaque nouvelle allocation.
     */
    private static final int ETAPE = 20;
    /**
     * Tableau des étudiants
     */
    private Etudiant[] etudiants;
    /**
     * Nombre d'étudiants
     */
    private int nbEtudiants;
    
    /**
     * Constructeur de la classe Classe
     * @param capacite
     * @param random si vrai les étudiants sont créés aléatoirement
     */
    public Classe(int capacite, boolean random) {
        this.etudiants = new Etudiant[capacite];
        if (random) {
            this.nbEtudiants = capacite;
            for (int i = 0; i < this.nbEtudiants; i++) {
                this.etudiants[i] = new Etudiant("Nom" + i, "Prenom" + i);
            }
        } else {
            this.nbEtudiants = 0;
        }
    }

    /**
     * Rajout d'un étudiant dans la classe.
     *
     * @param e étudiant à rajouter
     */
    public void ajouterEtudiant(Etudiant e) {
        if (this.etudiants.length <= this.nbEtudiants) {
            int nouvelleTaille = this.etudiants.length + ETAPE;
            this.etudiants = Arrays.copyOf(this.etudiants, nouvelleTaille);
        }
        this.etudiants[this.nbEtudiants++] = e;
    }
    
    /**
     * Affichage des étudiants de la classe
     * 
     */
    public void afficherEtudiants() {
        for (int i = 0; i < this.nbEtudiants; i++) {
            System.out.println(this.etudiants[i].getNom() + " " + this.etudiants[i].getPrenom() + " " + this.etudiants[i].getNumeroEtudiant() + " " + this.etudiants[i].getDateNaissance());
        }
    }
    
    /**
     * Retourne vrai si deux étudiants de la classe sont nés le même jour, faux sinon
     * 
     */
    public boolean memeDateNaissance() {
        for (int i = 0; i < this.nbEtudiants - 1; i++) {
            for (int j = i + 1; j < this.nbEtudiants; j++) {
                if (this.etudiants[i].NeMemeJour(this.etudiants[j])) {
                    return true;
                }
            }
        }
        return false;
    }
}