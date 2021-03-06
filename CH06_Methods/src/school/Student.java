package school;

public class Student {
	//변수
	private String name;
	private int age;
	private boolean isVisible;
	private double temperature;
	
	//생성자
	public Student() {
		// 기본생성자
		name = "이름모름";
		age= 18;
		isVisible = false;
		temperature = 36.0;
	}
	
		// 매개변수 넣은 생성자 자동생성
	public Student(String name, int age, boolean isVisible, double temperature) {
		this.name = name;
		this.age = age;
		this.isVisible = isVisible;
		this.temperature = temperature;
	}



	//getter setter 자동생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isVisible() {
		return isVisible;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", 집체=" + isVisible + ", temperature=" + temperature
				+ "]";
	}
	
}
