package Character;

import Inventory.Inventory;

import java.util.Random;

public class Priest extends Char {
    Inventory inventory = new Inventory(10, 10);
    String weapon;

    public Priest(int healt, int mana, int healtPot, int manaPot) {
        super(healt, mana, healtPot, manaPot);
    }

    public int healing(int skillNo) {

        switch (skillNo) {

            case 1:
                System.out.println("Using GroupCompleteHealing Skill...");
                return 100;

            case 2:
                System.out.println("Using CompleteHealing Skill...");
                return 100;

            case 3:
                System.out.println("Using PastRecovery Skill...");
                return 500;

            default:
                System.out.println("Please choose attack number...");
                return 0;

        }

    }

    public void assignWeapon() {
        this.inventory.assignWeapon("Priest");
        String res = this.inventory.getWeapon();
        this.setWeapon(res);
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
