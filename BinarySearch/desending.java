public class desending {
    public static void main(String[] args) {
        int[] arr={100,70,40,23,13,7,1};
        int target=23;
        int ans=desendingsearch(arr,target);
        System.out.println(ans);
    }
    static int desendingsearch(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(target==arr[mid])
            {
                return mid;
            }
            else if(target>arr[mid])
            {
                end=mid-1;
            }
            else if(target<arr[mid])
            {
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1; //if element not found then return -1
    }
}
