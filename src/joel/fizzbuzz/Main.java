package joel.fizzbuzz;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int number = 1; number < 101; number++) {

            if(number %3 == 0 && number %5 == 0){
                System.out.println("Fizzbuzz");}

            else if(number %3 ==0){
                System.out.println("Fizz");}

            else if(number %5 ==0){
                System.out.println("Buzz");}

            else{System.out.println(number);}
        }
    }
}