package Location;

import java.util.Timer;
import java.util.TimerTask;

public class Location {
    Boolean isColonyZone;
    Boolean isMaradon;
    int mana;
    int healt;
    ColonyZone colonyZone;
    public Maradon maradon = new Maradon(0,0);

    public Location(boolean isColonyZone, boolean isMaradon, int healt, int mana){
        this.isColonyZone= isColonyZone;
        this.isMaradon= isMaradon;
        this.mana = mana;
        this.healt = healt;
    }

    public void whereIam( ){
        Timer timer = new Timer();
        TimerTask t = new TimerTask() {
            @Override
            public void run() {
                if(isMaradon){
                    do {
                        if(mana <= 100) {
                            System.out.println("5 hp recovered....");
                          maradon.increaseHealt();
                        }else{

                        }
                    }while (!isColonyZone );

                }else if (isColonyZone){

                }
            }
        };
        timer.schedule(t,5000,5000);

    }
}
