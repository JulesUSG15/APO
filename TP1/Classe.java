package TP1;

public class Classe {
    private Etudiant[] etudiants;
    private int nbEtudiants;
    
    public Classe() {
        this.etudiants = new Etudiant[30];
        this.nbEtudiants = 0;
    }
    
    public void ajouterEtudiant(Etudiant e) {
        if (this.nbEtudiants < 30) {
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
            System.out.println(this.etudiants[i].getNom() + " " + this.etudiants[i].getPrenom() + " " + this.etudiants[i].getNumeroEtudiant());
        }
    }
}
