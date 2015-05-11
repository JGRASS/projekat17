package banka;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sistemskeoperacije.SODodajTransakciju;

public class KorisnikTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test (expected =java.lang.Exception.class)
	public void testSetVrstaRacunaExc() {
		Korisnik k = new Korisnik();
		k.setVrstaRacuna("tekuci");
	}

	@Test
	public void testEqualsObject() {
		Korisnik k = new Korisnik();
		k.setAdresa("AAa 566");
		k.setIme("Toma");
		k.setVrstaRacuna("devizni");
		
		Korisnik k1 = new Korisnik();
		k1.setAdresa("AAa 566");
		k1.setIme("Toma");
		k1.setVrstaRacuna("devizni");
		SODodajTransakciju.dodajTransakciju(new GregorianCalendar(), 125, "XCV", k1);
		
		assertTrue(k.equals(k1));
	}

	

}
