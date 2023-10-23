package TP1;

import java.time.MonthDay;
import java.util.Random;

public class Etudiant {
    private String nom;
    private String prenom;
    private int numeroEtudiant;
    private MonthDay dateNaissance;
    private static int prochainNumeroEtudiant = 100000;
    
    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroEtudiant = prochainNumeroEtudiant;
        prochainNumeroEtudiant++;
        this.dateNaissance = MonthDay.of(new Random().nextInt(12) + 1, new Random().nextInt(28) + 1);
    }
    
    public String getNom() {
        return this.nom;
    }
    
    public String getPrenom() {
        return this.prenom;
    }
    
    public int getNumeroEtudiant() {
        return this.numeroEtudiant;
    }
    
    public MonthDay getDateNaissance() {
        return this.dateNaissance;
    }
    
    public boolean estNeLeMemeJourQue(Object autre) {
        if (autre instanceof Etudiant) {
            Etudiant e = (Etudiant) autre;
            return this.dateNaissance.equals(e.getDateNaissance());
        }
        return false;
    }
}