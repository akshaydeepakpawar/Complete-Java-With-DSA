import java.util.Scanner;

public class casecheck {
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    char c=in.next().charAt(0);
    if(c<91)
    {
        System.out.println("the char is uppercase");
    }
    else{
        System.out.println("the char is lower case");
    }
}    
}
