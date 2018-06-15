public class PracticeAlgo {

    public static void main(String args[]){
       int numOfWords =  countWords("i am a man");
        System.out.println(numOfWords);
        int f1 = 0;
        int f2 = 1;
        int numToPrint = 5;
        fibonacci(f1,f2,numToPrint);
    }

    public static int countWords(String sentence){
        String[] numOfWords = sentence.split(" ");

        return numOfWords.length;

    }

    public static int fibonacci(int f1,int f2,int numToPrint){

    }
}
