public class Prediction
{
    Location loc;
    boolean[][] grid;
    Radar r1 =;
    public Prediction(Location l1)
    {
        loc = l1;
        grid = r1.getGrid();
    }
    
    public Location calculate()
    {
        int newX;
        int newY;
        int xVel;
        int yVel;
        if(loc.getX() + vel.getX() > grid.getMaxX())
        {
            newX = 100 - ((loc.getX() + loc.getXVel()) - 100);
            xVel = -loc.getXVel;
        }
        
        else if(loc.getX() + vel.getX() < 0)
        {
            newX = Math.abs(loc.getX() + loc.getXVel());
            xVel = -loc.getXVel;
        }
        
        else
        {
            newX = loc.getX() + vel.getX();
        }
        
        if(loc.getY() + vel.getY() > grid.getMaxY())
        {
            newY = 100 - ((loc.getY() + loc.getYVel()) % 100);
            yVel = -loc.getYVel;
        }
        
        else if(loc.getY() + vel.getY() < 0)
        {
            newY = Math.abs(loc.getY() + loc.getYVel());
            yVel = -loc.getYVel;
        }
        
        else
        {
            newY = loc.getY() + vel.getY();
        }
        
        return new Location(newX, newY);
    }


}