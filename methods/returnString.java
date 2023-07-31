
import java.util.Scanner;

public class returnString {
    
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String name=in.next();
        System.out.println(greet(name));
    }
    static String greet(String naam)
    {
        String Greet="Hello "+naam;
        return Greet;
    }
}
