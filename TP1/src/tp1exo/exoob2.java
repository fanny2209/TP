package tp1exo;

public class exoob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;  
		int[] diviseurs= new int[10001];

		for (int i=0;i<10000;i++ ) {

			int nbDiviseur=0;

			for ( int x =1;x<=i;x++ ) { 
				if ( i%x == 0 )
					nbDiviseur++;
			}
			diviseurs[i] =nbDiviseur; 

			if (nbDiviseur>max) {
				max=nbDiviseur;
				//System.out.println("new diviseur :"+max);
			}

		}

		System.out.println("Among integers between 1 and 10000,");
		System.out.println("The maximum number of divisors was " + max);
		System.out.println("Numbers with that many divisors include:");
		for ( int i = 0; i <10000; i++ ) { //parcours
			if ( diviseurs[i] == max ) {
				System.out.println( "   " + i );
			}
		}

	} // end main()

}