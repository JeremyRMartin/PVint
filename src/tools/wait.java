package tools;
import java.util.concurrent.TimeUnit;

public class wait {

	public static void threeDot() throws InterruptedException {
		for (int i=0; i<3; i++) {
			TimeUnit.SECONDS.sleep(1);
			System.out.printf("%35s%n",".");
		}//ends Loop
	}//ends threeDot
	
	public static void twoSec() throws InterruptedException {
		for (int i=0; i<1; i++) {
			TimeUnit.SECONDS.sleep(2);
		}//ends Loop		
	}//ends twoSec
	
	public static void oneSec() throws InterruptedException {
		for (int i=0; i<1; i++) {
			TimeUnit.SECONDS.sleep(1);
		}//ends Loop		
	}//ends oneSec
	
	
	public static void sleep() throws InterruptedException {
		wait.threeDot();
		wait.threeDot();
	}//ends sleep
}
