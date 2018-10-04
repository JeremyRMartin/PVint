package Storyline;
import tools.Utility;
import tools.requestResponse;
import tools.wait;

/*
 * Introduces player to the main story line. 
 * 
 * Presents player with option to continue.
 * 
 * Sets players name.  
 * 
 */
public class Intro {
	public static String printIntro() throws InterruptedException {
		System.out.printf("%53s%n", "***YOU AWAKEN FROM BEING UNCONSCIOUS***");
		wait.twoSec();
		System.out.printf("%57s%n","***YOUR HEAD ACHES AND YOUR BODY FEELS HEAVY***");
		wait.twoSec();
		System.out.printf("%33s%n","***YOU CAN HEAR THE FAINT BREATHING OF SOMEONE HOVERED OVER YOU***");
		wait.threeDot();
		wait.oneSec();
		System.out.printf("%47s%n","***YOU OPEN YOUR EYES***");
		wait.oneSec();
		System.out.println("[Old Man]- Ahh, you're awake!");
		wait.oneSec();
		System.out.println("[Old Man]- You withstood quite the beating back there.");
		wait.twoSec();
		System.out.println("[Old Man]- Hey, whats your name anyway?");
		requestResponse.ask();
		String name = Utility.scanner.nextLine();
		String trueName = testName.CorrectName(name);
		player.setName(trueName);
		trueName.toUpperCase();
		System.out.println("[Old Man]- Okay " + player.getName() + ", heres the sitch.");
		wait.twoSec();
		System.out.println("[Old Man]- Look, I'm surprised you're even alive right now,");
		wait.oneSec();
		System.out.println("[Old Man]- and I know it's probably inappropriate for me to ask a favor");
		wait.oneSec();
		System.out.println("[Old Man]- from a half alive corpse, but we are desperate here.");
		wait.twoSec();
		System.out.println("[Old Man]- Would you possibly be able to help us?");
		requestResponse.yesNoMore();
		String response = Utility.scanner.nextLine();
		response = response.toUpperCase();
		return response;	
	}//End printIntro method	
	
	
	public static String moreInfo() throws InterruptedException {
		System.out.println("{ENTER (MORE INFO ABOUT CHAPTER 1)}");
		wait.twoSec();
		System.out.println("[Old Man]- So what do you say?");
		requestResponse.yesNo();
		String response = Utility.scanner.nextLine();
		response = response.toUpperCase();
		return response;
	}//End moreInfo method
	
	
	
}//End Chapter1 class