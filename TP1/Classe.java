package TP1;

public class Classe {
    private Etudiant[] etudiants;
    private int nbEtudiants;
    
    public Classe(int nbEtudiants) {
        this.etudiants = new Etudiant[nbEtudiants];
        this.nbEtudiants = 0;
        for (int i = 0; i < nbEtudiants; i++) {
            this.ajouterEtudiant(new Etudiant("", ""));
        }
    }
    
    public void ajouterEtudiant(Etudiant e) {
        if (this.nbEtudiants < this.etudiants.length) {
            boolean existe = false;
            for (int i = 0; i < this.nbEtudiants; i++) {
                if (this.etudiants[i].getNumeroEtudiant() == e.getNumeroEtudiant()) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                this.etudiants[this.nbEtudiants] = e;
                this.nbEtudiants++;
            }
        }
    }
    
    public void afficherEtudiants() {
        for (int i = 0; i < this.nbEtudiants; i++) {
            System.out.println(this.etudiants[i].getNom() + " " + this.etudiants[i].getPrenom() + " " + this.etudiants[i].getNumeroEtudiant() + " " + this.etudiants[i].getDateNaissance());
        }
    }
    
    public boolean aDeuxEtudiantsNeLeMemeJour() {
        for (int i = 0; i < this.nbEtudiants - 1; i++) {
            for (int j = i + 1; j < this.nbEtudiants; j++) {
                if (this.etudiants[i].estNeLeMemeJourQue(this.etudiants[j])) {
                    return true;
                }
            }
        }
        return false;
    }
}