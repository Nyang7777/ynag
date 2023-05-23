package day15.com.ict.edu4;

public class Main {
	public static void main(String[] args) {
		
		Terran terran = new Terran();
		terran.setName("마린");
		terran.setFly(false);
		terran.setEnergy(40);
		
		Protoss protoss = new Protoss("질럿", 80, false);
		
		Zerg zerg = new Zerg("뮤탈", 120, true);
		
		terran.decEnergy();
		terran.decEnergy();
		terran.decEnergy();
		zerg.decEnergy();
		protoss.decEnergy();
		
		System.out.println("테란: "+ terran.getEnergy());
		System.out.println("프로토스: "+ protoss.getEnergy());
		System.out.println("저그: "+ zerg.getEnergy());
		
	}
}
