
public class Exercise3
{
    public static void main(String args[])
    {
        Customer c1 = new Customer("zyan", 22, 22233377);
        Customer c2 = new Customer("zyan", 22, 22233377, true, 4.5f);
  
        System.out.println(" customer name is: "+c1.name+", age is: "+c1.age+" membership is: "+c1.memberShip+", reward points are: "+c1.rewardPoint);
        System.out.println(" customer name is: "+c2.name+", age is: "+c2.age+" membership is: "+c2.memberShip+", reward points are: "+c2.rewardPoint);
        }
    }
  
    class Customer{
    String name;
    int age;
    int contactNumber;
    boolean memberShip = false;
    float rewardPoint;
  
    Customer(String name, int age, int contactNumber){
    this.name = name;
    this.age = age;
    this.contactNumber = contactNumber;
    }
    Customer(String name, int age, int contactNumber, boolean memberShip, Float rewardPoint){
    this.name = name;
    this.age = age;
    this.contactNumber = contactNumber;
    this.memberShip = memberShip;
    this.rewardPoint = rewardPoint;
    }
}
  