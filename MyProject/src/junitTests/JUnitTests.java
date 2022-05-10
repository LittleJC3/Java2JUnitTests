package junitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fish.Fish;

class JUnitTests {

	@Test
	void test3() {
		try {
			Fish myFish = new Fish("Pedro");
			// Erase name
			myFish.setName("");
			// See if we now have a Fish with no name
			assert (myFish.getName().trim().length() != 0);
		} catch (Exception ex) {
		}

	}

	@Test
	void test() {
		// Test if we can have a blank fish name. According to the spec we should not be
		// able to
		Fish myFish = new Fish();
		assert (myFish.getName().length() != 0);
	}

	@Test
	void test1() {
		// Test if the name is stored correctly when we call setName
		Fish myFish = new Fish();
		try {
			myFish.setName("Perch");
		} catch (Exception ex) {
		}
		assert (myFish.getName().equals("Perch"));
	}

	@Test
	void test2() {
		// Test if the name is stored correctly when we use the constructor
		try {
			Fish myFish = new Fish("Bass");
			assert (myFish.getName().equals("Bass"));
		} catch (Exception ex) {
		}

	}
}
