package day12.com.ict.edu;

public class Ex02_getset {
	
	// 직접 접근하는것을 막기 위해서 접근제한자 private를 사용한다
	private String name = "홍길동";
	private String kkk = "";
	private int age = 24;
	private double weight = 72.6;
	private boolean gender = true;
	
	
	// get() set() 이용한다
	
	public String getKkk() {
		return kkk;
	}
	public void setKkk(String kkk) {
		this.kkk = kkk;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this/*전역변수와 지역변수의 이름이 같으면 this.붙이기*/.name = name;
	}
	// 지역변수 우선순위가 높기때문에 전역변수에 this. 표시하지않으면 이름이 같은 지역변수로 설정된다
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	
	
	
	
	
	
	
	
}
