package method;

public class Gasoline {
	public static void main(String[] args) {
		double gasoline = 8.86;
		double distance = 182.736;
		double efficiency = calcEffiency(gasoline, distance);
		System.out.printf("¿¬ºñ: %.2f km/L",efficiency);
	}

	private static double calcEffiency(double gasoline, double distance) {
		return distance/gasoline;
		
	}
}
