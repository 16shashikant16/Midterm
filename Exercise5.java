import java.util.*;

public class Exercise5{
 public static void main(String[] args) {
  String cityName ="";
  Temperature t[] = new Temperature[5];

  for(int i = 0; i<5; i++){
   t[i] = new Temperature();
   t[i].getTempData();
    }

  for(int i = 0; i<5; i++){
   if(t[i].cityTemp>Temperature.maxTemp){
    Temperature.maxTemp = t[i].cityTemp;
    cityName = t[i].cityName;
    }
  }

  System.out.println("City that has highest temperature is "+cityName+" which is"+Temperature.maxTemp);
 }
}

class Temperature{
 String cityName;
 double cityTemp;
 static double maxTemp = 0;

 void getTempData(){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter city name: ");
  cityName = sc.next();
  System.out.println("Enter city temperature: ");
  cityTemp = sc.nextDouble();
 }
}