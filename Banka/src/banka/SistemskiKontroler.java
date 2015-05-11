package banka;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import sistemskeoperacije.SODodajKorisnika;
import sistemskeoperacije.SODodajTransakciju;
import sistemskeoperacije.SOObrisiKorisnika;
import sistemskeoperacije.SOObrisiTransakciju;
import sistemskeoperacije.SOSacuvajUFajl;
import sistemskeoperacije.SOUcitajIzFajla;
import sistemskeoperacije.SOVratiKorisnika;
import sistemskeoperacije.SOVratiSveTransakcije;

/**
 * Klasa SistemskiKontroler
 * klasa koja predstavlja sistemski kontroler logickog nivoa
 * i upravlja svim sistemskim operacijama
 * @author Petar Jelenkovic
 *
 */

public class SistemskiKontroler {
	/**
	 * lista korisnika u sistemu
	 */
	private LinkedList<Korisnik> korisnici = new LinkedList<Korisnik>();
	
	/**
	 * Metoda za dodavanje novog korisnika u listu
	 * @param ime ime korisnika
	 * @param adresa adresa korisnika
	 * @param vrstaRacuna vrsta racuna korisnika i mora biti devizni ili dinarski
	 * @throws java.lang.RuntimeException kada se za vrstu racuna unese
	 * nesto razlicito od devizni ili dinarski
	 */
	public void dodajKorsinika(String ime,String adresa, String vrstaRacuna) {
		SODodajKorisnika.dodajKorisnika(ime, adresa, vrstaRacuna, korisnici);
	}

	/**
	 * Metoda za brisanje korisnika iz liste
	 * @param ime ime korisnika
	 * @param adresa adresa korisnika
	 * @param vrstaRacuna vrsta racuna korisnika i mora biti devizni ili dinarski
	 * @throws java.lang.RuntimeException kada se za vrstu racuna unese
	 * nesto razlicito od devizni ili dinarski
	 * @throws java.lang.RuntimeException kada takav korisnik ne postoji
	 * u listi 
	 */
	public void obrisiKorisnika(String ime, String adresa, String vrstaRacuna) {
		SOObrisiKorisnika.obrisiKorisnika(ime, adresa, vrstaRacuna, korisnici);
	}
	
	public Korisnik vratiKorisnika(String ime, String adresa, String vrstaRacuna){
		return SOVratiKorisnika.vratiKorisnika(ime, adresa, vrstaRacuna, korisnici);
	}
	
	/**
	 * Metoda za dodavanje nove transakcije
	 * @param datum datum i vreme transakcije
	 * @param iznos iznos transakcije
	 * @param valuta valuta transakcije
	 * @param k korisnik koji je obavio transakciju
	 */
	public void dodajTransakciju(GregorianCalendar datum, double iznos, String valuta,Korisnik k){
		SODodajTransakciju.dodajTransakciju(datum, iznos, valuta, k);
	}
	
	/**
	 * Metoda za brisanje transakcije ako takva postoji
	 * @param datum datum i vreme transakcije
	 * @param iznos iznos transakcije
	 * @param valuta valuta transakcije
	 * @param k korisnik koji je obavio transakciju
	 */
	public void obrisiTransakciju(GregorianCalendar datum, double iznos, String valuta, Korisnik k){
		SOObrisiTransakciju.obrisiTransakciju(datum, iznos, valuta, k);
	}
	
	
	public String vratiSveTransakcije(Korisnik k){
		return SOVratiSveTransakcije.vratiSveTransakcije(k);
	}
	
	public void sacuvajUFajl(String putanja){
		SOSacuvajUFajl.sacuvajUFajl(korisnici, putanja);
	}
	
	public void ucitajIzFajla(String putanja){
		SOUcitajIzFajla.ucitajIzFajla(putanja, korisnici);
	}
}
