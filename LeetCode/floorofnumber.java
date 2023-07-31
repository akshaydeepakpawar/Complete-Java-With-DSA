public class floorofnumber {
    public static void main(String[] args) {
        int[] arr={10,12,24,29,39,40,51,56,69};
        int target=55;
        int ans = Bsearch(arr,target);
        System.out.println(ans);
    }
    static int Bsearch(int[] arr,int target)
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
                start=mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else{
                return mid;
            }
            if(target>arr[arr.length-1])
            {
                return -1;
            }
            
        }
        return arr[end];
    }
}
