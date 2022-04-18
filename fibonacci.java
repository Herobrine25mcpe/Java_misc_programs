import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int a=0;
        int b=1;

        for(int i = 0; i<=x; i++ ){

            int temp=a+b;
            System.out.print(a+" ");
            a=b;
            b=temp;

        }

    }
}
