package Main;

import Datos.Leer;
import Tiempo.Tiempo;

public class PrbTiempo {

    public static void main(String[] args) {
        Tiempo tiem = new Tiempo();
        String op;
        do {
            tiem.setSeg(Leer.leerInt("Ingrese los segundos a convertir:\t"));
            tiem.conversionTotal();
            op = Leer.leerString("Ingrese $ si desea terminar la ejecución, de lo contrario cualquier tecla:\t");
        } while (!(op.equals("$")));
        System.out.println("GRACIAS POR EJECUTAR :D");
    }
}
