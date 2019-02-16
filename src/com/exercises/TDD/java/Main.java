public class Main {


    public static void main(String[] args) {

        Fizz fizz = new Fizz();
        for ( int givenNumber = 1; givenNumber<=100; givenNumber++) {
            if (givenNumber % 3 == 0)
                System.out.println(fizz.getNumber(givenNumber));

        }



    }





}
