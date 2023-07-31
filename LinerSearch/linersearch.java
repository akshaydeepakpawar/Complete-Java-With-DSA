public class linersearch {
    public static void main(String[] args) {
        int [] arr={12,34,56,67,3};
        int target=12;
        int ans=Search(arr,target);
        System.out.println(ans);
    }
    static int Search(int[] arr,int target)
    {
        if(arr.length==0)
        {

            return -1;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }

    //time complexity 
    //O(n)=worst case
    //O(1)=best case
    //O(n/2)=avg case
}
