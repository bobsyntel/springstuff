package com.company;

import java.util.HashMap;
import java.util.Map;



public class MultiDimArray {
    public static void main(String[] args){
       Map<Character,String> braille = new HashMap<Character,String>();
       braille.put('a',"100000");
       braille.put('b',"110000");
       braille.put('c',"100100");
       braille.put('d',"100110");
       braille.put('e',"100010");
       braille.put('f',"110100");
       braille.put('g',"110110");
       braille.put('h',"110010");
       braille.put('i',"010100");
       braille.put('j',"010110");
       braille.put('k',"101000");
       braille.put('l',"111000");
       braille.put('m',"101100");
       braille.put('n',"101110");
       braille.put('o',"101010");
       braille.put('p',"111100");
       braille.put('q',"111110");
       braille.put('r',"111010");
       braille.put('s',"011100");
       braille.put('t',"011110");
       braille.put('u',"101001");
       braille.put('v',"111001");
       braille.put('w',"010111");
       braille.put('x',"101101");
       braille.put('y',"101111");
       braille.put('z',"101011");


        System.out.println(answer("code"));
    }
    public static String answer(String str){
        String decode = "";
        for(int i = 0; i < str.length();i++){
            decode+=Decode(str.charAt(i));
        }
        return decode;
    }

    public static String Decode(char ch){
        Map<Character,String> braille = new HashMap<Character,String>();
        braille.put('a',"100000");
        braille.put('b',"110000");
        braille.put('c',"100100");
        braille.put('d',"100110");
        braille.put('e',"100010");
        braille.put('f',"110100");
        braille.put('g',"110110");
        braille.put('h',"110010");
        braille.put('i',"010100");
        braille.put('j',"010110");
        braille.put('k',"101000");
        braille.put('l',"111000");
        braille.put('m',"101100");
        braille.put('n',"101110");
        braille.put('o',"101010");
        braille.put('p',"111100");
        braille.put('q',"111110");
        braille.put('r',"111010");
        braille.put('s',"011100");
        braille.put('t',"011110");
        braille.put('u',"101001");
        braille.put('v',"111001");
        braille.put('w',"010111");
        braille.put('x',"101101");
        braille.put('y',"101111");
        braille.put('z',"101011");
        braille.put(' ',"000000");
        braille.put('A',"000001100000");

        return braille.get(ch);

    }
}
