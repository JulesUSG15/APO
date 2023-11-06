package TP2;

/**
 * Classe représentant une division entre deux expressions
 */
    public class Division extends ExpressionBinaire {
    
        /**
        * Constructeur de la classe Division
        * @param expressionGauche
        * @param expressionDroite
        */
        public Division(Expression expressionGauche, Expression expressionDroite) {
            super(expressionGauche, expressionDroite);
        }
    
        /**
        * Renvoie la valeur de la division des deux expressions
        * @return la valeur de la division des deux expressions
        */
        public ValeurTypee calculer() {
            return this.getExpressionGauche().calculer().diviser(this.getExpressionDroite().calculer());
        }
    
        /**
        * Renvoie une chaine de caractère representant la division des deux expressions
        * @return une chaine de caractère representant la division des deux expressions
        */
        public String toString() {
            return "(" + this.getExpressionGauche().toString() + "/" + this.getExpressionDroite().toString() + ")";
        }
    
        /**
        * Renvoie l'opérateur de la division
        * @return l'opérateur de la division
        */
        public String getOperateur() {
            return "/";
        }
    }