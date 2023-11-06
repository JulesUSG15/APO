package TP2;

/**
 * Classe représentant l'addition de deux expressions
 */
 
 public class Addition extends ExpressionBinaire {

    /**
     * Constructeur de la classe Addition
     * @param expressionGauche
     * @param expressionDroite
     */
    public Addition(Expression expressionGauche, Expression expressionDroite) {
        super(expressionGauche, expressionDroite);
    }

    /**
     * Renvoie la valeur de l'addition des deux expressions
     * @return la valeur de l'addition des deux expressions
     */
    public ValeurTypee calculer() {
        return this.getExpressionGauche().calculer().plus(this.getExpressionDroite().calculer());
    }

    /**
     * Renvoie une chaine de caractère representant l'addition des deux expressions
     * @return une chaine de caractère representant l'addition des deux expressions
     */
    public String toString() {
        return "(" + this.getExpressionGauche().toString() + "+" + this.getExpressionDroite().toString() + ")";
    }

    /**
     * Renvoie l'opérateur de l'addition
     * @return l'opérateur de l'addition
     */
    public String getOperateur() {
        return "+";
    }

 }