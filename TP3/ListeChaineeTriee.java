package TP3;

public class ListeChaineeTriee<E extends Comparable<E>> extends ListeChainee<E> {
    
    /**
     * Constructeur avec un seul élément.
     * @param valeur l'élément
     */
    public ListeChaineeTriee(E valeur) {
        super(valeur);
    }
    
    /**
     * Constructeur avec un élément et la suite de la liste chaînée triée.
     *
     * @param valeur l'élément
     * @param suivant la suite de la liste chaînée
     */
    private ListeChaineeTriee(E valeur, ListeChaineeTriee<E> suivant) {
        super(valeur, suivant);
    }
    
    /**
     * Renvoyer la suite la liste chaînée triée.
     * @return la suite la liste chaînée triée
     */
    @Override
    public ListeChaineeTriee<E> getSuivant() {
        return (ListeChaineeTriee<E>) super.getSuivant();
    }

    /**
     * Rajouter un valeur à la liste triée de manière croissante.
     * @param valeur l'valeur à rajouter
     */
    @Override
    public void ajouterDebut(E valeur) {
        if (valeur.compareTo(valeur) <= 0) {
            super.ajouterDebut(valeur);
        } else if (this.getSuivant() == null) {
            this.ajouterFin(valeur);
        } else {
            this.getSuivant().ajouterDebut(valeur);
        }
    }

    /**
     * Dupliquer l'élément courant de la liste chaînée. La suite n'est pas dupliquée.
     * @return la duplication de l'élément courant
     */
    @Override
    public ListeChaineeTriee<E> clone() {
        return new ListeChaineeTriee<>(this.getValeur(), this.getSuivant());
    }

}
