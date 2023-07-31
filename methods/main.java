import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //q: take input of two numbre and print the sum
        Scanner in=new Scanner(System.in);
        System.out.println("enter two numebrs: ");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("the sum is --->"+sum(a, b));
    }
    static int sum(int a,int b)
    {
        return a+b;
    }
}