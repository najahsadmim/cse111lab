
public class Character {

    public String name;
    public int level;

    public Character(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void specialMove() {
        System.out.println("Character uses a generic move.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Character) || obj == null) {
            return false;
        }
        Character new_char=(Character) obj;

        if (name==new_char.name){
            if (level==new_char.level){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }

    }
}
