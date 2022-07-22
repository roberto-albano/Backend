package week1giorno5Progetto;

public class Immagine implements ElementoVideo {

	int luminosita;
	String titolo;
	
	public Immagine(String titolo, int luminosita) {
		this.luminosita = luminosita;
		this.titolo = titolo;
	}
	
	public void show() {

		for (int i = 1; i < luminosita; i++) {
			if(i%2==0) {
			System.out.printf(this.titolo);
				
				} 
				
				for (int x = 0; x < luminosita; x++) {
					System.out.printf("*");
				}
		
				}
			} 

	
	
	public void alzaLuminosita(int lum) {
		this.luminosita = lum; 
		
	}

	
	public void diminuisciLuminosita(int dimlum) {
		this.luminosita = dimlum;
		
	}

		
}
