package exercises;
import java.util.Scanner;

public class NumericTypes {
    public static void main( String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("length:");
        double length = input.nextDouble();

        System.out.println("width:");
        double width = input.nextDouble();
        input.close();

        double area = length * width;
        System.out.println("The rectangle’s area is " + area + " cm^2.");

    }
}
