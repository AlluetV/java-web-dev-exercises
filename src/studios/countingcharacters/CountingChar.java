package studios.countingcharacters;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import java.util.Scanner;

public class CountingChar {
    public static void main(String [] arg) throws IOException {

        // Scanner input = new Scanner(System.in);

        System.out.println("phrase read from my file");
        // String myPhrase = input.nextLine();
        String  myPhrase = readFromFile("java-web-dev-exercises/studio2phrase/myPhrase.txt");

        //making  case-insensitive.
        String finalPhrase = myPhrase.toLowerCase();

        // changing  the phrase to chars
        char [] charPhrase = finalPhrase.toCharArray();

        // creating an empty map
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
        for (Map.Entry<Character,Integer> word : mapPhrase.entrySet()) {
            System.out.println(word.getKey() + ":" + word.getValue());
        }
        //System.out.println(mapPhrase);

    }

    //method to read a file , my phrase is stored in myPhrase.txt
    public static String readFromFile(String file) throws IOException {
        //String read = "";
        StringBuilder read = new StringBuilder();

        Path path = Paths.get(file);
        List<String> lines = Files.readAllLines(path);

        // concatenating all lines to get the whole phrase
        for(String line : lines){
            //read += line;
            read.append(line);

        }
        return read.toString();
    }
}
