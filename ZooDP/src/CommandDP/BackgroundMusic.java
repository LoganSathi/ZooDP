/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandDP;

import Main.Zoo;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

import FactoryMethodDP.Lion;
import FactoryMethodDP.Tiger;

//Used for Command Pattern
/**
 *
 * @author Logan
 */
public class BackgroundMusic {

    Clip musicClip;

    
    StopMusic stopMusic;
    PlayMusic playMusic;
    
    public BackgroundMusic(Clip musicClip) {
        this.musicClip = musicClip;

    }
    
    public void playMusic() {
    	musicClip.start();
    	musicClip.loop(Clip.LOOP_CONTINUOUSLY);
//    	backgroundMusicButton.setIcon(MusicOnIcon);
//    	backgroundMusicButton.setVisible(true);
//    	backgroundMusicButton.revalidate();
    }

    public void stopMusic() {
    	musicClip.stop();
//        backgroundMusicButton.setIcon(MusicOffIcon);
//        backgroundMusicButton.setVisible(true);
//        backgroundMusicButton.revalidate();
    }
}
