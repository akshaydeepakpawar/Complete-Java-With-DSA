public class reverse {
    public static void main(String[] args) {
        int n=123456;
        while(n>0)
        {
            int rem=n%10;
            n/=10;
            System.out.print(rem);
        }
    }
}
