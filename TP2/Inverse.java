package TP2;

/**
 * Classe représentant l'inverse d'une expression
 */
 
 public class Inverse extends Expression {

    /**
     * Expression à inverser
     */
    final private Expression expression;

    /**
     * Constructeur de la classe Inverse
     * @param expression
     */
    public Inverse(Expression expression) {
        this.expression = expression;
    }

    /**
     * Renvoie la valeur de l'inverse de l'expression
     * @return la valeur de l'inverse de l'expression
     */
    public ValeurTypee calculer() {
        return this.expression.calculer().inverse();
    }

    /**
     * Renvoie une chaine de caractère representant l'inverse de l'expression
     * @return une chaine de caractère representant l'inverse de l'expression
     */
    public String toString() {
        return "1/(" + this.expression.toString() + ")";
    }

 }