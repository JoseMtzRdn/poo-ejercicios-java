package SubClase;

import Interfaces.OperacionesVector;
import SuperClase.Arreglo;
import Datos.*;

public class VectorEntero extends Arreglo implements OperacionesVector {

    int vec[];

    public VectorEntero(int n) {
        super(n);
        vec = new int[n];
    }

    @Override
    public void llenadoDatos() {
        for (int i = 0; i < vec.length; i++) {
            vec[i] = Leer.leerInt("Ingrese dato entero:\t");
        }
        System.out.println("***\nLlenado completo\n***");
    }

    @Override
    public void llenadoDatos(int ini, int fin) {
        for (int i = 0; i < vec.length; i++) {
            System.out.println("Llenado dato [" + i + "]");
            vec[i] = Aleatorio.getDatoInt(ini, fin);
        }
        System.out.println("***\nLlenado completo\n***");
    }

    @Override
    public void impresiónDatos(char op) {
        System.out.print("[");
        for (int i = 0; i < vec.length; i++) {
            if (i != 0) {
                System.out.print(op);
            }
            System.out.print(vec[i]);
        }
        System.out.println("]");
    }

    @Override
    public int getPromedio() {
        int prom = 0;
        for (int i = 0; i < vec.length; i++) {
            prom += vec[i];
        }
        return prom / getN();
    }

    @Override
    public int getDato(int pos) {
        return vec[pos];
    }

    @Override
    public int getMayor() {
        int aux = vec[0];
        for (int i = 1; i < vec.length; i++) {
            if (aux < vec[i]) {
                aux = vec[i];
            }
        }
        return aux;
    }

    @Override
    public int getDatoMenor() {
        int aux = vec[0];
        for (int i = 1; i < vec.length; i++) {
            if (aux > vec[i]) {
                aux = vec[i];
            }
        }
        return aux;
    }

    @Override
    public void añadirDato(int nvoDato) {
        int aux[] = new int[getN() + 1];
        System.arraycopy(vec, 0, aux, 0, getN());
        aux[getN()] = nvoDato;
        setN(getN() + 1);
        vec = aux;
        System.out.println("Dato añadido");
    }

    @Override
    public void eliminarDato() {
        if (getN() == 0) {
            System.out.println("No hay elementos a eliminar");
        } else {
            int aux[] = new int[getN() - 1];
            System.arraycopy(vec, 0, aux, 0, getN() - 1);
            setN(getN() - 1);
            vec = aux;
            System.out.println("Dato eliminado");
        }
    }

}
