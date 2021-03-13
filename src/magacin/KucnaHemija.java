package magacin;

import java.util.Date;

public class KucnaHemija extends Artikal{
	
	private Date rokTrajanja;

	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(Date rokTrajanja) {
		if(rokTrajanja.before(new Date()))
			throw new RuntimeException("Rok trajanja mora biti nakon danasnjeg datuma.");
		this.rokTrajanja = rokTrajanja;
	}

	@Override
	public String toString() {
		return "Naziv artikla: " + getNaziv() + "\nSifra: " + getSifra() + 
				"\nOpis: " + getOpis() + "\nKolicina: " + getKolicina() + 
				"\nRok trajanja: " + rokTrajanja;
	}
	
	

}
