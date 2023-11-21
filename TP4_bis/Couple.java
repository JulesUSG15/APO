package TP4_bis;

/**
 * Classe représentant un couple indice, valeur
 * @param <E> Le type de la valeur
 */
public class Couple<E> implements Comparable<Couple<E>> {
    
    /**
     *  indice
     */
    private final int indice;

    /**
     * valeur
     */
    private E objet;
    
    /**
     * Renvoie l'indice
     * @return l'indice
     */
    public int getIndice() {
        return indice;
    }

    /**
     * Renvoie l'objet
     * @return l'objet
     */
    public E getObjet() {
        return objet;
    }
    
    /**
     * Modifie la valeur de l'objet
     * @param objet la nouvelle valeur
     */
    public void setObjet(E objet) {
        this.objet = objet;
    }
    
    /**
     * Renvoie un nombre négatif, zéro ou positif suivant si l'indice du couple courant est plus petit, égal ou plus grand que celui du couple en paramètre
     * @param couple le couple avec lequel comparer
     */
    @Override
    public int compareTo(Couple<E> couple) {
        return this.indice - couple.getIndice();
    }
    
    /**
     * Constructeur initialisé l'indice et la valeur du couple
     * @param indice l'indice
     * @param objet la valeur
     */
    public Couple(int indice, E objet) {
        this.indice = indice;
        this.objet = objet;
    }
}
