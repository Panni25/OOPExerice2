//Subclass Bird of SuperClass Pet
public class Bird extends Pet {

	private String feather;

	public Bird (String name, double weight, String feather) { 

		super(name, weight);
		this.feather = feather;
    }

	public String makeSound() {
		return "TWEET! TWEET!";
	}

	public String getfeather() {
		return feather;
	}

	public void setFeather(String feather) { 
	    this.feather = feather; 
    } 
}
