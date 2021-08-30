package exercises.ch3;

public class ArrayPractice {
    public static void main( String[] args){
        int [] numberArray = {1, 1, 2, 3, 5, 8};

        for (int j : numberArray) {

            if (j % 2 != 0) {
                System.out.println(j);
            }
        }
    }
}
