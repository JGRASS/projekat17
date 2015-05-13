package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajTransakciju extends JFrame {

	private JPanel contentPane;
	private JLabel lblIznosTransakcije;
	private JTextField textField;
	private JComboBox comboBox;
	private JLabel lblValuta;
	private JButton btnDodaj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajTransakciju frame = new DodajTransakciju();
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
	public DodajTransakciju() {
		setResizable(false);
		setTitle("Dodavanje transakcije");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel_1());
		contentPane.add(getTextField());
		contentPane.add(getComboBox());
		contentPane.add(getLblValuta());
		contentPane.add(getBtnDodaj());
	}

	private JLabel getLabel_1() {
		if (lblIznosTransakcije == null) {
			lblIznosTransakcije = new JLabel("Iznos transakcije:");
			lblIznosTransakcije.setBounds(41, 18, 110, 20);
		}
		return lblIznosTransakcije;
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(41, 53, 110, 20);
			textField.setColumns(10);
		}
		return textField;
	}

	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] { "RSD",
					"EUR", "USD" }));
			comboBox.setBounds(272, 53, 94, 20);
		}
		return comboBox;
	}

	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta:");
			lblValuta.setBounds(272, 18, 94, 20);
		}
		return lblValuta;
	}

	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.dodajTransakciju(
							Double.parseDouble(getTextField().getText()),
							(String) getComboBox().getSelectedItem());
					dispose();

				}
			});
			btnDodaj.setBounds(159, 145, 119, 42);
		}
		return btnDodaj;
	}
}
