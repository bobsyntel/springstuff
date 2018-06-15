public class InsertionSort {
    public static void main(String[] args){
        int[] numbersToSort  = {3,2,8,5,11,1,10};
        for (int num : insertionSort(numbersToSort)) {
            System.out.print(num);
        }
    }

    public static int[] insertionSort(int[] arr){

        for(int i = 1; i < arr.length;i++){

            for(int j = i-1; j >= 0;j--){
                if(arr[i] > arr[j]){
                    continue;
                }else{
                    int element = arr[j];
                    arr[j] = arr[i];
                    arr[i] = element;
                }

            }
        }
        return  arr;
    }

}
