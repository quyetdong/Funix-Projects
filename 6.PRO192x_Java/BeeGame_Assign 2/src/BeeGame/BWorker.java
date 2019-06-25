package BeeGame;

class BWorker extends Bee {
	String bStatus() {
		if(getHealth() < 70) {
			return "Death";
		}
		return "Alive";
	}
}
