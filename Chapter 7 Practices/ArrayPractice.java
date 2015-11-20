import java.util.Arrays;

public class ArrayPractice
{
    public static void boundsException()
    {
        int[] values = {1, 4, 9, 16, 26};
        int x = values[4];
    }
    
    public static void fill()
    {
        int[] values = new int[100];
    
        for (int i = 0; i < values.length; i++)
        {
            values[i] = i * i;
        }
    
        System.out.println(values);
        System.out.println(Arrays.toString(values));
    }
    
    public static int findMax()
    {
        int[] values = {1, 4, 9, 16, 26};
        int largest = values[0];
        
        for (int currVal: values)
        {
            if(currVal > largest)
            {
                largest = currVal;
            }
        }
        
        return largest;
    }
    
}