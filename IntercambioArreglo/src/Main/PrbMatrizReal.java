package Main;

import Datos.Leer;
import SubClase.MatrizReal;

public class PrbMatrizReal {

    public static void main(String[] args) {
        int n, m;
        char op, menu;
        n = Leer.leerInt("Ingrese el número de filas de la matriz:\t");
        while (n <= 0) {
            n = Leer.leerInt("Ingrese el número de filas de la matriz:\t");
        }
        m = Leer.leerInt("Ingrese el número de columnas de la matriz:\t");
        while (m <= 0) {
            m = Leer.leerInt("Ingrese el número de columnas de la matriz:\t");
        }
        MatrizReal mR = new MatrizReal(n, m);
        do {
            System.out.println("Elija el tipo de llenado:\t");
            System.out.println("a) Aleatorio");
            System.out.println("b) Usuario");
            menu = Leer.leerChar("Ingrese opción:\t");
            switch (menu) {
                case 'a':
                case 'A':
                    mR.llenadoDatos(-99, 99);
                    break;
                case 'b':
                case 'B':
                    mR.llenadoDatos();
                    break;
                default:
                    System.out.println("Opcion incorrecta...");
                    menu = '0';
                    break;
            }
        } while (menu == '0');
        do {
            System.out.println("Menu");
            System.out.println("a) Rellenar matriz");
            System.out.println("b) Imprimir matriz");
            System.out.println("c) Intercambiar filas");
            System.out.println("d) Intercambiar columnas");
            System.out.println("s) salir");
            menu = Leer.leerChar("Ingrese opción:\t");
            switch (menu) {
                case 'a':
                case 'A':
                    System.out.println("Elija el tipo de llenado:\t");
                    System.out.println("a) Aleatorio");
                    System.out.println("b) Usuario");
                    menu = Leer.leerChar("Ingrese opción:\t");
                    switch (menu) {
                        case 'a':
                        case 'A':
                            mR.llenadoDatos(-99, 99);
                            break;
                        case 'b':
                        case 'B':
                            mR.llenadoDatos();
                            break;
                    }
                    break;
                case 'b':
                case 'B':
                    op = Leer.leerChar("Ingrese separador:\t");
                    mR.impresiónDatos(op);
                    break;
                case 'c':
                case 'C':
                    int filaIni = Leer.leerInt("Ingrese la fila inicial de (0 - " + (mR.getN() - 1) + "):\t");
                    while (filaIni < 0 || filaIni >= mR.getN()) {
                        filaIni = Leer.leerInt("Ingrese la fila inicial de (0 - " + (mR.getN() - 1) + "):\t");
                    }
                    int filaFin = Leer.leerInt("Ingrese la fila final de (0 - " + (mR.getN() - 1) + "):\t");
                    while (filaFin < 0 || filaFin == filaIni || filaFin >= mR.getN()) {
                        filaFin = Leer.leerInt("Ingrese la fila final de (0 - " + (mR.getN() - 1) + "):\t");
                    }
                    mR.intercambioFila(filaIni, filaFin);
                    break;
                case 'd':
                case 'D':
                    int colIni = Leer.leerInt("Ingrese la columna inicial de (0 - " + (mR.getM() - 1) + "):\t");
                    while (colIni < 0 || colIni >= mR.getM()) {
                        colIni = Leer.leerInt("Ingrese la columna inicial de (0 - " + (mR.getM() - 1) + "):\t");
                    }
                    int colFin = Leer.leerInt("Ingrese la columna final de (0 - " + (mR.getM() - 1) + "):\t");
                    while (colFin < 0 || colFin == colIni || colFin >= mR.getM()) {
                        colFin = Leer.leerInt("Ingrese la columna final de (0 - " + (mR.getM() - 1) + "):\t");
                    }
                    mR.intercambioColumna(colIni, colFin);
                    break;
                case 'e':
                case 'E':
                    mR.trasponerMatriz();
                    break;
            }
        } while (menu != 's' && menu != 'S');
    }
}
