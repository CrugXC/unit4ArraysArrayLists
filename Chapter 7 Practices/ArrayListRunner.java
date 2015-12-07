import java.util.ArrayList;

public class ArrayListRunner
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>(8);
       System.out.println(names);
       
       names.add("Alice");
       names.add("Bob");
       names.add("Connie");
       names.add("David");
       names.add("Edward");
       names.add("Fran");
       names.add("Gomez");
       names.add("Harry");
       
       System.out.println(names);
       
       System.out.println(names.get(0));
       System.out.println(names.get(names.size() - 1));
       
       System.out.println(names.size());
       
       names.set(0, "Alice B. Toklas");
       System.out.println(names);
       
       names.add(4, "Doug");
       
       for (String name: names)
       {
           System.out.println(name);
       }
       
       
       ArrayList<String> names2 = new ArrayList<String>(8);
       for (String name: names)
       {
           names2.add(name);
       }
       
       names.remove(0);
       
       System.out.println(names);
       System.out.println(names2);
       
       if( names.indexOf("Alice B. Toklas") == -1 && names2.indexOf("Alice B. Toklas") != -1)
       {
           System.out.println("Alice B. Toklas removed from names list, still present in names2 list.");
       }
   }
} 