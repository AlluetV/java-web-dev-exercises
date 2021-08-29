package studios.countingcharacters;
import java.util.HashMap;
import java.util.Scanner;

public class CountingChar {
    public static void main(String [] arg){

        Scanner input = new Scanner(System.in);
        System.out.println("phrase ...");
        String  myPhrase = input.nextLine();
        input.close();

        //making  case-insensitive.
        String finalPhrase = myPhrase.toLowerCase();
       // System.out.println("your phrase is:\n" + finalPhrase);

        char [] charPhrase = finalPhrase.toCharArray();
        HashMap<Character, Integer> mapPhrase = new HashMap<>();

        for(char i : charPhrase){
            if(Character.isLetter(i)){
                if(!mapPhrase.containsKey(i)){
                    mapPhrase.put(i,1);
                }else{
                    int charValue = mapPhrase.get(i);
                    charValue += 1;
                    mapPhrase.put(i,charValue);
                }
            }

        }

        System.out.println(mapPhrase);


    }
}
