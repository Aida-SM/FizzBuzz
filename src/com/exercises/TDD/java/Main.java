public class Main {


    public static void main(String[] args) {

        Fizz fizz = new Fizz();
        Buzz buzz = new Buzz();
        for ( int givenNumber = 1; givenNumber<=100; givenNumber++) {
            if (givenNumber % 3 == 0)
                System.out.println(fizz.getNumber(givenNumber));
            else if (givenNumber%5==0)
                System.out.println(buzz.getNumber(givenNumber));


        }



    }





}
