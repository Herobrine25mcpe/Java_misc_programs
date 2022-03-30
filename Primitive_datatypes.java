
import java.util.Scanner;

public class Primitive_datatypes {

    public static void main(String[] args) {
            // data types that you can not divide any further
        int age = 21; //4 bytes
        char sec = 'A'; // 2 byte
        short id = 23456;// 2 bytes
        float marks = 88.23f;// 4 byte
        long phone = 1234567891011121314L; // 8 bytes
        double decimal = 123123.123454;// 8 bytes
        boolean flag = false;// 1 byte

        int a= 10; // a(reference variable) is an identifier and 10 is a literal

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your marks");
        marks = input.nextFloat();
        System.out.println(marks);

        System.out.println("Enter your section");
        sec = input.next().charAt(0);
        System.out.println(sec);

        System.out.println("Enter your number");
        phone = input.nextLong();
        System.out.println(phone);


    }
}
