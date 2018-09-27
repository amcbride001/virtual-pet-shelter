package shelter;

import java.util.Collection;
import java.util.HashMap;

public class VirtualPetShelter {

	private HashMap<String, VirtualPet> pets;
	private String shelter;
	private String giveWaterToShelter;
	private String feedAllPets;
	private VirtualPet goPlay;

	// create a shelter then give options for user
	VirtualPetShelter() {
		pets = new HashMap<String, VirtualPet>();
	}

	public void addPet(VirtualPet pet) {
		pets.put(pet.getName(), pet);
	}

	public  VirtualPet getPet(String name) {
		return pets.get(name);
	}

	public String giveWaterToShelter() {
		return giveWaterToShelter;
	}

	public String feedAllPets() {
		return feedAllPets;

	}

	public VirtualPet goPlay(String name) {
		
		return goPlay;
	}

	public void removePet(VirtualPet pet) {
		pets.remove(pet);

	}

	public String getShelter() {
		return shelter;
	}

	public void setShelter(String shelter) {
		this.shelter = shelter;
	}

	
		
	}


