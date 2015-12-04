import java.util.Scanner;


public class MagicSquares
{
    public static void main(String[] args)
    {
        int[][] matrix = new int[4][4];
        
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("You will be prompted to insert 16 integers.");
        
        int count = 1;
        
        for( int row = 0; row < matrix.length; row++)
        {
            for( int col = 0; col < matrix[row].length; col++)
            {
                System.out.print("Integer " + count++ + ": ");
                matrix[row][col] = s1.nextInt();
            }
        }
        
        boolean magicSquare = true;
        int total = 0;
        
        for( int row = 0; row < matrix.length && magicSquare != false; row++)
        {
            for( int col = 0; col < matrix[row].length; col++)
            {
                total += matrix[row][col];
            }
            
            if( total != 34)
            {
                magicSquare = false;
            }
            
            total = 0;
        }
        
        for( int col = 0; col < matrix[0].length && magicSquare != false; col++)
        {
            for( int row = 0; row < matrix.length; row++)
            {
                total += matrix[row][col];
            }
            
            if( total != 34)
            {
                magicSquare = false;
            }
            
            total = 0;
        }
        
        for( int i = 0; i < matrix.length; i ++)
        {
            total += matrix[i][i];
        }
        
        if( total != 34)
            {
                magicSquare = false;
            }
            
        total = 0;
        
        for( int i = 0; i < matrix.length; i ++)
        {
            total += matrix[i][(matrix.length - 1) - i];
        }
        
                    
        if( total != 34)
        {
            magicSquare = false;
        }
        
        total = 0;
        
        if( magicSquare == false)
        {
            System.out.println("Not a Magic Square.");
        }
        
        else
        {
            System.out.println("Magic Square.");
        }
    }
}
