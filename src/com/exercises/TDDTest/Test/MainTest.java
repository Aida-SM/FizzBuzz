import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    private Number number;
    private Fizz fizz;
    private Buzz buzz;
    private FizzBuzz fizzBuzz;
    private Main main;

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

        for ( int givenNumber = 1; givenNumber<=100; givenNumber++){
            if (givenNumber%15==0)
                Assert.assertEquals("FizzBuzz" , fizzBuzz.getNumber(givenNumber));
            else if (givenNumber%3==0)
                 Assert.assertEquals("Fizz" , fizz.getNumber(givenNumber));
            else if (givenNumber%5==0)
                Assert.assertEquals("Buzz" , buzz.getNumber(givenNumber));
            else
                Assert.assertEquals( String.valueOf(givenNumber) , number.getNumber(givenNumber));

        }
    }


}