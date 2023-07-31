// Q 1672
public class Rcustomer {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,2,3},{3,2,1}
    };
    int ans=maximumWealth(accounts);
    System.out.println(ans);
}
    static int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++)
        {
            int sum=0;
            for(int j=0;j<accounts[person].length;j++)
            {
                sum=sum+accounts[person][j];
            }
            if(ans<sum)
            {
                ans=sum;
            }
        }
        return ans;
    }
}
