import java.util.Scanner;

public class reverse_num {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number");
        int x = in.nextInt();
        int rev = 0;


        while(x>0){

            int num = x%10; // getting the last digit
            rev = rev*10 + num; // reversing the number
            x=x/10;// removing the last digit

        }

        System.out.println("The reverse number is : " +rev);
    }
}
