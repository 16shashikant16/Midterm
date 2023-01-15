public class Exercise8 
{
    public static void main(String[] args) 
    {
        MyCalculator sum = new MyCalculator();
        System.out.println("The sum is: "+sum.divisorSum(6));
        }
    }
   
    interface advancedArithmetic
    {
        int divisorSum(int n);
    }
   
    class MyCalculator implements advancedArithmetic
    {
    public int divisorSum(int n)
    {
        int sum = 0;
        for(int i = 1; i<=n; i++){
        if(n%i==0)
        {
            sum+=i;
        }
    }
    return sum;
    }
}