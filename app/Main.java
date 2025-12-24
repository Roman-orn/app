public class Main {
    public static void main(String[] args){
        Order order1 = new Order("Alice", "smartphone", 305.99, "Moon Street, 10");
        Order order2 = new Order("Tom", "laptop", 570.95, "Terra Street, 17");

        Order[] orders = new Order[2];
        orders[0] = order1;
        orders[1] = order2;

        printOrder(orders);
    }

    static void printOrder(Order[] ord) {
        int count = 1;
        for(int i = 0; i < ord.length; i++){
            System.out.println("Order No " + count);
            System.out.println("Client: " + ord[i].client);
            System.out.println("Product: " + ord[i].product);
            System.out.println("Price : " + ord[i].price + " EUR");
            System.out.println("Address: " + ord[i].address);
            System.out.println("-----------------------------");
            count++;
        }
    }
}
