package exercises;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPracticeOne {
    public static void main(String[] args){
        //ArrayList<Integer> numbersToSum = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        //Integer theSum =  ArrayListPracticeOne.sumEvenNumbers(numbersToSum);
        //System.out.println("the sum of even numbers is: " + theSum.toString());

       // ArrayPracticeStrings arrayPracticeStrings = new ArrayPracticeStrings();
        //String[] returnWords = arrayPracticeStrings.

        ArrayList<String> wordToSearch = new ArrayList<>(Arrays.asList("spring", "summer", "fall", "winter", "house"));
        System.out.println("what word length are you looking for: ");
        Integer userLength = ArrayListPracticeOne.getUserInput();
        ArrayListPracticeOne.printWordFiveLetters(wordToSearch, userLength);

    }

    public  static Integer getUserInput(){
        Scanner scanner = new Scanner(System.in);
        Integer userInt = scanner.nextInt();
        scanner.close();
        return userInt;
    }

    public static  void printWordFiveLetters(ArrayList<String> words, Integer userLength){
            for(int j = 0; j< words.size(); j++ ){
                if(words.get(j).length() == userLength){
                    System.out.println(words.get(j));
                }
            }
    }

  /*
    public  static Integer sumEvenNumbers(ArrayList<Integer> valuesToSum){
        Integer sum = 0;
        for(int i = 0; i< valuesToSum.size(); i++ ){
            if(valuesToSum.get(i) % 2 == 0){
                //System.out.println(valuesToSum.get(i));
                sum  = sum + valuesToSum.get(i);
            }

        }
        return sum;
    }
*/
}
