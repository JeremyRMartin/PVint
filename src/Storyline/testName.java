package Storyline;
import tools.Utility;
import tools.requestResponse;
import tools.wait;



public class testName {

	public static String CorrectName(String name) throws InterruptedException {
			name = name.toUpperCase();
			System.out.println("[Old Man]- " + name + ", really?");
			wait.oneSec();
			System.out.println("[Old Man]- Did I get that right?");
			requestResponse.yesNo();
			String correctName = Utility.scanner.nextLine();
			correctName = correctName.toUpperCase();	
			if(correctName.equals("NO")) {
				System.out.println("[Old Man]- Okay, what is it then?");
				name = Utility.scanner.nextLine();
				name = name.toUpperCase();
			}
			else if(correctName.equals("YES")) {
								
			}
			else {
				System.out.println("PLEASE ENTER A CORRECT OPTION");
				correctName = Utility.scanner.nextLine();
			}
			return name;
		
	}
}
