package sistemskeoperacije;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import banka.Korisnik;

public class SOObrisiTransakcijuTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testObrisiTransakciju() {
		Korisnik k = new Korisnik();
		SODodajTransakciju.dodajTransakciju(new GregorianCalendar(), 557, "JPY", k);
		SOObrisiTransakciju.obrisiTransakciju(new GregorianCalendar(), 557, "JPY", k);
		assertTrue(k.getTransakcije().isEmpty());
	}
	@Test
	public void testObrisiTransakciju1() {
		Korisnik k = new Korisnik();
		SODodajTransakciju.dodajTransakciju(new GregorianCalendar(), 557, "JPY", k);
		SOObrisiTransakciju.obrisiTransakciju(new GregorianCalendar(), 558, "JPY", k);
		assertEquals(1, k.getTransakcije().size());
	}

}
