/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import MatrizNum.MatrizNum;
import Datos.Leer;

public class PrbMatrizNum {

    public static void main(String[] args) {
        int fil, col, n;
        System.out.println("Bienvenido a programa de matriz numerica");
        n = Leer.leerInt("Ingrese el tamaño de la matriz n x n (mayor a cero):\t");
        while (n <= 0) {
            System.out.println("Valor incorrecto, ingrese de nuevo");
            n = Leer.leerInt("Ingrese el tamaño de la matriz n x n (mayor a cero):\t");
        }
        MatrizNum Mnum = new MatrizNum(n);
        char op;
        do {
            System.out.println("Menú");
            System.out.println("a)Llenar matriz por usuario");
            System.out.println("b)Llenar matriz aleatoriamente");
            System.out.println("c)Imprimir matriz");
            System.out.println("d)Suma de diagonales principal y secundaria");
            System.out.println("e)Obtener dato");
            System.out.println("f)Modificar dato");
            System.out.println("g)Contar negativos, positivos y ceros");
            System.out.println("h)Contar números primos");
            System.out.println("s)Salir");
            op = Leer.leerChar("Ingrese la opción que desea:\t");
            switch (op) {
                case 'a':
                case 'A':
                    Mnum.llenadoDatos();
                    break;
                case 'b':
                case 'B':
                    Mnum.llenadoDatos(-9, 9);
                    break;
                case 'c':
                case 'C':
                    Mnum.impDatos();
                    break;
                case 'd':
                case 'D':
                    System.out.println("La suma de las diagonales es: " + Mnum.diagPrinSec());
                    break;
                case 'e':
                case 'E':
                    fil = Leer.leerInt("Ingrese la fila del dato a obtener de (0 a " + (n - 1) + "):\t");
                    while (fil < 0 || fil >= n) {
                        System.out.println("Valor incorrecto, ingrese de nuevo...");
                        fil = Leer.leerInt("Ingrese la fila del dato a obtener de (0 a " + (n - 1) + "):\t");
                    }
                    col = Leer.leerInt("Ingrese la columna del dato a obtener de (0 a " + (n - 1) + "):\t");
                    while (col < 0 || col >= n) {
                        System.out.println("Valor incorrecto, ingrese de nuevo...");
                        col = Leer.leerInt("Ingrese la columna del dato a obtener de (0 a " + (n - 1) + "):\t");
                    }
                    System.out.println("El valor es: " + Mnum.obtenerDato(fil, col));
                    break;
                case 'f':
                case 'F':
                    fil = Leer.leerInt("Ingrese la fila del dato a modificar de (0 a " + (n - 1) + "):\t");
                    while (fil < 0 || fil >= n) {
                        System.out.println("Valor incorrecto, ingrese de nuevo...");
                        fil = Leer.leerInt("Ingrese la fila del dato a modificar de (0 a " + (n - 1) + "):\t");
                    }
                    col = Leer.leerInt("Ingrese la columna del dato a modificar de (0 a " + (n - 1) + "):\t");
                    while (col < 0 || col >= n) {
                        System.out.println("Valor incorrecto, ingrese de nuevo...");
                        col = Leer.leerInt("Ingrese la columna del dato a modificar de (0 a " + (n - 1) + "):\t");
                    }
                    Mnum.modificarDato(fil, col);
                    break;
                case 'g':
                case 'G':
                    Mnum.contDatos();
                    break;
                case 'h':
                case 'H':
                    Mnum.contarPrimos();
                    break;
                case 's':
                case 'S':
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no encontrada");
                    break;
            }
        } while (op != 's' && op != 'S');
        System.out.println("GRACIAS POR EJECUTAR :D");
    }
}
