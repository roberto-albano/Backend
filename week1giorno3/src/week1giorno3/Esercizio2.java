package week1giorno3;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("*************** Conversione numeri in lettere ***************");
		System.out.println("                       ");
		System.out.println("Inserire un numero intero seguito dal tasto invio");
		int numero = scanner.nextInt();
		String stringaNum = null;
		
		switch (numero) {
		case 0: {
			stringaNum = "Zero";
			break;
		}
		case 1: {
			stringaNum = "Uno";
			break;
		}
		case 2: {
			stringaNum = "Due";
			break;
		}
		case 3: {
			stringaNum = "Tre";
			break;
		}
		default:
			stringaNum = "Non compreso tra 0 e 3, impossibile convertire";
		}
		
		System.out.println("Risultato: " + stringaNum);
		
	}

}
