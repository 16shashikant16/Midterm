public class Exercise1
{
    public static void main(String[] args) 
    {
        int oddSum = 0;
        int evenSum = 0;
        int primeSum = 0;

        for(int i = 1; i<=15; i++){
        if(i%2==0){
        evenSum+=i;
        }else{
        oddSum+=i;
        }

        // prime number
        if(Prime(i)){
        primeSum+=i;
        }
    }

        System.out.println("Even number sum is: "+evenSum);
        System.out.println("Odd number sum is: "+oddSum);
        System.out.println("Even number sum is: "+primeSum);
        }

        static boolean Prime(int n){
        if(n==1) return false;
        for(int i = 2;i<n; i++){
        if(n%i==0) return false;
        }
  return true;
    }

}
