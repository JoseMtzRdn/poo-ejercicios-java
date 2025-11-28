package Datos;

import java.util.Scanner;

public class Leer {
    private static Scanner leer = new Scanner(System.in);
    
    public static int leerInt(String msj){
        int aux;
        System.out.print(msj);
        aux = leer.nextInt();
        leer.nextLine();
        return aux;
    }
    
    public static short leerShort(String msj){
        short aux;
        System.out.print(msj);
        aux = leer.nextShort();
        leer.nextLine();
        return aux;
    }
    
    public static long leerLong(String msj){
        long aux;
        System.out.print(msj);
        aux = leer.nextLong();
        leer.nextLine();
        return aux;
    }
    
    public static char leerChar(String msj){
        char aux;
        System.out.print(msj);
        aux = leer.nextLine().charAt(0);
        return aux;
    }
    
    public static String leerString(String msj){
        String aux;
        System.out.print(msj);
        aux = leer.nextLine();
        return aux;
    }
    
    public static boolean leerBool(String msj){
        boolean aux;
        System.out.print(msj);
        aux = leer.nextBoolean();
        leer.nextLine();
        return aux;
    }
    
    public static float leerFloat(String msj){
        float aux;
        System.out.print(msj);
        aux = leer.nextFloat();
        leer.nextLine();
        return aux;
    }
    
    public static double leerDouble(String msj){
        double aux;
        System.out.print(msj);
        aux = leer.nextDouble();
        leer.nextLine();
        return aux;
    }
    
    public static void cleanBuffer(){
        leer = new Scanner(System.in);
    }
}
