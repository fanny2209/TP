package QuizzUtils;


public class SoustractionQuestion implements IntQuestion {
	private int a, b;  // The numbers in the problem.
	
	/**
	 * COntstructior
	 * @param null
	 * 
	 */
	public SoustractionQuestion() { // constructor
		a = (int)(Math.random() * 10 + 1);
		b = (int)(Math.random() * 10);
		if (b > a) { 
			int temp = a;
			a = b;
			b = temp;
		}
	}
	/**
	 * getteur
	 * @return string question type
	 */
	public String getQuestion() {
		return "What is " + a + " - " + b + " ?";
	}
	/**
	 * getteur
	 * @return string answer 
	 */
	public int getCorrectAnswer() {
		return a - b;
	}
}


