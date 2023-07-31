import java.util.Arrays;

public class overloading {
    public static void main(String[] args) {
        fun(32);
        fun("akshay");
        System.out.println(sum(3, 4));
        System.out.println(sum(1, 2, 3));
        demo("akshay","nikhil","papa","kunal");
        demo(1,2,3,4,3,2,1,1,1);
    }
    static void demo(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v)
    {
        System.out.println(Arrays.toString(v));
    }
    static int sum(int a, int b)
    {
        return a+b;
    }
    static int sum(int a, int b,int c)
    {
        return a+b+c;
    }
    static void fun(int b){
        System.out.println("first one");
        System.out.println(b);
    }
    static void fun(String name){
        System.out.println("second one");
        System.out.println(name);
    }
}
