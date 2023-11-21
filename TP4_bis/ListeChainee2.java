package TP4_bis;
import java.util.Iterator;

/**
 * Classe représentant une liste chaînée.
 * @param <E> Le contenu de la liste chaînée
 */
public class ListeChainee2<E> implements Iterable<E> {

    protected Noeud tete;

    /**
     * Constructeur sans paramètre.
     */
    public ListeChainee2() {
    }

    /**
     * Rajouter un objet à la liste
     *
     * @param objet l'objet à rajouter
     */
    public void add(E objet) {
        this.tete = new Noeud(objet, this.tete);
    }

    /**
     * Renvoyer l'index-ème objet de la liste (version récursive de l'algorithme)
     *
     * @param index l'indice de l'objet à renvoyer
     * @return l'index-ème objet de la liste
     */
    public E get(int index) {
        return this.get(index, this.tete);
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            private Noeud current = ListeChainee2.this.tete;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                E value = this.current.objet;
                this.current = this.current.prochain;
                return value;
            }
        };
    }

    private E get(int index, Noeud noeud) {
        if (index == 0) {
            return noeud.objet;
        } else if (noeud.prochain == null) {
            return null;
        } else {
            return get(index - 1, noeud.prochain);
        }
    }

    /**
     * Renvoyer une chaîne de caractère décrivant le contenu de la liste chaînée
     *
     * @return le contenu de la liste chaînée
     */
    @Override
    public String toString() {
        return this.tete == null ? "[]" : this.tete.toString();
    }

    class Noeud {

        /**
         * contenu
         */
        protected E objet;

        /**
         * suite de la liste chainée
         */
        protected Noeud prochain;

        protected Noeud(E objet, Noeud prochain) {
            this.objet = objet;
            this.prochain = prochain;
        }

        /**
         * Renvoie une chaîne de caractère décrivant le contenu de la liste chaînée
         *
         * @return le contenu de la liste chaînée
         */
        @Override
        public String toString() {
            Noeud courant = this;
            StringBuilder sb = new StringBuilder("[");
            while (courant != null) {
                sb.append(courant.objet);
                if (courant.prochain != null) {
                    sb.append(", ");
                }
                courant = courant.prochain;
            }
            sb.append("] ");
            return sb.toString();
        }
    }
}

