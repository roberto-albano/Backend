package it.epicode.catalogo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SearchClass implements Search {

	public Map<String, Catalog> mainCatalog;

	public SearchClass(Map<String, Catalog> mainCatalog) {

		this.mainCatalog = mainCatalog;
	}

	@Override
	public Map<String, Catalog> searchForAuthor(String author) {
		return mainCatalog.values().stream().filter(e -> e instanceof Book && ((Book) e).getAuthor().equals(author))
				.collect(Collectors.toMap(c -> c.getISBNcode(), c -> c));

	}

	@Override
	public Map<String, Catalog> searchForYear(String y, Map<String, Catalog> m) {
		return mainCatalog.values().stream().filter(e -> e instanceof Book && ((Book) e).getPublicationYear().equals(y))
				.collect(Collectors.toMap(c -> c.getISBNcode(), c -> c));
	}

	@Override
	public Map<String, Catalog> searchForIsbn(String i, Map<String, Catalog> m) {
		return mainCatalog.values().stream().filter(e -> e instanceof Book && ((Book) e).getISBNcode().equals(i))
				.collect(Collectors.toMap(c -> c.getISBNcode(), c -> c));
	}

}
