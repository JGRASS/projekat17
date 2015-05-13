package sistemskeoperacije;

import java.util.GregorianCalendar;

import banka.Korisnik;
import banka.Transakcija;

public class SOObrisiTransakciju {
	
	public static void obrisiTransakciju(GregorianCalendar datum, double iznos, String valuta, Korisnik k){
		Transakcija tran = new Transakcija();
		tran.setDatumTransakcije(datum);
		tran.setIznosTransakcije(iznos);
		tran.setValuta(valuta);
		
		if(!k.getTransakcije().contains(tran)){
			throw new RuntimeException("Ne postoji takva transakcija!");
		}
		for (int i = 0; i < k.getTransakcije().size(); i++) {
			if(k.getTransakcije().get(i).equals(tran)){
				k.getTransakcije().remove(i); 
				return;
			}
		}
	}

}
