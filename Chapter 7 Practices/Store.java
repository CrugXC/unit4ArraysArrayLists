import java.util.Scanner;


public class Store
{
    public static void main(String[] args)
    {
       System.out.println("Enter End for Customer Name to end program.");
       
       String name;
       double amount;
       TopCustomers topCust = new TopCustomers();
       Scanner s1 = new Scanner(System.in);
       
       do
       {
           System.out.print("Input customer name: ");
           
           name = s1.next();
           
           if ((name.equals("End") || name.equals("end")) == false)
           {
               System.out.print("Input amount: ");
               
               amount = s1.nextDouble();
               
               topCust.addSale(name, amount);
           }
        } while((name.equals("End") || name.equals("end")) == false);
       
       System.out.println("The top customer is " + topCust.nameOfBestCustomer() + "!");
    }
}
