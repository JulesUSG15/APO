package TP2;

/**
 *  Classe abstraite représentant une opération binaire entre deux expressions.
 */
public abstract class ExpressionBinaire extends Expression {
    /**
     * Expression de gauche
     */
    final private Expression expressionGauche;
    /**
     * Expression de droite
     */
    final private Expression expressionDroite;

    /**
     * Constructeur de la classe ExpressionBinaire
     * @param expressionGauche
     * @param expressionDroite
     */
    public ExpressionBinaire(Expression expressionGauche, Expression expressionDroite) {
        this.expressionGauche = expressionGauche;
        this.expressionDroite = expressionDroite;
    }

    /**
     * Renvoie l'expression de gauche
     * @return l'expression de gauche
     */
    public Expression getExpressionGauche() {
        return this.expressionGauche;
    }

    /**
     * Renvoie l'expression de droite
     * @return l'expression de droite
     */
    public Expression getExpressionDroite() {
        return this.expressionDroite;
    }

    /**
     * Renvoie une chaine de caractère representant l'expression binaire
     * @return une chaine de caractère representant l'expression binaire
     */
    public String toString() {
        return "(" + this.expressionGauche.toString() + this.getOperateur() + this.expressionDroite.toString() + ")";
    }

    /**
     * Renvoie l'opérateur de l'expression binaire
     * @return l'opérateur de l'expression binaire
     */
    public abstract String getOperateur();
    
}