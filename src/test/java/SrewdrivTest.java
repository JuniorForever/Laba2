import org.junit.Test;

import static org.junit.Assert.*;

public class SrewdrivTest {

    @Test
    public void unleash() {
        String actual = Srewdriv.Unleash();
        String expected = "Раскрутить";
        assertEquals(expected,actual);
    }

    @Test
    public void twist() {
        String actual = Srewdriv.Twist();
        String expected = "Закрутить";
        assertEquals(expected,actual);
    }
}