//import java.util.*;
package BeeGame;

abstract class Bee {
	private int health;
	private int index;
	private String bType;
	
	Bee() {
		health = 100;
	}
	void printInfo() {
		System.out.println(index+". "+bType+" "+health+" "+this.bLife());
	}
	abstract String bLife();
	
	void setType(String bType) {
		this.bType = bType;
	}
	
	String getType() {
		return bType;
	}
	
	void setIndex(int index) {
		this.index = index;
	}
	
	int getIndex() {
		return index;
	}
	
	int getHealth() {
		return health;
	}
	
	void Damage() {
		int n = (int) (Math.random() * 100);
		if(bLife() == "Alive") {
			health = health - n;
		}
	}
}