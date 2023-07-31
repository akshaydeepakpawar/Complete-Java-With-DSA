import java.util.Arrays;

public class vararg {
    public static void main(String[] args) {
        fun(2,3,4,3,4,56,56,45,34);
        multiple(2, 3,"akshay","nikhil","shubham");
    }
    static void multiple(int a,int b,String...v) //vararg always comes at the end
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
