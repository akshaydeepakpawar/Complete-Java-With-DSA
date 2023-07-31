public class strS {
    public static void main(String[] args) {
        String name="Akshay";
        char target ='y';
        int ans=StringS(name,target);
        System.out.println(ans);
    }
    static int StringS(String name,char target)
    {
        for(int index=0;index<name.length();index++)
        {
            if(name.charAt(index)==target)
            {
                return index;
            }
        }
        return -1;
    }
}
