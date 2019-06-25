package BeeGame;

class BeeGroup {	
	static Bee createBee() {
		int i = (int) (Math.random() * 3);
		Bee a = new BQueen();
		
		if(i == 0) {
			a = new BQueen();
			a.setType("Queen");
		}
		
		if(i == 1) {
			a = new BDrone();
			a.setType("Drone");
		}
		
		if(i == 2) {
			a = new BWorker();
			a.setType("Worker");
		}
		return a;
	}
	
	static Bee[] bList(int num) {
		Bee[] bGroup = new Bee[num];
		
		for(int i=0; i<num; i++) {
			bGroup[i] = createBee();
		}		
		return bGroup;
	}
	
	static boolean bLifeAll(Bee[] bees) {
		boolean bLife = false;
		
		for(Bee bee: bees) {
			if(bee.bStatus() == "Alive") {
				bLife = true;
			}
		}		
		return bLife;
	}		
}
