package joel.fizzbuzz;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int number = 1; number < 101; number++) {
            doFizzbuzz(number);
        }
        for (int number = 101; number < 201; number++) {
            doFizzbuzz(number);
        }
    }

    private static void doFizzbuzz(int number) {
        if(number %11 ==0){
            System.out.println("Bong");}

        else if(number %3 == 0 && number %5 == 0 && number %7 ==0){
            System.out.println("FizzBuzzBang");}

        else if(number %3 == 0 && number %7 == 0){
            System.out.println("FizzBang");}

        else if(number %5 == 0 && number %7 == 0){
            System.out.println("BuzzBang");}

        else if(number %3 == 0 && number %5 == 0){
            System.out.println("FizzBuzz");}

        else if(number %3 ==0){
            System.out.println("Fizz");}

        else if(number %5 ==0){
            System.out.println("Buzz");}

        else if(number %7 ==0){
            System.out.println("Bang");}



        else{System.out.println(number);}
    }
}