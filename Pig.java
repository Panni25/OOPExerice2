// Subclass Dog of Super Class Pet
public class Pig extends Pet{ // 

	private String breed;

	public Pig (String name, double weight, String breed) {

		super(name, weight);
		this.breed = breed;
    }

	public String makeSound() { 
		return "OINK! OINK!";
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed (String breed) { 
	    this.breed = breed;
	}
}
