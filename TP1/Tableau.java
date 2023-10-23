package TP1;

public class Tableau {
    private int[] tab;
    private int n;
    private int max;
    
    public Tableau(int n, int max) {
        this.n = n;
        this.max = max;
        this.tab = new int[n];
        for (int i = 0; i < n; i++) {
            this.tab[i] = (int) (Math.random() * max);
        }
    }
    
    public void g() {
        for (int i = 0; i < this.n; i++) {
            System.out.print(this.tab[i] + " ");
        }
        System.out.println();
    }
    
    public void f() {
        for (int i = 0; i < this.n - 1; i++) {
            for (int j = i + 1; j < this.n; j++) {
                if (this.tab[i] > this.tab[j]) {
                    int temp = this.tab[i];
                    this.tab[i] = this.tab[j];
                    this.tab[j] = temp;
                }
            }
        }
    }
}