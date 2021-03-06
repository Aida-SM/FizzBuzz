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
    public void ShouldReturnFizzWhenNumbersBetweenZeroAndHundredAreMultipleOfThree() {

        for ( int givenNumber = 1; givenNumber<=100; givenNumber++){
            if (givenNumber%3==0)
                 Assert.assertEquals("Fizz" , fizz.getNumber(givenNumber));

        }


    }

    @Test
    public void ShouldReturnBuzzWhenNumbersBetweenZeroAndHundredAreMultipleOfFive() {
        for ( int givenNumber = 1; givenNumber<=100; givenNumber++){
            if (givenNumber%5==0)
                Assert.assertEquals("Buzz" , buzz.getNumber(givenNumber));

        }

    }

    @Test
    public void ShouldReturnBuzzWhenNumbersBetweenZeroAndHundredAreMultipleOfFifteen() {

        for (int givenNumber = 1; givenNumber <= 100; givenNumber++) {
            if (givenNumber % 15 == 0)
                Assert.assertEquals("FizzBuzz", fizzBuzz.getNumber(givenNumber));
        }

    }

    @Test
    public void ShouldCheckIfNumberConsistOfThreeAtRight() {
        int givenNumber = 43;
        Assert.assertEquals(3, givenNumber% 10);

    }

    @Test
    public void ShouldCheckIfNumberConsistOfThreeAtLeft() {
        int givenNumber = 34;
        Assert.assertEquals(3, givenNumber /  10);
    }
    @Test
    public void ShouldCheckIfNumberConsistOfFiveAtLeft() {
        int givenNumber = 54;
        Assert.assertEquals(5, givenNumber /  10);
    }

    @Test
    public void  ShouldCheckIfNumberConsistOfFiveAtLeftAndMultipleOfThree() {
        int givenNumber = 51;
        Assert.assertTrue("not consist of 5 on the left" , givenNumber / 10 == 5);
        Assert.assertTrue("not multiple of three" , givenNumber % 3 == 0);

    }

    @Test
    public void  ShouldCheckIfNumberConsistOfThreeAtLeftAndFiveAtRight() {
        int givenNumber = 35;
        Assert.assertTrue("not consist of 3 on the left" , givenNumber / 10 == 3);
        Assert.assertTrue("not multiple of Five" , givenNumber % 10 == 5);

    }

    @Test
    public void  ShouldCheckIfNumberConsistOfThreeAtRightAndFiveAtLeft() {
        int givenNumber = 53;
        Assert.assertTrue("not consist of 3 on the left" , givenNumber / 10 == 5);
        Assert.assertTrue("not multiple of Five" , givenNumber % 10 == 3);
    }
}