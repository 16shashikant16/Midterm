import java.util.ArrayList;
public class Exercise11
{
    public static void main(String[] args) 
    {
        int nums[] = {33,4,55,6,7,79,83,11,4,37};
        ArrayList<Integer> prime = new ArrayList<Integer>();
        ArrayList<Integer> notPrime = new ArrayList<Integer>();

    for(int n:nums)
    {
        if(prime(n))
        {
        prime.add(n);
        }
        else
        {
        notPrime.add(n);
        }
    }
    System.out.println("Prime numbers from array are: "+prime);
    System.out.println("Non Prime numbers from array are: "+notPrime);

    }
    static boolean prime(int n)
    {
    if(n==1) return false;
    for(int i = 2; i<n; i++)
    {
        if(n%i==0)
        {
        return false;
        }
    }
    return true;
    }
}
