package TP3;

/**
 * Classe représentant une liste chainée
 */
public class ListeChainee<E> {

    /*
     
Liste chaˆın ́ee
— Cr ́eer une classe ListeChainee qui va avoir un objet de type Object et (une r ́ef ́erence `a) une ListeChainee, qui est le prochain  ́el ́ement de la liste.
— E ́crireunem ́ethodepourrajouterun ́el ́ementaud ́ebutdelalistechaˆın ́ee, une pour acc ́eder `a la valeur de l’objet de type Object et une pour acc ́eder `a la suite de la liste chaˆın ́ee.
— On souhaite maintenant avoir une liste chaˆın ́ee tri ́ee, i.e. lors de l’insertion d’un nouvel  ́el ́ement, celle-ci se fait de fa ̧con `a conserver l’ordre dans la liste. Il ne faut alors plus stocker des Objects mais des Comparables. Proposer une impl ́ementation en r ́efl ́echissant bien `a tous les cas d’erreurs possibles. En particulier si une op ́eration n’est pas possible (par exemple comparer deux  ́el ́ements qui ne sont pas du mˆeme type), il faudra la g ́erer correctement avec une Exception.
— Aveclecodepr ́ec ́edemmentcr ́e ́e,pourrait-onfaireunelistechaˆın ́eed’Integer? Y aurait-il une garantie que seuls des entiers pourraient ˆetre dans cette
liste ?
— La g ́en ́ericit ́e permet de param ́etrer une classe, une interface ou une m ́ethode avec un ou plusieurs types. Par exemple en d ́eclarant public class Exemple<E>, on cr ́ee une classe g ́en ́erique Exemple param ́etr ́ee par le type E qui est ensuite utilisable dans le reste du code. On peut par exemple d ́eclarer un attribut public E attribut;. Pour utiliser cette classe, il faudra faire une invocation de type g ́en ́erique. La d ́eclaration prendra cette forme Exemple<Classe> et alors tous les attributs/variables d ́eclar ́ees de type E dans le code auront le type Classe pour un objet du type Exemple<Classe>.
Cr ́eer une liste chaˆın ́ee g ́en ́erique.
— Faire de mˆeme pour la classe ListeChaineeTriee<E>. Quelle contrainte
doit-on imposer `a E ?
     */

    /**
     * Valeur de l'élément
     */
    private E valeur;

    /**
     * Liste chainée suivante
     */
    private ListeChainee<E> suivant;

    /**
     * Constructeur de la classe ListeChainee
     * @param valeur
     * @param suivant
     */
    public ListeChainee(E valeur, ListeChainee<E> suivant) {
        this.valeur = valeur;
        this.suivant = suivant;
    }

    /**
     * Renvoie la valeur de l'élément
     * @return la valeur de l'élément
     */
    public E getValeur() {
        return this.valeur;
    }

    /**
     * Renvoie la liste chainée suivante
     * @return la liste chainée suivante
     */
    public ListeChainee<E> getSuivant() {
        return this.suivant;
    }

    /**
     * Revoie ajouter un élément au début de la liste chainée
     * @param valeur
     * @return la liste chainée avec l'élément ajouté au début
     */
    public void ajouterDebut(E valeur) {
        ListeChainee<E> nouveau = new ListeChainee<E>(valeur, this.suivant);
        this.suivant = nouveau;
    }

    /**
     * Renvoie une chaine de caractère representant la liste chainée
     * @return une chaine de caractère representant la liste chainée
     */
    public class ListeChaineeTriee<E extends Comparable<E>> extends ListeChainee<E> {

        /**
         * Constructeur de la classe ListeChaineeTriee
         * @param valeur
         * @param suivant
         */
        public ListeChaineeTriee(E valeur, ListeChainee<E> suivant) {
            super(valeur, suivant);
        }

        /**
         * Renvoie ajouter un élément au début de la liste chainée
         * @param valeur
         * @return la liste chainée avec l'élément ajouté au début
         */
        public void ajouterDebut(E valeur) {
            ListeChainee<E> nouveau = new ListeChainee<E>(valeur, this.suivant);
            this.suivant = nouveau;
        }

        /**
         * Renvoie une chaine de caractère representant la liste chainée
         * @return une chaine de caractère representant la liste chainée
         */
        public String toString() {
            return this.getValeur().toString() + " " + this.getSuivant().toString();
        }
    }

    
}
