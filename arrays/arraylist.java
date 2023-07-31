import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list =new ArrayList<>(10);
        Scanner in=new Scanner(System.in);
        // list.add(67);
        // list.add(23);
        // list.add(6);
        // list.add(78);
        // System.out.println(list);
        // list.set(0, 99);
        // System.out.println(list);
        // list.remove(0);
        // System.out.println(list);
        for(int i=0;i<5;i++)
        {
            list.add(in.nextInt());
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
