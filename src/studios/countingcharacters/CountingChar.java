package studios.countingcharacters;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class CountingChar {
    public static void main(String [] arg) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("phrase ...");
        String  myPhrase = readFromFile("java-web-dev-exercises/studio2phrase/myPhrase.txt");

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

    //method to read a file , my phrase is stored in myPhrase.txt
    public static String readFromFile(String file) throws IOException {
        Path path = Paths.get(file);
        String read = Files.readAllLines(path).get(0);
        return read;
    }
}
