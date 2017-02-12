import java.util.Scanner;

public class VirtualPetApp 
{
	static boolean alive;

	public static void main(String[] args) {
		VirtualPet spike = new VirtualPet(); // Created VP

		Scanner input = new Scanner(System.in);

		System.out.println("Virtual Pet menu:");
		System.out.println("What would you like to do?");
		System.out.println("1. Feed my pet");
		System.out.println("2. Give Spike some water");
		System.out.println("3. Take Spike for a walk");
		// User selects
		do {// loop begins

					int choice = input.nextInt();

				if (choice == 1) {
					// feed Method

					spike.feed();

					System.out.println("Spike is full now, and ready for a nap.");

				} else if (choice == 2) { // water Method

					spike.water();
					System.out.println("Spike is no longer thirsty and may need to 'go out' soon.");

				} else if (choice == 3) { // walk Method

					spike.walk();
					System.out.println("Spike is no longer bored, Spike is ready for a nap.");

				}
				spike.tick();// time is passing
				System.out.println(
						"Spike's hunger level is at:  " + VirtualPet.getHunger() + " Spike's thirst level is at: "
								+ VirtualPet.getWater() + "  Spike's level of boredom is at: " + VirtualPet.getWalk());

				if (VirtualPet.getHunger() >= 15) {
					System.out.println("Spike is on the brink of starvation, FEED YOUR DOG before I call the law!!");

				}
				if (VirtualPet.getWater() >= 15) {
					System.out.println("Spike is parched, you need to put some water in his bowl a.s.a.p.!!");

				}
				if (VirtualPet.getWalk() >= 15) {
					System.out.println(
							"Spike is feeling like he's on 'Lock Down'...show some love and take him to the park");
				}
		 if (VirtualPet.getHunger() >= 100 || VirtualPet.getWater() >= 100 || VirtualPet.getWalk() >= 100){// close
			 alive = false;
			 System.out.println("Spike is dead");
		}else if	(VirtualPet.getHunger() < 100 || VirtualPet.getWater() < 100 || VirtualPet.getWalk() < 100){
		 	alive = true;}
		} while (alive);		// close
		// loop
		input.close();

	}
}

// go back to printing the menu (loop)
