package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ObrisiKorisnika extends JFrame {

	private JPanel contentPane;
	private JLabel lblImeKorisnika;
	private JLabel lblAdresa;
	private JTextField textFieldIme;
	private JTextField textFieldAdresa;
	private JComboBox comboBox;
	private JLabel lblVrstaRacuna;
	private JButton btnObrisi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiKorisnika frame = new ObrisiKorisnika();
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
	public ObrisiKorisnika() {
		setResizable(false);
		setTitle("Brisanje korisnika");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblImeKorisnika());
		contentPane.add(getLblAdresa());
		contentPane.add(getTextFieldIme());
		contentPane.add(getTextFieldAdresa());
		contentPane.add(getComboBox());
		contentPane.add(getLblVrstaRacuna());
		contentPane.add(getBtnObrisi());
	}

	
	private JLabel getLblImeKorisnika() {
		if (lblImeKorisnika == null) {
			lblImeKorisnika = new JLabel("ImeKorisnika:");
			lblImeKorisnika.setBounds(10, 57, 86, 14);
		}
		return lblImeKorisnika;
	}
	private JLabel getLblAdresa() {
		if (lblAdresa == null) {
			lblAdresa = new JLabel("Adresa:");
			lblAdresa.setBounds(169, 57, 46, 14);
		}
		return lblAdresa;
	}
	private JTextField getTextFieldIme() {
		if (textFieldIme == null) {
			textFieldIme = new JTextField();
			textFieldIme.setBounds(10, 82, 86, 20);
			textFieldIme.setColumns(10);
		}
		return textFieldIme;
	}
	private JTextField getTextFieldAdresa() {
		if (textFieldAdresa == null) {
			textFieldAdresa = new JTextField();
			textFieldAdresa.setBounds(151, 82, 86, 20);
			textFieldAdresa.setColumns(10);
		}
		return textFieldAdresa;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"dinarski", "devizni"}));
			comboBox.setBounds(273, 82, 96, 20);
		}
		return comboBox;
	}
	private JLabel getLblVrstaRacuna() {
		if (lblVrstaRacuna == null) {
			lblVrstaRacuna = new JLabel("Vrsta racuna:");
			lblVrstaRacuna.setBounds(284, 57, 85, 14);
		}
		return lblVrstaRacuna;
	}
	
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.obrisiKorisnika(textFieldIme.getText(),
						 textFieldAdresa.getText(),(String) comboBox.getSelectedItem());
				}
			});
			btnObrisi.setBounds(140, 178, 124, 23);
		}
		return btnObrisi;
	}
}
