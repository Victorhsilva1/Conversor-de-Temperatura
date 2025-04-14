package br.dev.victorhugo.conversor_temperatura.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaConversor {

    public static void main(String[] args) {
        // Janela
        JFrame tela = new JFrame("Conversor de Temperatura");
        tela.setSize(400, 300);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);

        // Label Celsius
        JLabel labelCelsius = new JLabel("Temperatura (°C):");
        labelCelsius.setBounds(30, 30, 150, 25);
        tela.add(labelCelsius);

        // Campo de texto para entrada em Celsius
        JTextField textCelsius = new JTextField();
        textCelsius.setBounds(180, 30, 100, 25);
        tela.add(textCelsius);

        // Botão para Kelvin
        JButton buttonKelvin = new JButton("Converter para Kelvin");
        buttonKelvin.setBounds(30, 80, 250, 30);
        tela.add(buttonKelvin);

        // Botão para Fahrenheit
        JButton buttonFahrenheit = new JButton("Converter para Fahrenheit");
        buttonFahrenheit.setBounds(30, 120, 250, 30);
        tela.add(buttonFahrenheit);

        // Mostrar o resultado
        JLabel labelResultado = new JLabel("Resultado:");
        labelResultado.setBounds(30, 170, 300, 25);
        tela.add(labelResultado);

 

        // Exibir janela
        tela.setVisible(true);
    }
}