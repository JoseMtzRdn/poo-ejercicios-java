package SubClase.Dim3D;
import SubClase.Dim2D.Cuadrado;

public class Cubo extends Cuadrado{
    
    public Cubo(){
        super();
    }
    
    public Cubo(float base){
        super(base);
    }
    
    protected float getVolumen(){
        return getArea() * getBase();
    }
    
    @Override
    public void impDatos(){
        super.impDatos();
        System.out.println("Datos del cubo");
        System.out.println("Volumen = " + String.format("%.2f", getVolumen()) + " u^3");
    }
}
