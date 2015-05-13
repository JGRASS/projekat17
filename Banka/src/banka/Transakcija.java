package banka;

import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 * Klasa Transakcija
 * domenska klasa koja definise jednu transakciju
 * jednog korisnika
 * @author Petar Jelenkovic
 *
 */
public class Transakcija implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GregorianCalendar datumTransakcije;
	private double iznosTransakcije;
	private String valuta;
	
	public GregorianCalendar getDatumTransakcije() {
		return datumTransakcije;
	}
	public void setDatumTransakcije(GregorianCalendar datumTransakcije) {
		this.datumTransakcije = datumTransakcije;
	}
	public double getIznosTransakcije() {
		return iznosTransakcije;
	}
	public void setIznosTransakcije(double iznosTransakcije) {
		this.iznosTransakcije = iznosTransakcije;
	}
	public String getValuta() {
		return valuta;
	}
	public void setValuta(String valuta) {
		this.valuta = valuta;
	}
	/**
	 * @return string oblika:
	 * "Datum i vreme transackije: " dan u mesecu"/"mesec"/"godina" "sat":"minut"
	 *	"Iznos:"iznos Transakcije" "valuta
	 */
	@Override
	public String toString() {
		return "Datum i vreme transakcije: " + datumTransakcije.get(GregorianCalendar.DAY_OF_MONTH)+"/"+(datumTransakcije.get(GregorianCalendar.MONTH)+1)+
				"/"+datumTransakcije.get(GregorianCalendar.YEAR)+" "+datumTransakcije.get(GregorianCalendar.HOUR_OF_DAY)+":"
				+datumTransakcije.get(GregorianCalendar.MINUTE)
				+ "\nIznos:" + iznosTransakcije + " "+ valuta ;
				
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((datumTransakcije == null) ? 0 : datumTransakcije.hashCode());
		long temp;
		temp = Double.doubleToLongBits(iznosTransakcije);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((valuta == null) ? 0 : valuta.hashCode());
		return result;
	}
	/**
	 * Equals metoda koje poredi transakcije prema
	 * valuti, iznosu i datumu gde se uzimaju u obzir
	 * datum i vreme u satima i minutima
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transakcija other = (Transakcija) obj;
		if (datumTransakcije == null) {
			if (other.datumTransakcije != null)
				return false;
		} else if (datumTransakcije.get(GregorianCalendar.DAY_OF_MONTH)!=(other.datumTransakcije.get(GregorianCalendar.DAY_OF_MONTH))||
				datumTransakcije.get(GregorianCalendar.MONTH)!=(other.datumTransakcije.get(GregorianCalendar.MONTH))||
				datumTransakcije.get(GregorianCalendar.YEAR)!=(other.datumTransakcije.get(GregorianCalendar.YEAR))||
				datumTransakcije.get(GregorianCalendar.HOUR_OF_DAY)!=(other.datumTransakcije.get(GregorianCalendar.HOUR_OF_DAY))||
				datumTransakcije.get(GregorianCalendar.MINUTE)!=(other.datumTransakcije.get(GregorianCalendar.MINUTE)))
			return false;
		if (Double.doubleToLongBits(iznosTransakcije) != Double
				.doubleToLongBits(other.iznosTransakcije))
			return false;
		if (valuta == null) {
			if (other.valuta != null)
				return false;
		} else if (!valuta.equals(other.valuta))
			return false;
		return true;
	}
	
	

}
