import java.util.Scanner;

public class primitives {
    public static void main(String[] args) {
        String name="akshay"; //not primitive
        char letter='a';
        double largedecimalnumber=12345.56;
        float marks=99.78f;
        boolean check=false;
        long largerint=123186973l;
        Scanner input =new Scanner(System.in);
        float a=input.nextFloat();
        float b=input.nextFloat();
        System.out.println("sum = "+(a+b));
    }
}
