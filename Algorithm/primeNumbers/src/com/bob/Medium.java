package com.bob;

public class Medium {
    public static void  main(String[] args){
        Calculator calc = new Calculator();
        calc.add(750);
        calc.subtract(420);
        calc.multiply(13);
        calc.divide(30);
        System.out.println(calc.getAnswer());
        calc.clear();
        calc.add(1000);
        System.out.println(calc.getAnswer());
        System.out.println(strMultiply("abc",5));
    }

    static String strMultiply(String str,int num){
        String mult = str;
        for(int i = 0; i < num-1;i++){
            mult+=str;
        }
        return mult;
    }

}
