import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        swap(arr,0,5);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int start,int end)
    {
        int temp;
        temp =arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
