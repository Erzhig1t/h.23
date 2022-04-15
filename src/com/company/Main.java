package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        getNumbers();
        evenNumber();
        oddNumber();
    }
    public static void getNumbers(){
            Random random = new Random();
            ArrayList<Integer> numbers = new ArrayList<>();

            for(int i = 0; i<50; i++){

                numbers.set(i, random.nextInt(99)+1);
            }
            System.out.println(Arrays.toString(new ArrayList[]{numbers}));
        }
        public static void evenNumber(){
        Random rd = new Random();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for(int a = 0; a<evenNumbers.size(); a++){
            evenNumbers.set(a, rd.nextInt(99)+1);
            if(evenNumbers.get(a) %2==0){
                System.out.println(Arrays.toString(evenNumbers.toArray()));
            }else {
                System.out.println("Something is wrong");
            }
        }
    }
    public static void oddNumber(){
        Random random = new Random();
        ArrayList<Integer> oddNumber = new ArrayList<>();
        for(int b = 0; b<oddNumber.size(); b++){
            oddNumber.set(b,random.nextInt(99)+1);
            if(oddNumber.get(b)%2==1){
                System.out.println(Arrays.toString(oddNumber.toArray()));
            }else{
                System.out.println("Something is wrong");
            }
        }
    }
}
