import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Josef", Ranks.CAPTAIN, "ABC123");
    }

    @Test
    public void hasName(){
        assertEquals("Josef", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Ranks.CAPTAIN, pilot.getRank());
    }

    @Test
    public void hasPilotLicenseNumber(){
        assertEquals("ABC123", pilot.getPilotLicenseNumber());
    }
}
