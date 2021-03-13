package impl;

import java.util.List;

import magacin.Artikal;
import specifikacija.IMagacin;

public class MagacinImpl implements IMagacin {
	
	private List<Artikal> artikli;
	
	public MagacinImpl(List<Artikal> artikli) {
		super();
		this.artikli = artikli;
	}

	public List<Artikal> getArtikli() {
		return artikli;
	}

	public void setArtikli(List<Artikal> artikli) {
		this.artikli = artikli;
	}

	@Override
	public void dodajArtikal(Artikal artikal) {
		if(artikal == null) {
			throw new NullPointerException("Uneti artikal ne moze biti null.");
		}
		if(artikli.contains(artikal)) {
			int i = artikli.indexOf(artikal);
			int kolicina = artikli.get(i).getKolicina();
			artikli.get(i).setKolicina(kolicina + 1);
		} else {
			artikli.add(artikal);
		}
			
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		if(artikal == null) {
			throw new NullPointerException("Uneti artikal ne moze biti null.");
		}
		artikli.remove(artikal);
	}

	@Override
	public Artikal nadji(int sifra) {
		if(sifra == 0 || sifra < 0) {
			throw new RuntimeException("Uneta sifra nije ispravna.");
		}
		for(Artikal a: artikli) {
			if(a.getSifra() == sifra)
				return a;
		}
		return null;
	}
	
}
