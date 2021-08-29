package exercises;

import java.util.ArrayList;

public class ArrayListPracticeOne {

    public  static int sumNumbers(ArrayList<Integer> myArray){
        int myTotal = 0;
        for(int integer : myArray){
            if(integer %2 == 0 ){
                myTotal += integer;
            }
        }
        return myTotal;
    }


}
