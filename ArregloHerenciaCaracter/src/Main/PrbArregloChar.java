package Main;

import Datos.Leer;
import SubClase.*;

public class PrbArregloChar {

    public static void main(String[] args) {
        char op, menu;
        int n, m;
        do {
            System.out.println("Elija un tipo de arreglo");
            System.out.println("v) Vector");
            System.out.println("m) Matriz");
            System.out.println("s) Salir");
            menu = Leer.leerChar("Ingrese opción:\t");
            switch (menu) {
                case 'v':
                case 'V':
                    n = Leer.leerInt("Ingrese tamaño del vector:\t");
                    while (n <= 0) {
                        n = Leer.leerInt("Ingrese tamaño del vector:\t");
                    }
                    VectorChar vE = new VectorChar(n);
                    do {
                        System.out.println("Elija llenado de vector");
                        System.out.println("a) Aleatorio");
                        System.out.println("u) Usuario");
                        menu = Leer.leerChar("Ingrese opción:\t");
                        switch (menu) {
                            case 'A':
                            case 'a':
                                vE.llenadoDatos(0, 255);
                                break;
                            case 'U':
                            case 'u':
                                vE.llenadoDatos();
                                break;
                            default:
                                menu = '0';
                                break;
                        }
                    } while (menu == '0');
                    do {
                        System.out.println("Elija operación de vector");
                        System.out.println("a) Rellenar vector");
                        System.out.println("b) Imprimir vector");
                        System.out.println("c) Obtener dato de posición");
                        System.out.println("d) Obtener dato mayor de vector");
                        System.out.println("e) Obtener dato menor de vector");
                        System.out.println("f) Añadir dato a vector");
                        System.out.println("g) Eliminar dato de vector");
                        System.out.println("h) Promedio");
                        System.out.println("i) Obtener posición de un dato");
                        System.out.println("j) Obtener longitud de vector");
                        System.out.println("r) Regresar");
                        menu = Leer.leerChar("Ingrese opción:\t");
                        switch (menu) {
                            case 'a':
                            case 'A':
                                if (vE.getN() == 0) {
                                    System.out.println("Vector sin longitud");
                                    n = Leer.leerInt("Ingrese tamaño del vector:\t");
                                    while (n <= 0) {
                                        n = Leer.leerInt("Ingrese tamaño del vector:\t");
                                    }
                                    vE = new VectorChar(n);
                                }
                                do {
                                    System.out.println("Elija llenado de vector");
                                    System.out.println("a) Aleatorio");
                                    System.out.println("u) Usuario");
                                    menu = Leer.leerChar("Ingrese opción:\t");
                                    switch (menu) {
                                        case 'A':
                                        case 'a':
                                            vE.llenadoDatos(0, 255);
                                            break;
                                        case 'U':
                                        case 'u':
                                            vE.llenadoDatos();
                                            break;
                                        default:
                                            menu = '0';
                                            break;
                                    }
                                } while (menu == '0');
                                break;
                            case 'b':
                            case 'B':
                                op = Leer.leerChar("Ingrese separador de datos:\t");
                                vE.impresiónDatos(op);
                                break;
                            case 'c':
                            case 'C':
                                if (vE.getN() == 0) {
                                    System.out.println("El vector no tiene datos");
                                } else {
                                    int pos = Leer.leerInt("Ingrese posición de dato(0-" + (vE.getN() - 1) + "):\t");
                                    while (pos < 0 || pos >= vE.getN()) {
                                        pos = Leer.leerInt("Ingrese posición de dato(0-" + (vE.getN() - 1) + "):\t");
                                    }
                                    System.out.println("El dato en [" + pos + "] es:" + vE.getDato(pos));
                                }
                                break;
                            case 'd':
                            case 'D':
                                if (vE.getN() == 0) {
                                    System.out.println("El vector no tiene datos");
                                } else {
                                    System.out.println("El dato mayor es: " + vE.getMayor());
                                }
                                break;
                            case 'e':
                            case 'E':
                                if (vE.getN() == 0) {
                                    System.out.println("El vector no tiene datos");
                                } else {
                                    System.out.println("El dato menor es: " + vE.getDatoMenor());
                                }
                                break;
                            case 'f':
                            case 'F':
                                char nvoDato = Leer.leerChar("Ingrese nuevo dato:\t");
                                vE.añadirDato(nvoDato);
                                break;
                            case 'g':
                            case 'G':
                                vE.eliminarDato();
                                break;
                            case 'h':
                            case 'H':
                                if (vE.getN() == 0) {
                                    System.out.println("El vector no tiene datos");
                                } else {
                                    System.out.println("El promedio es: " + vE.getPromedio());
                                }
                                break;
                            case 'i':
                            case 'I':
                                char dato = Leer.leerChar("Ingrese dato a buscar:\t");
                                int pos = vE.getPosición(dato);
                                if (pos != -1) {
                                    System.out.println("El dato " + dato + " está en [" + pos + "]");
                                } else {
                                    System.out.println("El dato no está en el vector");
                                }
                                break;
                            case 'j':
                            case 'J':
                                vE.getLongitudVector();
                                break;
                        }
                    } while (menu != 'r' && menu != 'R');
                    break;
                case 'm':
                case 'M':
                    n = Leer.leerInt("Ingrese tamaño de filas de la matriz:\t");
                    while (n <= 0) {
                        n = Leer.leerInt("Ingrese tamaño de filas de la matriz:\t");
                    }
                    m = Leer.leerInt("Ingrese tamaño de filas de la matriz:\t");
                    while (m <= 0) {
                        m = Leer.leerInt("Ingrese tamaño de filas de la matriz:\t");
                    }
                    MatrizChar mE = new MatrizChar(n, m);
                    do {
                        System.out.println("Elija llenado de matriz");
                        System.out.println("a) Aleatorio");
                        System.out.println("u) Usuario");
                        menu = Leer.leerChar("Ingrese opción:\t");
                        switch (menu) {
                            case 'A':
                            case 'a':
                                if (mE.getN() == 0 && mE.getM() == 0) {
                                    System.out.println("Matriz sin valores");
                                    n = Leer.leerInt("Ingrese tamaño de filas:\t");
                                    while (n <= 0) {
                                        n = Leer.leerInt("Ingrese tamaño de filas:\t");
                                    }
                                    m = Leer.leerInt("Ingrese tamaño de columnas:\t");
                                    while (n <= 0) {
                                        m = Leer.leerInt("Ingrese tamaño de columnas:\t");
                                    }
                                    mE = new MatrizChar(n, m);
                                }
                                mE.llenadoDatos(0, 255);
                                break;
                            case 'U':
                            case 'u':
                                if (mE.getN() == 0 && mE.getM() == 0) {
                                    System.out.println("Matrriz sin valores");
                                    n = Leer.leerInt("Ingrese tamaño de filas:\t");
                                    while (n <= 0) {
                                        n = Leer.leerInt("Ingrese tamaño de filas:\t");
                                    }
                                    m = Leer.leerInt("Ingrese tamaño de columnas:\t");
                                    while (n <= 0) {
                                        m = Leer.leerInt("Ingrese tamaño de columnas:\t");
                                    }
                                    mE = new MatrizChar(n, m);
                                }
                                mE.llenadoDatos();
                                break;
                            default:
                                menu = '0';
                                break;
                        }
                    } while (menu == '0');
                    do {
                        char[] nvoDato;
                        System.out.println("Elija operación de matriz");
                        System.out.println("a) Rellenar matriz");
                        System.out.println("b) Imprimir matriz");
                        System.out.println("c) Obtener dato de fila y columna");
                        System.out.println("d) Obtener dato mayor de matriz");
                        System.out.println("e) Obtener dato menor de matriz");
                        System.out.println("f) Promedio");
                        System.out.println("g) Añadir fila a matriz");
                        System.out.println("h) Añadir columna a matriz");
                        System.out.println("i) Eliminar fila a matriz");
                        System.out.println("j) Eliminar columna a matriz");
                        System.out.println("k) Obtener posición de un dato");
                        System.out.println("l) Obtener longitud de matriz");
                        System.out.println("r) Regresar");
                        menu = Leer.leerChar("Ingrese opción:\t");
                        switch (menu) {
                            case 'a':
                            case 'A':
                                do {
                                    System.out.println("Elija llenado de matriz");
                                    System.out.println("a) Aleatorio");
                                    System.out.println("u) Usuario");
                                    menu = Leer.leerChar("Ingrese opción:\t");
                                    switch (menu) {
                                        case 'A':
                                        case 'a':
                                            if (mE.getN() == 0 && mE.getM() == 0) {
                                                System.out.println("Matriz sin valores");
                                                n = Leer.leerInt("Ingrese tamaño de filas:\t");
                                                while (n <= 0) {
                                                    n = Leer.leerInt("Ingrese tamaño de filas:\t");
                                                }
                                                m = Leer.leerInt("Ingrese tamaño de columnas:\t");
                                                while (n <= 0) {
                                                    m = Leer.leerInt("Ingrese tamaño de columnas:\t");
                                                }
                                                mE = new MatrizChar(n, m);
                                            }
                                            mE.llenadoDatos(0, 255);
                                            break;
                                        case 'U':
                                        case 'u':
                                            if (mE.getN() == 0 && mE.getM() == 0) {
                                                System.out.println("Matrriz sin valores");
                                                n = Leer.leerInt("Ingrese tamaño de filas:\t");
                                                while (n <= 0) {
                                                    n = Leer.leerInt("Ingrese tamaño de filas:\t");
                                                }
                                                m = Leer.leerInt("Ingrese tamaño de columnas:\t");
                                                while (n <= 0) {
                                                    m = Leer.leerInt("Ingrese tamaño de columnas:\t");
                                                }
                                                mE = new MatrizChar(n, m);
                                            }
                                            mE.llenadoDatos();
                                            break;
                                        default:
                                            menu = '0';
                                            break;
                                    }
                                } while (menu == '0');
                                break;
                            case 'b':
                            case 'B':
                                op = Leer.leerChar("Ingrese separador de datos:\t");
                                mE.impresiónDatos(op);
                                break;
                            case 'c':
                            case 'C':
                                if (mE.getN() == 0 && mE.getM() == 0) {
                                    System.out.println("No hay datos");
                                } else {
                                    int fila, columna;
                                    fila = Leer.leerInt("Ingrese fila de dato(0-" + (mE.getN() - 1) + "):\t");
                                    while (fila < 0 || fila >= mE.getN()) {
                                        fila = Leer.leerInt("Ingrese fila de dato(0-" + (mE.getN() - 1) + "):\t");
                                    }
                                    columna = Leer.leerInt("Ingrese columna de dato(0-" + (mE.getM() - 1) + "):\t");
                                    while (columna < 0 || columna >= mE.getM()) {
                                        columna = Leer.leerInt("Ingrese columna de dato(0-" + (mE.getN() - 1) + "):\t");
                                    }
                                    System.out.println("El dato en [" + fila + "][" + columna + "] es:" + mE.getDato(fila, columna));
                                }
                                break;
                            case 'd':
                            case 'D':
                                if (mE.getN() == 0 && mE.getM() == 0) {
                                    System.out.println("No hay datos");
                                } else {
                                    System.out.println("El dato mayor es: " + mE.getDatoMayor());
                                }
                                break;
                            case 'e':
                            case 'E':
                                if (mE.getN() == 0 && mE.getM() == 0) {
                                    System.out.println("No hay datos");
                                } else {
                                    System.out.println("El dato menor es: " + mE.getDatoMenor());
                                }
                                break;
                            case 'f':
                            case 'F':
                                if (mE.getN() == 0 && mE.getM() == 0) {
                                    System.out.println("No hay datos");
                                } else {
                                    System.out.println("El promedio es: " + mE.getPromedio());
                                }
                                break;
                            case 'g':
                            case 'G':
                                nvoDato = new char[mE.getM()];
                                for (int i = 0; i < nvoDato.length; i++) {
                                    nvoDato[i] = Leer.leerChar("Ingrese nuevo dato en la posición [" + i + "]:");
                                }
                                mE.añadirFila(nvoDato);
                                break;
                            case 'h':
                            case 'H':
                                nvoDato = new char[mE.getN()];
                                for (int i = 0; i < nvoDato.length; i++) {
                                    nvoDato[i] = Leer.leerChar("Ingrese nuevo dato en la posición [" + i + "]:");
                                }
                                mE.añadirColumna(nvoDato);
                                break;
                            case 'i':
                            case 'I':
                                mE.eliminarFila();
                                break;
                            case 'j':
                            case 'J':
                                mE.eliminarColumna();
                                break;
                            case 'k':
                            case 'K':
                                char dato = Leer.leerChar("Ingrese dato a buscar:\t");
                                mE.getPosición(dato);
                                break;
                            case 'l':
                            case 'L':
                                mE.getLongitudMatriz();
                                break;
                        }
                    } while (menu != 'r' && menu != 'R');
                    break;
            }

        } while (menu != 's' && menu != 'S');
    }

}
