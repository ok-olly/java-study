package custom_Exception;

import custom_Exception.exception.TempTooHightException;
import custom_Exception.exception.TempTooLowException;

public class App {
	public static void main(String[] args){
		// 예외처리를 넘김
		Thermostat stat = new Thermostat();
		
		try {
			stat.setTemperature(-40);
		} catch (TempTooHightException e) {
			//온도가 낮을 경우 처리 코드
			System.out.println(e.getMessage());
		} catch (TempTooLowException e) {
			//온도가 높을 경우 처리 코드
			System.out.println(e.getMessage());
		}

	}

}
