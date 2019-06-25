package BeeGame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BDroneTest {

	@Test
	void test() {
		BDrone bd = new BDrone();
		String result = bd.bLife();
		assertEquals("Death",result);
	}

}
