package SubClase;

import SuperClase.Temperatura;

public class TempCelsius extends Temperatura {

    public TempCelsius(double noGrados) {
        super(noGrados);
    }

    @Override
    public void conversión() {
        System.out.println("Conversiones Celsius");
        System.out.println("Fharenheit: " + String.format("%.2f", getFharenheit()) + " °F");
        System.out.println("Kelvin: " + String.format("%.2f", getKelvin()) + " K");
        System.out.println("Rankine: " + String.format("%.2f", getRankine()) + " °R");
    }

    protected double getFharenheit() {
        return ((getNoGrados() * 9) / 5) + 32;
    }

    protected double getKelvin() {
        return getNoGrados() + 273.15;
    }

    protected double getRankine() {
        return ((getNoGrados() * 9) / 5) + 491.67;
    }

}
