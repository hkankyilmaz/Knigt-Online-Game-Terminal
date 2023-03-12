package Character;

import java.util.Random;

import Inventory.Inventory;

public class Assasian extends Char {

    Inventory inventory = new Inventory(10,10);
    String weapon;

    public Assasian(int healt, int mana, int healtPot, int manaPot) {
        super(healt, mana, healtPot, manaPot);
    }

    public int attack(int attackNo) {

        switch (attackNo) {

            case 1:
                System.out.println("Using Spike Skill...");
                return getDamage(600, 400);

            case 2:
                System.out.println("Using Thurst Skill...");
                return getDamage(500, 300);

            case 3:
                System.out.println("Using Pierce Skill...");
                return getDamage(400, 300);

            default:
                System.out.println("Please choose attack number...");
                return 0;

        }

    }

    public int getDamage(int high, int low) {

        Random r = new Random();
        int result = r.nextInt(high - low) + low;
        return result;
    }
    public void assignWeapon() {
      this.inventory.assignWeapon("Assasian");
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
