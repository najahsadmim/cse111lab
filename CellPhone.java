
public class CellPhone {

    public String model = "unknown";
    public int stored = 0;
    public String contacts[]  = new String[3];

    public void printDetails() {
        System.out.println("Phone Model " + model);
        System.out.println("Contacts Stored " + stored);
        if (stored >= 1) {
            System.out.println("Stored Contacts: ");
            for (int i=0; i<stored; i++){
                System.out.println(contacts[i]);
            }
        }
    }

    public void storeContact(String cont) {
        if (stored < contacts.length) {
            contacts[stored]=cont;
            System.out.println("Contact Stored");
            stored++;
        } else {
            System.out.println("Memory full. New contact can't be stored");
        }
    }
}
