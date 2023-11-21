package TP4_bis;

/**
 * Classe représentant une liste chaînée triée
 * @param <E> Le contenu de la liste chaînée triée
 */
public class ListeChaineeTriee2<E extends Comparable<E>> extends ListeChainee2<E> {
    
    /**
     * Rajoute un objet à la liste triée de manière croissante
     * @param objet l'objet à rajouter
     */
    @Override
    public void add(E objet) {
        this.tete = this.add(objet, this.tete);
    }

    public Noeud add(E objet, Noeud noeud) {
        if (noeud == null || objet.compareTo(noeud.objet) <= 0) {
            return new Noeud(objet, noeud);
        } else {
            noeud.prochain = this.add(objet, noeud.prochain);
            return noeud;
        }
    }

    public ListeChaineeTriee2() {
        super();
    }
    
}
