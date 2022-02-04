import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Nikita", Ranks.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("Nikita", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Ranks.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }
}
