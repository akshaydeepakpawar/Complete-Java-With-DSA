public class findinmountain {
    public static void main(String[] args) {
        int[] arr={1,2,5,6,7,3,0};
        int target=2;
        int peak=peakelement(arr);
        int ans= Orderserch(arr, target, 0, peak);
        if(ans!=-1)
        {
            System.out.println(ans);
        }
        else{
            System.out.println(Orderserch(arr, target,peak+1, arr.length-1));
        }
    }
    static int peakelement(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else{
                start=mid+1; //if arr[mid]<arr[mid+1]
            }
        }
        return arr[start];
    }
    static int Orderserch(int[] arr, int target,int start,int end) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } 
            }
             else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } 
            }
        }
        return -1;
    }
}
