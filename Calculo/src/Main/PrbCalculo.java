package Main;

import Calculo.Calculo;
import Datos.*;

public class PrbCalculo {

    public static void main(String[] args) {
        Calculo cal = new Calculo();
        char op;
        do {
            System.out.println("MENU");
            System.out.println("a) Calcular potencia");
            System.out.println("b) Calcular factorial");
            System.out.println("c) Número primo");
            System.out.println("$) Salir");
            op = Leer.leerChar("Selecciona opción:\t");
            switch (op) {
                case 'a':
                case 'A':
                    cal.setNum(Leer.leerInt("Digite un número entero positivo:\t"));
                    while (cal.getNum() < 0) {
                        System.out.println("Número negativo, vuelva a ingresar");
                        cal.setNum(Leer.leerInt("Digite un número de tipo entero:\t"));
                    }
                    int pot = Leer.leerInt("Ingresa potencia a elevar el número:\t");
                    System.out.println("El número " + cal.getNum() + " elevado a la potencia " + pot + " es: " + cal.potencia(pot));
                    break;
                case 'b':
                case 'B':
                    cal.setNum(Leer.leerInt("Digite un número entero positivo:\t"));
                    while (cal.getNum() < 0) {
                        System.out.println("Número negativo, vuelva a ingresar");
                        cal.setNum(Leer.leerInt("Digite un número de tipo entero:\t"));
                    }
                    System.out.println("El factorial de " + cal.getNum() + " es: " + cal.factorial());
                    break;
                case 'c':
                case 'C':
                    cal.setNum(Leer.leerInt("Digite un número entero positivo:\t"));
                    while (cal.getNum() < 0) {
                        System.out.println("Número negativo, vuelva a ingresar");
                        cal.setNum(Leer.leerInt("Digite un número de tipo entero:\t"));
                    }
                    cal.primo();
                    break;
                case '$':
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (!(op == '$'));

    }
}
