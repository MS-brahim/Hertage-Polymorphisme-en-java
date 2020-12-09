package jpVoixAnimal;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Capricorn extends Domestique {

	public Capricorn(String name, String age, String type) {
		super(name, age, type);
		
	}

	public static void PlaySound() {
		Domestique Domestique = new Domestique();
		try {
			Domestique.ReadSound("La voix de capricorn","C:\\Users\\admin\\eclipse-workspace\\javaPolymorphismeVoixDeAnimal\\sounds\\capricorn.wav");
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
			e.printStackTrace();
		} 
	}
	
	@Override
	public String toString() {
		return "Capricorn [ Type =" + getType() + ",  Name =" + getName() + ",  Age =" + getAge() +"]";
	}
	
}