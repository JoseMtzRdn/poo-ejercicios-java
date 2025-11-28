package SuperClase;

public abstract class Vectores {

    public double vec1[], vec2[];
    private int n;

    public Vectores(int n) {
        vec1 = new double[n];
        vec2 = new double[n];
        this.n = n;
    }

    public abstract void llenarVectores(double ini, double fin);

    public abstract void imprimirVectores(char separador);

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }

}
