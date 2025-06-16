
public class BracuBus {

    public String area;
    public int psg;
    public BracuStudent psngr[];
    public int count = 0;

    public BracuBus(String area) {
        this.area = area;
        psg=2;
        psngr=new BracuStudent[2];
    }

    public BracuBus(String area, int psg) {
        this.area = area;
        this.psg = psg;
        psngr=new BracuStudent[psg];
    }

    public void showDetails() {
        System.out.println("Bus Route: " + area);
        System.out.println("Passenger Count: " + count + " (Max: " + psg + ")");
        System.out.println("Passengers on Board: ");
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                System.out.print(psngr[i].name + " ");
            }
        }
    }

    public void board(){
        System.out.println("No passengers");
    }

    public void board(BracuStudent s) {
        if (s.havepass==true) {
            if (count < psg) {
                if (s.area == this.area) {
                    psngr[count] = s;
                    count++;
                    System.out.println(s.name + " boarded the bus.");
                } else {
                    System.out.println("You got on the wrong bus!");
                }
            } else {
                System.out.println("Bus is full!");
            }
        } else {
            System.out.println("You don't have a bus pass!");
        }
    }

    public void board(BracuStudent s1, BracuStudent s2) {
        board(s1);
        if (count<psg){
            board(s2);
        }
    }

}
