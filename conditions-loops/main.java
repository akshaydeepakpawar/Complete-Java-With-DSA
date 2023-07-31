import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter your salary");
        int salary=in.nextInt();
        if(salary<=10000)
        {
            salary=salary+2000;
        }
        else if(salary>=20000){
            salary +=4000;
        }
        else{
            salary+=1000;
        }
        System.out.println("your added salary is : "+salary);
    }
}
