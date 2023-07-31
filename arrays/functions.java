import java.util.Arrays;

public class functions {
    public static void main(String[] args) {
        int[] num={12,34,121,34};
        System.out.println(Arrays.toString(num));
        change(num);
    }
    static void change(int arr[])
    {
        arr[0]=100;
        System.out.println(Arrays.toString(arr));
    }
}
