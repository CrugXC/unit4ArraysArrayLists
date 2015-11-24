


public class ArrayOperations
{
    public static void main(String[] args)
    {
        int[] values = {8, 4, 5, 21, 7, 9, 18, 2, 100};
        System.out.println("There are " + values.length + " elements in the Array.");
        System.out.println("Index 0: " + values[0]);
        System.out.println("Last Index: " + values[values.length - 1]);
        
        for(int value: values)
        {
            System.out.println("Value: " + value);
        }
        
        for(int i = 0;
            i < values.length;
            i ++)
        {
            System.out.println("Index " + i + ": " + values[i]);
        }
        
        for(int i = values.length - 1;
            i >= 0;
            i --)
        {
            System.out.println("Index " + i + ": " + values[i]);
        }
    }
    
}
