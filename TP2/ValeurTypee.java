package TP2;
/**
 * Classe représentant une valeur typée
 */
public abstract class ValeurTypee {
    /**
     * Addition entre deux valeurs
     * @param v1 l'autre valeur à additionner 
     * @return la somme des deux valeurs
     */
    public abstract ValeurTypee plus(ValeurTypee v1);

    /**
     * Soustraction entre deux valeurs
     * @param v1 l'autre valeur à soustraire
     * @return la somme des deux valeurs
     */
    public abstract ValeurTypee moins(ValeurTypee v1);

    /**
     * Multiplication entre deux valeurs
     * @param v1 l'autre valeur à multiplier
     * @return le produit des deux valeurs
     */
    public abstract ValeurTypee multiplier(ValeurTypee v1);

    /**
     * Division entre deux valeurs
     * @param v1 l'autre valeur à diviser
     * @return le quotient des deux valeurs
     */
     public abstract ValeurTypee diviser(ValeurTypee v1);

    /**
     * Inversion de la valeur
     * 
     * @return la valeur inversée
     */
    public abstract ValeurTypee inverse(); 
}
