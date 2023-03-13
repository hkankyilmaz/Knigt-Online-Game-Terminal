package Location;
import java.util.Timer;

public class Maradon {

    int healt;
    int mana;
    Maradon ( int healt, int mana) {
        this.mana = mana;
        this.healt=healt;
    }
    public void increaseHealt(){
        this.healt = healt + 5;
    }
    public void increaseMana(){
        this.mana = mana + 5;
    }
}
