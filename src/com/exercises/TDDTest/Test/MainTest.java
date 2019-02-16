import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void ShouldReturnNumberOneWhenItIsOne() {

        Number number = new Number();

        String result = number.getNumber(1);

        assertEquals("1" , result);

    }

    @Test
    public void ShouldReturnNumberTwoWhenItIsTwo() {

        Number number = new Number();

        String result = number.getNumber(2);

        assertEquals("2" , result);

    }
}