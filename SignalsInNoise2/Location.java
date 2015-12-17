

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
     * xVel x velocity of the Monster
     * yVel y velocity of the Monster
     */
    int row;
    int col;
    int xVel;
    int yVel;
    
    public Location(int rowLoc, int colLoc, int xVelocity, int yVelocity)
    {
        row = rowLoc;
        col = colLoc;
        xVel = xVelocity;
        yVel = yVelocity;
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
    
    
    public void setXVel(int xVelocity)
    {
        xVel = xVelocity;
    }
    
    public void setYVel(int yVelocity)
    {
        yVel = yVelocity;
    } 
}
