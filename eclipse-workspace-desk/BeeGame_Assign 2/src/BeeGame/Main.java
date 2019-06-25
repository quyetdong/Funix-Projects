package BeeGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Choose one of following options:");
		System.out.println("1. Create a bee list: include 10 bees, each bee"
				+ " is one of three types: Queen, Drone, Worker");
		System.out.println("2. Attack bees in the list");
		
		Scanner in = new Scanner(System.in);
		Bee[] beeList = new Bee[10];
		
		beeList = PlayBeeGame.startGame(in, beeList);
		beeList = PlayBeeGame.attackBee(in, beeList);
		
		System.out.println("You've won!");
		for(Bee bee: beeList) {
			bee.printInfo();
		}
	}

}
