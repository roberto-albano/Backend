package it.epicode.catalogo;

import java.util.HashMap;
import java.util.Map;

public class Service {
	
	public Map<String, Catalog> mainCatalog = new HashMap<>();
	

	Catalog book1 = new Book("1234", "Libro 1", "2012", 963, "Autore 1", "Fantasy");
	Catalog book2 = new Book("1534", "Libro 2", "2018", 763, "Autore 2", "Adventure");
	Catalog book3 = new Book("4294", "Libro 3", "2020", 523, "Autore 3", "Dramatic");
	Catalog book4 = new Book("3234", "Libro 4", "2010", 876, "Autore 1", "Adventure");
	Catalog book5 = new Book("7034", "Libro 5", "2022", 126, "Autore 2", "Fantasy");
	Catalog magazine1 = new Magazine("1321", "Rivista 1", "2020", 23, Periodicity.MENSILE);
	Catalog magazine2 = new Magazine("2721", "Rivista 2", "2019", 43, Periodicity.SETTIMANALE);
	Catalog magazine3 = new Magazine("4381", "Rivista 3", "2012", 51, Periodicity.SEMESTRALE);
	Catalog magazine4 = new Magazine("9321", "Rivista 4", "2018", 22, Periodicity.MENSILE);
	Catalog magazine5 = new Magazine("4322", "Rivista 5", "2022", 63, Periodicity.SETTIMANALE);
	
	public void addElement(Catalog element) {
		mainCatalog.put(element.getISBNcode(), element);
	}
	
	public void deleteElement(Catalog element) {
		mainCatalog.remove(element.getISBNcode());
	}

	public Service() {
		super();
	}

	public Map<String, Catalog> popolaLista(){
		
	
		
		addElement(book1);
		addElement(book2);
		addElement(book3);
		addElement(book4);
		addElement(book5);
		addElement(magazine1);
		addElement(magazine2);
		addElement(magazine3);
		addElement(magazine4);
		addElement(magazine5);
		
		return mainCatalog;
	};
	
	
	

}
