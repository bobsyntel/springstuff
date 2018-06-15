package com.bob;

import javafx.util.converter.BigIntegerStringConverter;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
         int num = 2;
        System.out.println(isPrime(num));
      String a =   "37107287533902102798797998220837590246510135740250";
     String b =    "46376937677490009712648124896970078050417018260538";
       int index = 2;
        ArrayList<BigInteger> test = new ArrayList<BigInteger>();
        //test.add("37107287533902102798797998220837590246510135740250");
      //  System.out.println(factorial(2));
       // System.out.println(findNthPrimeNumber(index));
        ArrayList<Integer> ints = arrayListOfInts();

    }

    public static boolean isPrime(int num){
       // int count = 0;

        //int n = num/2;

        for(int i = 2; i <= num/2; i++){
            if(num%i == 0){
                return false;

            }
        }

            return true;

    }
    static BigInteger factorial(int N){
        BigInteger f = new BigInteger("37107287533902102798797998220837590246510135740250");
        f.intValue();
       // f.add( BigInteger.valueOf("321312222223"));
        System.out.println(f);
        for(int i = 2; i <=N; i++){
            f = f.multiply(BigInteger.valueOf(i));
        }
           return f;
        }

    public static int findNthPrimeNumber(int index){
        int count = 0;
        int num = 2;

        while(count < index){

            if(isPrime(num)){
                count++;
            }
           if(index == count){
                break;
           }

            num++;
        }

        return num;
    }

    static ArrayList<Integer> arrayListOfInts(){
       ArrayList<Integer> listOfInts = new ArrayList<Integer>();
       int i = 1;
       while(i <= 30){
           listOfInts.add(i);
           i++;
       }
        System.out.println("in arrayList of ints "+listOfInts.get(listOfInts.size()-1));
        return listOfInts;
    }


}
