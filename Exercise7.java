public class Exercise7 
{
    public static void main(String[] args) 
    {
     
        int num = 5;
   
        for(int i = 1; i<3; i++)
        {
        for(int j = i; j<=3; j++)
        {
        System.out.print("    ");
        }
        for(int j = 1; j<=i; j++)
        {
        System.out.print(" "+num+" ");
        num+=5;
        }
        for(int j = 1; j<i; j++){
        System.out.print(" "+num+" ");
        num+=5;
        }
        System.out.println();
        }
   
        for(int i = 1; i<=3; i++){
        for(int j = 1; j<=i; j++){
        System.out.print("    ");
        }
        for(int j = i; j<=3; j++){
        System.out.print(" "+num+" ");
        num+=5;
        }
        for(int j = i; j<3; j++){
        System.out.print(" "+num+" ");
        num+=5;
        }
        System.out.println();
        }
    }
}
   