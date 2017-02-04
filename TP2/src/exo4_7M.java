import java.util.Scanner;


/**
 * @author Fanny
 *
 */
public class exo4_7M {
	private static int[] nb1;
	private static int[] nb2;
	private static int[] answers;


	/**
	 * Constructor of a QUIZZ 
	 */
	public exo4_7M() {
		this.nb1= new int[10];
		this.nb2= new int[10];
		this.answers= new int[10];
		for (int i=0; i<10;i++){
			this.nb1[i]=(int)(Math.random()*15)+1;
			this.nb2[i]=(int)(Math.random()*15)+1;
			this.answers[i]=0;
		}
	}

	/**
	 * @param quizz Recept the quizz with initialize questions 
	 * Use to save answers  
	 */
	public static void admin(exo4_7M quizz){
		System.out.println("Welcome, give the result of all of these questions :");
		Scanner sc= new Scanner(System.in);
		int res;
		for (int i=0; i<10;i++){
			System.out.println("Result of...   "+ quizz.nb1[i] +" + "+ quizz.nb2[i] +" = ");
			res=sc.nextInt();
			quizz.answers[i]=res;
		}

		System.out.println("Thanks, we analyze your answers...");
	}

	/**
	 * @param quizz Recept the quizz with initialize questions and answers of users
	 * give result of the user
	 */
	public static void result(exo4_7M quizz){
		int result=0;
		int res;
		System.out.println();
		System.out.println();
		System.out.println("That's your Result : ");
		for (int i=0; i<10; i++){
			res=quizz.nb1[i]+quizz.nb2[i];
			System.out.println("Result of...   "+ quizz.nb1[i] +" + "+ quizz.nb2[i] +" = " +quizz.answers[i]);
			if(res==quizz.answers[i]){
				System.out.println("Great ! you're good man !\n" );
				result+=10;
			}
			else
				System.out.println("NO : result is   "+res+"\n" );
		}
		System.out.println("End of the quizz.... you have "+result+ " point\n" );

	}




	/**
	 * 
	 * Write a program that administers a basic addition quiz to the user. There should be ten questions. Each question is a simple addition problem such as 17 + 42, where the numbers in the problem are chosen at random (and are not too big). The program should ask the user all ten questions and get the user's answers. After asking all the questions, the user should print each question again, with the user's answer. If the user got the answer right, the program should say so; if not, the program should give the correct answer. At the end, tell the user their score on the quiz, where each correct answer counts for ten points.

The program should use three subroutines, one to create the quiz, one to administer the quiz, and one to grade the quiz. It can use three arrays, with three global variables of type int[], to refer to the arrays. The first array holds the first number from every question, the second holds the second number from every questions, and the third holds the user's answers.

	 */
	public static void main(String[] args) {

		exo4_7M quizz= new exo4_7M();
		admin(quizz);
		result(quizz);
	}

}
