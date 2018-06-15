package com.bob;

public class Hard {
    public static void main(String[] args){
        System.out.println(reverse("abc"));
        if(palindrome("Redivider")){
            System.out.println("it's a palindrome ");
        }else {
            System.out.println("not a palindrome");
        }
    }

    static boolean palindrome(String word){
        String str = word.toLowerCase();
        if(str.equals(reverse(str))){
                return true;
            }
        return  false;
    }
    static String reverse(String word){
        StringBuilder str = new StringBuilder(word);
        str.reverse();
        return str.toString();
    }
}
