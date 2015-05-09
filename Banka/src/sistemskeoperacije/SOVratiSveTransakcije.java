package sistemskeoperacije;

import banka.Korisnik;

public class SOVratiSveTransakcije {
	
	public static String vratiSveTransakcije(Korisnik k){
		
		if(k.getTransakcije().isEmpty())
			return "Nema transakcija!";
		String s = "";
		for (int i = 0; i < k.getTransakcije().size(); i++) {
			s+=k.getTransakcije().get(i);
			
		}
		return s;
	}

}
