public class Main {


    public static void main(String[] args) {

         Number number = new Number();
         Fizz fizz = new Fizz();
         Buzz buzz = new Buzz();
         FizzBuzz fizzbuzz = new FizzBuzz();

        for ( int givenNumber = 1; givenNumber<=100; givenNumber++){
            if (givenNumber%15==0)
                System.out.println(fizzbuzz.getNumber(givenNumber));
            else if (givenNumber%3==0)
                System.out.println(fizz.getNumber(givenNumber));
            else if (givenNumber%5==0)
                System.out.println(buzz.getNumber(givenNumber));
            else
                System.out.println(number.getNumber(givenNumber));
    }


    }



}
