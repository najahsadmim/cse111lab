
public class TaxiLagbe {

    public String taxinum;
    public String region;
    public int psg = 0;
    public String psglist[] = new String[4];
    public int fare = 0;

    public void storeInfo(String taxinum, String region) {
        this.taxinum = taxinum;
        this.region = region;
    }

    public void printDetails() {
        System.out.println("Taxi number: " + taxinum);
        System.out.println("This taxi can cover  " + region+" area");
        System.out.println("Total Passenger: " + psg);
        System.out.println("Passenger list: ");
        for (int i = 0; i < psg; i++) {
            System.out.println(psglist[i]+" ");
        }
        System.out.println("Total collected fare: " + fare);
    }

    public void addPassenger(String name, int fare) {
        if (psg < 4) {
            System.out.println("Dear " + name + "! " + " Welcome to TaxiLagbe");
            psglist[psg]=name;
            psg++;
            this.fare += fare;
        } else {
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }

    public void addPassenger(String n1, int f1, String n2, int f2) {
        if ((psg + 2) <= 4) {
            System.out.println("Dear " + n1 + "! " + " Welcome to TaxiLagbe");
            psglist[psg]=n1;
            psg++;
            System.out.println("Dear " + n2 + "! " + " Welcome to TaxiLagbe");
            psglist[psg]=n2;
            psg++;
            fare += f1 + f2;
        } 
        else if ((psg + 1) == 4 && (psg + 2) > 4) {
            System.out.println("Dear " + n1 + "! " + " Welcome to TaxiLagbe");
            psglist[psg]=n1;
            psg++;
            System.out.println("Taxi Full! No more passengers can be added");
            fare += f1;
        } else {
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }
}
