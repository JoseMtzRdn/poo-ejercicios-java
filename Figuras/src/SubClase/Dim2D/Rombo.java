package SubClase.Dim2D;

import SuperClase.Figura;

public class Rombo extends Figura {

    private float diagMa;
    private float diagMe;

    public Rombo() {
        super();
        diagMa = 0.0f;
        diagMe = 0.0f;
    }

    public Rombo(float diagMa, float diagMe, float base) {
        super(base);
        this.diagMa = diagMa;
        this.diagMe = diagMe;
    }

    @Override
    protected float getPerimetro() {
        return getBase() * 4;
    }

    @Override
    protected float getArea() {
        return (getDiagMa() * getDiagMe()) / 2;
    }

    @Override
    public void impDatos() {
        System.out.println("Datos del rombo");
        System.out.println("Diagonal mayor = " + getDiagMa() + " cm");
        System.out.println("Diagonal menor = " + getDiagMe() + "cm");
        System.out.println("Medida de los lados = " + getBase() + " cm");
        System.out.println("Perimetro = " + String.format("%.2f", getPerimetro()) + " cm");
        System.out.println("Area = " + String.format("%.2f", getArea()) + " cm");
    }

    public float getDiagMa() {
        return diagMa;
    }

    public void setDiagMa(float diagMa) {
        this.diagMa = diagMa;
    }

    public float getDiagMe() {
        return diagMe;
    }

    public void setDiagMe(float diagMe) {
        this.diagMe = diagMe;
    }

   
}
