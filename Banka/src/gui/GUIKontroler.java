package gui;

import java.awt.EventQueue;

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
	
	public static void dodajKorisnika(String ime, String adresa, String racun){
		try{
		sistem.dodajKorsinika(ime, adresa, racun);
		JOptionPane.showMessageDialog(frame.getContentPane(), "Korisnik je uspesno dodat!",
				"Obavestenje", JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(frame.getContentPane(), e1.getMessage(),
					"Greska", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public static void obrisiKorisnika(String ime, String adresa, String racun){
		try{
		sistem.obrisiKorisnika(ime, adresa, racun);
		JOptionPane.showMessageDialog(frame.getContentPane(), "Korisnik je uspesno obrisan!",
				"Obavestenje", JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(frame.getContentPane(), e1.getMessage(),
					"Greska", JOptionPane.ERROR_MESSAGE);
		}
	}

}
