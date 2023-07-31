//Q. 1295
public class findEven {  
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }
   static int findNumbers(int[] nums) {
    int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(even(nums[i]))
            {
                count++;
            }
        }
        return count;
    }
    static boolean even (int num)
    {
        return digit(num)%2==0;
    }
    static int digit(int num)
    {
        return (int)Math.log10(num)+1;
    }
}
