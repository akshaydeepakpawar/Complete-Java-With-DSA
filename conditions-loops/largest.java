import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter three numbers");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        // if(a>b&&a>c)
        // {
        //     System.out.println("the first number is greater");
        // }
        // else if(b>a&&b>c)
        // {
        //     System.out.println("the second number is greater");
        // }
        // else{
        //     System.out.println("third number is greater");
        // }
        // int max=a;
        // if(b>max){
        //     max=b;
        // }
        // if(c>max){
        //     max=c;
        // }
        int max=Math.max(a,Math.max(b, c));
        System.out.println("the greater number is "+max);
    }
}
