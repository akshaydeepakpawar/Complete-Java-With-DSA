public class range {
    public static void main(String[] args) {
        int [] arr={12,34,56,67,3};
        int target=34;
        int start=0;
        int end=2;
        int ans=Search(arr,target,start,end);
        System.out.println(ans);
    }
    static int Search(int[] arr,int target,int start,int end)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(start=0;start<=end;start++)
        {
            if(arr[start]==target)
            {
                return start;
            }
        }
        return -1;
    }
}
