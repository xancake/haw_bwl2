package org.haw.bwl2.praktikum.produkt.loader;

import java.io.IOException;
import java.util.List;

import org.haw.bwl2.praktikum.produkt.Produkt_I;

public interface ProduktLoader_I {
	List<Produkt_I> loadAlleProdukte() throws IOException;
	
	Produkt_I loadProdukt(String id) throws IOException;
}