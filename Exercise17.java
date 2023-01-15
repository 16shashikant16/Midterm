import java.util.ArrayList;

public class Exercise17
{
    public static void main(String[] args) 
    {
    int arr1[] = {1,2,3,4,5};
    int arr2[] = {2,3,1,1,0,5,0,2,1};
    ArrayList<Integer> notInSecondArray = new ArrayList<Integer>();

    int count = 0;
    for(int i:arr1)
    {
        for(int j = 0; j<arr2.length; j++)
        {
            if(i==arr2[j])
            {
            count++;
        }
    }

    if(count==0)
    {
        notInSecondArray.add(i);
    }
    count = 0;
    }

    System.out.println("number that are not present in second array are: "+notInSecondArray);
  
    }
}
