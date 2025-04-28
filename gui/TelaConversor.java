package br.dev.victorhugo.conversor_temperatura.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.dev.victorhugo.conversor_temperatura.*;
import br.dev.victorhugo.conversor_temperatura.model.Temperatura;

public class TelaConversor {
	private JLabel lblCelsius;
	private JTextField textCelsius;
	private JButton btnKelvin;
	private JButton btnFahreinheit;
	private JLabel lblResultado;
	private JLabel lblMensagemErro;

	public void criarTelaConversor() {

		// Criando a tela onde será colocado as informações
		JFrame tela = new JFrame();
		tela.setSize(530, 350);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Conversor de Temperatura");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);

		// Texto do Celsius
		JLabel lblCelsius = new JLabel();
		lblCelsius.setText("Temperatura em graus celsius:");
		lblCelsius.setBounds(180, 0, 200, 60);

		// botão para converter para Kelvin
		JButton btnKelvin = new JButton();
		btnKelvin.setText("Kelvin");
		btnKelvin.setBounds(150, 110, 220, 30);

		// botão para converter para Fahreinheit
		JButton btnFahreinheit = new JButton();
		btnFahreinheit.setText("Fahreinheit");
		btnFahreinheit.setBounds(150, 160, 220, 30);
		;
		
		//Local para mostrar o resultado
		JLabel lblResultado = new JLabel();
		lblResultado.setBounds(230, 260, 230, 30);
		;
		
		//Local para mostrar a mensagem de erro
		JLabel lblMensagemErro = new JLabel();
		lblMensagemErro.setBounds(190, 200, 230, 30);
		lblMensagemErro.setForeground(Color.red);
		
		//Caixa de texto para inserir os Celsius
		JTextField textCelsius = new JTextField();
		textCelsius.setBounds(20, 60, 480, 30);

		btnKelvin.addActionListener(new ActionListener() {

			@Override
			// Condição para a inserção de apenas números
			public void actionPerformed(ActionEvent e) {
				String txtCelsius = textCelsius.getText();
				try {
					double celsius = Double.parseDouble(txtCelsius);

					Temperatura kelvin = new Temperatura();
					kelvin.setCelsius(celsius);
					celsius = kelvin.converterParaKelvin();
					lblResultado.setText(celsius + " KELVIN");
					lblMensagemErro.setText("");
					// Formatação do texto
				} catch (NumberFormatException e2) {
					lblMensagemErro.setText("Insira apenas números!");
					

				}
			}
		});

		btnFahreinheit.addActionListener(new ActionListener() {
			@Override
			// Condição para a inserção de apenas números no botão
			public void actionPerformed(ActionEvent e) {
				String txtCelsius = textCelsius.getText();
				try {
					double celsius = Double.parseDouble(txtCelsius);

					Temperatura fahreinheit = new Temperatura();
					celsius = fahreinheit.converterParaFahreinheit();
					lblResultado.setText(celsius + " FAREHINHEIT");
					lblMensagemErro.setText("");
					// Formatação do texto
				} catch (NumberFormatException e2) {
					lblMensagemErro.setText("Insira apenas números!");
					
				}
			}
		});
		
		//Adicionando os conteúdos na tela
		tela.getContentPane().add(lblCelsius);
		tela.getContentPane().add(btnKelvin);
		tela.getContentPane().add(btnFahreinheit);
		tela.getContentPane().add(lblResultado);
		tela.getContentPane().add(lblMensagemErro);
		tela.getContentPane().add(textCelsius);
		
		//Deixando a tela visível 
		tela.setVisible(true);

	}

}