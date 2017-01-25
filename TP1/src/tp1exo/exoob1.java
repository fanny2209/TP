package tp1exo;

import java.util.Scanner;

public class exoob1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Votre phrase :");
		String p= sc.nextLine();
		boolean retour=false;
		char chaine;
		for ( int i = 0;  i < p.length(); i++ ) {
			chaine = p.charAt(i);
			if ( Character.isLetter(chaine) || chaine=='\'') {
				System.out.print(chaine);
				retour = false;  
			}
			else if ( retour == false ) {  
					System.out.println();
					retour = true;  
				}
			else{
				retour =false;
			}
		}
	}

}
