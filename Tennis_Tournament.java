
public class Tennis_Tournament extends Tournament {

    public int players;

    public Tennis_Tournament(String name, int players) {
        super(name);
        this.players = players;
    }

    public String detail() {
        return "Tennis Tournament Name: " + getName() + "\nNumber of Players: " + players;
    }

}
