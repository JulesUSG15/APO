package TP2;

/**
 * Classe représentant une opérande littérale
 */
public class OperandeLitteral extends Expression {
    /**
     * Valeur de l'opérande littérale
     */
    private ValeurTypee valeur;

    /**
     * Constructeur de la classe OperandeLitteral
     * @param valeur
     */
    public OperandeLitteral(ValeurTypee valeur) {
        this.valeur = valeur;
    }

    /**
     * Renvoie la valeur de l'opérande
     * @return la valeur de l'opérande
     */
    public ValeurTypee calculer () {
        return this.valeur;
    }

    /**
     * Renvoie une chaine de caractère representant la valeur de l'opérande
     * @return une chaine de caractère representant la valeur de l'opérande
     */
    public String toString() {
        return this.valeur.toString();
    }
}

