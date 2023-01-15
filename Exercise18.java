public class Exercise18 
{
    public static void main(String[] args) 
    {
    int n = 64;
    if(divide(n))
    {
      System.out.println(n+" is power of 2");
    }
    else
    {
      System.out.println(n+" is not power of 2");
    }
   
    }
   
    static boolean divide(int n)
    {
        if(n==1) return true;
        if(n%2!=0) return false;
        return divide(n/2);
    }
}