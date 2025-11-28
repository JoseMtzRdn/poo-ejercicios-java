package SubClase.Dim3D;
import SubClase.Dim2D.*;

public class PiramideCuadrangular extends Cuadrado{
    
    private float alturaPiramide;
    
    public PiramideCuadrangular(){
        super();
    }
    
    public PiramideCuadrangular(float base){
        super(base);
    }

    
   public float getVolumen(){
       return (getArea() / 3) * getAlturaPiramide();
   }
   
   @Override
   public void impDatos(){
       super.impDatos();
       System.out.println("Datos de la piramide cuadrangular");
       System.out.println("Volumen = " + String.format("%.2f", getVolumen()) + " u^3" );
       System.out.println("Altura de la piramide = " + getAlturaPiramide() + " u");
   }

    public float getAlturaPiramide() {
        return alturaPiramide;
    }

    public void setAlturaPiramide(float alturaPiramide) {
        this.alturaPiramide = alturaPiramide;
    }
   
   
    
}
