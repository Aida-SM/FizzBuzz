import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    private Number number;
    private Fizz fizz;
    private Buzz buzz;
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
         number = new Number();
        fizz = new Fizz();
         buzz = new Buzz();
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void ShouldReturnNumberOneWhenItIsOne() {

        String result = number.getNumber(1);

        Assert.assertEquals("1" , result);

    }

    @Test
    public void ShouldReturnNumberTwoWhenItIsTwo() {

        String result = number.getNumber(2);

        Assert.assertEquals("2" , result);

    }

    @Test
    public void ShouldReturnFizzWhenNumberIsThree() {

        String result = fizz.getNumber(3);

        Assert.assertEquals("Fizz" , result);
    }

    @Test
    public void ShouldReturnBuzzWhenNumberIsFive() {

        String result = buzz.getNumber(5);

        Assert.assertEquals("Buzz" , result);
    }

    @Test
    public void ShouldReturnBuzzWhenNumberIsFifteen() {

        String result = fizzBuzz.getNumber(15);

        Assert.assertEquals("FizzBuzz" , result);
    }

    @Test
    public void ShouldFineCorrectClassForNumberBetween1To100() {

        for ( int i = 1; i<=100; i++){

            if (i%15==0)
                Assert.assertEquals("FizzBuzz" , fizzBuzz.getNumber(i));
            else if (i%3==0)
                 Assert.assertEquals("Fizz" , fizz.getNumber(i));
            else if (i%5==0)
                Assert.assertEquals("Buzz" , buzz.getNumber(i));
            else
                Assert.assertEquals( String.valueOf(i) , number.getNumber(i));

        }
    }
}