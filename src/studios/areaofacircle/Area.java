package studios.areaofacircle;
import java.util.Scanner;


public class Area {
    public static void main(String[] args){
        //get the radius value from the user

        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("radius: ");
            if(input.hasNextDouble()){
                double r = input.nextDouble();
                if(r < 0){
                    System.out.println("not a valid input, only positive numbers");
                }else{
                    double area = Circle.getArea(r);
                    System.out.println("The area of a circle of radius "+ r + "is: " + area);
                    break;
                }
            }else
                System.out.println("not a valid input");

            }
        }

    }


