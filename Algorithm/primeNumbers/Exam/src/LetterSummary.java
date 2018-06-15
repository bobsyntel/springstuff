
import java.util.HashMap;
import java.util.Map;

public class LetterSummary {
    public static void main(String[] args){
                letter_histogram("ba");
    }
    static void letter_histogram(String input){
        Map<Character,Integer> map = new HashMap<Character, Integer>();

        for(int i = 0; i < input.length();i++){
            int count = 1;
            for(int j = i+1;j<input.length();j++){
                if(input.charAt(i)==input.charAt(j)){
                    count++;
                }

            }
            if(!(map.containsKey(input.charAt(i)))){
                map.put(input.charAt(i),count);
            }
        }

        for (Map.Entry<Character,Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}
