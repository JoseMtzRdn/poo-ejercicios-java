package SubClase.Dim2D;

import SuperClase.*;

public class Trapecio extends Figura {

    private float bmay;
    private float bmen;
    private float altura;

    public Trapecio() {
        super();
        bmay = 0.0f;
        bmen = 0.0f;
        altura = 0.0f;
    }

    public Trapecio(float base, float bmay, float bmen, float altura) {
        super(base);
        this.bmay = bmay;
        this.bmen = bmen;
        this.altura = altura;
    }

    @Override
    protected float getPerimetro() {

        return (getBase() * 2) + getBMay() + getBMen();
    }

    @Override
    protected float getArea() {
        return (getBMay() + getBMen()) * getAltura() / 2;
    }

    @Override
    public void impDatos() {
        System.out.println("Datos del trapecio");
        System.out.println("Base mayor = " + getBMay());
        System.out.println("Base menor = " + getBMen());
        System.out.println("Altura = " + getAltura());
        System.out.println("Medida de los lados = " + getBase());
        System.out.println("Perimetro = " + String.format("%.2f", getPerimetro()));
        System.out.println("Area = " + String.format("%.2f", getArea()));
    }

    public float getBMay() {
        return bmay;
    }

    public void setBMay(float BMay) {
        this.bmay = BMay;
    }

    public float getBMen() {
        return bmen;
    }

    public void setBMen(float BMen) {
        this.bmen = BMen;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}
