package ShoppingSim.CustomerThings;

public class CustomerFactory {
    private int count = 0;

    public Customer createCustomer() {
        return new Customer(count++);
    }

}
