package TP2;

/**
 * Classe représentant un entier relatif
 */
public class EntierRelatif extends ValeurTypee {
    /**
     * Valeur de l'entier relatif
     */
    final private int valeur;

    /**
     * Constructeur de la classe EntierRelatif
     * @param valeur
     */
    public EntierRelatif(int valeur) {
        this.valeur = valeur;
    }

    /**
     * Retourne la valeur de l'entier relatif
     * @return la valeur de l'entier relatif
     */
    public int getEntier() {
        return this.valeur;
    }

    private int valeurInt(ValeurTypee nombre) {
        if (nombre instanceof EntierRelatif entierRelatif) {
            return entierRelatif.getEntier();
        }
        throw new UnsupportedOperationException("Type de valeur inconnu!");
    }
    
    /**
     * Addition entre deux entiers relatifs
     * @param v1 l'autre entier relatif à additionner 
     * @return la somme des deux entiers relatifs
     */
    public ValeurTypee plus(ValeurTypee nombre) {
        if (nombre instanceof ReelFlottant) {
            return new ReelFlottant(this.valeur).plus(nombre);
        }
        return new EntierRelatif(this.valeur + valeurInt(nombre));
    }
    

    /** 
     * Soustraction entre deux entiers relatifs
     * @param v1 l'autre entier relatif à soustraire
     * @return la somme des deux entiers relatifs
     */
    public ValeurTypee moins(ValeurTypee nombre) {
        if (nombre instanceof ReelFlottant) {
            return new ReelFlottant(this.valeur).moins(nombre);
        }
        return new EntierRelatif(this.valeur - valeurInt(nombre));
    }

    /**
     * Multiplication entre deux entiers relatifs
     * @param v1 l'autre entier relatif à multiplier
     * @return le produit des deux entiers relatifs
     */
    public ValeurTypee multiplier(ValeurTypee nombre) {
        if (nombre instanceof ReelFlottant) {
            return new ReelFlottant(this.valeur).multiplier(nombre);
        }
        return new EntierRelatif(this.valeur * valeurInt(nombre));
    }

    /**
     * Division entre deux entiers relatifs
     * @param v1 l'autre entier relatif à diviser
     * @return le quotient des deux entiers relatifs
     */
    public ValeurTypee diviser(ValeurTypee nombre) {
        if (nombre instanceof ReelFlottant) {
            return new ReelFlottant(this.valeur).diviser(nombre);
        }
        return new EntierRelatif(this.valeur / valeurInt(nombre));
    }

    /**
     * Inversion de la valeur
     * 
     * @return la valeur inversée
     */
    public ValeurTypee inverse() {
        return new EntierRelatif(-this.valeur);
    }

    /**
     * Renvoie une chaîne de caractère représentant la valeur entière
     * @return une chaîne de caractère représentant la valeur entière
     */
    public String toString() {
        return Integer.toString(this.valeur);
    }
}