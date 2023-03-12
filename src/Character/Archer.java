package Character;
import Inventory.Inventory;
import java.util.Random;

public class Archer extends Char {
    Inventory inventory = new Inventory(10,10);
    String weapon;

    public Archer(int healt, int mana, int healtPot, int manaPot) {
        super(healt, mana, healtPot, manaPot);
    }

    public int attack(int attackNo) {

        switch (attackNo) {

            case 1:
                System.out.println("Using PowerShot Skill...");
                return getDamage(600,400);

            case 2:
                System.out.println("Using DarkPursuer Skill...");
                return getDamage(500,300);

            case 3:
                System.out.println("Using BlindingStrafe Skill...");
                return getDamage(400,300);

            default:
                System.out.println("Please choose attack number...");
                return 0;

        }

    }

    public int getDamage (int high, int low) {

        Random r = new Random();
        int result = r.nextInt(high-low) + low;
        return  result;
    }

    public void assignWeapon() {
        this.inventory.assignWeapon("Archer");
        String res = this.inventory.getWeapon();
        this.setWeapon(res);
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }
}
