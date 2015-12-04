


public class MedalCount
{
    final int COUNTRIES = 7;
    final int MEDALS = 3;
    
    int[][] counts = {
        {1, 0, 1} ,
        {2, 1, 4} ,
        {4, 1, 2} ,
        {4, 2, 1} ,
        {2, 4, 2} ,
        {7, 2, 5} ,
        {0, 4, 7} };
    public MedalCount()
    {
        //Alternate way
        //counts = new int[COUNTRIES][MEDALS];
    }
    
    public void printTable()
    {
        for (int row = 0;
             row < counts.length;
             row ++)
        {
            for (int col = 0;
                 col < counts[row].length;
                 col++)
            {
                System.out.print( counts[row][col] + "\t");
            }
            
            System.out.println();
        }
    }
    
    public int countMedals(int index)
    {
        int total = 0;
        
        for(int col = 0;
            col < counts[index].length;
            col ++)
        {
            total += counts[index][col];
        }
        
        return total;
    }
    
    public int countPerMedal(int index)
    {
        int total = 0;
        
        for(int row = 0;
            row < counts.length;
            row ++)
        {
            total += counts[row][index];
        }
        
        return total;
    }
}


