package timerExample3;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Alert extends TimerTask {
	@Override
	public void run() {
		System.out.println("Hello");
	}
}

class Task implements Runnable {
	@Override
	public void run() {
		System.out.println("Hi");
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Alert(), 0, 1000);
		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task(), 0, 1, TimeUnit.SECONDS);

	}

}
