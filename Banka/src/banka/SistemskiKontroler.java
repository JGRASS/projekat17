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



public class SistemskiKontroler {
	
	private LinkedList<Korisnik> korisnici = new LinkedList<Korisnik>();
	
	public void dodajKorsinika(String ime,String adresa, String vrstaRacuna) {
		SODodajKorisnika.dodajKorisnika(ime, adresa, vrstaRacuna, korisnici);
	}

	public void obrisiKorisnika(String ime, String adresa, String vrstaRacuna) {
		SOObrisiKorisnika.obrisiKorisnika(ime, adresa, vrstaRacuna, korisnici);
	}
	
	public Korisnik vratiKorisnika(String ime, String adresa, String vrstaRacuna){
		return SOVratiKorisnika.vratiKorisnika(ime, adresa, vrstaRacuna, korisnici);
	}
	
	public void dodajTransakciju(GregorianCalendar datum, double iznos, String valuta,Korisnik k){
		SODodajTransakciju.dodajTransakciju(datum, iznos, valuta, k);
	}
	
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
