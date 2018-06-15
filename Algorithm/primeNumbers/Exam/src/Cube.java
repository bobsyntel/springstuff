import java.util.ArrayList;

public class Cube {
    public static  void main(String[] args){
        int[] sc1 = {3,6,9};
        ArrayList<Integer> nums = cubeNumbers(sc1);
        for (int i: nums) {
            System.out.print(i+" ");
        }
    }

    static ArrayList<Integer> cubeNumbers(int[] arr){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i =0;i < arr.length;i++){
            int cube = arr[i]*arr[i]*arr[i];
            nums.add(cube);
        }
        return nums;
    }
}
