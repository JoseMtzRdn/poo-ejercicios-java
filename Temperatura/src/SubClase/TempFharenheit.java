package SubClase;

import SuperClase.Temperatura;

public class TempFharenheit extends Temperatura {

    public TempFharenheit(double noGrados) {
        super(noGrados);
    }

    @Override
    public void conversión() {
        System.out.println("Conversiones Fharenheit");
        System.out.println("Celsius: " + String.format("%.2f", getCelsius()) + " °C");
        System.out.println("Kelvin: " + String.format("%.2f", getKelvin()) + " K");
        System.out.println("Rankine: " + String.format("%.2f", getRankine()) + " °R");
    }

    protected double getCelsius() {
        return ((getNoGrados() - 32) * 5) / 9;
    }

    protected double getKelvin() {
        return (((getNoGrados() - 32) * 5) / 9) + 273.15;
    }

    protected double getRankine() {
        return getNoGrados() + 459.67;
    }

}
