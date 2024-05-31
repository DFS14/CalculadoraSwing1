package calculadoraSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Font;
import javax.swing.JTextField;

public class CalculadoraSwing1 extends JFrame implements ActionListener {

    private static final long serialVersionUID = 959431443786654859L;
    private JButton[] botoesNumeros;
    private JButton[] botoesOperadores;
    private double primeiroNumero;
    private double segundoNumero;
    private String operador;
	private JTextField display;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            CalculadoraSwing1 window = new CalculadoraSwing1();
            window.setVisible(true);
            SwingUtilities.invokeLater(new Runnable() {

        		@Override

        		public void run() {

        			new CalculadoraSwing();

        		}
        	});
            
        });
    }

    public CalculadoraSwing1() {
    	setBackground(new Color(0, 0, 0));
        setTitle("CALCULADORA");
        setSize(400, 369);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());
        setVisible(true);
        
     // Painel do display

        display = new JTextField();
        display.setEditable(false);
        getContentPane().add(display, BorderLayout.NORTH);

        // Painel dos botões
        JPanel painelBotoes = new JPanel();
        painelBotoes.setBackground(new Color(255, 255, 255));

        // Criar e adicionar botões numéricos
        botoesNumeros = new JButton[10];
        for (int i = 0; i < 10; i++) {
            botoesNumeros[i] = new JButton(Integer.toString(i));
            botoesNumeros[i].addActionListener(this);
            painelBotoes.add(botoesNumeros[i]);
        }

        // Criar e adicionar botões de operadores
        botoesOperadores = new JButton[4];
        botoesOperadores[0] = new JButton("+");
        botoesOperadores[1] = new JButton("-");
        botoesOperadores[2] = new JButton("*");
        botoesOperadores[3] = new JButton("/");
        
        // Criar botão de resultado

        JButton botaoResultado = new JButton("=");
        botaoResultado.setFont(new Font("Tahoma", Font.BOLD, 14));
        botaoResultado.setBounds(191, 236, 96, 80);
        botaoResultado.addActionListener(this);
        painelBotoes.setLayout(null);
        painelBotoes.add(botaoResultado);


        // Criar botão de limpar

        JButton botaoLimpar = new JButton("C");
        botaoLimpar.setFont(new Font("Tahoma", Font.BOLD, 14));
        botaoLimpar.setBounds(287, 236, 96, 80);
        botaoLimpar.addActionListener(this);
        painelBotoes.add(botaoLimpar);

        getContentPane().add(painelBotoes, BorderLayout.CENTER);
        setVisible(true);

        for (JButton botao : botoesOperadores) {
            botao.addActionListener(this);
            painelBotoes.add(botao);
            
        }
        

        getContentPane().add(painelBotoes, BorderLayout.CENTER);
        
        JButton operadores = new JButton("*");
        operadores.setFont(new Font("Tahoma", Font.BOLD, 14));
        operadores.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        operadores.setBounds(-1, 236, 96, 80);
        painelBotoes.add(operadores);
        
        JButton operadores_1 = new JButton("/");
        operadores_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        operadores_1.setBounds(95, 236, 96, 80);
        painelBotoes.add(operadores_1);
        
        JButton botaoLimpar_1 = new JButton("C");
        botaoLimpar_1.setBounds(445, 245, 96, 80);
        painelBotoes.add(botaoLimpar_1);
        
        JButton operadores_3 = new JButton("8");
        operadores_3.setFont(new Font("Tahoma", Font.BOLD, 14));
        operadores_3.setBounds(-1, 156, 96, 80);
        painelBotoes.add(operadores_3);
        
        JButton operadores_1_2 = new JButton("9");
        operadores_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
        operadores_1_2.setBounds(95, 156, 96, 80);
        painelBotoes.add(operadores_1_2);
        
        JButton botaoResultado_2 = new JButton("+");
        botaoResultado_2.setFont(new Font("Tahoma", Font.BOLD, 14));
        botaoResultado_2.setBounds(191, 156, 96, 80);
        painelBotoes.add(botaoResultado_2);
        
        JButton botaoLimpar_2 = new JButton("-");
        botaoLimpar_2.setFont(new Font("Tahoma", Font.BOLD, 14));
        botaoLimpar_2.setBounds(287, 156, 96, 80);
        painelBotoes.add(botaoLimpar_2);
        
        JButton operadores_3_1 = new JButton("0");
        operadores_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        operadores_3_1.setBounds(-1, 0, 96, 80);
        painelBotoes.add(operadores_3_1);
        
        JButton operadores_1_2_1 = new JButton("1");
        operadores_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        operadores_1_2_1.setBounds(95, 0, 96, 80);
        painelBotoes.add(operadores_1_2_1);
        
        JButton botaoResultado_2_1 = new JButton("2");
        botaoResultado_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        botaoResultado_2_1.setBounds(191, 0, 96, 80);
        painelBotoes.add(botaoResultado_2_1);
        
        JButton botaoLimpar_2_1 = new JButton("3");
        botaoLimpar_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        botaoLimpar_2_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        botaoLimpar_2_1.setBounds(287, 0, 96, 80);
        painelBotoes.add(botaoLimpar_2_1);
        
        JButton operadores_4 = new JButton("4");
        operadores_4.setFont(new Font("Tahoma", Font.BOLD, 14));
        operadores_4.setBounds(-1, 79, 96, 80);
        painelBotoes.add(operadores_4);
        
        JButton operadores_1_3 = new JButton("5");
        operadores_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
        operadores_1_3.setBounds(95, 79, 96, 80);
        painelBotoes.add(operadores_1_3);
        
        JButton botaoResultado_3 = new JButton("6");
        botaoResultado_3.setFont(new Font("Tahoma", Font.BOLD, 14));
        botaoResultado_3.setBounds(191, 79, 96, 80);
        painelBotoes.add(botaoResultado_3);
        
        JButton botaoLimpar_3 = new JButton("7");
        botaoLimpar_3.setFont(new Font("Tahoma", Font.BOLD, 14));
        botaoLimpar_3.setBounds(287, 79, 96, 80);
        painelBotoes.add(botaoLimpar_3);
        
        
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
    	String comando = e.getActionCommand();

    	display = null;
		if (comando.equals("+") || comando.equals("-") || comando.equals("*") || comando.equals("/")) {
    		primeiroNumero = Double.parseDouble(display.getText());
    		operador = comando;
    		display.setText("");
    	} else if (comando.equals("=")) {
    		segundoNumero = Double.parseDouble(display.getText()); 
    		double resultado = 0;
    		switch (operador) {
    		case "+":
    			resultado = primeiroNumero + segundoNumero;

    			break;
    		case "-":
    			resultado = primeiroNumero - segundoNumero;
    			break;
    		case "*":
    			resultado = primeiroNumero * segundoNumero;
    			break;
    		case "/":
    			if (segundoNumero != 0) {
    				resultado = primeiroNumero / segundoNumero;
    			} else {
    				JOptionPane.showMessageDialog(this, "Não é possível dividir por zero!", "Erro", JOptionPane.ERROR_MESSAGE);
    			}
    			break;
    		}
    		display.setText(Double.toString(resultado));
    	} else if (comando.equals("C")) {
    		display.setText("");
    	} else {
    		display.setText(display.getText() + comando);
    	}
    }
    }
