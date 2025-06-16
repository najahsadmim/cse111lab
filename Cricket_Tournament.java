
public class Cricket_Tournament extends Tournament {

    public int players;
    public String type = "No Type";

    public Cricket_Tournament() {
    }

    public Cricket_Tournament(String name, int players, String type) {
        super(name);
        this.players = players;
        this.type = type;
    }

    public String detail() {
        return "Cricket Tournament Name: " + getName() + "\nNumber of Players: " + players + "\nType: " + type;
    }

}
