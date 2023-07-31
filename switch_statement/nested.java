import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int employeeno = in.nextInt();
        String departmemt = in.next();
        switch (employeeno) {
            case 1 -> System.out.println("kunal kushwaha");
            case 2 -> System.out.println("akshay pawar");
            case 3 -> {
                switch (departmemt) {
                    case "IT" ->
                        System.out.println("IT department");

                    case "Management" ->
                        System.out.println("Management");

                    default ->
                        System.out.println("no department");
                }
            }
            default ->
                System.out.println("enter correct emp-id");

        }
    }
}
