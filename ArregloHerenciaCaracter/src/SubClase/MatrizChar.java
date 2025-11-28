package SubClase;

import Interfaces.OperacionesMatrizChar;
import SuperClase.ArregloChar;
import Datos.*;

public class MatrizChar extends ArregloChar implements OperacionesMatrizChar {

    private int m;
    char mat[][];

    public MatrizChar(int n, int m) {
        super(n);
        mat = new char[n][m];
        this.m = m;
    }

    @Override
    public void llenadoDatos() {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = Leer.leerChar("Ingrese dato entero [" + i + "][" + j + "]:\t");
            }
        }
        System.out.println("***\nLlenado completo\n***");
    }

    @Override
    public void llenadoDatos(int ini, int fin) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = Aleatorio.getDatoChar(ini, fin);
            }
        }
        System.out.println("***\nLlenado completo\n***");
    }

    @Override
    public void impresiónDatos(char op) {
        for (int i = 0; i < mat.length; i++) {
            System.out.print("[");
            for (int j = 0; j < mat[i].length; j++) {
                if (j != 0) {
                    System.out.print(op);
                }
                System.out.print(mat[i][j]);
            }
            System.out.println("]");
        }
    }

    @Override
    public char getPromedio() {
        int prom = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                prom += mat[i][j];
            }
        }
        return (char) (prom / (getN() * getM()));
    }

    @Override
    public char getDato(int fila, int columna) {
        return mat[fila][columna];
    }

    @Override
    public char getDatoMayor() {
        int aux = mat[0][0];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (aux < mat[i][j]) {
                    aux = mat[i][j];
                }
            }
        }
        return (char) aux;
    }

    @Override
    public char getDatoMenor() {
        int aux = mat[0][0];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (aux > mat[i][j]) {
                    aux = mat[i][j];
                }
            }
        }
        return (char) aux;
    }

    @Override
    public void añadirFila(char[] nvoDatos) {
        if (getN() == 0 && getM() == 0) {
            mat = new char[1][1];
            mat[0][0] = Leer.leerChar("Ingrese nuevo dato:\t");
            System.out.println("Fila añadida");
            setN(1);
            setM(1);
        } else {
            char aux[][] = new char[getN() + 1][getM()];
            for (int i = 0; i < mat.length; i++) {
                System.arraycopy(mat[i], 0, aux[i], 0, getM());
            }
            System.arraycopy(nvoDatos, 0, aux[getN()], 0, getM());
            mat = aux;
            setN(getN() + 1);
            System.out.println("Fila añadida");
        }
    }

    @Override
    public void añadirColumna(char[] nvoDatos) {
        if (getN() == 0 && getM() == 0) {
            mat = new char[1][1];
            mat[0][0] = Leer.leerChar("Ingrese nuevo dato:\t");
            System.out.println("Columna añadida");
            setN(1);
            setM(1);
        } else {
            char aux[][] = new char[getN()][getM() + 1];
            for (int i = 0; i < mat.length; i++) {
                System.arraycopy(mat[i], 0, aux[i], 0, getM());
                aux[i][getM()] = nvoDatos[i];
            }
            mat = aux;
            setM(getM() + 1);
            System.out.println("Columna añadida");
        }
    }

    @Override
    public void eliminarFila() {
        if (getN() == 0) {
            setM(0);
            System.out.println("Ya no se puede eliminar más filas");
        } else {
            char aux[][] = new char[getN() - 1][getM()];
            for (int i = 0; i < mat.length - 1; i++) {
                System.arraycopy(mat[i], 0, aux[i], 0, getM());
            }
            mat = aux;
            setN(getN() - 1);
            System.out.println("Fila eliminada");
        }
    }

    @Override
    public void eliminarColumna() {
        if (getM() == 0) {
            setN(0);
            System.out.println("Ya no se puede eliminar más columnas");
        } else {
            char aux[][] = new char[getN()][getM() - 1];
            for (int i = 0; i < mat.length; i++) {
                System.arraycopy(mat[i], 0, aux[i], 0, getM() - 1);
            }
            mat = aux;
            setM(getM() - 1);
            System.out.println("Columna eliminada");
        }
    }

    public void getLongitudMatriz() {
        System.out.println("La longitud de la matriz es de " + (getN() * getM()) + " elementos");
        System.out.println("Número de filas: " + getN());
        System.out.println("Número de columnas: " + getM());
    }

    public void getPosición(char dato) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == dato) {
                    System.out.println("El dato " + dato + " esta en [" + i + "][" + j + "]");
                    return;
                }
            }
        }
        System.out.println("El dato no está en la matriz");
    }

    /**
     * @return the m
     */
    public int getM() {
        return m;
    }

    /**
     * @param m the m to set
     */
    public void setM(int m) {
        this.m = m;
    }

}
