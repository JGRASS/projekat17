package sistemskeoperacije;

import java.util.LinkedList;

import banka.Korisnik;

public class SOObrisiKorisnika {
	
	public static void obrisiKorisnika(String ime, String adresa, String vrstaRacuna, LinkedList<Korisnik> korisnici) {
		
		Korisnik a = new Korisnik();
		a.setIme(ime);
		a.setAdresa(adresa);
		a.setVrstaRacuna(vrstaRacuna);
		
		if(!korisnici.contains(a)) throw new RuntimeException("Ne postoji takav korisnik!");
		for (int i = 0; i < korisnici.size(); i++) {
			if(korisnici.get(i).equals(a)){ korisnici.remove(i); return;}
		}
		
	}

}
