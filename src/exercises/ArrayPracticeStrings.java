package exercises;

import java.util.Arrays;

public class ArrayPracticeStrings {
    public static void main(String[] args){
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String [] words = phrase.split(" ");
        System.out.println("split by one space");
        System.out.println(Arrays.toString(words));

        String [] wordDots = phrase.split("\\.");
        System.out.println("split by // dots");
        System.out.println(Arrays.toString(wordDots));

        String [] wordNoSpace = phrase.split("");
        System.out.println("split by no space");
        System.out.println(Arrays.toString(wordNoSpace));

        String [] wordChar = phrase.split("//");
        System.out.println("split by char //");
        System.out.println(Arrays.toString(wordChar));

    }
}
