
public class Pokemon {

    public String name;
    public String attack;
    public int power;

    public Pokemon(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println(name + " attacks with a basic move!");
    }

    public void attack(String attack) {
        this.attack = attack;
        System.out.println(name + " uses " + attack + "!");
    }

    public void attack(String attack, int power) {
        this.attack = attack;
        this.power = power;
        System.out.println(name + " uses " + attack + " with power " + power + "!");
    }
}
