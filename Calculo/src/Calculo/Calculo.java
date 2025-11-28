package Calculo;

public class Calculo {

    private int num;

    public int potencia(int pot) {
        int aux = 1;
        if (pot == 0) {
            aux = 1;
        }
        if (pot == 1) {
            aux = getNum();
        }
        if (pot > 1) {
            for (int i = 0; i < pot; i++) {
                aux = aux * getNum();
            }
        }
        return aux;
    }

    public int factorial() {
        int fac = 1;
        for (int i = 1; i <= getNum(); i++) {
            fac = fac * i;
        }
        return fac;
    }

    public void primo() {
        int aux = 0;
        for (int i = 1; i <= getNum(); i++) {
            if (getNum() % i == 0) {
                aux++;
            }
        }
        if (aux != 2) {
            System.out.println("El número " + getNum() + " no es primo");
        } else {
            System.out.println("El número " + getNum() + " si es primo");
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
