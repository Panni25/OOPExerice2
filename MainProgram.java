// Main class
public class MainProgram {

	public static void main(String[] args) {

		Pet pet;

		Pig pig = new Pig("Peppa", 10, "Micro Pig");
        pet = pig;
		System.out.println(pet.makeSound()+" "+" My name is " + pet.getName());

		Bird bird = new Bird("Dobby", 5, "Gray");
	    pet = bird;
		System.out.println(pet.makeSound()+" "+" My name is " + pet.getName());

	}
}
