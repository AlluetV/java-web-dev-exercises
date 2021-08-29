package exercises;

public class ArrayPractice {
    public static void main( String[] args){
        int [] numberArray = {1, 1, 2, 3, 5, 8};

        for(int i=0; i < numberArray.length; i++){

            if(numberArray[i] % 2 != 0){
                System.out.println(numberArray[i]);
            }
        }
    }
}
