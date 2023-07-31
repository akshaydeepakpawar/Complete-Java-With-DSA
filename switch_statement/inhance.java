import java.util.Scanner;
public class inhance {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("enter fruit name");
        String fruit=in.next();

        switch(fruit){
            case "apple"-> System.out.println("red sweet fruit");
            case "mango"-> System.out.println("king of fruit");
            case "banana"->System.out.println("yellow fruit");
            case "grapes"->System.out.println("small sweet fruit");
            default->System.out.println("IDK");
        }

    }
}
