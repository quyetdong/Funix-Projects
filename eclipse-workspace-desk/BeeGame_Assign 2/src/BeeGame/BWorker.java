package BeeGame;

class BWorker extends Bee {
	String bLife() {
		if(getHealth() < 70) {
			return "Death";
		}
		return "Alive";
	}
}
