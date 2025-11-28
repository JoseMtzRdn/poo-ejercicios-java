package Main;

import Datos.Leer;
import SubClase.VectoresDobles;

public class PrbVectores {

    public static void main(String[] args) {
        int n, menu;
        double ini, fin;
        n = Leer.leerInt("Ingrese el tamaño de los vectores:\t");
        while (n <= 0) {
            n = Leer.leerInt("Ingrese el tamaño de los vectores:\t");
        }
        VectoresDobles vD = new VectoresDobles(n);
        ini = Leer.leerDouble("Ingrese el rango de inicio:\t");
        fin = Leer.leerDouble("Ingrese el rango final:\t");
        while (fin <= ini) {
            fin = Leer.leerDouble("Ingrese el rango final:\t");
        }
        vD.llenarVectores(ini, fin);
        do {
            System.out.println("Menú");
            System.out.println("1) Rellenar vectores");
            System.out.println("2) Imprimir vectores");
            System.out.println("3) Operar vectores");
            System.out.println("4) Añadir datos a vectores");
            System.out.println("5) Eliminar datos");
            System.out.println("0) Salir");
            menu = Leer.leerInt("Ingrese la opción que desea ejecutar:\t");
            switch (menu) {
                case 1:
                    if (vD.getN() == 0) {
                        System.out.println("Vectores vacios");
                    } else {
                        ini = Leer.leerDouble("Ingrese el rango de inicio:\t");
                        fin = Leer.leerDouble("Ingrese el rango final:\t");
                        while (fin <= ini) {
                            fin = Leer.leerDouble("Ingrese el rango final:\t");
                        }
                        vD.llenarVectores(ini, fin);
                    }
                    break;
                case 2:
                    char separador = Leer.leerChar("Ingrese separador:\t");
                    vD.imprimirVectores(separador);
                    break;
                case 3:
                    if (vD.getN() == 0) {
                        System.out.println("Vectores vacios");
                    } else {
                        System.out.println("+) Suma");
                        System.out.println("-) Resta");
                        System.out.println("*) Multiplicacion");
                        System.out.println("/) Division");
                        char operador = Leer.leerChar("Ingrese operacion a realizar:\t");
                        while (operador != '+' && operador != '-' && operador != '*' && operador != '/') {
                            System.out.println("Ingrese una de las opciones anteriormente mostradas");
                            operador = Leer.leerChar("Ingrese operacion a realizar:\t");
                        }
                        vD.operacionDatos(operador);
                    }
                    break;
                case 4:
                    double n1,
                     n2;
                    n1 = Leer.leerDouble("Ingrese el valor a añadir al vector 1:\t");
                    n2 = Leer.leerDouble("Ingrese el valor a añadir al vector 2:\t");
                    vD.añadirDatos(n1, n2);
                    break;
                case 5:
                    vD.eliminarDatos();
                    break;
                case 0:
                    System.out.println("GRACIAS POR EJECUTAR");
                    break;
                default:
                    System.out.println("Opcion no encontrada ingrese de nuevo");
                    break;
            }
        } while (menu != 0);

    }
}
