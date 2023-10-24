package TP2;
/**
 * Classe représentant un réel flottant
 */
public class ReelFlottant extends ValeurTypee {
    /**
     * Valeur du réel flottant
     */
    private double valeur;

    /**
     * Constructeur de la classe ReelFlottant
     * @param valeur
     */
    public ReelFlottant(double valeur) {
        this.valeur = valeur;
    }

    /**
     * Retourne la valeur du réel flottant
     * 
     * @return
     */
    public double getReel() {
        return this.valeur;
    }

    private double valeurDouble(ValeurTypee nombre) {
        if (nombre instanceof ReelFlottant) {
            return ((ReelFlottant) nombre).getReel();
        }
        else if (nombre instanceof EntierRelatif) {
            return ((EntierRelatif) nombre).getEntier();
        }
        throw new UnsupportedOperationException("Type de valeur inconnu!");
    }

    /**
     * Addition entre deux réels flottants
     * @param v1 l'autre réel flottant à additionner 
     * @return la somme des deux réels flottants
     */
    public ValeurTypee plus(ValeurTypee nombre) {
        return new ReelFlottant(this.valeur + valeurDouble(nombre));
    }

    /** 
     * Soustraction entre deux réels flottants
     * @param v1 l'autre réel flottant à soustraire
     * @return la somme des deux réels flottants
     */
    public ValeurTypee moins(ValeurTypee nombre) {
        return new ReelFlottant(this.valeur - valeurDouble(nombre));
    }

    /**
     * Multiplication entre deux réels flottants
     * @param v1 l'autre réel flottant à multiplier
     * @return le produit des deux réels flottants
     */
    public ValeurTypee multiplier(ValeurTypee nombre) {
        return new ReelFlottant(this.valeur * valeurDouble(nombre));
    }

    /**
     * Division entre deux réels flottants
     * @param v1 l'autre réel flottant à diviser
     * @return le quotient des deux réels flottants
     */
    public ValeurTypee diviser(ValeurTypee nombre) {
        return new ReelFlottant(this.valeur / valeurDouble(nombre));
    }

    /**
     * Inversion de la valeur
     * 
     * @return la valeur inversée
     */
    public ValeurTypee inverse() {
        return new ReelFlottant(1 / this.valeur);
    }
}
