package SubClase.Dim3D;
import SubClase.Dim2D.Circulo;

public class Cono extends Circulo{
    private float alturaPiramide;
    
    public Cono(){
        super();
    }
    
    public Cono(float base, float alturaPiramide){
        super(base);
        this.alturaPiramide = alturaPiramide;
    }
    
    public float getVolumen(){
        return (getArea() / 3) * getAlturaPiramide();
    }
    
    @Override
    public void impDatos(){
        super.impDatos();
        System.out.println("Datos del cono");
        System.out.println("Volumen = " + String.format("%.2f", getVolumen()) + " u^3");
        System.out.println("Altura de la piramide = " + getAlturaPiramide() + "u");
    }

    public float getAlturaPiramide() {
        return alturaPiramide;
    }

    public void setAlturaPiramide(float alturaPiramide) {
        this.alturaPiramide = alturaPiramide;
    }
    
    
}
