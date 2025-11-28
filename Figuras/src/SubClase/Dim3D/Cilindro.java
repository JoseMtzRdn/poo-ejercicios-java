package SubClase.Dim3D;

import SubClase.Dim2D.Circulo;

public class Cilindro extends Circulo{
    
    private float alturaPrisma;
    
    public Cilindro(){
        super();
    }
    
    public Cilindro(float base, float alturaPrisma){
        super(base);
        this.alturaPrisma = alturaPrisma;
    }
    
    protected float getVolumen(){
        return getArea() * getAlturaPrisma();
    }
    
    @Override
    public void impDatos(){
        super.impDatos();
        System.out.println("Datos del cilindro");
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
