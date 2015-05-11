package sistemskeoperacije;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import banka.Korisnik;

public class SOObrisiKorisnikaTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test (expected =java.lang.Exception.class)
	public void testObrisiKorisnikaExc() {
		LinkedList<Korisnik> kor = new LinkedList<Korisnik>();
		SODodajKorisnika.dodajKorisnika("Zika", "Negde 567", "devizni", kor);
		SOObrisiKorisnika.obrisiKorisnika("Laza", "Gde 87", "dinarski", kor);
	}
	@Test
	public void testObrisiKorisnikaPrazan() {
		LinkedList<Korisnik> kor = new LinkedList<Korisnik>();
		SODodajKorisnika.dodajKorisnika("Zika", "Negde 567", "devizni", kor);
		SODodajKorisnika.dodajKorisnika("Mika", "gde 67", "devizni", kor);
		
		SOObrisiKorisnika.obrisiKorisnika("Zika", "Negde 567", "devizni", kor);
		SOObrisiKorisnika.obrisiKorisnika("Mika", "gde 67", "devizni", kor);
		assertTrue(kor.isEmpty());
	}

}
