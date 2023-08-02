import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LamparaTest {

    @Test
    void testGetColor() {
        Lampara lampara = new Lampara();
        String result = lampara.getColor();
        assertEquals("Roja", result);
    }

    @Test
   void testInterruptor() {
        Lampara lampara = new Lampara();
        assertFalse(lampara.isEncendida());
        lampara.interruptor();
        assertTrue(lampara.isEncendida());
    
    }

    @Test
    void testIsEncendida() {
        Lampara lampara = new Lampara();
        assertFalse(lampara.isEncendida());
        lampara.interruptor();
        assertTrue(lampara.isEncendida());
    }

    @Test
    void testToString() {
        Lampara lampara = new Lampara("Roja");
        String expectedOff = "La lámpara esRoja y está OFF";
        assertEquals(expectedOff, lampara.toString());
        lampara.interruptor();
        String expectedOn = "La lámpara esRoja y está ON";
        assertEquals(expectedOn, lampara.toString());

        lampara.interruptor();


    }
}
