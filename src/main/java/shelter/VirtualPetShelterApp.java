package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	private static final String shelter = null;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What is your name?");
		String player = input.nextLine();

		VirtualPetShelter shelter = new VirtualPetShelter();

		String userInput = "";
		while (!userInput.equals("6")) {

			System.out.println("Welcome to the A to Exotics Pet Shelter, " + player + "!\n");
			System.out.println("Here are your options...");
			System.out.println("1.Feed all the pets in the shelter.");
			System.out.println("2. Give all the pets in the shelter water. ");
			System.out.println("3. Play with one pet.");
			System.out.println("4. Adopt a pet.");
			System.out.println("5. Admit a new homeless pet.");
			System.out.println("What is your choice?");
			userInput = input.nextLine();
			{
				if (userInput.equals("1")) {

					System.out.println("You fed all the pets. ");
					System.out.println();
					shelter.feedAllPets();

				}
				if (userInput.equals("2")) {

					System.out.println("You gave all the pets water.");
					System.out.println();
					shelter.giveWaterToShelter();

				}
				if (userInput.equals("3")) {
					System.out.println("Which pet would you like to play with?");
					VirtualPet pet = new VirtualPet("");
					pet.getGoPlay();

				}
				System.out.println("Your choice: ");
				int userInputNum = input.nextInt();
				input.nextLine();
			}
			System.out.println("1. Chucky the lonely colorblind chameleon.");
			System.out.println("2. Hershey the not so chocolate labrador.");
			System.out.println("3. Tofu the cat who thinks he's a dog.");

		}

		if (userInput.equals("4")) {
			System.out.println("Which pet would you like to adopt?");
			VirtualPet pet = new VirtualPet("");
			pet.takeHome();
		}
		if (userInput.equals("5")) {
			System.out.println("Type the name of the new pet.");
		
		}

		shelter.tick();
	}

}
