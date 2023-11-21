package TP4;

public class Result {

    public static void main(String[] args) {
        ListeChainee<Integer> liste = new ListeChainee<>(3);
        liste.ajouterDebut(5);
        liste.ajouterDebut(4);
        liste.ajouterDebut(2);
        System.out.printf("liste: %s\n", liste);
        ListeChaineeTriee<Integer> listeTriee = new ListeChaineeTriee<>(3);
        listeTriee.ajouterDebut(4);
        listeTriee.ajouterDebut(5);
        listeTriee.ajouterDebut(2);
        System.out.printf("Liste triée: %s\n", listeTriee);

    }
}
