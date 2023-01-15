public class Exercise6 {
    public static void main(String[] args) {
     CarLoan newCar = new CarLoan(250000, 7.5f);
     HomeLoan newHome = new HomeLoan(250000, 5.5f);
     EducationLoan newCourse  = new EducationLoan(500000, 5.5f);
     newCar.setCommissionRate();
     newHome.setCommissionRate();
     newCourse.setCommissionRate();
    }
   }
   // commission_amount = sale price * commission_percentage / 100
   class Loan{
    int price;
    float commission_percentage;
   
    Loan(int price,float commission_percentage){
     this.price = price;
     this.commission_percentage = commission_percentage;
    }
   
    void setCommissionRate(){
     System.out.println("commission rate");
    }
   }
   
   class CarLoan extends Loan{
    CarLoan(int price,float commission_percentage){
     super(price, commission_percentage);
    }
   
    void setCommissionRate(){
     System.out.println("your car commission rate is: "+price * commission_percentage / 100);
    }
   }
   
   class HomeLoan extends Loan{
    HomeLoan(int price,float commission_percentage){
     super(price, commission_percentage);
    }
   
    void setCommissionRate(){
     System.out.println("your home commission rate is: "+price * commission_percentage / 100);
    }
   
   }
   
   class EducationLoan extends Loan{
    EducationLoan(int price,float commission_percentage){
     super(price, commission_percentage);
    }
   
    void setCommissionRate(){
     System.out.println("your education commission rate is: "+price * commission_percentage / 100);
    }
   }
   