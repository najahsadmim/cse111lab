
public class Player extends SportsPerson {

    public int goal;
    public int matches;
    public double ratio;

    public Player(String team, String name, String role, int goal, int matches) {
        super(team, name, role);
        this.goal = goal;
        this.matches = matches;
    }

    public void calculateRatio() {
        if (matches > 0) {
            ratio = (double) goal / matches;
        } else {
            ratio=0.0;
        }
        earningPerMatch = (goal * 1000) + (matches * 10);
    }

    public void printDetails() {
        System.out.println(getNameTeam());
        System.out.println("Team Role: " + role);
        System.out.println("Total Goal: " + goal + ", Total Played: " + matches);
        System.out.println("Goal Ratio: " + ratio);
        System.out.println("Match Earning: " + (int)earningPerMatch + "K");
    }
}

