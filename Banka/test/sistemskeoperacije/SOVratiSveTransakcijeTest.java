package sistemskeoperacije;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import banka.Korisnik;
import banka.Transakcija;

public class SOVratiSveTransakcijeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testVratiSveTransakcijeNema() {
		Korisnik k = new Korisnik();
		String a = SOVratiSveTransakcije.vratiSveTransakcije(k);
		assertEquals("Nema transakcija!",a);
	}
	@Test
	public void testVratiSveTransakcijeIma() {
		Korisnik k = new Korisnik();
		SODodajTransakciju.dodajTransakciju(new GregorianCalendar(), 123, "XKN", k);
		SODodajTransakciju.dodajTransakciju(new GregorianCalendar(), 1123, "XlN", k);
		
		Transakcija t1 = new Transakcija();
		t1.setDatumTransakcije(new GregorianCalendar());
		t1.setIznosTransakcije(123);
		t1.setValuta("XKN");
		
		Transakcija t2 = new Transakcija();
		t2.setDatumTransakcije(new GregorianCalendar());
		t2.setIznosTransakcije(1123);
		t2.setValuta("XlN");
		
		String p = "\n"+t1.toString()+"\n"+t2.toString();
		assertEquals(p,SOVratiSveTransakcije.vratiSveTransakcije(k));
	}

}
