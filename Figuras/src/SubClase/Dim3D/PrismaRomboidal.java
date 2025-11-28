package SubClase.Dim3D;
import SubClase.Dim2D.*;
public class PrismaRomboidal extends Rombo{
    private float alturaPrisma;
    
    public PrismaRomboidal(){
        super();
    }
    
    public PrismaRomboidal(float diagMa, float diagMe, float base, float alturaPrisma){
        super(diagMa, diagMe, base);
        this.alturaPrisma = alturaPrisma;
    }
    
    public float getVolumen(){
        return getArea() * getAlturaPrisma();
    }
    
    @Override
    public void impDatos(){
        super.impDatos();
        System.out.println("Datos del prisma romboidal");
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
