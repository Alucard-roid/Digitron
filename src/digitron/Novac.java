package digitron;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Novac extends JFrame implements Vrednost{

	private JPanel contentPane;
	private JTextField textField;
	private JButton btn8;
	private JButton btn9;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn0;
	private JButton btnUndo;
	private JButton btnDel;
	private JTextField textField_1;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	
	double num1;
	String rezultat;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Novac frame = new Novac();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Novac() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 313, 320);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setForeground(Color.BLACK);
		textField.setColumns(10);
		textField.setBackground(SystemColor.textInactiveText);
		textField.setBounds(10, 40, 126, 35);
		contentPane.add(textField);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn7.setBackground(Color.DARK_GRAY);
		btn7.setForeground(Color.LIGHT_GRAY);
		btn7.setBounds(47, 130, 60, 23);
		contentPane.add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btn8.setForeground(Color.LIGHT_GRAY);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn8.setBackground(Color.DARK_GRAY);
		btn8.setBounds(117, 130, 60, 23);
		contentPane.add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		btn9.setForeground(Color.LIGHT_GRAY);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn9.setBackground(Color.DARK_GRAY);
		btn9.setBounds(187, 130, 60, 23);
		contentPane.add(btn9);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		btn4.setForeground(Color.LIGHT_GRAY);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn4.setBackground(Color.DARK_GRAY);
		btn4.setBounds(47, 164, 60, 23);
		contentPane.add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btn5.setForeground(Color.LIGHT_GRAY);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn5.setBackground(Color.DARK_GRAY);
		btn5.setBounds(117, 164, 60, 23);
		contentPane.add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btn6.setForeground(Color.LIGHT_GRAY);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn6.setBackground(Color.DARK_GRAY);
		btn6.setBounds(187, 164, 60, 23);
		contentPane.add(btn6);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		btn1.setForeground(Color.LIGHT_GRAY);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn1.setBackground(Color.DARK_GRAY);
		btn1.setBounds(47, 198, 60, 23);
		contentPane.add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		btn2.setForeground(Color.LIGHT_GRAY);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn2.setBackground(Color.DARK_GRAY);
		btn2.setBounds(117, 198, 60, 23);
		contentPane.add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		btn3.setForeground(Color.LIGHT_GRAY);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn3.setBackground(Color.DARK_GRAY);
		btn3.setBounds(187, 198, 60, 23);
		contentPane.add(btn3);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		btn0.setForeground(Color.LIGHT_GRAY);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn0.setBackground(Color.DARK_GRAY);
		btn0.setBounds(47, 232, 89, 23);
		contentPane.add(btn0);
		
		btnUndo = new JButton("<--");
		btnUndo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length = textField.getText().length();
				int number = textField.getText().length() - 1;
				String s;
				
				if(length > 0) {
					StringBuilder b = new StringBuilder(textField.getText());
					b.deleteCharAt(number);
					s = b.toString();
					textField.setText(s);
				}
			}
		});
		
		btnUndo.setForeground(Color.LIGHT_GRAY);
		btnUndo.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnUndo.setBackground(Color.DARK_GRAY);
		btnUndo.setBounds(47, 96, 101, 23);
		contentPane.add(btnUndo);
		
		btnDel = new JButton("Del");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnDel.setForeground(Color.LIGHT_GRAY);
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDel.setBackground(Color.DARK_GRAY);
		btnDel.setBounds(158, 96, 89, 23);
		contentPane.add(btnDel);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setForeground(Color.BLACK);
		textField_1.setColumns(10);
		textField_1.setBackground(SystemColor.textInactiveText);
		textField_1.setBounds(158, 40, 126, 35);
		contentPane.add(textField_1);
		
		comboBox = new JComboBox();
		comboBox.setForeground(Color.LIGHT_GRAY);
		comboBox.setBackground(Color.DARK_GRAY);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dinar", "Dolar", "Evro", "Yuan"}));
		comboBox.setBounds(10, 11, 126, 22);
		contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Dinar", "Dolar", "Evro", "Yuan"}));
		comboBox_1.setForeground(Color.LIGHT_GRAY);
		comboBox_1.setBackground(Color.DARK_GRAY);
		comboBox_1.setBounds(158, 11, 126, 22);
		contentPane.add(comboBox_1);
		
		JButton btnIzr = new JButton("Izracunaj");
		btnIzr.addActionListener(new ActionListener() {
			/**
			 * @param e
			 */
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				
				// Dinar
				if(comboBox.getSelectedItem().equals("Dinar") && comboBox_1.getSelectedItem().equals("Dinar"))
					textField_1.setText(textField.getText().toString());
				
				if(comboBox.getSelectedItem().equals("Dinar") && comboBox_1.getSelectedItem().equals("Dolar")) {
					double rez = num1 * Vrednost.dinToDol;
					rezultat = String.valueOf(rez);
					textField_1.setText(rezultat);
				}
				
				if(comboBox.getSelectedItem().equals("Dinar") && comboBox_1.getSelectedItem().equals("Evro")) {
					double rez = num1 * Vrednost.dinToEur;
					rezultat = String.valueOf(rez);
					textField_1.setText(rezultat);
				}
				
				if(comboBox.getSelectedItem().equals("Dinar") && comboBox_1.getSelectedItem().equals("Yuan")) {
					double rez = num1 * Vrednost.dinToYuan;
					rezultat = String.valueOf(rez);
					textField_1.setText(rezultat);
				}
				
				// Dolar
				if(comboBox.getSelectedItem().equals("Dolar") && comboBox_1.getSelectedItem().equals("Dolar"))
					textField_1.setText(textField.getText().toString());
				
				if(comboBox.getSelectedItem().equals("Dolar") && comboBox_1.getSelectedItem().equals("Dinar")) {
					double rez = num1 * Vrednost.dolarToRsd;
					rezultat = String.valueOf(rez);
					textField_1.setText(rezultat);
				}
				
				if(comboBox.getSelectedItem().equals("Dolar") && comboBox_1.getSelectedItem().equals("Evro")) {
					double rez = num1 * Vrednost.dolarToEur;
					rezultat = String.valueOf(rez);
					textField_1.setText(rezultat);
				}
				
				if(comboBox.getSelectedItem().equals("Dolar") && comboBox_1.getSelectedItem().equals("Yuan")) {
					double rez = num1 * Vrednost.dolarToYuan;
					rezultat = String.valueOf(rez);
					textField_1.setText(rezultat);
				}			
				
				// Evro
				if(comboBox.getSelectedItem().equals("Evro") && comboBox_1.getSelectedItem().equals("Evro"))
					textField_1.setText(textField.getText().toString());
				
				if(comboBox.getSelectedItem().equals("Evro") && comboBox_1.getSelectedItem().equals("Dinar")) {
					double rez = num1 * Vrednost.evroToRsd;
					rezultat = String.valueOf(rez);
					textField_1.setText(rezultat);
				}
				
				if(comboBox.getSelectedItem().equals("Evro") && comboBox_1.getSelectedItem().equals("Dolar")) {
					double rez = num1 * Vrednost.evroToDol;
					rezultat = String.valueOf(rez);
					textField_1.setText(rezultat);
				}
				
				if(comboBox.getSelectedItem().equals("Evro") && comboBox_1.getSelectedItem().equals("Yuan")) {
					double rez = num1 * Vrednost.evroToYuan;
					rezultat = String.valueOf(rez);
					textField_1.setText(rezultat);
				}
				
				// Yuan
				if(comboBox.getSelectedItem().equals("Yuan") && comboBox_1.getSelectedItem().equals("Yuan"))
					textField_1.setText(textField.getText().toString());
				
				if(comboBox.getSelectedItem().equals("Yuan") && comboBox_1.getSelectedItem().equals("Dinar")) {
					double rez = num1 * Vrednost.yuanToRsd;
					rezultat = String.valueOf(rez);
					textField_1.setText(rezultat);
				}
				
				if(comboBox.getSelectedItem().equals("Yuan") && comboBox_1.getSelectedItem().equals("Dolar")) {
					double rez = num1 * Vrednost.yuanToDol;
					rezultat = String.valueOf(rez);
					textField_1.setText(rezultat);
				}
				
				if(comboBox.getSelectedItem().equals("Yuan") && comboBox_1.getSelectedItem().equals("Evro")) {
					double rez = num1 * Vrednost.yuanToEur;
					rezultat = String.valueOf(rez);
					textField_1.setText(rezultat);
				}
			}
		});
		btnIzr.setForeground(Color.LIGHT_GRAY);
		btnIzr.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnIzr.setBackground(Color.DARK_GRAY);
		btnIzr.setBounds(146, 232, 101, 23);
		contentPane.add(btnIzr);
		
		btn0 = new JButton("0");
		btn0.setForeground(Color.LIGHT_GRAY);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn0.setBackground(Color.DARK_GRAY);
		btn0.setBounds(47, 232, 89, 23);
		contentPane.add(btn0);
		
		JButton btn0 = new JButton("0");
		btn0.setForeground(Color.LIGHT_GRAY);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn0.setBackground(Color.DARK_GRAY);
		btn0.setBounds(47, 232, 89, 23);
		contentPane.add(btn0);
	}
}
