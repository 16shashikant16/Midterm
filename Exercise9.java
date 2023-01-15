public class Exercise9
{
    public static void main(String[] args) 
    {
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();
        a.depositInBank(150);
        b.depositInBank(200);
        c.depositInBank(200);
     
        a.getBalance();
        b.getBalance();
        c.getBalance();
        }
    }
   
    abstract class Bank{
    abstract void getBalance();
    }
   
    class BankA extends Bank
    {
        int deposit;
        void depositInBank(int amount)
        {
        this.deposit = amount;
        }
        void getBalance(){
        System.out.println("your deposit amount in BankA is: "+deposit);
    }
    
    }
    class BankB extends Bank
    {
        int deposit;
        void depositInBank(int amount)
        {
        this.deposit = amount;
        }
        void getBalance()
        {
        System.out.println("your deposit amount in BankB is: "+deposit);
        }
   
    }
    class BankC extends Bank
    {
        int deposit;
        void depositInBank(int amount)
        {
        this.deposit = amount;
        }
   
        void getBalance()
        {
        System.out.println("your deposit amount in BankC is: "+deposit);
        }
}
   