package shelter;

public class VirtualPet {

	private int fullness;
	private int hydration;
	private int happiness;
	private String name;

	
	public VirtualPet(String name, int hydration, int happiness, int fullness) {
		this.name = name;
		this.hydration = hydration;
		this.happiness = happiness;
		this.fullness = fullness;

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

	public void getGoPlay() {
	
		
	}

	public void takeHome() {
		
	
		}
	
	}
