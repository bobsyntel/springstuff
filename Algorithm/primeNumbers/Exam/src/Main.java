import java.util.ArrayList;

public class Main {
    public static  void main(String[] args){
        int[] sc1 = {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> nums = oddNumbers(sc1);
        for (int i: nums) {
            System.out.print(i+" ");
        }
    }

    public static ArrayList<Integer> oddNumbers(int[] arr){
        ArrayList<Integer> oddNum = new ArrayList<Integer>();

        for(int i = 0; i < arr.length;i++){
            if(arr[i]%2==0){
                continue;
            }else{
                oddNum.add(arr[i]);
            }
        }
        return oddNum;
    }
}
