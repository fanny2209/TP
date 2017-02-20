package Test;

import QuizzUtils.*;
import TextUtils.TextIO;

public class Test {
	private static IntQuestion[] quest;
	private static int[] Answers;   

	/**
	 * Create a tab of answers then save them in a array of the object
	 */
	private static void administerQuiz() {
		Answers = new int[10];
		for (int i = 0; i < 10; i++) {
		
			System.out.println(quest[i].getQuestion());
			Answers[i] = TextIO.getlnInt();
		}
	}


	/**
	 * Correct answers after save response of users
	 * give the final score of the quizz
	 */
	private static void gradeQuiz() {
		int score=0;
		for (int i = 0; i < 10; i++) {
			System.out.println(quest[i].getQuestion());
			System.out.println("The response was:  " + quest[i].getCorrectAnswer());
			if ( Answers[i] == quest[i].getCorrectAnswer() ) {
				System.out.println("Good !!!! ");
				score++;
			}
			else {
				System.out.println(Answers[i] + " is wrong !!! ");
			}
			System.out.println();
		}
		
		System.out.println("You have " +score+" points at this quizz");

	}

	
	/**
	 *Creations of questions
	 */
	private static void createQuiz() {
		quest = new IntQuestion[10];
		for ( int i = 0; i < 7; i++ ) {
			if (Math.random() < 0.5)
				quest[i] = new AdditionQuestion();
			else
				quest[i] = new SoustractionQuestion();
		}
		
		quest[7] = new IntQuestion() {
			public String getQuestion() {
				return "How many states are there in the United States?";
			}
			public int getCorrectAnswer() {
				return 50;
			}
		};
		quest[8] = new IntQuestion() {
			public String getQuestion() {
				return "In what year did the First World War begin?";
			}
			public int getCorrectAnswer() {
				return 1914;
			}
		};
		quest[9] = new IntQuestion() {
			public String getQuestion() {
				return "What is the answer to the ultimate question " +
						"of life, the universe, and everything?";
			}
			public int getCorrectAnswer() {
				return 42;
			}
		};
	}        
	public static void main(String[] args) {
		System.out.println("Hi :-) \n");
		createQuiz();
		administerQuiz();
		gradeQuiz();
	}



	

} // end class GeneralQuiz

