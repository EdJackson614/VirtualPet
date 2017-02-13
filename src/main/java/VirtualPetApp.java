import java.util.Scanner;

public class VirtualPetApp 
{
	static boolean alive;

	public static void main(String[] args) {
		VirtualPet spike = new VirtualPet(); // Created VP

		Scanner input = new Scanner(System.in);

		System.out.println("Virtual Pet menu:");
		System.out.println("What does Spike need? Please monitor Spike's wellness levels closely;" //
				+ "if any of Spike's levels reached 75, Spike perishes.");
		System.out.println("1. Press ''1'', if you would you like to feed Spike.");
		System.out.println("2. Press ''2'', if you would you like to give spike some water.");
		System.out.println("3.Press ''3'', if you would like to take Spike for a walk.");
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
							"Spike is feeling like he's imprisoned...love your pet,  take him to the park");
				}
		 if (VirtualPet.getHunger() >= 75 || VirtualPet.getWater() >= 75 || VirtualPet.getWalk() >= 75){// close
			 alive = false;
			 System.out.println("Spike is dead !! Wow.");
		}else if	(VirtualPet.getHunger() < 100 || VirtualPet.getWater() < 100 || VirtualPet.getWalk() < 100){
		 	alive = true;}
		} while (alive);		// close
		// loop
		input.close();

	}
}

// go back to printing the menu (loop)
