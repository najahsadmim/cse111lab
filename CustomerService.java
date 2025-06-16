
public class CustomerService {

    public String name;
    public int cap;
    public int count = 0;
    public int current = 0;
    public int head=0;
    public String customer[];

    public CustomerService(int cap) {
        this.cap = cap;
        customer = new String[cap];
    }

    public void serveCustomer() {
        if (count == 0) {
            System.out.println("No customers to serve");
        } else {
            System.out.println("Serving " + customer[head]);
            count--;
            head=(head+1)%cap;
        }
    }

    public void addCustomer(String name) {
        this.name = name;
        if (count < cap) {
            customer[current] = name;
            System.out.println("Added: " + name);
            count++;
            current=(current+1)%cap;
        } else {
            System.out.println("Queue is full. Cannot add " + name);
        }

    }
}
