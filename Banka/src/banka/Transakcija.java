package banka;

import java.util.GregorianCalendar;

public class Transakcija {
	
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

}
