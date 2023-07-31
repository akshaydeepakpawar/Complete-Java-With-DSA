import java.util.Arrays;
import java.util.Scanner;

public class multidimensionarray {
    public static void main(String[] args) {
        int [][] arr=new int[3][3];
        // int [][] arr={
        //     {1,2,3},
        //     {3,4},
        //     {3,4,5,10}
        // };
        Scanner in=new Scanner(System.in);
        //input
        for (int row=0;row<arr.length;row++) //for each  row
        {
            for (int coloum=0;coloum<arr[row].length;coloum++) // for each coloum
            {
                arr[row][coloum]=in.nextInt(); 
            }
        }
        //output
        for (int row=0;row<arr.length;row++) //for each  row
        {
          System.out.println(Arrays.toString(arr[row]));
        }
    }
}
