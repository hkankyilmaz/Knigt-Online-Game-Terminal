package Player;
import Character.Assasian;
import Character.Archer;
import Character.Warior;
import Character.Magician;
import Character.Priest;

public class Player {
    public Assasian assasianPlayer;
    public Archer archerPlayer;
    public Priest priestPlayer;
    public Warior wariorPlayer;
    public Magician magicianPlayer;

    public Player (String character) {
        if (character.equals("Assasian")) {
            this.assasianPlayer = new Assasian(100,100,5,5);
        }else if (character.equals("Archer")) {
            this.archerPlayer = new Archer(100,100,5,5);
        }else if (character.equals("Warior")) {
            this.wariorPlayer = new Warior(100,100,5,5);
        }else if (character.equals("Magician")) {
            this.magicianPlayer = new Magician(100,100,5,5);
        }else if (character.equals("Priest")) {
            this.priestPlayer = new Priest(100,100,5,5);
        }
    }

}
