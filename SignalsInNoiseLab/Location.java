

/**
 * Write a description of class Monster here.
 * 
 * @author Jay Rixie 
 * @version 12/15/15
 */
public class Location
{
    /**
     * row  the row coordinate of the Monster
     * col  the column coordinate of the Monster
     */
    int row;
    int col;
    
    public Location(int rowLoc, int colLoc)
    {
        row = rowLoc;
        col = colLoc;
    }
    
    /**
     * getRow   returns row value
     * @row     class's row variable
     */
    public int getX()
    {
        return row;
    }
    
    /**
     * getCol   returns col value
     * @col     class's col variable
     */
    public int getY()
    {
        return col;
    }
}
