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

public class DodajKorisnika extends JFrame {

	private JPanel contentPane;
	private JLabel lblImeKorisnika;
	private JLabel lblAdresa;
	private JTextField textFieldIme;
	private JTextField textFieldAdresa;
	private JComboBox comboBox;
	private JLabel lblVrstaRacuna;
	private JButton btnDodaj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKorisnika frame = new DodajKorisnika();
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
	public DodajKorisnika() {
		setResizable(false);
		setTitle("Dodavanje korisnika");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblImeKorisnika());
		contentPane.add(getLblAdresa());
		contentPane.add(getTextFieldIme());
		contentPane.add(getTextFieldAdresa());
		contentPane.add(getComboBox());
		contentPane.add(getLblVrstaRacuna());
		contentPane.add(getBtnDodaj());
	}
	private JLabel getLblImeKorisnika() {
		if (lblImeKorisnika == null) {
			lblImeKorisnika = new JLabel("Ime korisnika:");
			lblImeKorisnika.setBounds(20, 57, 86, 14);
		}
		return lblImeKorisnika;
	}
	private JLabel getLblAdresa() {
		if (lblAdresa == null) {
			lblAdresa = new JLabel("Adresa:");
			lblAdresa.setBounds(161, 57, 46, 14);
		}
		return lblAdresa;
	}
	private JTextField getTextFieldIme() {
		if (textFieldIme == null) {
			textFieldIme = new JTextField();
			textFieldIme.setBounds(20, 82, 106, 20);
			textFieldIme.setColumns(10);
		}
		return textFieldIme;
	}
	private JTextField getTextFieldAdresa() {
		if (textFieldAdresa == null) {
			textFieldAdresa = new JTextField();
			textFieldAdresa.setBounds(161, 82, 106, 20);
			textFieldAdresa.setColumns(10);
		}
		return textFieldAdresa;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"dinarski", "devizni"}));
			comboBox.setBounds(304, 82, 106, 20);
		}
		return comboBox;
	}
	private JLabel getLblVrstaRacuna() {
		if (lblVrstaRacuna == null) {
			lblVrstaRacuna = new JLabel("Vrsta racuna:");
			lblVrstaRacuna.setBounds(304, 57, 85, 14);
		}
		return lblVrstaRacuna;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.dodajKorisnika(textFieldIme.getText(),
						 textFieldAdresa.getText(),(String) comboBox.getSelectedItem());
					dispose();
				}
			});
			btnDodaj.setBounds(150, 181, 124, 23);
		}
		return btnDodaj;
	}
}
