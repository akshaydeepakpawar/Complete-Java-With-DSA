import java.util.Arrays;

public class changevalue {
    public static void main(String[] args) {
        int[] arr={1,2,3,54,45,6};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] num)
    {
        num[0]=99;
    }
}
