package Character;

import java.util.Random;

public class Assasian extends Char {

    Assasian (int healt, int mana, int healtPot, int manaPot) {
        super(healt, mana, healtPot, manaPot);
    }

    public int attack(int attackNo) {

            switch (attackNo) {

                case 1:
                    System.out.println("Using Spike Skill...");
                    return getDamage(600,400);

                case 2:
                    System.out.println("Using Thurst Skill...");
                    return getDamage(500,300);

                case 3:
                    System.out.println("Using Pierce Skill...");
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
}
