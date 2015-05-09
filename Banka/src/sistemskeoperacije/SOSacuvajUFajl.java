package sistemskeoperacije;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import banka.Korisnik;

public class SOSacuvajUFajl {
	
	public static void sacuvajUFajl(LinkedList<Korisnik> kor, String putanja){
		 
		try {
			ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(putanja)));
			out.writeObject(kor);
			
			out.close();
		} catch (Exception e){
			throw new RuntimeException(e);
		}
		
		
	}

}
