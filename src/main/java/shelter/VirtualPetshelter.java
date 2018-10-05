package shelter;

import java.util.HashMap;

public class VirtualPetShelter {

	private HashMap<String, VirtualPet> pets;
	private String shelter;

	// create a shelter then give options for user
	VirtualPetShelter(int i) {
		pets = new HashMap<String, VirtualPet>();
	}

	public VirtualPetShelter() {

	}

	public VirtualPet addPet(VirtualPet pet) {
		pets.put(pet.getName(), pet);
		return pet;
	}

	public VirtualPet getPet(String name) {
		return pets.get(name);
	}

	public void giveWaterToShelter() {
		for (VirtualPet pet : pets.values()) {
			pet.getHydration();
		}
	}

	public void feedAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.getFullness();
		}
	}

	public void happiness(String name) {

		for(VirtualPet pet:pets.values()) {
			pet.happiness();
	}
	}
	public void removePet(VirtualPet pet) {
		pets.remove("");

	}

	public String getShelter() {
		return shelter;
	}

	public void setShelter(String shelter) {
		this.shelter = shelter;
	}

	public Object getPets() {

		return pets;

	}

	public void tick() {

	}

}
