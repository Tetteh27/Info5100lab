package assignment8_multithreading_java;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * Class that will play music files at given paths
 * 
 * @author Jesus Molina
 *
 */
public class FilePlayer {

	/**
	 * Plays an audio clip located at the given path
	 * 
	 * @param filePath
	 *            the path to the audio clip that should be played
	 */
	public void play(String filePath) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
                        Thread.sleep(1000);
                        clip.close();
                        
                        

		} catch (Exception e) {
			System.out.println("Error with playing sound.");
			e.printStackTrace();
		}

	}
}
