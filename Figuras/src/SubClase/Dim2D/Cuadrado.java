package SubClase.Dim2D;

import SuperClase.Figura;

public class Cuadrado extends Figura {

    public Cuadrado(){
        super();
    }
    
    public Cuadrado(float base){
        super(base);
    }
    
    @Override
    protected float getPerimetro() {
        return getBase() * 4;
    }

    @Override
    protected float getArea() {
        return getBase() * getBase();
    }

    @Override
    public void impDatos() {
        System.out.println("Datos del cuadrado");
        System.out.println("Lado = " + getBase() + " u ");
        System.out.println("Perimetro = " + String.format("%.2f", getPerimetro()) + " u");
        System.out.println("Area = " + String.format("%.2f", getArea()) + " u2 ");
    }
    
}
