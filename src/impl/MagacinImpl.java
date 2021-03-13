package impl;


import java.util.ArrayList;
import java.util.List;

import magacin.Artikal;
import specifikacija.IMagacin;

public class MagacinImpl implements IMagacin {
	
	private List<Artikal> artikli;

	public MagacinImpl() {
		artikli = new ArrayList<>();
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
			Artikal a = artikli.get(i);
			int kolicina = a.getKolicina();
			artikli.get(i).setKolicina(kolicina + 1);
		} else {
			artikli.add(artikal);
		}
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		if(artikal == null)
			throw new NullPointerException("Uneti artikal ne moze biti null.");
		if(!artikli.contains(artikal))
			throw new RuntimeException("Uneti artikal se ne nalazi na listi artikla.");
		artikli.remove(artikal);
	}

	@Override
	public Artikal nadji(int sifra) {
		if(sifra == 0 || sifra < 0) {
			throw new RuntimeException("Sifra mora biti pozitivan broj");
		} else {
			for(Artikal a: artikli) {
				if(a.getSifra() == sifra)
					return a;
			}
			throw new RuntimeException("U lisiti nema artikla pod navedenom sifrom.");
		}
	}
	
}
