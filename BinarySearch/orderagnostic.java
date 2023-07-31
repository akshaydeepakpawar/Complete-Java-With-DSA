public class orderagnostic {
    public static void main(String[] args) {
        //int[] arr = { 10, 12, 24, 29, 39, 40, 51, 56, 69 };
        int[] arr={100,70,40,23,13,7,1};
        int target = 40;
        int ans=Orderserch(arr, target);
        System.out.println(ans);
    }

    static int Orderserch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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
                } else {
                    return mid;
                }
            }
             else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
