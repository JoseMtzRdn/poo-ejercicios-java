package SuperClase;

public abstract class Arreglo {

    private int n;

    public Arreglo(int n) {
        this.n = n;
    }

    public abstract void llenadoDatos();

    public abstract void llenadoDatos(int ini, int fin);

    public abstract void impresiónDatos(char op);

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    protected void setN(int n) {
        this.n = n;
    }

}
