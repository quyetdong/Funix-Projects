//import java.util.*;
package BeeGame;

abstract class Bee {
	private int health;
	private String bType;
	
	Bee() {
		health = 100;
	}
	
	abstract String bStatus();
	
	void setType(String bType) {
		this.bType = bType;
	}	
	String getType() {
		return bType;
	}
	
	int getHealth() {
		return health;
	}
	
	int Damage() {
		int d = (int) (Math.random() * 100);
		if(bStatus() == "Alive") {
			if(health <= d) {
				health = 0;
			} else {
				health = health - d;
			}
		}
		return d;
	}
}