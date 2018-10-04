import Storyline.Credits;
import Storyline.Intro;
import Storyline.chapter1;
import tools.Utility;

/* Jeremy Martin
 * Project Description:
 *
 * My project will be a simple game
 * involving choices and a story line.
 * 
 */
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		
		String questDecisionI_0 = Intro.printIntro();
		if (questDecisionI_0.equals("YES")) {
			chapter1.section1();
		}else if(questDecisionI_0.equals("NO")) {
			Credits.rollFalseCredits();
		}else if (questDecisionI_0.equals("MORE INFO")) {
			String Q1_1MoreInfo = Intro.moreInfo();
			if (Q1_1MoreInfo.equals("YES")) {
				chapter1.section1();
			}
			if (Q1_1MoreInfo.equals("NO")) {
				Credits.rollFalseCredits();
			}
		}else {///////////////////Retry for correct response/////////////////////
			System.out.println("PLEASE ENTER A CORRECT OPTION");
			String questDecisionI_1 = Utility.scanner.nextLine();
			if (questDecisionI_1.equals("YES")) {
				chapter1.section1();
			}else if(questDecisionI_1.equals("NO")) {
				Credits.rollFalseCredits();
			}else if (questDecisionI_1.equals("MORE INFO")) {
				Intro.moreInfo();
			}////////////////////////////////////////////////////////////////////
		}//end Intro If-Statement
		
		
	}//end main method
}//end Main class
