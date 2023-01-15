public class Exercise2 
{
    public static void main(String[] args) 
    {
        Area a = new Area();
        System.out.println("Area of rectangle is: "+a.areaOfRectangle(6, 8));
        System.out.println("Area of square is: "+a.areaOfSquare(20));
   
        }
    }
   
    class Area
    {
        int areaOfRectangle(int l, int b)
        {
        return l*b;
        }
        int areaOfSquare(int s){
        return s*s;
    }
}
