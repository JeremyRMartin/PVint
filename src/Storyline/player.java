package Storyline;

public class player {
	
	//////////////////Fields///////////////////////////
	private static String name;
	private static double height;
	private static int age;
	
	
	//////////////////Methods/////////////////////////
	
	///////////name
	public static void setName(String nameEntry) {
		name = nameEntry;
		
	}
	public static String getName() {
		return name;
	}
	
	///////////height
	public static void setheight(double heightEntry) {
		height = heightEntry;
	}
	public static double getHeight() {
		return height;
	}
	
	/////////////age
	public static void setAge(int ageEntry) {
		age = ageEntry;
	}
	public static int getAge() {
		return age;		
	}



}
