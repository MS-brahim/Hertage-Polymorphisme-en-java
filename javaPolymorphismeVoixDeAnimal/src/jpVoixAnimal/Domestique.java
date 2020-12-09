package jpVoixAnimal;

public class Domestique extends Animal {

	private String type;
	
	public Domestique(String name, String age, String type) {
		super(name, age);
		this.type=type;
	}

	public Domestique() {
		super();
	}

	public String getType() {
		return type;
	}	
}