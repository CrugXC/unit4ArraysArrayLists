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
     int lastVal1 = 0;
     int lastVal2 = 0;
     boolean switchVar = true;
     for (int value = 0;
          value < values.length ;
          value ++)
     {
         if(value != 0)
         {
             if(switchVar == true)
             {
                 lastVal2 = values[value];
                 values[value] = lastVal1;
                 switchVar = false;
             }
             
             else
             {
                 lastVal1 = values[value];
                 values[value] = lastVal2;
                 switchVar = true;
             }

         }
         else
         {
             lastVal1 = values[0];
             values[0] = values[values.length - 1];
         }
     }
     
     
     
     for(int value: values)
     {
         System.out.println(value);
     }
 }
 
 public void replaceEvens()
 {
     for(int i = 0;
         i < values.length;
         i ++)
     {
         if(i % 2 == 0)
         {
             values[i] = 0;
         }
     }
 }
 public void printArray()
 {
     for (int value: values) {System.out.println(value);}
 }
}