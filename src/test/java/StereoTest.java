import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    CDPlayer cdPlayer;
    Radio radio;

    @Before
    public void before() {
        cdPlayer = new CDPlayer("Sony", "CD-100", 4);
        radio = new Radio("Samsung", "RD-200");
        stereo = new Stereo("Mike's Stereo", cdPlayer, radio);
    }

    @Test
    public void stereoHasCDPlayer() {
        assertEquals(cdPlayer, stereo.getCdPlayer());
    }

    @Test
    public void stereoHasRadio() {
        assertEquals(radio, stereo.getRadio());
    }
}
