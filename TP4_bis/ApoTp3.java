package TP4_bis;

public class ApoTp3 {

    public static void main(String[] args) {
        ListeChainee2<Integer> liste = new ListeChainee2<>();
        liste.add(3);
        liste.add(5);
        liste.add(4);
        liste.add(2);
        System.out.printf("liste: %s\n", liste);
        ListeChaineeTriee2<Integer> listeTriee = new ListeChaineeTriee2<>();
        listeTriee.add(3);
        listeTriee.add(5);
        listeTriee.add(4);
        listeTriee.add(2);
        System.out.printf("Liste triée: %s\n", listeTriee);

        listeTriee = new ListeChaineeTriee2<>();
        listeTriee.add(1);
        listeTriee.add(2);
        listeTriee.add(3);
        listeTriee.add(4);
        System.out.printf("Liste triée: %s\n", listeTriee);


        listeTriee = new ListeChaineeTriee2<>();
        listeTriee.add(4);
        listeTriee.add(3);
        listeTriee.add(2);
        listeTriee.add(1);
        System.out.printf("Liste triée: %s\n", listeTriee);

        MatriceCreuse<Integer> matrice = new MatriceCreuse<>(5, 10);
        System.out.println(matrice);
        matrice.add(2, 3, 5);
        matrice.add(3, 3, 7);
        matrice.add(4, 0, 7);
        matrice.add(5, 0, 7);
        matrice.add(7, 2, 5);
        matrice.add(7, 2, 6);
        matrice.add(7, 2, 7);
        boolean assertion = matrice.toString().equals(
                "0 0 0 0 0 0 0 5 0 0 \n" +
                "0 0 0 0 0 0 0 0 0 0 \n" +
                "0 0 0 0 0 7 7 7 0 0 \n" +
                "0 0 0 0 0 2 0 3 0 0 \n" +
                "0 0 0 0 0 0 0 0 0 0 \n");
        if (!assertion) {
            throw new IllegalStateException("La valeur de matrice n'est pas bonne: \n" + matrice.toString());
        }
        System.out.println(matrice);


    }
}