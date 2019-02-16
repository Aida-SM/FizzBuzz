import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void ShouldReturnNumberOneWhenItIsOne() {

        Number number = new Number();

        String result = number.getNumber(1);

        Assert.assertEquals("1" , result);

    }

    @Test
    public void ShouldReturnNumberTwoWhenItIsTwo() {

        Number number = new Number();

        String result = number.getNumber(2);

        Assert.assertEquals("2" , result);

    }

    @Test
    public void ShouldReturnFizzWhenNumberIsThree() {

        Fizz fizz = new Fizz();

        String result = fizz.getNumber(3);

        Assert.assertEquals("Fizz" , result);
    }

    @Test
    public void ShouldReturnBuzzWhenNumberIsFive() {
        Buzz buzz = new Buzz();

        String result = buzz.getNumber(5);

        Assert.assertEquals("Buzz" , result);
    }

    @Test
    public void ShouldReturnBuzzWhenNumberIsFifteen() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.getNumber(15);

        Assert.assertEquals("FizzBuzz" , result);
    }

}