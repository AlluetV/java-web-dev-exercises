package exercises;
import java.util.Scanner;

public class Miles {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you drive?");
        double miles = input.nextDouble();

        System.out.println("How much gas did you use? in gallons.");
        double gas = input.nextDouble();
        input.close();

        double milesPerGallons = miles/gas;
        System.out.println("You are using " + milesPerGallons + "mpg");
    }
}
