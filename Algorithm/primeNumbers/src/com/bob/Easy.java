package com.bob;

import java.util.ArrayList;

public class Easy {
    public static void main(String[] args){
        int[] sc1 = {2,4,8};
        ArrayList<Integer> nums = squareNums(sc1);
        for (int i: nums) {
            System.out.print(i+",");
        }
    }
    static ArrayList<Integer> positiveNumbers(int[] arr){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i < arr.length;i++){
            if(arr[i] > 0){
                nums.add(arr[i]);
            }
        }
        return nums;
    }
    static ArrayList<Integer> evenNumbers(int[] arr){
        ArrayList<Integer> evenNums = new ArrayList<Integer>();
        for(int i = 0; i < arr.length;i++){
            if(arr[i] % 2 == 0){
                evenNums.add(arr[i]);
            }
        }
        return  evenNums;
    }
    static ArrayList<Integer> squareNums(int[] arr){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0;i < arr.length;i++){
            nums.add(arr[i]*arr[i]);
        }
        return nums;
    }
}
