package objetosAPF;
public class Persona {
    private String nomCompleto;
    private String sexo;
    private int edad;

    @Override
    public String toString() {                
        return "Datos de la persona:\n"
                + "Nombre completo: "+getNomCompleto()+"\n"
                + "Edad: "+getEdad()+"\n"
                + "Sexo: "+getSexo()+"\n";
    }
            
    public String getNomCompleto() {
        return nomCompleto;
    }

    public void setNomCompleto(String nomCompleto) {
        this.nomCompleto = nomCompleto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
