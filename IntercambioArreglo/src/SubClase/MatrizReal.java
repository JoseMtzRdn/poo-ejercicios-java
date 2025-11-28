package SubClase;

import Datos.*;
import SuperClase.Arreglo;
import Interfaces.OperacionesMatriz;

public class MatrizReal extends Arreglo implements OperacionesMatriz {

    private int m;
    double mat[][];

    public MatrizReal(int n, int m) {
        super(n);
        this.m = m;
        mat = new double[n][m];
    }

    @Override
    public void llenadoDatos() {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = Leer.leerDouble("Ingrese dato en la posición [" + i + "][" + j + "]:\t");
            }
        }
        System.out.println("***\nLlenado completo\n***");
    }

    @Override
    public void llenadoDatos(int ini, int fin) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = Aleatorio.getDatoDouble(ini, fin);
            }
        }
        System.out.println("***\nLlenado completo\n***");
    }

    @Override
    public void impresiónDatos(char op) {
        for (int i = 0; i < mat.length; i++) {
            System.out.print("[");
            for (int j = 0; j < mat[i].length; j++) {
                if (j != 0) {
                    System.out.print(op);
                }
                System.out.print(String.format("%.2f", mat[i][j]));
            }
            System.out.println("]");
        }
    }

    @Override
    public void intercambioFila(int filaIni, int filaFin) {
        double aux[][] = new double[getN()][getM()];
        for (int i = 0; i < mat.length; i++) {
            if (i == filaIni) {
                System.arraycopy(mat[filaIni], 0, aux[filaFin], 0, getM());
            } else if (i == filaFin) {
                System.arraycopy(mat[filaFin], 0, aux[filaIni], 0, getM());
            } else {
                System.arraycopy(mat[i], 0, aux[i], 0, getM());
            }
        }
        mat = aux;
        System.out.println("Intercambio realizado con exito :D");
    }

    @Override
    public void intercambioColumna(int colIni, int colFin) {
        double aux;
        for (int i = 0; i < mat.length; i++) {
            aux = mat[i][colIni];
            mat[i][colIni] = mat[i][colFin];
            mat[i][colFin] = aux;
        }
        System.out.println("Intercambio realizado con exito :D");
    }

    @Override
    public void trasponerMatriz() {
        double aux[][] = new double[getM()][getN()];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                aux[j][i] = mat[i][j];
            }
        }
        mat = aux;
        int nn = getM();
        setM(getN());
        setN(nn);
        System.out.println("Matriz traspuesta correctamente");
    }

    /**
     * @return the m
     */
    public int getM() {
        return m;
    }

    /**
     * @param m the m to set
     */
    protected void setM(int m) {
        this.m = m;
    }

}
