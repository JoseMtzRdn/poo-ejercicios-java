package SuperClase;

public abstract class Temperatura {

    private double noGrados;

    public Temperatura(double noGrados) {
        this.noGrados = noGrados;
    }

    /**
     * @return the noGrados
     */
    public double getNoGrados() {
        return noGrados;
    }

    public abstract void conversión();

}
