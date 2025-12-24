public class Order {
    public String client;
    public String product;
    public double price;
    public String address;

    public Order(String cli, String prod, double pri, String addr ){
        client = cli;
        product = prod;
        price = pri;
        address = addr;
    }
}
