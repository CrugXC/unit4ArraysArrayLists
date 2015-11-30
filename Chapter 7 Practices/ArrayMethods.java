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
 
 public void replaceWithLargestNeighbor()
 {
     int temp;
     int previous = values[0];
     for(int i = 1;
         i < values.length - 1;
         i ++)
     {
         if(previous > values[i + 1])
         {
             temp = previous;
         }
         
         else
         {
            temp = values[i + 1]; 
         }
         
         
         previous = values[i];
         
         values[i] = temp;
     }
 }
 
 public void removeMiddle()
 {
     int currentIndex = 0;
     if(values.length % 2 == 0)
     {
         int[] newValues = new int[values.length - 2];
         
         for(int i = 0;
             i < values.length;
             i ++)
         {
             if(i != (values.length/2) || i != ((values.length/2) - 1))
             {
                 newValues[currentIndex] = values[i];
                 currentIndex++;
             }
         }
         values = newValues;
     }
     
     else
     {
         int[] newValues = new int[values.length - 1];
         
         for(int i = 0;
             i < values.length;
             i ++)
         {
             if(i != (int)(values.length/2))
             {
                 newValues[currentIndex] = values[i];
                 currentIndex++;
             }
         }
         values = newValues;
     }
 }
 
 public void evensFirst()
 {
     int[] newValues = new int[values.length];
     int currentIndex = 0;
     for(int i = 0;
         i < values.length;
         i ++)
     {
         if(values[i] % 2 == 0)
         {
             newValues[currentIndex] = values[i];
             currentIndex++;
         }
     }
     
     for(int i = 0;
         i < values.length;
         i ++)
     {
       if(values[i] % 2 != 0)
         {
             newValues[currentIndex] = values[i];
             currentIndex++;
         }  
     }
     
     values = newValues;
 }
 
 public void printArray()
 {
     for (int value: values) {System.out.println(value);}
 }
}