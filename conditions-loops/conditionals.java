import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int i=in.nextInt();
        System.out.println("while loop");
        while(i<=5)
        {
            System.out.println(i);
            i++;
        }
        System.out.println("do while loop");
        int k=0;
        do{
            System.out.println(k);
            k+=1;
        }
        while(k<=5);

        System.out.println("for loop");
        for(int j=1;j<=5;j++)
        {
            System.out.println(j);
        }
    }
}
