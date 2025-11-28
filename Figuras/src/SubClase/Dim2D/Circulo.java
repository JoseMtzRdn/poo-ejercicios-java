package SubClase.Dim2D;
import SuperClase.Figura;

public class Circulo extends Figura {

    float pi;

    public Circulo() {
        super();
        pi = (float) Math.PI;
    }

    public Circulo(float base) {
        super(base);
        pi = (float) Math.PI;
    }

    @Override
    protected float getPerimetro() {
        return getPI() * getDiametro();
    }

    @Override
    protected float getArea() {
        return getPI() * (getBase() * getBase());
    }

    @Override
    public void impDatos() {
        System.out.println("Datos del circulo");
        System.out.println("PI = " + String.format("%.4f", getPI()));
        System.out.println("Radio = " + getBase() + " u ");
        System.out.println("Diametro = " + String.format("%.2f", getDiametro()) + " u ");
        System.out.println("Perimetro = " + String.format("%.2f", getPerimetro()) + " u ");
        System.out.println("Area = " + String.format("%.2f", getArea()) + " u^2 ");
    }

    protected float getDiametro() {
        return getBase() * 2;
    }

    protected float getPI() {
        return pi;
    }
}
