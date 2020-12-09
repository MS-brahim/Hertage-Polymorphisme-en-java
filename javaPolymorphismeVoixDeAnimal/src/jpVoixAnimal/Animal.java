package jpVoixAnimal;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Animal {
	
	private String name;
	private String age;
	private String sendPath;
	
	public Animal(String name, String age) {
		super();
		this.name=name;
		this.age=age;
		
	}

	public Animal() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSendPath() {
		return sendPath;
	}

	public void setSendPath(String sendPath) {
		this.sendPath = sendPath;
	}	

	public void ReadSound(String effectSource, String sendPath) throws UnsupportedAudioFileException, IOException, 
	LineUnavailableException{
		AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(sendPath));
		Clip clip = AudioSystem.getClip();
		clip.open(audioIn);
		clip.start();
		System.out.println(effectSource+" sound is start ! ");
		System.out.println("s : "+clip.isActive());
		while(clip.isActive()) {
		System.out.println("hola "+effectSource);
		}
		clip.close();
		System.out.println(effectSource+" sound is end ! ");
		
	}
}
