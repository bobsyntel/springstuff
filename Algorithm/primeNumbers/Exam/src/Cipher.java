public class Cipher {
    public static void main(String[] args){
        System.out.println(decipher("Nca"));
    }

    static String decipher(String word){
        int offset = 13;

        System.out.println(word);
        String cipher = "";
        for(int i = 0; i < word.length();i++){
            int charNum = word.charAt(i);

            if(charNum > 64 && charNum < 91){
                if(charNum > 77){
                    charNum-=offset;
                    char ch = (char)charNum;
                    cipher+=ch;
                }else{
                    charNum+=offset;
                    char ch = (char)charNum;
                    cipher+=ch;
                }
            }
            charNum+=offset;

            if(word.charAt(i) == ' '){
                cipher+=" ";
                continue;
            }
            if(charNum > 96 && charNum < 123){

                char ch = (char)charNum;
                cipher+=ch;
            }else if(charNum >= 123){
                charNum-= 2*offset;
                char ch = (char)charNum;
                cipher+=ch;
            }
        }
        return cipher;
    }

}
