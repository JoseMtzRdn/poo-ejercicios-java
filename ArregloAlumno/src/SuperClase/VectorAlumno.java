package SuperClase;

import Clase.Alumno;

public abstract class VectorAlumno {

    protected Alumno alu[];

    public VectorAlumno(int n) {
        alu = new Alumno[n];
    }

    public abstract void llenarVector();

    public abstract void impresiónVector();

    public abstract void impresiónVector(String noCtrl);
}
