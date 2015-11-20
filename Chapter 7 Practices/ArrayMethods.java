public class ArrayMethods
{
 private int[] values = {1, 2, 3, 4, 5};
 public ArrayMethods()
 {
 }

 public void swapFirstAndLast()
 {
     int value1 = values[0];
     
     values[0] = values[values.length - 1];
     
     values[values.length - 1] = value1;
 }
 
 
 public void shiftRight()
 {
     int lastVal = values[values.length - 1];
     for (int value = 1;
          value < values.length + 1;
          value ++)
     {
         
     }
 }
 
 
 public void printArray()
 {
     for (int value: values) {System.out.println(value);}
 }
}