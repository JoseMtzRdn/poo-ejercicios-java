package SubClase;

import Interfaces.*;
import SuperClase.Calculadora;

public class CalculadoraBásica extends Calculadora implements Suma, Resta, Multiplicación, División {

    public CalculadoraBásica(double n1) {
        super(n1);
    }

    @Override
    public double getResultado(char oper) {
        switch (oper) {
            case '+':
                return getSuma();
            case '-':
                return getResta();
            case '*':
                return getMultiplicación();
            case '/':
                return getDivisión();
        }
        return 0.0;
    }

    @Override
    public double getSuma() {
        return getN1() + getN2();
    }

    @Override
    public double getResta() {
        return getN1() - getN2();
    }

    @Override
    public double getMultiplicación() {
        return getN1() * getN2();
    }

    @Override
    public double getDivisión() {
        return getN1() / getN2();
    }

}
