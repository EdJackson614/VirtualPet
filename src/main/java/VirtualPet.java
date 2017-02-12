
public class VirtualPet {
	private String petName = "Spike";

	private static int hunger = 2;// Initialize hunger as an integer

	public static int getHunger() {// Get Method
		return hunger;
	}

	public void feed() { // feed Method
		hunger = hunger - 12; // hunger to decrease
	}

	public void tick() { // tick
		hunger = hunger + 7; // hunger increases as time passes
		thirst = thirst + 8;// thirst increase as time passes
		boredom = boredom + 5;// boredom increases as time passes
	}

	private static int thirst = 7; // Initialize thirst as an integer

	public static int getWater() { // Get Method
		return thirst;
	}

	public void water() {// Water method
		thirst = thirst - 12;// decreased thirst
	}

	private static int boredom = 7;// Initialise boredom

	public static int getWalk() {// Get Method
		return boredom;
	}

	public void walk() {// Walk method
		boredom = boredom - 12;// decreased boredom
	}

}
