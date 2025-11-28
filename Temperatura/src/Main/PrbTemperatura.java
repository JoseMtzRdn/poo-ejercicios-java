package Main;

import SubClase.*;
import Datos.Leer;

public class PrbTemperatura {

    public static void main(String[] args) {
        double noGrados;
        String op;
        do {
            System.out.println("Elija temperatura");
            System.out.println("a) Celsius");
            System.out.println("b) Fharenheit");
            System.out.println("s) Salir");
            op = Leer.leerString("Ingrese opción:\t").toLowerCase();
            switch (op) {
                case "a":
                case "celsius":
                    System.out.println("CELSIUS");
                    noGrados = Leer.leerDouble("Ingrese el número de grados a convertir:\t");
                    TempCelsius tempcel = new TempCelsius(noGrados);
                    tempcel.conversión();
                    break;
                case "b":
                case "fharenheit":
                    System.out.println("FHARENHEIT");
                    noGrados = Leer.leerDouble("Ingrese el número de grados a convertir:\t");
                    TempFharenheit tempfar = new TempFharenheit(noGrados);
                    tempfar.conversión();
                    break;
                case "s":
                case "salir":
                    System.out.println("GRACIAS POR EJECUTAR");
                    break;
                default:
                    System.out.println("Opción no encontrada");
                    break;
            }
        } while (!(op.equals("s") || op.equals("salir")));
    }
}
