package SubClase.Dim3D;
import SubClase.Dim2D.Cuadrado;

public class PrismaCuadrangular extends Cuadrado{
    private float alturaPrisma;
    
    public PrismaCuadrangular(){
        super();
    }
    
    public PrismaCuadrangular(float base, float alturaPrisma){
        super(base);
        this.alturaPrisma = alturaPrisma;
    }
    
    protected float getVolumen(){
        return getArea() * getAlturaPrisma();
    }
    @Override
    public void impDatos(){
        super.impDatos();
        System.out.println("Datos del prisma cuadrangular");
        System.out.println("Volumen = " + String.format("%.2f", getVolumen()) + " u^3");
        System.out.println("Altura del prisma = " + getAlturaPrisma() + "u");      
    }

    public float getAlturaPrisma() {
        return alturaPrisma;
    }

    public void setAlturaPrisma(float alturaPrisma) {
        this.alturaPrisma = alturaPrisma;
    }
}
