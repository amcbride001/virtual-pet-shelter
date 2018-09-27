package shelter;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TestShelter {

	@Test
	public void shouldBeAbleToCreateShelter() {
		new VirtualPetShelter();
	}

	@Test
	public void shouldBeAbleToAddPets() {
		VirtualPetShelter shelter = new VirtualPetShelter();
		VirtualPet pet = new VirtualPet("");
		shelter.addPet(pet);
	}

	@Test
	public void shouldBeAbleToGetPetByName() {
		VirtualPetShelter shelter = new VirtualPetShelter();
		VirtualPet pet = new VirtualPet("");
		shelter.addPet(pet);
		VirtualPet result = shelter.getPet(pet.getName());
		assertThat(result, is(pet));
	}

	@Test
	public void shouldBeAbleToWaterAllPets() {

		VirtualPetShelter pets = new VirtualPetShelter();
		pets.giveWaterToShelter();
	}

	@Test
	public void shouldBeAbleToFeedAllPets() {
		VirtualPetShelter pets = new VirtualPetShelter();
		pets.feedAllPets();
	}

	@Test
	public void shouldBeAbleToPlayWithPet() {

		VirtualPet pet = new VirtualPet("");
		pet.getGoPlay();

	}
	@Test
	public void shouldBeAbleToAdoptAPet() {
		VirtualPet pet = new VirtualPet("");
		pet.takeHome();
	}
}
