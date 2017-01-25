import java.util.Scanner;

public class exo4_1 {

	public static String FirstLetterToUpper( String chaine){
		char cParcours;
		String newC="";
		char temp=' ';
		
		for (int i=0; i< chaine.length(); i++){
			char charAct = chaine.charAt(i);
			if(Character.isLetter(charAct)&& i==0){
				charAct=Character.toUpperCase(charAct);
				newC+=charAct;
				temp=charAct;
			}
			else if(Character.isLetter(charAct)&&((temp >= 'A' && temp <= 'Z')||(temp!=' '))){
				newC+=charAct;
				temp=charAct;
			}
			else{
				charAct=Character.toUpperCase(charAct);
				newC+=charAct;
				temp=charAct;
			}
		}
		return newC;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez votre phrase :");
		String chaine=sc.nextLine();
		System.out.println(FirstLetterToUpper(chaine));
		System.out.println("Fin du programme");
		return ;
		
	}

}
