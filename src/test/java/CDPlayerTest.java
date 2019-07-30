import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before() {
        cdPlayer = new CDPlayer("Samsung", "CD_321", 4);
    }

    @Test
    public void canGetNumOfCds() {
        assertEquals(4, cdPlayer.getNumOfCds());
    }

    @Test
    public void canPlayCD() {
        assertEquals("CD is playing", cdPlayer.play());
    }

    @Test
    public void canPauseCD() {
        assertEquals("CD is paused", cdPlayer.pause());
    }

    @Test
    public void canSkipToNextTrack() {
        assertEquals("Next song playing", cdPlayer.next());
    }

    @Test
    public void canSkipToPreviousTrack() {
        assertEquals("Previous song playing", cdPlayer.back());
    }
}


