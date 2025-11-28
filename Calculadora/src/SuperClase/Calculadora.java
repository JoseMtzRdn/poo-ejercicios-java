package SuperClase;

public abstract class Calculadora {

    private double n1;
    private double n2;

    public Calculadora(double n1) {
        this.n1 = n1;
    }

    public abstract double getResultado(char oper);

    /**
     * @return the n1
     */
    public double getN1() {
        return n1;
    }

    /**
     * @return the n2
     */
    public double getN2() {
        return n2;
    }

    /**
     * @param n2 the n2 to set
     */
    public void setN2(double n2) {
        this.n2 = n2;
    }

}
