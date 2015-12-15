

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests two Monster Locations set by test class
 * 
 * @author Jay Rixie
 * @version December 14th, 2015
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     * Creates Monster at coordinates 50,50 and checks to see if its there
     */
    
    @Test
    public void test1()
    {
        Radar r1 = new Radar(100,100,50,50); 
        
        for(int i = 0; i < 500; i++)
        {
            r1.scan();
        }
        
        assertEquals(500, r1.getAccumulatedDetection(50,50));
    }
    
    @Test
    public void test2()
    {
        Radar r1 = new Radar(100,100,75,75); 
        
        for(int i = 0; i < 500; i++)
        {
            r1.scan();
        }
        
        assertEquals(500, r1.getAccumulatedDetection(75,75));
    }
}
