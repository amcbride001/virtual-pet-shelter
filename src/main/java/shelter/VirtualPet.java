package shelter;

public class VirtualPet {

	private int fullness;
	private int hydration;
	private int happiness;
	private String name;

	public VirtualPet(String name) {
		this.name = name;

	}

	public int getHydration() {
		return hydration;
	}

	public int getFullness() {
		return fullness;
	}

	public int getHappiness() {
		return happiness;
	}

	public String getName() {
		return name;
	}

	public void water() {
		this.hydration += 6;
		
	}
	public void feed() {
		this.fullness  +=3;
		
	}

	public void happiness() {
		this.happiness +=8;
		
	}

	public void removePet(String string) {
		
		
	}
	}
