package day15.com.ict.edu2;

public class Ex04_dog extends Ex04_abstract {
	String name ="개똥이";

	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
	@Override
	public void play() {
		System.out.println("들에서놀기");
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	
}