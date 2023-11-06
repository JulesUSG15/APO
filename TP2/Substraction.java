package TP2;

/**
 * Classe représentant la soustraction de deux expressions
 */
    public class Substraction extends ExpressionBinaire {
    
        /**
        * Constructeur de la classe Substraction
        * @param expressionGauche
        * @param expressionDroite
        */
        public Substraction(Expression expressionGauche, Expression expressionDroite) {
            super(expressionGauche, expressionDroite);
        }
    
        /**
        * Renvoie la valeur de la soustraction des deux expressions
        * @return la valeur de la soustraction des deux expressions
        */
        public ValeurTypee calculer() {
            return this.getExpressionGauche().calculer().moins(this.getExpressionDroite().calculer());
        }
    
        /**
        * Renvoie une chaine de caractère representant la soustraction des deux expressions
        * @return une chaine de caractère representant la soustraction des deux expressions
        */
        public String toString() {
            return "(" + this.getExpressionGauche().toString() + "-" + this.getExpressionDroite().toString() + ")";
        }
    
        /**
        * Renvoie l'opérateur de la soustraction
        * @return l'opérateur de la soustraction
        */
        public String getOperateur() {
            return "-";
        }
    
    }