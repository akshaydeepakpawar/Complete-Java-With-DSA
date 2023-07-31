import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.Manifest;

public class input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // int[] arr= new int[5];
        // for (int i=0;i<arr.length;i++)
        // {
        //     arr[i]=in.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));
        String arr[]=new String[3];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=in.next();
        }
        System.out.println(Arrays.toString(arr));

        // modify
        arr[0]="akshay";
        System.out.println(Arrays.toString(arr));
    }
}
