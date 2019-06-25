package BeeGame;

import java.util.Scanner;

class PlayBeeGame {
	
	static int opt;
	
	static void attackInstr() {
		System.out.println("Now you can start attacking bees");
		System.out.println("Type 2 to attack bees, type 1 if you want to "
				+ "create a new bee list");
	}
	
	static Bee[] startGame(Scanner in, Bee[] beeList) {
		
		int n = beeList.length;
		
		while(true) {			
			try {
				opt = (int) (Integer.parseInt(in.nextLine()));
			}
			catch(Exception e) {
				System.out.println("Choose option 1 or 2");
				continue;
			}
			
			if(opt == 1) {
				System.out.println("You've created a bee list:");
				beeList = BeeGroup.bList(n);
				attackInstr();
			}			
			else if(opt == 2) {
				System.out.println("Create a bee list before Attack bees");
				continue;
			}			
			else {
				System.out.println("Choose option 1 or 2");
				continue;
			}		
			break;
		}
		return beeList;
	}
	
	static Bee[] attackBee(Scanner in, Bee[] beeList) {
		int i=0, n = beeList.length;
		while(BeeGroup.bLifeAll(beeList)) {
				try {
					opt = (int) (Integer.parseInt(in.nextLine()));
				}
				catch(Exception e) {
					System.out.println("Choose option 1 or 2");
					continue;
				}
							
				if(opt == 1) {
					System.out.println("You've just created a new bee list");
					beeList = BeeGroup.bList(n);
					i = 0;
					attackInstr();
				}			
				else if(opt == 2) {
					if(beeList[i].bLife()=="Death") i++;
					beeList[i].Damage();
					beeList[i].printInfo();
				}
				else {
					System.out.println("Choose option 1 or 2");
				}
		}
		return beeList;
	}
}
