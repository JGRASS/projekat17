package gui;

import java.awt.EventQueue;
import java.io.File;
import java.util.GregorianCalendar;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import banka.SistemskiKontroler;

public class GUIKontroler {

	private static GlavniProzor frame;
	private static SistemskiKontroler sistem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sistem = new SistemskiKontroler();
					frame = new GlavniProzor();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void ugasiAplikaciju() {
		int opcija = JOptionPane.showConfirmDialog(frame.getContentPane(),
				"Da li ZAISTA zelite da izadjete iz aplikacije?", "Izlazak",
				JOptionPane.YES_NO_OPTION);

		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);
	}

	public static void dodajKorisnika(String ime, String adresa, String racun) {
		try {
			sistem.dodajKorsinika(ime, adresa, racun);
			JOptionPane.showMessageDialog(frame.getContentPane(),
					"Korisnik je uspesno dodat!", "Obavestenje",
					JOptionPane.INFORMATION_MESSAGE);

		} catch (Exception e1) {
			JOptionPane.showMessageDialog(frame.getContentPane(),
					e1.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void obrisiKorisnika(String ime, String adresa, String racun) {
		try {
			sistem.obrisiKorisnika(ime, adresa, racun);
			JOptionPane.showMessageDialog(frame.getContentPane(),
					"Korisnik je uspesno obrisan!", "Obavestenje",
					JOptionPane.INFORMATION_MESSAGE);
			prozor1.dispose();

		} catch (Exception e1) {
			JOptionPane.showMessageDialog(frame.getContentPane(),
					e1.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void dodajTransakciju(double iznos, String valuta) {
		try {
			sistem.dodajTransakciju(new GregorianCalendar(), iznos, valuta,
					sistem.vratiKorisnika(prozor2.getTF(), prozor2.getIT(),
							prozor2.getCB()));
			JOptionPane.showMessageDialog(prozor2.getContentPane(),
					"Transakcija je uspesno dodata!", "Obavestenje",
					JOptionPane.INFORMATION_MESSAGE);
			prozor.dispose();
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(frame.getContentPane(),
					e1.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void obrisiTransakciju(double iznos, String valuta, int dan,
			int mesec, int godina, int sat, int minut) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(godina, mesec, dan, sat, minut);
		try {
			sistem.obrisiTransakciju(gc, iznos, valuta, sistem.vratiKorisnika(
					prozor2.getTF(), prozor2.getIT(), prozor2.getCB()));
			JOptionPane.showMessageDialog(prozor2.getContentPane(),
					"Transakcija je uspesno obrisana!", "Obavestenje",
					JOptionPane.INFORMATION_MESSAGE);
			prozor4.dispose();
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(frame.getContentPane(),
					e1.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static String PrikaziSveTransakcije(String ime, String adresa,
			String racun) {
		return sistem.vratiSveTransakcije(sistem.vratiKorisnika(ime, adresa,
				racun));
	}

	public static void sacuvajUFajl() {
		try {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showSaveDialog(frame.getContentPane());

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();

				sistem.sacuvajUFajl(file.getAbsolutePath());
			}
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(frame.getContentPane(),
					e1.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void ucitajIzFajla() {
		try {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showOpenDialog(frame.getContentPane());

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				sistem.ucitajIzFajla(file.getAbsolutePath());

			}
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(frame.getContentPane(),
					e1.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
		}
	}

	static DodajKorisnika prozor;

	public static void prikaziDodajKorisnikaProzor() {
		prozor = new DodajKorisnika();
		prozor.setLocationRelativeTo(frame.getContentPane());
		prozor.setVisible(true);
	}

	static ObrisiKorisnika prozor1;

	public static void prikaziObrisiKorisnikaProzor() {
		prozor1 = new ObrisiKorisnika();
		prozor1.setLocationRelativeTo(frame.getContentPane());
		prozor1.setVisible(true);
	}

	static UrediTransakcije prozor2;

	public static void prikaziUrediTransakcijProzor() {
		prozor2 = new UrediTransakcije();
		prozor2.setLocationRelativeTo(frame.getContentPane());
		prozor2.setVisible(true);
	}

	static DodajTransakciju prozor3;

	public static void prikaziDodajTransakcijuProzor() {
		prozor3 = new DodajTransakciju();
		prozor3.setLocationRelativeTo(frame.getContentPane());
		prozor3.setVisible(true);
	}

	static ObrisiTransakciju prozor4;

	public static void prikaziObrisiTransakcijuProzor() {
		prozor4 = new ObrisiTransakciju();
		prozor4.setLocationRelativeTo(frame.getContentPane());
		prozor4.setVisible(true);
	}
}
