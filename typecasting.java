import java.util.Scanner;

public class typecasting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input the number: ");
            // Typecasting is converting one type of variables into other
        float num = input.nextInt();// since float is bigger data type it can store int value
        float num1= input.nextFloat();
        int num2 = (int)(908.123f);//

        System.out.println(" The number are " + num + " " + (int) num1 + " "+ num2);// puting a (datatype)identifier explicit typecasting


    }
}
