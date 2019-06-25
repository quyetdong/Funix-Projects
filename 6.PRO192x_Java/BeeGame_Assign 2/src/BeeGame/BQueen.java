package BeeGame;

class BQueen extends Bee {
	String bStatus() {
		if(getHealth() < 20) {
			return "Death";
		}
		return "Alive";
	}
}