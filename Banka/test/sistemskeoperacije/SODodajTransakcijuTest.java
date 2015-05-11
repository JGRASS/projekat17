package sistemskeoperacije;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import banka.Korisnik;
import banka.Transakcija;

public class SODodajTransakcijuTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDodajTransakcijuSadrzi() {
		Korisnik k = new Korisnik();
		SODodajTransakciju.dodajTransakciju(new GregorianCalendar(), 123, "RSD", k);
		Transakcija t = new Transakcija();
		t.setDatumTransakcije(new GregorianCalendar());
		t.setIznosTransakcije(123);
		t.setValuta("RSD");
		
		assertTrue(k.getTransakcije().contains(t));
	}
	@Test
	public void testDodajTransakcijuSize(){
		Korisnik k = new Korisnik();
		SODodajTransakciju.dodajTransakciju(new GregorianCalendar(), 123, "RSD", k);
		SODodajTransakciju.dodajTransakciju(new GregorianCalendar(), 123, "RSD", k);
		assertEquals(1, k.getTransakcije().size());
	}

}
