public class infinitearray {
    public static void main(String[] args) {
        int[] arr={10,23,34,54,55,67,77,78,90,99,110,120,130,140,200};
        int target=90;
        int start=0;
        int end=1;
        while(target>arr[end])
        {
            int new_start=end+1;
            end=end+(end-start+1)*2;
            start=new_start;
        }
        System.out.println(Bsearch(arr, target, start, end));
    }
        static int Bsearch(int[] arr,int target,int start,int end)
        {
            
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
            return -1;
    }
}
