package SubClase.Dim2D;
import SuperClase.Figura;

public class Rectangulo extends Figura {

    private float altura;
    
    public Rectangulo(){
        super();
        altura = 0.0f;
    }
    
    public Rectangulo(float base, float altura){
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
        System.out.println("Datos del rectanguloo");
        System.out.println("Base = " + getBase() + " u ");
        System.out.println("Altura = " + getAltura());
        System.out.println("Perimetro = " + String.format("%.2f", getPerimetro()) + " u");
        System.out.println("Area = " + String.format("%.2f", getArea()) + " u2 ");
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
