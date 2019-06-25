package BeeGame;

class BQueen extends Bee {
	String bLife() {
		if(getHealth() < 20) {
			return "Death";
		}
		return "Alive";
	}
}