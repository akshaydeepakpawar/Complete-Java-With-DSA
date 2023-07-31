public class reapeat {
    public static void main(String[] args) {
        int a = 1272122921;
        int target = 2;
        int count = 0;
        while (a > 0) {
            int rem = a % 10;
            a = a / 10;
            if (rem == target) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
