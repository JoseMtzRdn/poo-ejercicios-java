/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubClase;

import Interfaces.OperacionesMatriz;
import SuperClase.Arreglo;
import Datos.*;

/**
 *
 * @author Sala
 */
public class MatrizEntero extends Arreglo implements OperacionesMatriz {

    private int m;
    int mat[][];

    public MatrizEntero(int n, int m) {
        super(n);
        mat = new int[n][m];
        this.m = m;
    }

    @Override
    public void llenadoDatos() {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = Leer.leerInt("Ingrese dato entero [" + i + "][" + j + "]:\t");
            }
        }
        System.out.println("***\nLlenado completo\n***");
    }

    @Override
    public void llenadoDatos(int ini, int fin) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = Aleatorio.getDatoInt(ini, fin);
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
    public int getPromedio() {
        int prom = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                prom += mat[i][j];
            }
        }
        return prom / (getN() * getM());
    }

    @Override
    public int getDato(int fila, int columna) {
        return mat[fila][columna];
    }

    @Override
    public int getDatoMayor() {
        int aux = mat[0][0];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (aux < mat[i][j]) {
                    aux = mat[i][j];
                }
            }
        }
        return aux;
    }

    @Override
    public int getDatoMenor() {
        int aux = mat[0][0];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (aux > mat[i][j]) {
                    aux = mat[i][j];
                }
            }
        }
        return aux;
    }

    @Override
    public void añadirFila(int[] nvoDatos) {
        if (getN() == 0 && getM() == 0) {
            mat = new int[1][1];
            mat[0][0] = Leer.leerInt("Ingrese nuevo dato:\t");
            System.out.println("Fila añadida");
            setN(1);
            setM(1);
        } else {
            int aux[][] = new int[getN() + 1][getM()];
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
    public void añadirColumna(int[] nvoDatos) {
        if (getN() == 0 && getM() == 0) {
            mat = new int[1][1];
            mat[0][0] = Leer.leerInt("Ingrese nuevo dato:\t");
            System.out.println("Columna añadida");
            setN(1);
            setM(1);
        } else {
            int aux[][] = new int[getN()][getM() + 1];
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
            int aux[][] = new int[getN() - 1][getM()];
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
            int aux[][] = new int[getN()][getM() - 1];
            for (int i = 0; i < mat.length; i++) {
                System.arraycopy(mat[i], 0, aux[i], 0, getM() - 1);
            }
            mat = aux;
            setM(getM() - 1);
            System.out.println("Columna eliminada");
        }
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
    protected void setM(int m) {
        this.m = m;
    }

}
