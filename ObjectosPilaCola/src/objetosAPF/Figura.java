package objetosAPF;
public class Figura {
    private String nombre;
    private int numLados;
    private String dimension;

    @Override
    public String toString() {
        return "Datos de la figura\n"
                + "Nombre: "+getNombre()+"\n"
                + "Número de lados = "+getNumLados()+"\n"
                + "Dimensión: "+getDimension()+"\n";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }
    
    
}
