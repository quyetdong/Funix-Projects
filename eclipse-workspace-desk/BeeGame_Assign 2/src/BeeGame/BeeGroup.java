package BeeGame;

class BeeGroup {	
	static Bee getBee() {
		int i = (int) (Math.random() * 3);
		Bee a = new BQueen();
		
		if(i == 0) {
			a = new BQueen();
			a.setType("Bee Queen");
		}
		
		if(i == 1) {
			a = new BDrone();
			a.setType("Bee Drone");
		}
		
		if(i == 2) {
			a = new BWorker();
			a.setType("Bee Worker");
		}
		return a;
	}
	
	static Bee[] bList(int num) {
		Bee[] bGroup = new Bee[num];
		
		for(int i=0; i<num; i++) {
			bGroup[i] = getBee();
			bGroup[i].setIndex(i+1);
			bGroup[i].printInfo();
		}
		
		return bGroup;
	}
	
	static boolean bLifeAll(Bee[] bees) {
		boolean bLife = false;
		
		for(Bee bee: bees) {
			if(bee.bLife() == "Alive") {
				bLife = true;
			}
		}		
		return bLife;
	}		
}
