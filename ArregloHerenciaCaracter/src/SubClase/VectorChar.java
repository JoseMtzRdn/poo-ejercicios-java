package SubClase;

import Interfaces.OperacionesVectorChar;
import SuperClase.ArregloChar;
import Datos.*;

public class VectorChar extends ArregloChar implements OperacionesVectorChar {

    char vec[];

    public VectorChar(int n) {
        super(n);
        vec = new char[n];
    }

    @Override
    public void llenadoDatos() {
        for (int i = 0; i < vec.length; i++) {
            vec[i] = Leer.leerChar("Ingrese el dato caracter:\t");
        }
        System.out.println("***\nLlenado completo\n***");
    }

    @Override
    public void llenadoDatos(int ini, int fin) {
        for (int i = 0; i < vec.length; i++) {
            System.out.println("Llenado dato [" + i + "]");
            vec[i] = Aleatorio.getDatoChar(ini, fin);
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
    public char getPromedio() {
        int prom = 0;
        for (int i = 0; i < vec.length; i++) {
            prom += vec[i];
        }
        return (char) (prom / getN());
    }

    @Override
    public char getDato(int pos) {
        return vec[pos];
    }

    @Override
    public char getMayor() {
        int aux = vec[0];
        for (int i = 1; i < vec.length; i++) {
            if (aux < vec[i]) {
                aux = vec[i];
            }
        }
        return (char) aux;
    }

    @Override
    public char getDatoMenor() {
        int aux = vec[0];
        for (int i = 1; i < vec.length; i++) {
            if (aux > vec[i]) {
                aux = vec[i];
            }
        }
        return (char) aux;
    }

    @Override
    public void añadirDato(char nvoDato) {
        char aux[] = new char[getN() + 1];
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
            char aux[] = new char[getN() - 1];
            System.arraycopy(vec, 0, aux, 0, getN() - 1);
            setN(getN() - 1);
            vec = aux;
            System.out.println("Dato eliminado");
        }
    }

    public void getLongitudVector() {
        System.out.println("La longitud del vector es de " + getN() + " elementos");
    }

    public int getPosición(char dato) {
        for (int i = 0; i < vec.length; i++) {
            if (vec[i] == dato) {
                return i;
            }
        }
        return -1;
    }
}
