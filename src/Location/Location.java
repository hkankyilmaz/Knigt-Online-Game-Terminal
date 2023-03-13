package Location;

public class Location {
    Boolean isColonyZone;
    Boolean isMaradon;
    ColonyZone colonyZone;
    Maradon maradon;

    Location (boolean isColonyZone, boolean isMaradon){
        this.isColonyZone= isColonyZone;
        this.isMaradon= isMaradon;
    }

    public void whereIam(){
        if(isColonyZone){

        }else if (isMaradon){

        }
    }
}
