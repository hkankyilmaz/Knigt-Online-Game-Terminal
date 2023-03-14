package Location;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class Location {
    Boolean isColonyZone;
    Boolean isMaradon;

    ColonyZone colonyZone;

    Scanner input = new Scanner(System.in);

    public Location(boolean isColonyZone, boolean isMaradon, int healt, int mana) {
        this.isColonyZone = isColonyZone;
        this.isMaradon = isMaradon;

    }

    public void whereIam() {
        Timer timer = new Timer();

        if (isMaradon) {
            System.out.println("You are in Maradon...");
            TimerTask t = new TimerTask() {
                @Override
                public void run() {

                    System.out.println("Your hp recovered....");

                }
            };
            timer.schedule(t, 1000);
            System.out.println("Plase choose What do you want...?");
            System.out.print("1-Stay here\n2-Go to Merchant and buy something\n3-Go to Colony Zone : ");
            int res = input.nextInt()
        } else if (isColonyZone) {
            System.out.println("You are in ColonyZone...");

        }

    }
}
