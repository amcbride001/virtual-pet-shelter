package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What is your name?");
		String player = input.nextLine();

		VirtualPetShelter shelter = new VirtualPetShelter();
		shelter.addPet(new VirtualPet("Chucky", 5, 6, 10));
		shelter.addPet(new VirtualPet("Hershey", 3, 8, 2));
		shelter.addPet(new VirtualPet("Tofu", 10, 5, 4));
		
		System.out.println("Welcome to the A to Exotics Pet Shelter, " + player + "!\n");
		
		String userInput = "";
		while (!userInput.equals("6")) {

			System.out.println("Here are your options...");
			System.out.println("1.Feed all the pets in the shelter.");
			System.out.println("2. Give all the pets in the shelter water. ");
			System.out.println("3. Play with one pet.");
			System.out.println("4. Adopt a pet.");
			System.out.println("5. Admit a new homeless pet.");
			System.out.println("6. Leave the shelter.");
			System.out.println("What is your choice?");
			userInput = input.nextLine();
			{
				if (userInput.equals("1")) {

					System.out.println("You fed all the pets.");
					shelter.feedAllPets();
					System.out.println();

				}
				if (userInput.equals("2")) {

					System.out.println("You gave all the pets water.");
					shelter.giveWaterToShelter();
					System.out.println();

				}
				if (userInput.equals("3")) {
					System.out.println("Which pet would you like to play with?");
					System.out.println("1. Chucky the lonely colorblind chameleon.");
					System.out.println("2. Hershey the not so chocolate labrador.");
					System.out.println("3. Tofu the cat who thinks he's a dog.");
					System.out.println("Please type the name of the pet you'd like to play with");
					userInput = input.nextLine();
					shelter.getGoPlay(userInput);
					System.out.println();
					System.out.println("You played with " + userInput + ". Aww you two look good together.");
					System.out.println();

				}

				if (userInput.equals("4")) {
					System.out.println("Which pet would you like to adopt?");
					System.out.println("1. Chucky the lonely colorblind chameleon.");
					System.out.println("2. Hershey the not so chocolate labrador.");
					System.out.println("3. Tofu the cat who thinks he's a dog.");
					System.out.println("Please type the name of the pet you'd like to adopt");
					userInput=input.nextLine();
					VirtualPet myPet = shelter.getPet(userInput);
					shelter.removePet(myPet);
					System.out.println("You adopted " + myPet.getName() + ". Welcome to pet parenthood!");
					System.out.println();

				}
				if (userInput.equals("5")) {
					System.out.println("Type the name of the new addition to our shelter.");
					String pet = input.nextLine();
					System.out.println("Please type a hydration level for the new pet.");
					Integer hydration = input.nextInt();
					System.out.println("Please type a happiness level for the new pet.");
					Integer happiness = input.nextInt();
					System.out.println("Please type a fullness level the new pet" );
					Integer fullness = input.nextInt();
					VirtualPet myPet = new VirtualPet(pet, hydration, happiness, fullness);
					shelter.addPet(myPet);
					System.out.println("You saved " + pet + ".");
					System.out.println();

				}
				if (userInput.equals("6")) {
					System.out.println("Goodbye for now.");
				}

				shelter.tick();

			}

		}

	}

}
