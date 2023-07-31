import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("enter fruit name");
        String fruit=in.next();

        switch(fruit){
            case "apple":
            System.out.println("red sweet fruit");
            break;
            case "mango":
            System.out.println("king of fruit");
            break;
            case "banana":
            System.out.println("yellow fruit");
            break;
            case "grapes":
            System.out.println("small sweet fruit");
            break;
            default:
            System.out.println("IDK");

        }

    }
}
