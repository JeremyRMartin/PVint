package Storyline;
import java.util.concurrent.TimeUnit;

public class Credits {

	public static void rollFalseCredits() throws InterruptedException {
		System.out.printf("%55s%n","******************THE END******************");
		System.out.printf("%55s%n","******************CREDITS******************");
		String jobRoles[] = {"Producer: Jeremy Martin","Production Assistant: Jeremy Martin", "Development: Jeremy Martin",
					"Developmental Assitant: Jeremy Martin", "StoryLine: Jeremy Martin", "Senior Coffee Fetcher: Jeremy Martin",
					"Assistant Coffee Fetcher: Jeremy Martin", "Dog Walker: Jeremy Martin",
					"Assitant TO the Dog Walker: Jeremy Martin"};
		for (int i=0; i<jobRoles.length; i++) {
			TimeUnit.SECONDS.sleep(2);
			System.out.println();
			System.out.printf("%50s%n", jobRoles[i]);
		}//ends Loop
		System.out.printf("%55s%n", "******************FIN******************");
		TimeUnit.SECONDS.sleep(1);
	}//ends Credits
}
