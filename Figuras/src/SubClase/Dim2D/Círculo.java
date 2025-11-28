package SubClase.Dim2D;

import SuperClase.Figura;

public class Círculo extends Figura {

    float pi;

    public Círculo() {
        super();
        pi = (float) Math.PI;
    }

    public Círculo(float base) {
        super(base);
        pi = (float) Math.PI;
    }

    @Override
    protected float getPerimetro() {
        return getPi() * getDiametro();
    }

    @Override
    protected float getArea() {
        return getPi() * (getBase() * getBase());
    }

    @Override
    public void impDatos() {
        System.out.println("Datos del circulo");
        System.out.println("Pi: " + getPi());
        System.out.println("Radio: " + getBase() + " u");
        System.out.println("Diametro: " + getDiametro() + " u");
        System.out.println("Perimetro: " + getPerimetro() + " u");
        System.out.println("Area: " + getArea() + " u^2");
    }

    protected float getDiametro() {
        return getBase() * 2;
    }

    protected float getPi() {
        return pi;
    }

}
