package sistemskeoperacije;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import banka.Korisnik;

public class SODodajKorisnikaTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test (expected =java.lang.Exception.class)
	public void testDodajKorisnikaExc()  {
		LinkedList<Korisnik> kor = new LinkedList<Korisnik>();
		SODodajKorisnika.dodajKorisnika("Pera", "Moja 22", "dinarski",kor);
		SODodajKorisnika.dodajKorisnika("Pera", "Moja 22", "dinarski",kor);
	}
	@Test
	public void testDodajKorisnika() {
		LinkedList<Korisnik> kor = new LinkedList<Korisnik>();
		SODodajKorisnika.dodajKorisnika("Zika", "Prva 84", "devizni", kor);
		Korisnik k = new Korisnik();
		k.setIme("Zika");
		k.setAdresa("Prva 84");
		k.setVrstaRacuna("devizni");
		
		assertTrue(kor.contains(k));
	}

}
