package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class UrediTransakcije extends JFrame {

	private JPanel contentPane;
	private JLabel lblImeKorisnika;
	private JLabel lblAdresaKorisnika;
	private JTextField textFieldImeK;
	private JTextField textFieldAdresaK;
	private JComboBox comboBox;
	private JLabel lblVrstaRacuna;
	private JButton btnDodajTransakciju;
	private JButton btnObrisiTransakciju;
	private JButton btnVratiSveTransakcije;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UrediTransakcije frame = new UrediTransakcije();
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
	public UrediTransakcije() {
		setResizable(false);
		setTitle("Uredjivanje transakcija");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		contentPane.add(getLblImeKorisnika());
		contentPane.add(getLblAdresaKorisnika());
		contentPane.add(gettextFieldIme());
		contentPane.add(gettextFieldAdresa());
		contentPane.add(getComboBox());
		contentPane.add(getLblVrstaRacuna());
		contentPane.add(getBtnDodajTransakciju());
		contentPane.add(getBtnObrisiTransakciju());
		contentPane.add(getBtnVratiSveTransakcije());
		contentPane.add(getScrollPane());

	}

	private JLabel getLblImeKorisnika() {
		if (lblImeKorisnika == null) {
			lblImeKorisnika = new JLabel("Ime korisnika:");
			lblImeKorisnika.setBounds(33, 57, 96, 14);
		}
		return lblImeKorisnika;
	}

	private JLabel getLblAdresaKorisnika() {
		if (lblAdresaKorisnika == null) {
			lblAdresaKorisnika = new JLabel("Adresa korisnika:");
			lblAdresaKorisnika.setBounds(167, 57, 108, 14);
		}
		return lblAdresaKorisnika;
	}

	private JTextField gettextFieldIme() {
		if (textFieldImeK == null) {
			textFieldImeK = new JTextField();
			textFieldImeK.setToolTipText("");
			textFieldImeK.setBounds(30, 82, 86, 20);
			textFieldImeK.setColumns(10);
		}
		return textFieldImeK;
	}

	private JTextField gettextFieldAdresa() {
		if (textFieldAdresaK == null) {
			textFieldAdresaK = new JTextField();
			textFieldAdresaK.setToolTipText("");
			textFieldAdresaK.setBounds(167, 82, 86, 20);
			textFieldAdresaK.setColumns(10);
		}
		return textFieldAdresaK;
	}

	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {
					"dinarski", "devizni" }));
			comboBox.setBounds(314, 82, 96, 20);
		}
		return comboBox;
	}

	private JLabel getLblVrstaRacuna() {
		if (lblVrstaRacuna == null) {
			lblVrstaRacuna = new JLabel("Vrsta racuna:");
			lblVrstaRacuna.setBounds(337, 57, 85, 14);
		}
		return lblVrstaRacuna;
	}

	private JButton getBtnDodajTransakciju() {
		if (btnDodajTransakciju == null) {
			btnDodajTransakciju = new JButton("Dodaj transakciju");
			btnDodajTransakciju.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.prikaziDodajTransakcijuProzor();
				}
			});
			btnDodajTransakciju
					.setHorizontalTextPosition(SwingConstants.CENTER);
			btnDodajTransakciju.setBounds(10, 157, 157, 23);
		}
		return btnDodajTransakciju;
	}

	private JButton getBtnObrisiTransakciju() {
		if (btnObrisiTransakciju == null) {
			btnObrisiTransakciju = new JButton("Obrisi transakciju");
			btnObrisiTransakciju.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.prikaziObrisiTransakcijuProzor();
				}
			});
			btnObrisiTransakciju.setBounds(10, 191, 157, 23);
		}
		return btnObrisiTransakciju;
	}

	private JButton getBtnVratiSveTransakcije() {
		if (btnVratiSveTransakcije == null) {
			btnVratiSveTransakcije = new JButton("Vrati sve transakcije");
			btnVratiSveTransakcije.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					getTextArea().setText(GUIKontroler.PrikaziSveTransakcije(gettextFieldIme().getText(), 
							gettextFieldAdresa().getText(), (String) getComboBox().getSelectedItem()));
				}
			});
			btnVratiSveTransakcije.setBounds(10, 225, 157, 23);
		}
		return btnVratiSveTransakcije;
	}

	public String getTF() {
		return gettextFieldIme().getText();
	}

	public String getIT() {
		return gettextFieldAdresa().getText();
	}

	public String getCB() {
		return (String) getComboBox().getSelectedItem();
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(179, 137, 255, 123);
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}

	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}

	public JTextArea getTA() {
		return getTextArea();
	}
}