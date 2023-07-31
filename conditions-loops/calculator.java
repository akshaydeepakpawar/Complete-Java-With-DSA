import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("enter x or X for exit");
            System.out.println("which operation you wanr to do?");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("enter two numbers");
                Float a = in.nextFloat();
                Float b = in.nextFloat();
                System.out.println(a + " " + op + " " + b + "=");
                if (op == '+') {
                    System.out.println(a + b);
                }
                if (op == '-') {
                    System.out.println(a - b);
                }
                if (op == '*') {
                    System.out.println(a * b);
                }
                if (op == '/') {
                    System.out.println(a / b);
                }
                if (op == '%') {
                    System.out.println(a % b);
                }
            }
            else if (op == 'x' || op == 'X') {
                break;
            } 
            else {
                System.out.println("invalid operation");
            }
        }
    }
}
