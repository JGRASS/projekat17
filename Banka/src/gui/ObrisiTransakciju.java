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
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiTransakciju extends JFrame {

	private JPanel contentPane;
	private JLabel lblIZnosT;
	private JTextField textFieldIT;
	private JComboBox comboBox;
	private JLabel lblValuta;
	private JSpinner spinner;
	private JSpinner spinner_1;
	private JSpinner spinner_2;
	private JLabel lblDatumTransakcije;
	private JSpinner spinner_3;
	private JSpinner spinner_4;
	private JButton btnObrisi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiTransakciju frame = new ObrisiTransakciju();
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
	public ObrisiTransakciju() {
		setTitle("Brisanje Transakcija");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblIZnosT());
		contentPane.add(getTextFieldIT());
		contentPane.add(getComboBox());
		contentPane.add(getLblValuta());
		contentPane.add(getSpinner());
		contentPane.add(getSpinner_1());
		contentPane.add(getSpinner_2());
		contentPane.add(getLblDatumTransakcije());
		contentPane.add(getSpinner_3());
		contentPane.add(getSpinner_4());
		contentPane.add(getBtnObrisi());
	}

	private JLabel getLblIZnosT() {
		if (lblIZnosT == null) {
			lblIZnosT = new JLabel("Iznos Transakcije:");
			lblIZnosT.setBounds(10, 10, 100, 34);
		}
		return lblIZnosT;
	}

	private JTextField getTextFieldIT() {
		if (textFieldIT == null) {
			textFieldIT = new JTextField();
			textFieldIT.setBounds(10, 55, 100, 20);
			textFieldIT.setColumns(10);
		}
		return textFieldIT;
	}

	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] { "RSD",
					"EUR", "USD" }));
			comboBox.setBounds(174, 48, 75, 34);
		}
		return comboBox;
	}

	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta:");
			lblValuta.setBounds(174, 5, 81, 44);
		}
		return lblValuta;
	}

	private JSpinner getSpinner() {
		if (spinner == null) {
			spinner = new JSpinner();
			spinner.setModel(new SpinnerNumberModel(1, 1, 31, 1));
			spinner.setBounds(277, 55, 29, 20);
		}
		return spinner;
	}

	private JSpinner getSpinner_1() {
		if (spinner_1 == null) {
			spinner_1 = new JSpinner();
			spinner_1.setModel(new SpinnerNumberModel(1, 1, 12, 1));
			spinner_1.setBounds(316, 52, 29, 27);
		}
		return spinner_1;
	}

	private JSpinner getSpinner_2() {
		if (spinner_2 == null) {
			spinner_2 = new JSpinner();
			spinner_2.setModel(new SpinnerNumberModel(2000, 2000, 2015, 1));
			spinner_2.setBounds(350, 52, 53, 27);
		}
		return spinner_2;
	}

	private JLabel getLblDatumTransakcije() {
		if (lblDatumTransakcije == null) {
			lblDatumTransakcije = new JLabel("Datum transakcije:");
			lblDatumTransakcije.setBounds(284, 10, 140, 34);
		}
		return lblDatumTransakcije;
	}

	private JSpinner getSpinner_3() {
		if (spinner_3 == null) {
			spinner_3 = new JSpinner();
			spinner_3.setModel(new SpinnerNumberModel(0, 0, 24, 1));
			spinner_3.setBounds(316, 90, 34, 20);
		}
		return spinner_3;
	}

	private JSpinner getSpinner_4() {
		if (spinner_4 == null) {
			spinner_4 = new JSpinner();
			spinner_4.setModel(new SpinnerNumberModel(0, 0, 60, 1));
			spinner_4.setBounds(360, 90, 43, 20);
		}
		return spinner_4;
	}

	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi ");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.obrisiTransakciju(
							Double.parseDouble(getTextFieldIT().getText()),
							(String) getComboBox().getSelectedItem(),
							(Integer) getSpinner().getValue(),
							((Integer) getSpinner_1().getValue())-1,
							(Integer) getSpinner_2().getValue(),
							(Integer) getSpinner_3().getValue(),
							(Integer) getSpinner_4().getValue());
				}
			});
			btnObrisi.setBounds(160, 177, 89, 23);
		}
		return btnObrisi;
	}
}
