package TP1;

public class Etudiant {
    private String nom;
    private String prenom;
    private int numeroEtudiant;
    private static int prochainNumeroEtudiant = 100000;
    
    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroEtudiant = prochainNumeroEtudiant;
        prochainNumeroEtudiant++;
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
}