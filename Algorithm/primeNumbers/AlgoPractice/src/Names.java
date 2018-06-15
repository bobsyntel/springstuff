import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.io.File;

public class Names {
    static int ultimateSum = 0;
    public static void main(String[] args) throws Exception {
            // write your code here


        File file = new File("C:\\Users\\Syntel\\Desktop\\names.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String temp = br.readLine();

        while (temp != null) {
            sb.append(temp);
            sb.append("\n");
            temp = br.readLine();

        }
        String ar = sb.toString();
        String[] arr = ar.split(",");
//        System.out.println("ewefwef  "+arr.length);
        System.out.println(sb.toString());
        Arrays.sort(arr);
        System.out.printf(" %s", Arrays.toString(arr));


        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i] + " " + valueOfNames(arr[i]));
        }
        System.out.println("The ultiimate sum is "+ultimateSum);

        }

        public static int valueOfNames (String name){
            int sum = 0;
            for (int i = 1; i < name.length() - 1; i++) {
                char b = name.charAt(i);

                int a = Character.getNumericValue(b) - 9;
                sum +=a;
            }
            ultimateSum +=sum;
            return sum;
        }

    }


