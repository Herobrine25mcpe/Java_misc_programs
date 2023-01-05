import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class companyman {

    public static void main(String[] args) {

        String[] person= new String[15];
        int[] salary= new int[15];

        int sum=0;

        Scanner s = new Scanner(System.in);

        for(int i=0; i<15; i++){

            System.out.println("Enter the name:");
            person[i]=s.nextLine();
            System.out.println("Enter the salary:");
            salary[i]=s.nextInt();
            s.nextLine();


            sum = sum + salary[i];

        }

        System.out.println("Total expense to company:" + sum);
        System.out.print("Total employee in company:");
        System.out.println(Arrays.toString(person));

    }

}
