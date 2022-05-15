import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Calculator");

        int output = 0;

        while(true){
            System.out.print("Enter operator:");
            char operator = in.next().charAt(0);


            if (operator == '+' ||operator == '-' ||operator == '*' || operator == '/' ){

                System.out.print("Enter two numbers:");
                int x = in.nextInt();// taking input
                int y = in.nextInt();

                if (operator == '+' ){
                    output = x+y;
                }
                if (operator == '-' ){
                    output = x-y;
                }
                if (operator == '/' ){
                    if(y!=0) {
                        output = x / y;
                    }
                }
                if (operator == '*' ){
                    output = x*y;
                }

            }

            else if( operator == 'x'|| operator == 'X'){

                break;
            }

            else{
                System.out.println("Invalid");
            }

            System.out.println("Answer:" + output);

        }
    }
}
