package Datos;

/**
 *
 * @author YAEL
 */
public class Aleatorio {

    public static int getDatoInt(int ini, int fin) {
        return (int) (Math.random() * ((fin + 1) - ini)) + ini;
    }

    public static short getDatoShort(short ini, short fin) {
        int aux = (int) (Math.random() * ((fin + 1) - ini)) + ini;
        return (short) aux;
    }

    public static long getDatoLong(long ini, long fin) {
        return (long) (Math.random() * ((fin + 1) - ini)) + ini;
    }

    public static char getDatoChar(int ini, int fin) {
        int aux = (int) (Math.random() * ((fin + 1) - ini)) + ini;
        return (char) aux;
    }

    public static char getDatoCharAZUpper() {
        int aux = (char) (Math.random() * ((90 + 1) - 65)) + 65;
        return (char) aux;
    }

    public static char getDatoCharAZLower() {
        int aux = (int) (Math.random() * ((122 + 1) - 97)) + 97;
        return (char) aux;
    }

    public static char getDatoCharAZ() {
        int aux = (int) (Math.random() * ((122 + 1) - 65)) + 65;
        while (aux > 90 && aux < 97) {
            aux = (int) (Math.random() * ((122 + 1) - 65)) + 65;
        }
        return (char) aux;
    }

    public static float getDatoFloat(float ini, float fin, int noDec){
        float aux = (float) (Math.random() * (fin - ini)) + ini;
        return Float.parseFloat(String.format("%." + noDec + "f", aux));
    }
    
    public static float getDatoFloat(float ini, float fin){
        return (float) (Math.random() * (fin - ini)) + ini;
    }
    
    public static double getDatoDouble(double ini, double fin, double noDec){
        double aux = (Math.random() * (fin - ini)) + ini;
        return Double.parseDouble(String.format("%." + noDec + "f", aux));
    }
    
    public static double getDatoDouble(double ini, double fin){
        return (Math.random() * (fin - ini)) + ini;
    }

}
