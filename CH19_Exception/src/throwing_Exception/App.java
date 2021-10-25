package throwing_Exception;

public class App {
	public static void main(String[] args) throws Exception {
		// 예외처리를 넘김
		Thermostat stat = new Thermostat();
		
		//setTemperature 메소드에서 예외처리를 throw했기 때문에 호출할 때 처리해야한다.
		//try-catch는 바로 처리, throw는 넘김
		stat.setTemperature(30);

	}

}
