import java.util.Scanner;

public class Scannerclass {
    public static void main(String[] args) {
        System.out.println("What is your name? ");

            //Scanner takes input
            //System.in is standard input stream from the keyboard

        Scanner input = new Scanner(System.in);

            // nextLine() prints the whole sting saved into the input

        System.out.println("hello " + input.nextLine());
        System.out.println("What is your age? ");
        input = new Scanner(System.in);

            // nextInt() prints the whole integer saved into the input

        System.out.println("So you are " + input.nextInt() + " year old");

    }
}
