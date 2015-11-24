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
    
    public void insert(int pos, int newValue)
    {
        if(currSize == values.length)
        {
            this.grow();
        }
        
        
    
        for(int i = currSize;
            i > pos;
            i--)
        {
            values[i] = values[i-1];
        }
            
        values[pos] = newValue;
        currSize++;
    }
    
    
    public void swap(int pos1, int pos2)
    {
        int temp = values[pos1];
        
        values[pos1] = values[pos2];
        values[pos2] = temp;
    }
    
    private void grow()
    {
        int[] newValues = new int[currSize * 2];
        
        for(int i = 0;
            i < currSize;
            i ++)
        {
            newValues[i] = values[i];
        }
        
        values = newValues;
    }
    
    public static void main(String[] args)
    {
        
    }
}






