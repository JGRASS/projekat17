package banka;

import java.util.LinkedList;

import sistemskeoperacije.SODodajKorisnika;
import sistemskeoperacije.SOObrisiKorisnika;



public class SistemskiKontroler {
	
	private LinkedList<Korisnik> korisnici = new LinkedList<Korisnik>();
	
	public void dodajKorsinika(String ime,String adresa, String vrstaRacuna) throws Exception{
		SODodajKorisnika.dodajKorisnika(ime, adresa, vrstaRacuna, korisnici);
	}

	public void obrisiKorisnika(String ime, String adresa, String vrstaRacuna) throws Exception{
		SOObrisiKorisnika.obrisiKorisnika(ime, adresa, vrstaRacuna, korisnici);
	}
}
