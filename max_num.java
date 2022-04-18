import java.util.Scanner;

public class max_num {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int ans = (a>b)?a>c?a:c : b>c ?b:c; // ternary operator

        System.out.println(ans);

    }
}
