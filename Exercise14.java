public class Exercise14 
{
    public static void main(String[] args) 
    {
        int num = -6;
     
        try 
        {
        if(num<0)
        {
            throw new Exception("Number can not be negative");
        }
        else
        {
        int fact = 1;
        for(int i = 2; i<num; i++)
        {
        fact = fact*i;
        }
        System.out.println(fact);
        }
        }
        catch (Exception e) 
        {
        System.out.println(e);
        }
    }
}
   