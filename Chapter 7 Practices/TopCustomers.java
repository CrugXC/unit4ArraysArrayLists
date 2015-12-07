import java.util.ArrayList;

public class TopCustomers
{
    private ArrayList<Customer> customerList;
    public TopCustomers()
    {
        customerList = new ArrayList<Customer>();
    }
    
    public void addSale(String customerName, double customerAmount)
    {
        customerList.add(new Customer(customerName, customerAmount));
    }
    
    public String nameOfBestCustomer()
    {
        Customer topCustomer = new Customer("", 0);
        for( Customer currCustomer: customerList)
        {
            if( topCustomer.returnAmount() < currCustomer.returnAmount())
            {
                topCustomer.changeName(currCustomer.returnName());
                topCustomer.changeAmount(currCustomer.returnAmount());
            }
        }
        
        return topCustomer.returnName();
    }
    
    
}
