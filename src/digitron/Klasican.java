package digitron;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Klasican extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_16;
	private JButton btnNewButton_17;
	private JButton btnNewButton_18;
	private JButton btnNewButton_19;
	private JButton btnNewButton_20;
	
	double num, rez;
	int operator;
	
	public void operacije() {
		switch(operator) {
			case 1: 
				rez = num + Double.parseDouble(textField.getText());
				textField.setText(Double.toString(rez));
				break;
			case 2: 
				rez = num - Double.parseDouble(textField.getText());
				textField.setText(Double.toString(rez));
				break;
			case 3: 
				rez = num * Double.parseDouble(textField.getText());
				textField.setText(Double.toString(rez));
				break;
			case 4: 
				rez = num / Double.parseDouble(textField.getText());
				textField.setText(Double.toString(rez));
				break;
		}
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Klasican frame = new Klasican();
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
	public Klasican() {
		setForeground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 287, 386);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setForeground(Color.DARK_GRAY);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(10, 11, 251, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("=");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacije();
				double rezultat = Double.parseDouble(textField.getText());
				
				Memorija.addResult(rezultat);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(172, 241, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		btnNewButton_1.setForeground(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(10, 105, 56, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("8");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btnNewButton_2.setForeground(Color.LIGHT_GRAY);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setBounds(76, 105, 56, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("9");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		btnNewButton_3.setForeground(Color.LIGHT_GRAY);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBackground(Color.DARK_GRAY);
		btnNewButton_3.setBounds(140, 105, 56, 23);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("*");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				operator = 3;
				textField.setText("");
			}
		});
		btnNewButton_4.setForeground(Color.LIGHT_GRAY);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4.setBackground(Color.DARK_GRAY);
		btnNewButton_4.setBounds(205, 105, 56, 23);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("4");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		btnNewButton_5.setForeground(Color.LIGHT_GRAY);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_5.setBackground(Color.DARK_GRAY);
		btnNewButton_5.setBounds(10, 139, 56, 23);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("5");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btnNewButton_6.setForeground(Color.LIGHT_GRAY);
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_6.setBackground(Color.DARK_GRAY);
		btnNewButton_6.setBounds(76, 139, 56, 23);
		contentPane.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("6");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btnNewButton_7.setForeground(Color.LIGHT_GRAY);
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_7.setBackground(Color.DARK_GRAY);
		btnNewButton_7.setBounds(140, 139, 56, 23);
		contentPane.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("-");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				operator = 2;
				textField.setText("");
			}
		});
		btnNewButton_8.setForeground(Color.LIGHT_GRAY);
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_8.setBackground(Color.DARK_GRAY);
		btnNewButton_8.setBounds(205, 139, 56, 23);
		contentPane.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("1");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		btnNewButton_9.setForeground(Color.LIGHT_GRAY);
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_9.setBackground(Color.DARK_GRAY);
		btnNewButton_9.setBounds(10, 173, 56, 23);
		contentPane.add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("2");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		btnNewButton_10.setForeground(Color.LIGHT_GRAY);
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_10.setBackground(Color.DARK_GRAY);
		btnNewButton_10.setBounds(76, 173, 56, 23);
		contentPane.add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("3");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		btnNewButton_11.setForeground(Color.LIGHT_GRAY);
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_11.setBackground(Color.DARK_GRAY);
		btnNewButton_11.setBounds(140, 173, 56, 23);
		contentPane.add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("+");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				operator = 1;
				textField.setText("");
			}
		});
		btnNewButton_12.setForeground(Color.LIGHT_GRAY);
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_12.setBackground(Color.DARK_GRAY);
		btnNewButton_12.setBounds(205, 173, 56, 23);
		contentPane.add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("Del");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_13.setForeground(Color.LIGHT_GRAY);
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_13.setBackground(Color.DARK_GRAY);
		btnNewButton_13.setBounds(140, 207, 56, 23);
		contentPane.add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("<--");
		btnNewButton_14.addActionListener(new ActionListener() {
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
		btnNewButton_14.setForeground(Color.LIGHT_GRAY);
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_14.setBackground(Color.DARK_GRAY);
		btnNewButton_14.setBounds(10, 57, 76, 23);
		contentPane.add(btnNewButton_14);
		
		btnNewButton_16 = new JButton(".");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		btnNewButton_16.setForeground(Color.LIGHT_GRAY);
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_16.setBackground(Color.DARK_GRAY);
		btnNewButton_16.setBounds(76, 207, 56, 23);
		contentPane.add(btnNewButton_16);
		
		btnNewButton_17 = new JButton("/");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				operator = 4;
				textField.setText("");
			}
		});
		btnNewButton_17.setForeground(Color.LIGHT_GRAY);
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_17.setBackground(Color.DARK_GRAY);
		btnNewButton_17.setBounds(205, 207, 56, 23);
		contentPane.add(btnNewButton_17);
		
		btnNewButton_18 = new JButton("0");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		btnNewButton_18.setForeground(Color.LIGHT_GRAY);
		btnNewButton_18.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_18.setBackground(Color.DARK_GRAY);
		btnNewButton_18.setBounds(10, 207, 56, 23);
		contentPane.add(btnNewButton_18);
		
		btnNewButton_19 = new JButton("x^2");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double x = Double.parseDouble(textField.getText());
				x = Math.pow(x, 2);
				textField.setText(String.valueOf(x));
				Memorija.addResult(x);
			}
		});
		btnNewButton_19.setForeground(Color.LIGHT_GRAY);
		btnNewButton_19.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_19.setBackground(Color.DARK_GRAY);
		btnNewButton_19.setBounds(96, 57, 79, 23);
		contentPane.add(btnNewButton_19);
		
		btnNewButton_20 = new JButton("sqrt");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double x = Double.parseDouble(textField.getText());
				x = Math.sqrt(x);
				textField.setText(String.valueOf(x));
				Memorija.addResult(x);
			}
		});
		btnNewButton_20.setForeground(Color.LIGHT_GRAY);
		btnNewButton_20.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_20.setBackground(Color.DARK_GRAY);
		btnNewButton_20.setBounds(185, 57, 76, 23);
		contentPane.add(btnNewButton_20);
		
		JButton btnNewButton_4_1 = new JButton("Memorija");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rezultati r = new Rezultati();
				r.setVisible(true);
			}
		});
		btnNewButton_4_1.setForeground(Color.LIGHT_GRAY);
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4_1.setBackground(Color.DARK_GRAY);
		btnNewButton_4_1.setBounds(10, 241, 152, 23);
		contentPane.add(btnNewButton_4_1);
	}
}
