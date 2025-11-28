package SubClase;

import Datos.Aleatorio;
import SuperClase.Vectores;
import Interfaces.Operaciones;

public class VectoresDobles extends Vectores implements Operaciones {

    public VectoresDobles(int n) {
        super(n);
    }

    @Override
    public void llenarVectores(double ini, double fin) {
        for (int i = 0; i < vec1.length; i++) {
            vec1[i] = Aleatorio.getDatoDouble(ini, fin);
        }
        for (int i = 0; i < vec2.length; i++) {
            vec2[i] = Aleatorio.getDatoDouble(ini, fin);
        }
        System.out.println("Llenado completo");
    }

    @Override
    public void imprimirVectores(char separador) {
        System.out.println("IMPRESION DE VECTORES");
        System.out.println("Vector 1");
        System.out.print("[");
        for (int i = 0; i < vec1.length; i++) {
            if (i != 0) {
                System.out.print(separador);
            }
            System.out.print(String.format("%.2f", vec1[i]));
        }
        System.out.println("]");
        System.out.println("Vector 2");
        System.out.print("[");
        for (int i = 0; i < vec2.length; i++) {
            if (i != 0) {
                System.out.print(separador);
            }
            System.out.print(String.format("%.2f", vec2[i]));
        }
        System.out.println("]");
    }

    @Override
    public void operacionDatos(char operador) {
        double operacion[] = new double[getN()];
        switch (operador) {
            case '+':
                for (int i = 0, aux = 0; i < vec1.length && aux < vec2.length; i++, aux++) {
                    operacion[i] = vec1[i] + vec2[aux];
                }
                System.out.println("SUMA:");
                System.out.print("[");
                for (int i = 0; i < operacion.length; i++) {
                    if (i != 0) {
                        System.out.print("|");
                    }
                    System.out.print(String.format("%.2f", operacion[i]));
                }
                System.out.println("]");
                break;
            case '-':
                for (int i = 0, aux = 0; i < vec1.length && aux < vec2.length; i++, aux++) {
                    operacion[i] = vec1[i] - vec2[aux];
                }
                System.out.println("RESTA:");
                System.out.print("[");
                for (int i = 0; i < operacion.length; i++) {
                    if (i != 0) {
                        System.out.print("|");
                    }
                    System.out.print(String.format("%.2f", operacion[i]));
                }
                System.out.println("]");
                break;
            case '*':
                for (int i = 0, aux = 0; i < vec1.length && aux < vec2.length; i++, aux++) {
                    operacion[i] = vec1[i] * vec2[aux];
                }
                System.out.println("MULTIPLICACION:");
                System.out.print("[");
                for (int i = 0; i < operacion.length; i++) {
                    if (i != 0) {
                        System.out.print("|");
                    }
                    System.out.print(String.format("%.2f", operacion[i]));
                }
                System.out.println("]");
                break;
            case '/':
                for (int i = 0, aux = 0; i < vec1.length && aux < vec2.length; i++, aux++) {
                    operacion[i] = vec1[i] / vec2[aux];
                }
                System.out.println("DIVISION:");
                System.out.print("[");
                for (int i = 0; i < operacion.length; i++) {
                    if (i != 0) {
                        System.out.print("|");
                    }
                    System.out.print(String.format("%.2f", operacion[i]));
                }
                System.out.println("]");
                break;
        }
    }

    @Override
    public void añadirDatos(double n1, double n2) {
        double aux[] = new double[getN() + 1];
        System.arraycopy(vec1, 0, aux, 0, getN());
        aux[getN()] = n1;
        double aux2[] = new double[getN() + 1];
        System.arraycopy(vec2, 0, aux2, 0, getN());
        aux2[getN()] = n2;
        setN(getN() + 1);
        vec1 = aux;
        vec2 = aux2;
        System.out.println("Datos añadidos");
    }

    @Override
    public void eliminarDatos() {
        if (getN() == 0) {
            System.out.println("No hay elementos a eliminar");
        } else {
            double aux[] = new double[getN() - 1];
            double aux2[] = new double[getN() - 1];
            System.arraycopy(vec1, 0, aux, 0, getN() - 1);
            System.arraycopy(vec2, 0, aux2, 0, getN() - 1);
            vec1 = aux;
            vec2 = aux2;
            setN(getN() - 1);
            System.out.println("Datos eliminados");
        }
    }

}
