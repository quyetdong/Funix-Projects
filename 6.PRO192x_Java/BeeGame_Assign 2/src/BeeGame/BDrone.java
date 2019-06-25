package BeeGame;

class BDrone extends Bee {
	String bStatus() {
		if(getHealth() < 50) {
			return "Death";
		}
		return "Alive";
	}
}
