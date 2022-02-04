import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(Planes.BOEING_737);
    }

    @Test
    public void hasCapacity(){
        assertEquals(300, plane.getCapacity());
    }

    @Test
    public void hasWeight(){
        assertEquals(2000, plane.getWeight());
    }
}
