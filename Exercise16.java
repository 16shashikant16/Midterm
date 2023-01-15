import java.util.Arrays;

class Exercise16
{
	public static void main (String[] args)
    {
		int array1[] = { 4, 1, 6 };
		int array2[] = { 5, 3, 1 };

		helperFunction(array1,  array2);
    System.out.println(Arrays.toString(array1)+" "+getSum(array1));
    System.out.println(Arrays.toString(array2)+" "+getSum(array2));
	}

	static int getSum(int array[])
    {
		int sum = 0;
		for (int i:array)
			sum += i;
		return sum;
	}
	
	static void helperFunction(int array1[], int array2[])
    {
		int sum1 = getSum(array1);
		int sum2 = getSum(array2);

    for(int i = 0; i<array1.length; i++)
    {
        for(int j = 0; j<array2.length; j++)
        {
            int newSum1 = sum1 - array1[i] + array2[j];
            int newSum2 = sum2 - array2[j] + array1[i];
        if(newSum1 == newSum2)
        {
            int tempValue = array1[i];
            array1[i] = array2[j];
            array2[j] = tempValue;
            return;}
            }
        }
	}
}
