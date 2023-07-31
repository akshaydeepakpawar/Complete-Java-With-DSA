import java.util.Scanner;

public class ctf {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter temp in celcious");
        int cel=input.nextInt();
        int answer=(cel*9/5) + 32 ;
        System.out.println("the temp in farhanite is = "+answer);
    }
}
