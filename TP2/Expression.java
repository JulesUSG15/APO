package TP2;

/**
 * Classe représentant une expression arithmétique
 */
public abstract class Expression {


    public static Expression create(String expression) {
        // on enlève les parenthèses externes
        String s = expression.substring(1, expression.length() - 1);
        // s'il n'y a plus de parenthèses alors c'est un opérande littéral
        if (!s.contains("(")) {
            // s'il y a un point, c'est un réel, sinon c'est un entier
            // pour être propre il faudrait traiter les exceptions possiblement levées par les conversions
            return new OperandeLitteral(
                    s.contains(".") ? new ReelFlottant(Double.parseDouble(s)) : new EntierRelatif(Integer.parseInt(s))
            );
        }
        // sinon c'est une expression complexe
        else {
            int i = 0;
            int indexOperande = 0;
            int nbParentheses = 0;
            // on va déterminer le type de l'opération en découpant par rapport aux parenthèses (l'expression de gauche contenant autant de parenthèses ouvrantes que fermantes)
            // pour être propre il faudrait s'arrêter si le parcours de la chaîne est finie et alors signaler un cas d'erreur
            while (indexOperande == 0) {
                if (s.charAt(i) == '(') {
                    nbParentheses++;
                }
                if (s.charAt(i) == ')') {
                    nbParentheses--;
                }
                if (nbParentheses == 0) {
                    indexOperande = i + 1;
                }
                i++;
            }
            // on crée l'expression du membre de gauche
            Expression expressionGauche = Expression.create(s.substring(0, indexOperande));
            // on récupère la chaîne de caractère représentant le membre de droite (on ne crée pas l'opération, car inutile dans le cas d'une inversion)
            String expressionressionDroite = s.substring(indexOperande + 1);
            // on crée l'expression correspondant au type d'opération trouvé
            return switch (s.charAt(indexOperande)) {
                case '^' -> new Inverse(expressionGauche);
                case '+' -> new Addition(expressionGauche, Expression.create(expressionressionDroite));
                case '-' -> new Substraction(expressionGauche, Expression.create(expressionressionDroite));
                case '*' -> new Multiplication(expressionGauche, Expression.create(expressionressionDroite));
                case '/' -> new Division(expressionGauche, Expression.create(expressionressionDroite));
                default -> throw new UnsupportedOperationException("Opérateur inconnu %c".formatted(s.charAt(indexOperande)));
            };
        }
        
    }
    
    /**
     * Renvoie la valeur de l'expression
     * @return la valeur de l'expression
     */
    public abstract ValeurTypee calculer();

    /**
     * Renvoie une chaine de caractère representant la valeur de l'expression
     * @return une chaine de caractère representant la valeur de l'expression
     */
    public abstract String toString();
}
 