package objetosAPF;
public class Animal {
    private String nombre;
    private String tipo;
    private int numPatas;

    @Override
    public String toString() {
        return "Datos del animal\n"
                + "Nombre: "+getNombre()+"\n"
                + "Tipo: "+getTipo()+"\n"
                + "Número de patas: "+getNumPatas()+"\n";
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }
    
    
}
