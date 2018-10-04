package Storyline;

import tools.wait;

public class chapter1 {

	public static void section1() throws InterruptedException {
		System.out.println("{ENTER (CHAPTER 1:SECTION 1)}");
		System.out.println("[Old Man]- Why don't you get a bit more sleep and");
		wait.oneSec();
		System.out.println("[Old Man]- we can pick up in the morning.");
		wait.oneSec();
		System.out.printf("%44s%n", "***YOU DOZE OFF***");
		wait.sleep();
		System.out.printf("%43s%n", "***YOU WAKE UP***");
		wait.twoSec();
		System.out.println("[Old Man]- Okay, first things first.");
				
	}
}
