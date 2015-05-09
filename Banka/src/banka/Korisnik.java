package banka;

import java.util.LinkedList;

public class Korisnik {
	
	 private String ime;
	 private String adresa;
	 private String vrstaRacuna;
	 
	 
	private LinkedList<Transakcija> transakcije;
	
	public Korisnik(){
		transakcije = new LinkedList<Transakcija>();
	}
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getVrstaRacuna() {
		return vrstaRacuna;
	}

	public void setVrstaRacuna(String vrstaRacuna) {
		if(vrstaRacuna.equals("devizni") || vrstaRacuna.equals("dinarski"))
		    this.vrstaRacuna = vrstaRacuna;
		else
			throw new RuntimeException("Vrsta racuna mora biti: devizni ili dinarski");
	}

	public LinkedList<Transakcija> getTransakcije() {
		return transakcije;
	}

	public void setTransakcije(LinkedList<Transakcija> transakcije) {
		this.transakcije = transakcije;
	}

	
	

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresa == null) ? 0 : adresa.hashCode());
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		result = prime * result
				+ ((vrstaRacuna == null) ? 0 : vrstaRacuna.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Korisnik other = (Korisnik) obj;
		if (adresa == null) {
			if (other.adresa != null)
				return false;
		} else if (!adresa.equals(other.adresa))
			return false;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		if (vrstaRacuna == null) {
			if (other.vrstaRacuna != null)
				return false;
		} else if (!vrstaRacuna.equals(other.vrstaRacuna))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ime korisnika:"+ime+" Adresa:"+adresa+" Vrsta racuna:"+vrstaRacuna;
	}

	

}
