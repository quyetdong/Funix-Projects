package BeeGame;

class BDrone extends Bee {
	String bLife() {
		if(getHealth() < 50) {
			return "Death";
		}
		return "Alive";
	}
}
