package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;


public class GlavniProzor extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnHelp;
	private JMenuItem mntmOpen;
	private JMenuItem mntmSave;
	private JMenuItem mntmExit;
	private JMenuItem mntmAbout;
	

	/**
	 * Create the frame.
	 */
	public GlavniProzor() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				GUIKontroler.ugasiAplikaciju();
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				GlavniProzor.class.getResource("/resources/bank-icon.jpg")));
		setResizable(false);
		setTitle("E-banka");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 455, 349);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblDobro = new JLabel("Dobro do\u0161li u e-banku");
		lblDobro.setHorizontalAlignment(SwingConstants.CENTER);
		lblDobro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblDobro.setBounds(37, 34, 367, 46);
		contentPane.add(lblDobro);

		JLabel lblIzaberite = new JLabel("Izaberite opciju:");
		lblIzaberite.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIzaberite.setHorizontalAlignment(SwingConstants.CENTER);
		lblIzaberite.setBounds(155, 112, 129, 29);
		contentPane.add(lblIzaberite);

		JButton btnDodajKorisnika = new JButton("Dodaj korisnika");
		btnDodajKorisnika.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnDodajKorisnika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUIKontroler.prikaziDodajKorisnikaProzor();
			
			}
		});
		btnDodajKorisnika.setBounds(6, 207, 139, 29);
		contentPane.add(btnDodajKorisnika);
	
	

		JButton btnObrisiKorsinika = new JButton("Obrisi korsinika");
		btnObrisiKorsinika.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnObrisiKorsinika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUIKontroler.prikaziObrisiKorisnikaProzor();
				
				
			}
		});
		btnObrisiKorsinika.setBounds(304, 207, 139, 29);
		contentPane.add(btnObrisiKorsinika);

		JButton btnUrediTransakcije = new JButton("Uredi transakcije");
		btnUrediTransakcije.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnUrediTransakcije.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUIKontroler.prikaziUrediTransakcijProzor();
			}
		});
		btnUrediTransakcije.setBounds(155, 207, 139, 29);
		contentPane.add(btnUrediTransakcije);
		contentPane.add(getMenuBar_1());
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setBounds(0, 0, 449, 21);
			menuBar.add(getMnFile());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmOpen());
			mnFile.add(getMntmSave());
			mnFile.add(getMntmExit());
		}
		return mnFile;
	}
	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMntmAbout());
		}
		return mnHelp;
	}
	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
			mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.ALT_MASK));
			mntmOpen.setIcon(new ImageIcon(GlavniProzor.class.getResource("/com/sun/java/swing/plaf/windows/icons/TreeOpen.gif")));
			mntmOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.ucitajIzFajla();
				}
			});
		}
		return mntmOpen;
	}
	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
			mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.ALT_MASK));
			mntmSave.setIcon(new ImageIcon(GlavniProzor.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
			mntmSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.sacuvajUFajl();
				}
			});
		}
		return mntmSave;
	}
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
			mntmExit.setIcon(new ImageIcon(GlavniProzor.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.ugasiAplikaciju();
				}
			});
		}
		return mntmExit;
	}
	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
			mntmAbout.setIcon(new ImageIcon(GlavniProzor.class.getResource("/javax/swing/plaf/metal/icons/ocean/info.png")));
			mntmAbout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(contentPane,
							"Autori: Vladimir Svicevic, Petar Jelenkovic, Verzija 1.0", "O programu",
							JOptionPane.INFORMATION_MESSAGE);
				}
			});
		}
		return mntmAbout;
	}
}
