package sistemskeoperacije;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import banka.Korisnik;

public class SOVratiKorisnikaTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test (expected =java.lang.Exception.class)
	public void testVratiKorisnikaExc() {
		LinkedList<Korisnik> kor = new LinkedList<Korisnik>();
		SOVratiKorisnika.vratiKorisnika("AA", "Nesto", "devizni", kor);
	}
	@Test
	public void testVratiKorisnika() {
		LinkedList<Korisnik> kor = new LinkedList<Korisnik>();
		SODodajKorisnika.dodajKorisnika("Ja", "Mill", "devizni", kor);
		Korisnik k = new Korisnik();
		k.setIme("Ja");
		k.setAdresa("Mill");
		k.setVrstaRacuna("devizni");
		
		assertEquals(k,SOVratiKorisnika.vratiKorisnika("Ja", "Mill", "devizni", kor));
	}

}
