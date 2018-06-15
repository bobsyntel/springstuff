import sun.print.SunMinMaxPage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Algo {
    public static void main(String[] args){

//        ArrayList<Integer> test = arrayListOfInts();
//        ArrayList<Integer> filter = filter(test);
//        System.out.println(" filter should work");
//        for(int i = 0; i < filter.size();i++){
//            System.out.print(" "+filter.get(i));
//        }
//        System.out.println();
//       // printSquare(5);
//        String[] acronyms = {"am","important","person"};
//       // acronym(acronyms);
//      //  String[] str = new String[]{"X","","X"};
//       // System.out.println(threeInArow(str));
//
//        System.out.println(alphabetSoup("hello"));
            magic(5);
            mult(3);
    }
    static void mult(int num){
        int total = 0;
        for(int i = 1;i <= num;i++){
            total+=i*2;
        }
        System.out.println(total);
    }
    public static void magic(int times){
        for(int i = 0; i < times; i++){
            if(i % 2==0){
                System.out.println("a");
            }else if(i < 3){
                System.out.println("b");
            }else{
                System.out.println("c");
            }
        }
    }
//    static String alphabetSoup(String alph){
//        char[] ch = alph.toCharArray();
//        int[] chValue = new int[alph.length()];
//        Map<Integer,Character> chAndNum = new HashMap<Integer,Character>();
//        ArrayList<Integer> arrayOfInts = new ArrayList<Integer>();
//        String result = "";
//        for (int i = 0; i < ch.length;i++){
//
//            chValue[i] = ch[i];
//            arrayOfInts.add(chValue[i]);
//            chAndNum.put(chValue[i],ch[i]);
//        }
//
//        for(int i = ch.length;i>0;i--){
//          int num = findMin(arrayOfInts);
//          char chars = chAndNum.get(num);
//          result+=chars;
//          arrayOfInts.remove((Integer)num);
//        }
//
//        return result;
//    }
//    static int findMin(ArrayList<Integer> arr){
//        int min = arr.get(0);
//        for(int i = 0; i < arr.size();i++){
//            if(min > arr.get(i)){
//                min = arr.get(i);
//            }
//        }
//        return min;
//    }
//    static String threeInArow(String[] str){
//        for(int i = 0;i< str.length-1;i++){
//            if(!(str[i].equals(str[i+1]))){
//                return "none";
//            }
//        }
//        return str[0];
//    }
//    static void acronym(String[] acro){
//        String acronym = "";
//        for(int i = 0; i < acro.length;i++){
//            acronym+=acro[i].toUpperCase().charAt(0);
//        }
//        System.out.println(acronym);
//    }
//    static void printSquare(int n){
//        String stars = "";
//        for(int i = 0;i < n;i++){
//            stars+="*";
//           // System.out.println(stars);
//        }
//        for(int i = 0; i < n;i++){
//            System.out.println(stars);
//        }
//    }
//    static ArrayList<Integer> arrayListOfInts(){
//        ArrayList<Integer> listOfInts = new ArrayList<Integer>();
//        int i = 1;
//        while(i <= 30){
//            listOfInts.add(i);
//            i++;
//        }
//        //System.out.println("in arrayList of ints "+listOfInts.get(listOfInts.size()-1));
//        return listOfInts;
//    }
//
//    static  ArrayList<Integer> filter(ArrayList<Integer> arrayList){
//        ArrayList<Integer> filterList = new ArrayList<Integer>();
//        for (int i=0;i<arrayList.size();i++) {
//            if((arrayList.get(i)%2== 0 || arrayList.get(i)%3==0 || arrayList.get(i)%5==0)){
//              continue;
//            }else{
//                filterList.add(arrayList.get(i));
//            }
//        }
//
//
//        return filterList;
//    }
}
