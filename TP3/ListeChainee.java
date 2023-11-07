package TP3;

/**
 * Classe représentant une liste chainée
 */
public class ListeChainee<E extends Comparable<E>> {

    private E valeur;
    private ListeChainee<E> suivant;

    /**
     * Constructeur avec un seul élément
     * @param valeur l'élément
     */
    public ListeChainee(E valeur) {
        this(valeur, null);
    }

    /**
     * Constructeur avec un élément et la suite de la liste chaînée
     * @param valeur l'élément
     * @param suivant la suite de la liste chaînée
     */
    public ListeChainee(E valeur, ListeChainee<E> suivant) {
        this.valeur = valeur;
        this.suivant = suivant;
    }

    /**
     * Retourne l'valeur courant
     * @return l'valeur courant
     */
    public E getValeur() {
        return valeur;
    }

    /**
     * Retourne la suite de la liste chaînée
     * @return  la suite de la liste chaînée
     */
    public ListeChainee<E> getSuivant() {
        return suivant;
    }

    /**
     * Rajouter un valeur à la liste.
     * @param valeur l'valeur à rajouter
     */
    public void ajouterDebut(E valeur) {
        ListeChainee<E> nouveau = this.clone();
        this.valeur = valeur;
        this.suivant = nouveau;
    }

    /**
     * Clone l'élément courant de la liste chaînée (la suite n'est pas clonée)
     * @return le clone de l'élément courant
     */
    @Override
    public ListeChainee<E> clone() {
        return new ListeChainee<>(this.valeur, this.suivant);
    }

    /**
     * ajoute un valeur à la fin de la liste
     * @param valeur
     */
    public void ajouterFin (E valeur) {
        if (this.suivant == null) {
            this.ajouterDebut(valeur);
        } else {
            this.suivant.ajouterFin(valeur);
        }
    }

    /**
     * Renvoyer l'index-ème valeur de la liste (version itérative de l'algorithme).
     * @param index l'indice de l'valeur à renvoyer
     * @return  l'index-ème valeur de la liste
     */
    public E getIteratif(int index) {
        int i;
        ListeChainee<E> element = this;
        for (i=0; i < index; i++) {
            if (element.suivant == null) {
                return null;
            } else {
                element = this.suivant;
            }
        }
        return element.valeur;
    }

    /**
     * Renvoie l'index-ème valeur de la liste (version récursive de l'algorithme).
     * @param index l'indice de l'valeur à renvoyer
     * @return  l'index-ème valeur de la liste
     */
    public E get(int index) {
        if (index == 0) {
            return this.valeur;
        }
        else if (this.suivant == null) {
            return null;
        }
        else {
            return suivant.get(index - 1);
        }
    }
    
    /**
     * Renvoie une chaîne de caractère décrivant le contenu de la liste chaînée
     * @return le contenu de la liste chaînée
     */
    @Override
    public String toString() {
        ListeChainee<E> courant = this;
        StringBuilder sb = new StringBuilder("[");
        while (courant != null) {
            sb.append(courant.valeur);
            if (courant.suivant != null) {
                sb.append(", ");
            }
            courant = courant.suivant;
        }
        sb.append("] ");
        return sb.toString();
    }
}
