package SubClase.Dim3D;
import SubClase.Dim2D.Rectangulo;
public class PrismaRectangular extends Rectangulo{
    
    private float alturaPrisma;
    
    public PrismaRectangular(){
        super();
    }
    
    public PrismaRectangular(float base, float alturaPrisma , float altura){
        super(base, altura);
        this.alturaPrisma = alturaPrisma;
    }
    
    public float getVolumen(){
        return getArea() * getAlturaPrisma();
    }
    
    @Override
    public void impDatos(){
        super.impDatos();
        System.out.println("Datos del prisma rectangular");
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
