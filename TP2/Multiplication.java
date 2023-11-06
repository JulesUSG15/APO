package TP2;

/**
 * Classe représentant une multiplication entre deux expressions
 */
 public class Multiplication extends ExpressionBinaire {

    /**
     * Constructeur de la classe Multiplication
     * @param expressionGauche
     * @param expressionDroite
     */
    public Multiplication(Expression expressionGauche, Expression expressionDroite) {
        super(expressionGauche, expressionDroite);
    }

    /**
     * Renvoie la valeur de la multiplication des deux expressions
     * @return la valeur de la multiplication des deux expressions
     */
    public ValeurTypee calculer() {
        return this.getExpressionGauche().calculer().multiplier(this.getExpressionDroite().calculer());
    }

    /**
     * Renvoie une chaine de caractère representant la multiplication des deux expressions
     * @return une chaine de caractère representant la multiplication des deux expressions
     */
    public String toString() {
        return "(" + this.getExpressionGauche().toString() + "*" + this.getExpressionDroite().toString() + ")";
    }

    /**
     * Renvoie l'opérateur de la multiplication
     * @return l'opérateur de la multiplication
     */
    public String getOperateur() {
        return "*";
    }
 }