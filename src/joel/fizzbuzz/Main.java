package joel.fizzbuzz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int number = 1; number < 101; number++) {
            doFizzbuzz(number);
        }
        for (int number = 101; number < 201; number++) {
            doFizzbuzz(number);
        }
        for (int number = 201; number < 301; number++) {
            doFizzbuzz(number);
        }
    }

    private static void doFizzbuzz(int number) {

        boolean Fizz=false;
        boolean Buzz=false;
        boolean Bang=false;
        boolean Bong=false;
        boolean Fezz=false;
        boolean Reverse=false;

        if(number %3 ==0){
            Fizz=true;}
        if(number %5 ==0){
            Buzz=true;}
        if(number %7 ==0){
            Bang=true;}
        if(number %11 ==0){
            Bong=true;}
        if(number %13 ==0){
            Fezz=true;}
        if(number %17 ==0){
            Reverse=true;}

        List<String> fb = new ArrayList<>();
        if (Fizz) {
            fb.add("Fizz");}
        if (Fezz) {
            fb.add("Fezz");}
        if (Buzz) {
            fb.add("Buzz");}
        if (Bang) {
            fb.add("Bang");}
        if (Bong) {
            fb.clear();
            if (Fezz) {
                fb.add("Fezz");}
            fb.add("Bong");}
        if (Reverse) {
            Collections.reverse(fb);}

        StringBuilder FizzBuzz = new StringBuilder();
        for (int listnumber = 0; listnumber <= fb.size() - 1; listnumber++) {
            FizzBuzz.append(fb.get(listnumber));
        }
        if (FizzBuzz.length()>0) {
            System.out.println(FizzBuzz);}
        else {
            System.out.println(number);}
    }
}