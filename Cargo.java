
public class Cargo {

    public static double cap = 10.0;
    public int id;
    public static int cargoid=1;
    public String content;
    public double weight;
    public boolean isload = false;

    public Cargo() {
    }

    public Cargo(String content, double weight) {
        this.content = content;
        this.weight = weight;
        id=cargoid++;
    }

    public static double capacity() {
        return cap;
    }

    public void details() {
        System.out.println("Cargo ID: " + id + ", Contents: " + content + ", Weight: " + weight + ", Loaded: " + isload);
    }

    public void load() {
        if (weight>cap){
            isload=false;
        }
        else{
            isload = true;
            cap-=weight;
        }
        if (isload){
            System.out.println("Cargo " + id + " loaded for transport.");
        }
        else{
            System.out.println("Cannot load cargo, exceeds weight capacity.");
        }
    }

    public void unload() {
        if (isload){
            isload=false;
            cap+=weight;
            System.out.println("Cargo " + id + " unloaded.");
        }
    }
}
