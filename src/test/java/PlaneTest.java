import org.junit.Test;

import static org.junit.Assert.*;

public class PlaneTest {

    @Test
    public void chip() {
        Plane.Chip(Hervesting.Form);
        String actual = Hervesting.Form;
        String expected = "Форма изменена рубанком" ;
        assertEquals(expected,actual);
    }
}
