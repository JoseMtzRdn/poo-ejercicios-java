package Main;

import SubClase.CalculadoraBásica;
import Datos.Leer;

public class PrbCalculadoraBásica {

    public static void main(String[] args) {
        double n1 = Leer.leerDouble("Ingrese primer número:\t");
        CalculadoraBásica cB = new CalculadoraBásica(n1);
        cB.setN2(Leer.leerDouble("Ingrese segundo número:\t"));
        char op;
        do {
            System.out.println("Elija una operación");
            System.out.println("+) Suma");
            System.out.println("-) Resta");
            System.out.println("*) Multiplicación");
            System.out.println("/) División");
            System.out.println("m) Modificar datos");
            System.out.println("s) Salir");
            op = Leer.leerChar("Ingrese opción:\t");
            switch (op) {
                case '+':
                case '-':
                case '*':
                case '/':
                    System.out.println("El resultado es: " + cB.getResultado(op));
                    break;
                case 'm':
                case 'M':
                    n1 = Leer.leerDouble("Ingrese primer número:\t");
                    cB = new CalculadoraBásica(n1);
                    cB.setN2(Leer.leerDouble("Ingrese segundo número:\t"));
                    break;
            }
        } while (op != 's' && op != 'S');

    }
}
