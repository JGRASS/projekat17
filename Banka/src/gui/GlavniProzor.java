package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class GlavniProzor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GlavniProzor frame = new GlavniProzor();
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
	public GlavniProzor() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(GlavniProzor.class.getResource("/resources/bank-icon.jpg")));
		setResizable(false);
		setTitle("E-banka");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDobro = new JLabel("Dobro do\u0161li u e-banku");
		lblDobro.setHorizontalAlignment(SwingConstants.CENTER);
		lblDobro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblDobro.setBounds(37, 21, 367, 46);
		contentPane.add(lblDobro);
		
		JLabel lblIzaberite = new JLabel("Izaberite opciju:");
		lblIzaberite.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIzaberite.setHorizontalAlignment(SwingConstants.CENTER);
		lblIzaberite.setBounds(156, 188, 129, 29);
		contentPane.add(lblIzaberite);
		
		JButton btnDodajKorisnika = new JButton("Dodaj korisnika");
		btnDodajKorisnika.setBounds(10, 237, 123, 29);
		contentPane.add(btnDodajKorisnika);
		
		JButton btnObrisiKorsinika = new JButton("Obrisi korsinika");
		btnObrisiKorsinika.setBounds(305, 237, 134, 29);
		contentPane.add(btnObrisiKorsinika);
		
		JButton btnUrediTransakcije = new JButton("Uredi transakcije");
		btnUrediTransakcije.setBounds(156, 237, 129, 29);
		contentPane.add(btnUrediTransakcije);
		
		JLabel lblImeKorsinika = new JLabel("Ime korsinika:");
		lblImeKorsinika.setHorizontalAlignment(SwingConstants.CENTER);
		lblImeKorsinika.setBounds(10, 117, 123, 14);
		contentPane.add(lblImeKorsinika);
		
		textField = new JTextField();
		textField.setBounds(10, 142, 123, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAdresa = new JLabel("Adresa:");
		lblAdresa.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdresa.setBounds(162, 117, 123, 14);
		contentPane.add(lblAdresa);
		
		textField_1 = new JTextField();
		textField_1.setBounds(161, 142, 123, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(316, 142, 123, 20);
		contentPane.add(comboBox);
		
		JLabel lblVrsta = new JLabel("Vrsta ra\u010Duna:");
		lblVrsta.setHorizontalAlignment(SwingConstants.CENTER);
		lblVrsta.setBounds(316, 117, 123, 14);
		contentPane.add(lblVrsta);
	}
}
