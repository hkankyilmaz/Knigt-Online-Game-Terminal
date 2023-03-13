package Character;
import Location.Location;
public abstract class Char {
    String nickName;
    int healt =100;
    int mana = 100;
    int healtPot=5;
    int manaPot=5;
    Location location;

    Char (int healt,int mana,int healtPot,int manaPot) {
        this.healt = healt;
        this.mana = mana;
        this.healtPot= healtPot;
        this.manaPot = manaPot;
    }



    public String getNickName() {
        return nickName;
    }

    public int getHealt() {
        return healt;
    }

    public int getMana() {
        return mana;
    }

    public int getHealtPot() {
        return healtPot;
    }

    public int getManaPot() {
        return manaPot;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setHealt(int healt) {
        this.healt = healt;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setHealtPot(int healtPot) {
        this.healtPot = healtPot;
    }

    public void setManaPot(int manaPot) {
        this.manaPot = manaPot;
    }
}
