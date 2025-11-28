package SubClase.Dim2D;

import SuperClase.Figura;

public class Rectángulo extends Figura {

    private float altura;

    public Rectángulo() {
        super();
        altura = 0.0f;
    }

    public Rectángulo(float base, float altura) {
        super(base);
        this.altura = altura;
    }

    @Override
    protected float getPerimetro() {
        return (getBase() * 2) + (getAltura() * 2);
    }

    @Override
    protected float getArea() {
        return getBase() * getAltura();
    }

    @Override
    public void impDatos() {
        System.out.println("Datos del rectangulo");
        System.out.println("Base: " + getBase() + " u");
        System.out.println("Altura: " + getAltura() + " u");
        System.out.println("Perimetro: " + getPerimetro() + " u");
        System.out.println("Area: " + getArea() + " u^2");
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

}
