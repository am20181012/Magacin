package magacin;

public class Artikal {
	
	private String naziv;
	private int sifra;
	private String opis;
	private int kolicina;
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv == null || naziv.isEmpty())
			throw new RuntimeException("Naziv artikal ne moze biti null ili prazan string.");
		this.naziv = naziv;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		if(sifra == 0)
			throw new RuntimeException("Sifra artikla ne moze biti nula");
		this.sifra = sifra;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		if(opis == null || opis.isEmpty())
			throw new RuntimeException("Opis artikal ne moze biti null ili prazan string.");
		this.opis = opis;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		if(kolicina < 0)
			throw new RuntimeException("Kolicina ne moze biti negativna.");
		this.kolicina = kolicina;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + sifra;
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
		Artikal other = (Artikal) obj;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (sifra != other.sifra)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Naziv: " + naziv + "\nSifra: " + sifra + "\nOpis: " + opis
				+ "\nKolicina: " + kolicina;
	}

}
