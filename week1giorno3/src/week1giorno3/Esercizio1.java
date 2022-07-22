package week1giorno3;

import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {
 		
		verificaStringaPariDispari();
		
		verificaAnnoBisestile();

	}

	public static void verificaStringaPariDispari() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Verifica se il numero è pari o dispari");
		System.out.println("Verifica e premi Invio");
		String stringa = scanner.nextLine();
		
		boolean pari = stringaPariDispari(stringa);
		
		if (pari == true) {
			System.out.println("Pari");
		} else {
			System.out.println("Dispari");
		}
	}
	
	
	public static void verificaAnnoBisestile() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Verifica se l'anno è bisestile");
		System.out.println("Inserire l'anno e premi Invio");
		int anno = scanner.nextInt();
		
		boolean bisestile = annoBisestile(anno);
		
		if (bisestile == true) {
			System.out.println("L'anno " + anno + " è bisestile");
		} else {
			System.out.println("L'anno " + anno + " non è bisestile");
		}
	}
	
	public static boolean stringaPariDispari(String stringa) {
		int numCaratteri = stringa.length();
		
		if ( numCaratteri % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean annoBisestile(int anno) {
		if (anno % 4 == 0) {
			return true;
		} else if (anno % 100 == 0 && anno % 400 == 0) {
			return true;
		}
		return false;
		}
	}
	
	

