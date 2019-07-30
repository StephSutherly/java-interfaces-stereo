import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MP3PlayerTest {

    Stereo stereo;
    MP3Player mp3Player;
    CDPlayer cdPlayer;
    Radio radio;

    @Before
    public void before() {
        cdPlayer = new CDPlayer("Sony", "CD-100", 4);
        radio = new Radio("Samsung", "RD-200");
        stereo = new Stereo("Mike's Stereo", cdPlayer, radio);
        mp3Player = new MP3Player("Apple", "IPOD");
    }

    @Test
    public void mp3CanConnectToStereo() {
        assertEquals("I am connected to Mike's Stereo", mp3Player.connect(stereo));
    }
}
