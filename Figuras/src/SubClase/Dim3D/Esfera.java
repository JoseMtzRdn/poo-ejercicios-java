package SubClase.Dim3D;
import SubClase.Dim2D.Circulo;

public class Esfera extends Circulo{
    
    public Esfera(){
        super(); 
    }
    
    public Esfera(float base){
        super(base);
    }
    
    protected float getVolumen(){
        return (1.33f) * getArea() * getBase();
    }
    
    @Override
    public void impDatos(){
        super.impDatos();
        System.out.println("Datos de la esfera");
        System.out.println("Volumen = " + String.format("%.2f", getVolumen()) + " u^3"); 
    }
}
