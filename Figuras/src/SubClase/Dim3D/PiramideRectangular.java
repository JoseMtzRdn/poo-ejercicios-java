package SubClase.Dim3D;
import SubClase.Dim2D.Rectangulo;

public class PiramideRectangular extends Rectangulo{
    private float alturaPiramide;
    
    public PiramideRectangular(){
        super();

    }
    
    public PiramideRectangular(float altura, float base){
        super(altura, base);
    }
    
    public float getVolumen(){
        return (getArea() / 3) * getAlturaPiramide();
    }
    
    @Override
    public void impDatos(){
        super.impDatos();
        System.out.println("Datos de la piramide rectangular");
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
