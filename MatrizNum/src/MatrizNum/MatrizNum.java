/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MatrizNum;

import Datos.*;

public class MatrizNum {

    int mat[][];

    public MatrizNum(int n) {
        mat = new int[n][n];
    }

    public void llenadoDatos() {
        System.out.println("Llenado de datos por usuario");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = Leer.leerInt("Ingrese el dato en la posición [" + i + "][" + j + "]:\t");
            }
        }
    }

    public void llenadoDatos(int ini, int fin) {
        System.out.println("Llenado de datos por método aleatorio");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = Aleatorio.getDatoInt(ini, fin);
            }
        }
    }

    public void impDatos() {
        for (int i = 0; i < mat.length; i++) {
            System.out.print("[");
            for (int j = 0; j < mat[i].length; j++) {
                if (j != 0) {
                    System.out.print("|");
                }
                System.out.print(mat[i][j]);
            }
            System.out.println("]");
        }
    }

    public int diagPrinSec() {
        int aux = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    aux += mat[i][j];
                }
                if (i + j == mat.length - 1) {
                    aux += mat[i][j];
                }
            }
        }
        return aux;
    }

    public int obtenerDato(int fil, int col) {
        return mat[fil][col];
    }

    public void modificarDato(int fil, int col) {
        mat[fil][col] = Leer.leerInt("Ingrese el nuevo dato:\t");
        System.out.println("Dato modificado");
    }

    public void contDatos() {
        int neg = 0, pos = 0, cer = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] > 0) {
                    pos++;
                }
                if (mat[i][j] < 0) {
                    neg++;
                }
                if (mat[i][j] == 0) {
                    cer++;
                }
            }
        }
        System.out.println("El número de positivos en la matriz es: " + pos + " El número de negativos es: " + neg + " El número de ceros es: " + cer);
    }

    public void contarPrimos() {
        int cont = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                int aux = 0;
                for (int k = 1; k <= mat[i][j]; k++) {
                    if (mat[i][j] % k == 0) {
                        aux++;
                    }
                }
                if (aux != 2) {
                    System.out.println(mat[i][j] + " No es primo");
                } else {
                    System.out.println(mat[i][j] + " Es primo");
                    cont++;
                }
            }
        }
        System.out.println("La cantidad de números primos dentro de la matriz es: " + cont);
    }
}
