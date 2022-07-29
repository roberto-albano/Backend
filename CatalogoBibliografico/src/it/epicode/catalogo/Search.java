package it.epicode.catalogo;

import java.util.List;
import java.util.Map;

public interface Search {
	public Map<String, Catalog> searchForAuthor(String author) ;
	public Map<String, Catalog>searchForYear(String y, Map<String, Catalog> m) ;
	public Map<String, Catalog> searchForIsbn(String i, Map<String, Catalog> m) ;
}
