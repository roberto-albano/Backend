package week1giorno5Progetto;

public class Audio implements ElementoRiproducibile{

	 int volume; //attributo//
	 double durata;
	 String titolo;
	 
	 public Audio (int volume, double durata, String titolo) {
		 
		     this.volume = volume;
		     this.durata = durata;
		     this.titolo = titolo;
		     }	

	 public void play() {
		 
		 for (int i = 1; i < durata; i++) {
				if(i%2==0) {
					System.out.printf(this.titolo);
						for (int j = 0; j < volume; j++){
							System.out.printf("!");
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
}


