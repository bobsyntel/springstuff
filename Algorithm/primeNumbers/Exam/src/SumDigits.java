public class SumDigits {

    public static void main(String[] args){
       String ar = "1234";
       int num = Character.getNumericValue(ar.charAt(3));
        System.out.println(num);
        String numbersString1 = "12378923254";
        String numbersString2 = "53625484376";
        String numbersString3 = "71941648682";

        String[] str = {numbersString1,numbersString2,numbersString3};
            sumDigits(str);
    }

    static int sumDigits(String[] str){
        int sum = 0;
        for(int i = 0; i < str.length;i++){
            sum+= sumOfEachString(str[i]);
        }
        System.out.println(sum);
        return sum;

    }

    static  int sumOfEachString(String str){
        int sum = 0;
        for(int i = 0; i < str.length();i++){
            int num = Character.getNumericValue(str.charAt(i));
            sum+=num;
        }
        return sum;
    }
}
