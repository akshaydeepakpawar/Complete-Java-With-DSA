public class search {
    public static void main(String[] args) {
        int[] arr={10,12,24,29,39,40,51,56,69};
        int target=24;
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
        }
        return -1; //if element not found then return -1
    }
}
