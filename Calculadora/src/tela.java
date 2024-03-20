import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela {

	private JFrame frmCalculadora;
	private JTextField txtField;
	double numero1;
	double numero2;
	double resultado;
	String operacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 236, 373);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		txtField = new JTextField();
		txtField.setForeground(Color.PINK);
		txtField.setBackground(Color.GRAY);
		txtField.setHorizontalAlignment(SwingConstants.RIGHT);
		txtField.setFont(new Font("Times New Roman", Font.BOLD, 28));
		txtField.setBounds(22, 11, 186, 38);
		frmCalculadora.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		JButton btnsoma = new JButton("+");
		btnsoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "+";
			}
		});
		btnsoma.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnsoma.setBackground(Color.PINK);
		btnsoma.setForeground(Color.MAGENTA);
		btnsoma.setBounds(169, 110, 39, 38);
		frmCalculadora.getContentPane().add(btnsoma);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn3.getText();
				txtField.setText(IngressarNumero);

			}
		});
		btn3.setForeground(Color.BLACK);
		btn3.setBackground(Color.PINK);
		btn3.setBounds(120, 208, 39, 38);
		frmCalculadora.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn0.getText();
				txtField.setText(IngressarNumero);

			}
		});
		btn0.setBackground(Color.PINK);
		btn0.setForeground(Color.BLACK);
		btn0.setBounds(22, 257, 39, 38);
		frmCalculadora.getContentPane().add(btn0);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn2.getText();
				txtField.setText(IngressarNumero);

			}
		});
		btn2.setBackground(Color.PINK);
		btn2.setForeground(Color.BLACK);
		btn2.setBounds(71, 208, 39, 38);
		frmCalculadora.getContentPane().add(btn2);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn9.getText();
				txtField.setText(IngressarNumero);

			}
		});
		btn9.setForeground(Color.BLACK);
		btn9.setBackground(Color.PINK);
		btn9.setBounds(120, 110, 39, 38);
		frmCalculadora.getContentPane().add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn8.getText();
				txtField.setText(IngressarNumero);

			}
		});
		btn8.setForeground(Color.BLACK);
		btn8.setBackground(Color.PINK);
		btn8.setBounds(71, 110, 39, 38);
		frmCalculadora.getContentPane().add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn7.getText();
				txtField.setText(IngressarNumero);

			}
		});
		btn7.setForeground(Color.BLACK);
		btn7.setBackground(Color.PINK);
		btn7.setBounds(22, 110, 39, 38);
		frmCalculadora.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn4.getText();
				txtField.setText(IngressarNumero);

			}
		});
		btn4.setForeground(Color.BLACK);
		btn4.setBackground(Color.PINK);
		btn4.setBounds(22, 159, 39, 38);
		frmCalculadora.getContentPane().add(btn4);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "-";
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnsub.setForeground(Color.MAGENTA);
		btnsub.setBackground(Color.PINK);
		btnsub.setBounds(169, 159, 39, 38);
		frmCalculadora.getContentPane().add(btnsub);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn6.getText();
				txtField.setText(IngressarNumero);

			}
		});
		btn6.setForeground(Color.BLACK);
		btn6.setBackground(Color.PINK);
		btn6.setBounds(120, 159, 39, 38);
		frmCalculadora.getContentPane().add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn5.getText();
				txtField.setText(IngressarNumero);

			}
		});
		btn5.setForeground(Color.BLACK);
		btn5.setBackground(Color.PINK);
		btn5.setBounds(71, 159, 39, 38);
		frmCalculadora.getContentPane().add(btn5);
		
		JButton btnc = new JButton("C");
		btnc.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");
			}
		});
		btnc.setForeground(Color.MAGENTA);
		btnc.setBackground(Color.PINK);
		btnc.setBounds(169, 60, 39, 38);
		frmCalculadora.getContentPane().add(btnc);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn1.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn1.setForeground(Color.BLACK);
		btn1.setBackground(Color.PINK);
		btn1.setBounds(22, 208, 39, 38);
		frmCalculadora.getContentPane().add(btn1);
		
		JButton btnmult = new JButton("*");
		btnmult.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "*";
			}
		});
		btnmult.setForeground(Color.MAGENTA);
		btnmult.setBackground(Color.PINK);
		btnmult.setBounds(169, 208, 39, 38);
		frmCalculadora.getContentPane().add(btnmult);
		
		JButton btnponto = new JButton(".");
		btnponto.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btnponto.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btnponto.setForeground(Color.MAGENTA);
		btnponto.setBackground(Color.PINK);
		btnponto.setBounds(71, 257, 39, 38);
		frmCalculadora.getContentPane().add(btnponto);
		
		JButton btnigual = new JButton("=");
		btnigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selecionar;
				numero2 = Double.parseDouble(txtField.getText());
				if(operacao.equals("+")) {
					resultado = numero1+numero2;
					selecionar = String.format("%.0f",resultado);
					txtField.setText(selecionar);
				}else if(operacao.equals("-")) {
					resultado = numero1-numero2;
					selecionar = String.format("%.0f",resultado);
					txtField.setText(selecionar);
				}else if(operacao.equals("*")) {
					resultado = numero1*numero2;
					selecionar = String.format("%.0f",resultado);
				    txtField.setText(selecionar);		
			    }else if(operacao.equals("/")) {
				    resultado = numero1/numero2;
				    selecionar = String.format("%.0f",resultado);
				    txtField.setText(selecionar);
			}
			}
		});
		btnigual.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnigual.setForeground(Color.MAGENTA);
		btnigual.setBackground(Color.PINK);
		btnigual.setBounds(120, 257, 39, 38);
		frmCalculadora.getContentPane().add(btnigual);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "/";
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btndiv.setForeground(Color.MAGENTA);
		btndiv.setBackground(Color.PINK);
		btndiv.setBounds(169, 257, 39, 38);
		frmCalculadora.getContentPane().add(btndiv);
	}
}
