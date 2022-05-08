package digitron;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
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
	public calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 242);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Klasican", "Duzina", "Vreme", "Tezina", "Temperatura", "Podaci", "Novac"}));
		comboBox.setBounds(71, 94, 143, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Izaberi");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selected = comboBox.getSelectedItem().toString();
				if(selected == "Klasican") {
					Klasican k = new Klasican();
					k.setVisible(true);
				}
				if(selected == "Tezina") {
					Tezina t = new Tezina();
					t.setVisible(true);
				}
				if(selected == "Duzina") {
					Duzina d = new Duzina();
					d.setVisible(true);
				}
				if(selected == "Vreme") {
					Vreme v = new Vreme();
					v.setVisible(true);
				}
				if(selected == "Temperatura") {
					Temperatura te = new Temperatura();
					te.setVisible(true);
				}
				if(selected == "Podaci") {
					Podaci p = new Podaci();
					p.setVisible(true);
				}
				if(selected == "Novac") {
					Novac n = new Novac();
					n.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(224, 94, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("IZABERI VRSTU KALKULATORA");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel.setBounds(71, 63, 242, 20);
		contentPane.add(lblNewLabel);
	}
}
