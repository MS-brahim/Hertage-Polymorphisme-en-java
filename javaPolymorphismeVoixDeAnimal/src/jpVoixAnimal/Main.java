package jpVoixAnimal;

public class Main {

	
	public static void main(String[] args) {
		
		Capricorn capri = new Capricorn("Capricorn","4 ans","Domestique");
		
		if(capri != null) {
			Capricorn.PlaySound();
			System.out.println(capri.toString());
		}		
	}
}

