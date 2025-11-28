package SubClase.Dim3D;

import SubClase.Dim2D.Rombo;

public class PiramideRomboidal extends Rombo{
    private float alturaPiramide;
    
    public PiramideRomboidal(){
        super();
    }
    
    public PiramideRomboidal(float diagMa, float diagMe, float base, float alturaPiramide){
        super(diagMa, diagMe, base);
        this.alturaPiramide = alturaPiramide;
    }
    
    public float getVolumen(){
        return (getArea() / 3) * getAlturaPiramide();
    }
    
    @Override
    public void impDatos(){
        super.impDatos();
        System.out.println("Datos de la piramide romboidal");
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
