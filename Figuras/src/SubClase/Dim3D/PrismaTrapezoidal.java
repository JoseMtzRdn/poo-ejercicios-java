package SubClase.Dim3D;

import SubClase.Dim2D.*;

public class PrismaTrapezoidal extends Trapecio {

    private float alturaPrisma;

    public PrismaTrapezoidal() {
        super();
    }

    public PrismaTrapezoidal(float base, float bmay, float bmen, float altura, float alturaPrisma) {
        super(base, bmay, bmen, altura);
        this.alturaPrisma = alturaPrisma;
    }

    public float getVolumen() {
        return ((getBMay() + getBMen()) * getAltura() / 2) * getAlturaPrisma();
    }

    @Override
    public void impDatos() {
        super.impDatos();
        System.out.println("Datos del prisma trapezoidal");
        System.out.println("Volumen = " + String.format("%.2f", getVolumen()) + " u^3");
        System.out.println("Altura prisma = " + getAlturaPrisma() + "u");
    }

    public float getAlturaPrisma() {
        return alturaPrisma;
    }

    public void setAlturaPrisma(float alturaPrisma) {
        this.alturaPrisma = alturaPrisma;
    }
}
