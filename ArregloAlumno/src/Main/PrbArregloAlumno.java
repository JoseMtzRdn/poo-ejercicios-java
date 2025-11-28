/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Datos.*;
import SubClase.VectorAlumnoHalcón;

public class PrbArregloAlumno {

    public static void main(String[] args) {
        int n;
        String op;
        n = Leer.leerInt("Ingrese el número de alumnos:\t");
        while (n <= 0) {
            n = Leer.leerInt("Ingrese el número de alumnos:\t");
        }
        VectorAlumnoHalcón vAH = new VectorAlumnoHalcón(n);
        vAH.llenarVector();
        do {
            System.out.println("Elija una opción");
            System.out.println("a) Imprimir alumnos");
            System.out.println("b) Imprimir alumno especifico");
            System.out.println("c) Añadir alumno");
            System.out.println("d) Eliminar alumno");
            System.out.println("e) Obtener mayor promedio");
            System.out.println("f) Obtener menor promedio");
            System.out.println("s) Salir");
            op = Leer.leerString("Ingrese opción:\t").toLowerCase();
            switch (op) {
                case "a":
                    vAH.impresiónVector();
                    break;
                case "b":
                    String noCtrl = Leer.leerString("Ingrese un número de control a imprimir:\t");
                    vAH.impresiónVector(noCtrl);
                    break;
                case "c":
                    vAH.añadirFila();
                    break;
                case "d":
                    noCtrl = Leer.leerString("Ingrese un número de control a eliminar:\t");
                    vAH.eliminarFila(noCtrl);
                    break;
                case "e":
                    vAH.mayorProm();
                    break;
                case "f":
                    vAH.menorProm();
                    break;
            }
        } while (!(op.equals("s") || op.equals("salir")));

    }
}
