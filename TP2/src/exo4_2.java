import java.util.Scanner;

/**
 * @author Fanny
 *
 */
public class exo4_2 {

	public static int hexValue(char hexa){
		int res=0;
		hexa=Character.toUpperCase(hexa);
		if((hexa <'A' && hexa > 'F') ){
			return -1;
		}
		else{
			switch (hexa)
			{
			case 'A':
				res=10;
				break;
			case 'B':
				res=11;
				break;
			case 'C':
				res=12;
				break;
			case 'D':
				res=13;
				break;
			case 'E':
				res=14;
				break;
			case 'F':
				res=15;
				break;
			default:
				res=Character.getNumericValue(hexa);
			}
		}
		System.out.println(res);
		return res;

	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Entrez votre nombre hexadécimal");
		String rep=sc.nextLine();
		int deci=0;
		int expo=rep.length()-1;
		for (int i = 0; i < rep.length();  i++ ){
			deci+= Math.pow(16, expo) * hexValue( rep.charAt(i) );
			expo-=1;
	}
		System.out.println("In base_10 : "+deci);
	}
}