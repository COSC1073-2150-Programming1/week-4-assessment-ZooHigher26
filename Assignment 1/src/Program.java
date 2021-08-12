import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
            double c,f;
            Scanner myObj = new Scanner(System.in);
            System.out.println("Please choose your desired conversion unit \n 1. Celsius to Fahrenheit \n 2. Fahrenheit to Celsius");
         int temp = myObj.nextInt();
            switch (temp) {
                case 1:
                    System.out.println("Enter the temperature in degrees celsius:");
                    c = myObj.nextDouble();
                    f = (((9*c)*5/9));
                    System.out.println("The converted temperature is "+f);
                break;

                case 2:
                    System.out.println("Enter the temperature in degrees fahrenheit:");
                        f = myObj.nextDouble();
                        c = (f-32)*5/9;

                    System.out.println("The converted temperature is "+c);
                break;

            }
    }
}





