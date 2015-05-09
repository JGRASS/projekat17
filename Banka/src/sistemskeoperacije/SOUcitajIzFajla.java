package sistemskeoperacije;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;

import banka.Korisnik;

public class SOUcitajIzFajla {
	
	public static void ucitajIzFajla(String putanja, LinkedList<Korisnik> kor){
		try{
			ObjectInputStream in = new ObjectInputStream(
					new BufferedInputStream(new FileInputStream(putanja)));
			
			
			LinkedList<Korisnik> korisnici = (LinkedList<Korisnik>)(in.readObject());
			kor.clear();
			kor.addAll(korisnici);
			
			in.close();
		} catch (Exception e){
			throw new RuntimeException(e);
		}
	}

}
