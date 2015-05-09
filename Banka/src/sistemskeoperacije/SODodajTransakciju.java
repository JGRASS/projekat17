package sistemskeoperacije;

import java.util.GregorianCalendar;
import banka.Korisnik;
import banka.Transakcija;

public class SODodajTransakciju {
	
	public static void dodajTransakciju(GregorianCalendar datum, double iznos, String valuta, Korisnik k){
		
		Transakcija tran = new Transakcija();
		tran.setDatumTransakcije(datum);
		tran.setIznosTransakcije(iznos);
		tran.setValuta(valuta);
		
		if(!k.getTransakcije().contains(tran)){
			k.getTransakcije().add(tran);
		}
		
	}

}
