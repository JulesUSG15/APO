package TP1;

import java.time.Month;
import java.time.MonthDay;
import java.util.Random;
/**
 * Classe représentant un étudiant
 */
public class Etudiant {
    /**
     * Nom de l'étudiant
     */
    private String nom;
    /**
     * Prénom de l'étudiant
     */
    private String prenom;
    /**
     * Numéro de l'étudiant
     */
    private int numeroEtudiant;
    /**
     * Date de naissance de l'étudiant
     */
    private MonthDay dateNaissance;
    /**
     * Numéro de l'étudiant suivant à créer
     */
    private static int prochainNumeroEtudiant = 1;

    /**
     * Constructeur de la classe Etudiant
     * @param nom
     * @param prenom
     */
    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroEtudiant = prochainNumeroEtudiant++;
        Random r = new Random();
        int mois = r.nextInt(12) + 1;
        int jour = r.nextInt(Month.values()[mois-1].length(false))+1;
        this.dateNaissance = MonthDay.of(mois, jour);
    }

    /**
     * Retourne le nom de l'étudiant
     * 
     * @return
     */
    public String getNom() {
        return this.nom;
    }
    
    /**
     * Retourne le prénom de l'étudiant
     * 
     * @return
     */
    public String getPrenom() {
        return this.prenom;
    }
    
    /**
     * Retourne le numéro de l'étudiant
     * 
     * @return
     */
    public int getNumeroEtudiant() {
        return this.numeroEtudiant;
    }

    /**
     * Retourne la date de naissance de l'étudiant
     * 
     * @return
     */
    public MonthDay getDateNaissance() {
        return this.dateNaissance;
    }

    /**
     * Compare la date de naissance de deux étudiants.
     * @param e l'étudiant à comparer
     * @return true si les deux étudiants sont nés le même jour, false sinon
     */
    public boolean NeMemeJour(Etudiant e) {
        return this.dateNaissance.equals(e.getDateNaissance());
    }

    /**
     * Affiche les informations de l'étudiant
     * 
     * @return une chaines de caractères contenant les informations de l'étudiant
     */
    public String toString() {
        return this.nom + " " + this.prenom + " (" + this.numeroEtudiant + ") né le " + this.dateNaissance;
    }
}