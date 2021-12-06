package member2;

public class MemberBean {
	
	private int id;
	private String name;
	private String phone;
	private String address;
	private String team;
	// JVM이 컴파일 시점에 생성자가 없는 클래스는 디폴트 생성자를 제공한다.
	
	public MemberBean() {
		
	}
	
	public MemberBean(int id, String name, String phone, String team, String address) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.team = team;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	
	
}
