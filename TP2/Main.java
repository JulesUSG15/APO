package TP2;

public class Main {

    public static void main(String[] args) {
        OperandeLitteral quatre= new OperandeLitteral(new EntierRelatif(4)); 
        OperandeLitteral sept = new OperandeLitteral(new EntierRelatif(7));
        OperandeLitteral moinsTrois= new OperandeLitteral(new EntierRelatif(-3));
        Expression e1 = new Addition(quatre, new Multiplication(sept, moinsTrois));
        System.out.printf("((4)+((7)*(-3))) = %s\n", e1.calculer());
        Expression exp11 = Expression.create("((4)+((7)*(-3)))");
        System.out.printf("((4)+((7)*(-3))) = %s = %s\n", exp11, exp11.calculer());
        OperandeLitteral trois = new OperandeLitteral(new EntierRelatif(3));
        OperandeLitteral cinq = new OperandeLitteral(new EntierRelatif(5));
        Expression exp2 = new Addition(trois, new Addition(cinq, new Inverse(cinq)));
        System.out.printf("((3)+((5)+((5)^-1))) = %s\n", exp2.calculer());
        Expression exp21 = Expression.create("((3)+((5)+((5)^-1)))");
        System.out.printf("((3)+((5)+((5)^-1))) = %s = %s\n", exp21, exp21.calculer());
        Expression exp3 = Expression.create("(((3)+(0.2))*(((1)+(1))^-1))");
        System.out.printf("(((3)+(0.2))*(((1)+(1))^-1)) = %s = %s\n", exp3, exp3.calculer());

    }
}