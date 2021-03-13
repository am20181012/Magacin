package specifikacija;

import magacin.Artikal;

public interface IMagacin {
	
	void dodajArtikal(Artikal artikal);
	void izbaciArtikal(Artikal artikal);
	Artikal nadji(int sifra);

}
