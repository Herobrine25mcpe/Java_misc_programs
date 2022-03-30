import java.util.Scanner;

public class plusminus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number you wanna add ");
        int a = input.nextInt();
        int b = input.nextInt();

        int sum = a + b;
        int diff = a - b;
        System.out.println("The sum is: " + sum);

        System.out.println("The difference is: "+ diff);

    }

}
