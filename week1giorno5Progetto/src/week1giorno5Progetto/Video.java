package week1giorno5Progetto;

public class Video implements ElementoRiproducibile, ElementoVideo {
	
	String titolo;
	int luminosita;
	int durata;
	int volume;
	
	
	public Video(String titolo, int luminosita, int durata, int volume) {
		this.titolo = titolo;
		this.durata = durata;
		this.volume = volume;
		this.luminosita = luminosita;		
		
	}

	public void play() {
		
		for (int i = 1; i < luminosita; i++) {
			if(i%2==0) {
			System.out.printf(this.titolo);
				for (int j = 0; j < volume; j++){
					System.out.printf("!");
					
				} 
				
				for (int x = 0; x < luminosita; x++) {
					System.out.printf("*");
				}
			} 
		}
	}
	
	
	

	

		

	
	public void abbassaVolume() {
		this.volume--;
		
	}

	
	public void alzaVolume() {
		this.volume++;
		
	}
		
	
	public void alzaLuminosita(int lum) {
		this.luminosita = lum; 
		
	}

	
	public void diminuisciLuminosita(int dimlum) {
		this.luminosita = dimlum;
		
	}

	
	

}

