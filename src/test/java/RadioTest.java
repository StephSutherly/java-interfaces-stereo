import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before() {
        radio = new Radio("Sony", "RD-100");
    }

    @Test
    public void canGetMake() {
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("RD-100", radio.getModel());
    }

    @Test
    public void canGetPowerOn() {
        assertEquals(false, radio.isPowerOn());
    }
}
