package timerExample;

import java.util.Timer;
import java.util.TimerTask;
//�ϳ��� ���Ͽ� ���� ���� Ŭ������ ���� �� �ִ�. �׷��� public class�� �� �ϳ��̰� ������ �̸��� ����.
class Task extends TimerTask {
	@Override
	public void run() {
		System.out.println("Hello");
	}
}

public class App {
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0, 1000); //�� �� : run(), 0�� �� ����, �ݺ� �ð��� 1��
	}
}
