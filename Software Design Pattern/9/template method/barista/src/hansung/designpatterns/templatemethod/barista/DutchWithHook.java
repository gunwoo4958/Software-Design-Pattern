package hansung.designpatterns.templatemethod.barista;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DutchWithHook extends CaffeineBeverageWithHook {


	@Override
	void ferment() {
		System.out.println("Fremnet Dutch few days");
	}

	public void brew() {
		System.out.println("Dripping Dutch through filter with cold water");
	}
 
	public void addCondiments() {
		System.out.println("Adding Sugar and Ice");
	}

	@Override
	public void prepareWater() {
		System.out.println("Prepare cold water");
	}

	public boolean customerWantsCondiments() {

		String answer = getUserInput();

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
 
	private String getUserInput() {
		String answer = null;

		System.out.print("Would you like Ice and sugar with your dutch (y/n)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO error trying to read your answer");
		}
		if (answer == null) {
			return "no";
		}
		return answer;
	}
}
