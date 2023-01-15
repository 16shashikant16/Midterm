public class Exercise15
{
    public static void main(String[] args) 
    {
        int weight = 90;
        try {
        checkWeight(weight);
        }
        catch (OverProductWeightException e) 
        {
        System.out.println("An Exception Occurred: "+e);
        }
     
    }
   
    static void checkWeight(int weight) throws OverProductWeightException
    {
        if(weight>60)
        {
        throw new OverProductWeightException("Sorry..! Product weight can not be more than 60kgs.");
        }
        System.out.println("Product weight is okk.");
        }
    }
   
    class OverProductWeightException extends Exception
    {
        OverProductWeightException(String msg)
        {
        super(msg);
        }
    }