package entities;

public class Fruit {
	//protected 접근 지정자 (상속받은 클래스에서 사용가능)
	protected int id;

	@Override
	public String toString() {
		return "Fruit [id=" + id + "]";
	}
	
	
}
