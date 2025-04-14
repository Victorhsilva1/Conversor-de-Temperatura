package br.dev.victorhugo.conversor_temperatura.model;

public class Temperatura {
    private double celsius;

    // Getter e Setter
    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    // Conversão para Fahrenheit
    public double converterParaFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    // Conversão para Kelvin
    public double converterParaKelvin() {
        return celsius + 273.15;
    }
}
