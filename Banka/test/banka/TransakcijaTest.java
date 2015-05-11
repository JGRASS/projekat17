package banka;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TransakcijaTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEqualsObject() {
		Transakcija t = new Transakcija();
		t.setValuta("OOP");
		t.setIznosTransakcije(1234);
		t.setDatumTransakcije(new GregorianCalendar());
		
		GregorianCalendar greg = new GregorianCalendar();
		greg.set(greg.get(GregorianCalendar.YEAR), greg.get(GregorianCalendar.MONTH), greg.get(GregorianCalendar.DAY_OF_MONTH), 
				greg.get(GregorianCalendar.HOUR_OF_DAY), greg.get(GregorianCalendar.MINUTE), greg.get(GregorianCalendar.SECOND)+1);
		Transakcija t2 = new Transakcija();
		t2.setIznosTransakcije(1234);
		t2.setValuta("OOP");
		t2.setDatumTransakcije(greg);
		assertTrue(t.equals(t2));
	}

}
