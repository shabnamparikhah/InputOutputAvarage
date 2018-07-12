import java.util.Scanner;
public class InputOutputAssignment {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print( "First Number? " );
        num1 = keyboard.nextInt();

        System.out.print( "Second Number? " );
        num2 = keyboard.nextInt();

        System.out.println("The max value is : " + Math.max(num1, num2));

        num3 = num1+num2;
        System.out.println("The Avarage value is : " + num3/2);

        keyboard.close();
    }
}
