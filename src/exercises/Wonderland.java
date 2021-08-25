package exercises;

import java.util.Scanner;

public class Wonderland {
    public static void main(String[] args){
        String  wonder = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, 'and what is the use of a book," +
                "' thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("term to search for within this string..");
        String  word = input.nextLine();
        input.close();
        word = word.toLowerCase();

        int index = wonder.indexOf(word);
        int length = word.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String myString = wonder.replaceFirst(word, "");
        System.out.println(myString);


    }
}
