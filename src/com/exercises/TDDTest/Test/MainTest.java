import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void ShouldReternNumber() {

        Number number = new Number();

        String result = number.getNumber(1);

        assertEquals("1" , result);

    }


}