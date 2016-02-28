import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import java.io.*;


/**
 * Created by Michael on 2/28/16.
 */
public class test {
    public static void main(String[] args){
        try {
            playSound();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void playSound() throws Exception{
        // open the sound file as a Java input stream
        String gongFile = "quack.wav";
        InputStream in = new FileInputStream(gongFile);

        // create an audiostream from the inputstream
        AudioStream audioStream = new AudioStream(in);

        // play the audio clip with the audioplayer class
        AudioPlayer.player.start(audioStream);
    }
}
