

public class PartialArray
{
    private int[] values;
    private int currSize;
    
    public PartialArray()
    {
        values = new int[100];
        
        for (currSize = 0;
             currSize < 20;
             currSize ++)
        {
            values[currSize] = currSize * currSize;
        }
    }
    
    public void remove(int pos)
    {
        for(int i = pos + 1;
            i < currSize;
            i ++)
        {
            values[i - 1] = values[i];
        }
        
        currSize --;
    }
}
