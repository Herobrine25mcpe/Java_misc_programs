import java.util.Scanner;

public class num_occur{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int x= in.nextInt();
        System.out.println("Enter Number to find it's occurrence");
        int y = in.nextInt();
        int count= 0;


        while(x>0){

            int num = x%10; // this statement gives the last digit (reminder)
            if (num == y){
                count+=1;
            }
            x=x/10; // this removes the last number

        }

        System.out.println("Then number of time " +y+" occurred is: " + count);

    }
}

