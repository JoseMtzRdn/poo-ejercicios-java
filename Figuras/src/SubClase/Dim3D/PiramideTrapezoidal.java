package SubClase.Dim3D;
import SubClase.Dim2D.Trapecio;
public class PiramideTrapezoidal extends Trapecio{
    
    private float alturaPiramide;
    
    public PiramideTrapezoidal(){
        super();
    }
    
    public PiramideTrapezoidal(float base, float bmay, float bmen, float altura, float alturaPiramide){
        super(base, bmay, bmen, altura);
        this.alturaPiramide = alturaPiramide;
    }
    
    public float getVolumen(){
        return (getArea() / 3) * getAlturaPiramide();
    }
    
    @Override
    public void impDatos(){
        super.impDatos();
        System.out.println("Datos de la piramide trapezoidal");
        System.out.println("Volumen = " + String.format("%.2f", getVolumen()) + " u^3");
        System.out.println("Altura de la piramide = " + getAlturaPiramide() + " u");
    }

    public float getAlturaPiramide() {
        return alturaPiramide;
    }

    public void setAlturaPiramide(float alturaPiramide) {
        this.alturaPiramide = alturaPiramide;
    }
}
