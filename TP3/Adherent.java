package TP3;
import java.util.ArrayList;
/**
 * Classe representant un adherent de la bibliotheque
 */
public class Adherent {

    private String nom, prenom;
    private int numAdherent;
    private ArrayList<Exemplaire> emprunts;

    /**
     * Constructeur 
     * @param nom le nom de l'adherent
     * @param prenom le prenom de l'adherent
     * @param numAdherent le numero de l'adherent
     */
    public Adherent(String nom, String prenom, int numAdherent) {
        this.nom = nom;
        this.prenom = prenom;
        this.numAdherent = numAdherent;
        this.emprunts = new ArrayList<>();
    }

    /**
     * Méthode permettant d'emprunter un exemplaire si l'adherent n'a pas deja emprunte 3 exemplaires
     * @param exemplaire
     * @throws Exception
     */
    public void attribuerExemplaire(Exemplaire exemplaire) throws Exception{
        if (this.emprunts.size()<3) {
            this.emprunts.add(exemplaire);
        } else {
            throw new Exception("L'adherent a deja emprunte 3 exemplaires");
        }
    }

    public String toString() {
        String res = "L'adhérent " + this.nom + " " + this.prenom + " "+ this.numAdherent + " a emprunté les exemplaires suivants : \n";
        for (Exemplaire exemplaire : this.emprunts) {
            res += exemplaire.toString() + "\n";
        }
        return res;
    }

    
}
