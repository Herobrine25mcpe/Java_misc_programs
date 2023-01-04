import java.util.*;

public class Insertion{
    public static void main(String[] args){

        int arr[] = {2,5,7,4,8,3,1,9};

        for( int i=1; i< arr.length; i++){

            int key = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

        }

        System.out.println(Arrays.toString(arr));

    }
}
