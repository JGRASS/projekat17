package sistemskeoperacije;

import java.util.LinkedList;

import banka.Korisnik;

public class SODodajKorisnika {
	
	public static void dodajKorisnika(String ime, String adresa, String vrstaRacuna,LinkedList<Korisnik> postojeci) throws Exception{
		Korisnik k = new Korisnik();
		k.setIme(ime);
		k.setAdresa(adresa);
		k.setVrstaRacuna(vrstaRacuna);
		
		
		if(!postojeci.contains(k)){ 
			postojeci.add(k);
			
		}
		else throw new Exception("Takav korisnik vec postoji!");
	}

}
