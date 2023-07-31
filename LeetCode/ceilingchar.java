public class ceilingchar {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target='a';
        System.out.println(smallestchar(letters, target));
    }
    static char smallestchar(char[] arr,char target)
{
    int start=0;
    int end=arr.length-1;
    while(start<=end)
    {
        int mid=(start+end)/2;
       
       if(target>arr[mid])
        {
            start=mid+1;
        }
        else
        {
            end=mid-1;
        }
       
        
    }
    return arr[start%arr.length];
}
}
