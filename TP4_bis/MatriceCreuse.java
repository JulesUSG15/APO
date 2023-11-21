package TP4_bis;

/**
 * Classe représentant une matrice creuse (i.e. une matrice constituée de beaucoup de 0) avec des listes chaînées triées
 * @param <E> type de donnée de la matrice
 */
public class MatriceCreuse<E> {
    
    /**
     * nombre de lignes
     */
    private final int nbLigne;

    /**
     *  nombre de colonnes
     */
    private final int nbColonne;

    /**
     * les lignes sont des listes triées de couples (indice, colonne), les colonnes sont des listes triées de couple (indice, valeur)
     */
    private final ListeChaineeTriee2<Couple<ListeChaineeTriee2<Couple<E>>>> contenu = new ListeChaineeTriee2<>();
    
    /**
     * Attribue (rajoute ou modifie si existant) une nouvelle valeur à un emplacement de la matrice
     * @param objet la nouvelle valeur
     * @param numLigne le numéro de ligne
     * @param numColonne le numéro de colonne
     */
    public void add(E objet, int numLigne, int numColonne) {
        ListeChaineeTriee2<Couple<E>> colonnes = getForIndex(numLigne, this.contenu);
        if (colonnes == null) {
            Couple<ListeChaineeTriee2<Couple<E>>> ligne = creerLigne(objet, numLigne, numColonne);
            this.contenu.add(ligne);
            return;
        }
        colonnes.add(new Couple<>(numColonne, objet));
    }

    private Couple<ListeChaineeTriee2<Couple<E>>> creerLigne(E objet, int numLigne, int numColonne) {
        Couple<E> valeur = new Couple<>(numColonne, objet);
        ListeChaineeTriee2<Couple<E>> colonne = new ListeChaineeTriee2<>();
        colonne.add(valeur);
        return new Couple<>(numLigne, colonne);
    }

    private static <T> T getForIndex(int index, ListeChaineeTriee2<Couple<T>> list) {
        if (list != null) {
            for (Couple<T> current : list) {
                if (current.getIndice() == index) {
                    return current.getObjet();
                }
                if (current.getIndice() > index) {
                    return null;
                }
            }
        }
        return null;
    }

    /**
     * Renvoie une chaîne de caractère représentant le contenu complet de la matrice
     * @return le contenu complet de la matrice
     */
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < this.nbLigne; i++) {
            ListeChaineeTriee2<Couple<E>> colonnes = getForIndex(i, this.contenu);
            for (int j = 0; j < this.nbColonne; j++) {
                E cellule = getForIndex(j, colonnes);
                String str = cellule == null ? "0" : cellule.toString();
                res.append(str).append(" ");
            }
            res.append("\n");
        }
        return res.toString();
    }
    
    /**
     * Constructeur d'une matrice creuse vide
     * @param nbLigne le nombre de lignes
     * @param nbColonne le nombre de colonnes
     */
    public MatriceCreuse(int nbLigne, int nbColonne) {
        this.nbLigne = nbLigne;
        this.nbColonne = nbColonne;
    }
}
