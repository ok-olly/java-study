package parameter;

public class App {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		int number = 5;
		int result = calc.square(number);
		
		System.out.printf("%d의 제곱은 %d이다.\n", number, result);
		
		result = calc.plus(10, 10);
		System.out.printf("두 수의 합은 %d이다.\n", result);
		
		result = calc.minus(10, 10);
		System.out.printf("두 수의 차는 %d이다.\n", result);

	}

}
