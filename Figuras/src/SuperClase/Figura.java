package SuperClase;

public abstract class Figura {
    private float base;
    
    public Figura(){
        base = 0.0f;
    }
    
    public Figura(float base){
        this.base = base;
    }
    
    protected abstract float getPerimetro();
    protected abstract float getArea();
    public abstract void impDatos();

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }
}
