package method;

public class NewLine {
	public static void main(String[] args) {
		System.out.println("Line 1");
		threeLines();
		System.out.println("Line 2");
		
	}

	private static void threeLines() {
		oneLine();
		oneLine();
		oneLine();		
	}

	private static void oneLine() {
		System.out.println(); //ÇÑÁÙ¶ç¿ò
	}
}
