package Character;

import java.util.Random;

public class Priest extends Char {

    Priest (int healt, int mana, int healtPot, int manaPot) {
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


}
