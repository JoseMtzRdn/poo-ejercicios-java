package SubClase;

import Clase.Alumno;
import Interfaces.OperaciónVector;
import SuperClase.VectorAlumno;
import Datos.Leer;

public class VectorAlumnoHalcón extends VectorAlumno implements OperaciónVector {

    public VectorAlumnoHalcón(int n) {
        super(n);
    }

    @Override
    public void llenarVector() {
        String nomCompleto;
        for (int i = 0; i < alu.length; i++) {
            System.out.println("Llenado de alumno " + (i + 1) + ":\t");
            nomCompleto = Leer.leerString("Ingrese nombre completo:\t");
            int n = Leer.leerInt("Ingrese el número de calificaciones a registrar:\t");
            alu[i] = new Alumno(n);
            alu[i].setNombreCompleto(nomCompleto);
            alu[i].llenarCalif();
            alu[i].setCarrera(Leer.leerString("Ingrese carrera:\t"));
            alu[i].setSemestre(Leer.leerInt("Ingrese semestre:\t"));
            alu[i].setNoCtrl(Leer.leerString("Ingrese número de control:\t"));
            while (buscarNoCtrl(alu[i].getNoCtrl(), i)) {
                System.out.println("Número de control ya existe, vuelva a ingresar");
                alu[i].setNoCtrl(Leer.leerString("Ingrese número de control:\t"));
            }
            System.out.println("***---***---***---***---***---***---***");
        }
    }

    @Override
    public void impresiónVector() {
        for (int i = 0; i < alu.length; i++) {
            System.out.println("Impresión de alumno número " + (i + 1));
            System.out.println("Nombre completo: " + alu[i].getNombreCompleto());
            System.out.println("Carrera: " + alu[i].getCarrera());
            System.out.println("Semestre: " + alu[i].getSemestre());
            System.out.println("No. de control: " + alu[i].getNoCtrl());
            System.out.println("El promedio es: " + alu[i].getMedia());
            System.out.println("Calificaciones: ");
            System.out.println(alu[i].impCalif());
            System.out.println("***---***---***---***---***---***---***");
        }
    }

    @Override
    public void impresiónVector(String noCtrl) {
        for (int i = 0; i < alu.length; i++) {
            if (alu[i].getNoCtrl().equals(noCtrl)) {
                System.out.println("Impresión de alumno con número de control " + alu[i].getNoCtrl());
                System.out.println("Nombre completo: " + alu[i].getNombreCompleto());
                System.out.println("Carrera: " + alu[i].getCarrera());
                System.out.println("Semestre: " + alu[i].getSemestre());
                System.out.println("Calificaciones: ");
                System.out.println(alu[i].impCalif());
                return;
            }
        }
        System.out.println("No existe alumno con número de control: " + noCtrl);
    }

    private boolean buscarNoCtrl(String noCtrl) {
        for (int i = 0; i < alu.length; i++) {
            if (alu[i].getNoCtrl().equals(noCtrl)) {
                return true;
            }
        }
        return false;
    }

    private boolean buscarNoCtrl(String noCtrl, int tam) {
        for (int i = 0; i < tam; i++) {
            if (alu[i].getNoCtrl().equals(noCtrl)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void eliminarFila(String noCtrl) {
        if (buscarNoCtrl(noCtrl)) {
            Alumno arrAux[] = new Alumno[alu.length - 1];
            for (int i = 0, aux = 0; i < alu.length; i++, aux++) {
                if (!alu[i].getNoCtrl().equals(noCtrl)) {
                    arrAux[aux] = alu[i];
                } else {
                    aux--;
                }
            }
            alu = arrAux;
        } else {
            System.out.println("No existe alumno con número de control: " + noCtrl);
        }
    }

    @Override
    public void añadirFila() {
        String nomCompleto;
        Alumno arrAux[] = new Alumno[alu.length + 1];
        System.arraycopy(alu, 0, arrAux, 0, alu.length);
        nomCompleto = Leer.leerString("Ingrese nombre completo:\t");
        int n = Leer.leerInt("Ingrese el número de calificaciones a registrar:\t");
        arrAux[alu.length] = new Alumno(n);
        arrAux[alu.length].llenarCalif();
        arrAux[alu.length].setNombreCompleto(nomCompleto);
        arrAux[alu.length].setCarrera(Leer.leerString("Ingrese carrera:\t"));
        arrAux[alu.length].setSemestre(Leer.leerInt("Ingrese semestre:\t"));
        arrAux[alu.length].setNoCtrl(Leer.leerString("Ingrese número de control:\t"));
        while (buscarNoCtrl(arrAux[alu.length].getNoCtrl(), alu.length)) {
            System.out.println("Número de control ya existe, vuelva a ingresar");
            arrAux[alu.length].setNoCtrl(Leer.leerString("Ingrese número de control:\t"));
        }
        alu = arrAux;
        System.out.println("Alumno añadido");
    }

    public void mayorProm() {
        float aux = alu[0].getMedia();
        int n = 0;
        for (int i = 0; i < alu.length; i++) {
            if (alu[i].getMedia() > aux) {
                aux = alu[i].getMedia();
                n = i;
            }
        }
        System.out.println("El alumno con mayor promedio es " + alu[n].getNombreCompleto() + "con promedio de: " + String.format("%.2f", aux));
    }

    public void menorProm() {
        float aux = alu[0].getMedia();
        int n = 0;
        for (int i = 0; i < alu.length; i++) {
            if (alu[i].getMedia() < aux) {
                aux = alu[i].getMedia();
                n = i;
            }
        }
        System.out.println("El alumno con menor promedio es " + alu[n].getNombreCompleto() + "con promedio de: " + String.format("%.2f", aux));
    }
}
