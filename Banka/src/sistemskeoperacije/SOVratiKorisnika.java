package sistemskeoperacije;

import java.util.LinkedList;

import banka.Korisnik;

public class SOVratiKorisnika {
	
	public static Korisnik vratiKorisnika(String ime, String adresa, String vrstaRacuna, LinkedList<Korisnik> korisnici){
		Korisnik k = new Korisnik();
		k.setIme(ime);
		k.setAdresa(adresa);
		k.setVrstaRacuna(vrstaRacuna);
		
		if(!korisnici.contains(k)){
			throw new RuntimeException("Nema takvog korisnika u listi!");
		}
		
		for (int i = 0; i <korisnici.size(); i++) {
			
			if(korisnici.get(i).equals(k)) return korisnici.get(i);
			
		}
		return null;
	}

}
