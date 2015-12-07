


public class Customer
{
    private String name;
    private double amount;

    public Customer(String customerName, double customerAmount)
    {
        name = customerName;
        amount = customerAmount;
    }
    
    public void changeName(String customerName)
    {
        name = customerName;
    }
    
    public void changeAmount(double customerAmount)
    {
        amount = customerAmount;
    }
    
    public String returnName()
    {
        return name;
    }
    
    public double returnAmount()
    {
        return amount;
    }
}
