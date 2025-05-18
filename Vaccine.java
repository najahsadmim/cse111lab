
public class Vaccine {

    private String name;
    private int days;
    private String origin;

    public Vaccine(String name, String origin, int days) {
        this.name = name;
        this.origin = origin;
        this.days = days;
    }
    public String getName(){
        return name;
    }
    public int getDays(){
        return days;
    }
}
