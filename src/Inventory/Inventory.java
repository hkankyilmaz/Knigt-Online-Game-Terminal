package Inventory;
import java.util.Scanner;
public class Inventory {

    int healtPot;
    int manaPot;
    String weapon;
    String[] assasianWeapon = {"Shard", "Mirage", "Dark Vane", "Flame Shard", "Sherenion"};
    String[] mageWeapon = {"Wood Staff", "Elexir Staff", "Salamander Staff"};
    String[] wariorWeapon = {"Raptor", "Blade Axe", "Giga"};
    String[] archerWeapon = {"Iron Bow", "Speacial Bow", "Flame Bow"};
    String[] priestWeapon = {"Defender of Lord", "Chitin Shield", "Power Defender"};

    Scanner input = new Scanner(System.in);

    public Inventory(int healtPot, int manaPot) {

        this.healtPot= healtPot;
        this.manaPot = manaPot;
    }


    public int useManaPot() {
        int res_ = this.healtPot - 1;
        setHealtPot(res_);
        return 30;


    }
    public int useHealtPot() {
        int res_ = this.manaPot - 1;
        setManaPot(res_);
        return 30;

    }

    public void assignWeapon (String character) {
        setWeapon(selectWeapon(character));
    }

    public String selectWeapon(String character) {

        if (character == "Assasian") {

            for (int i = 1; i <= assasianWeapon.length ; i++ ){
                System.out.println(i+" "+assasianWeapon[i-1]);

            }
            System.out.print("Plase choose Your Weapon... : ");
            int charSelect = input.nextInt();

            switch (charSelect) {
                case 1:
                    return assasianWeapon[0];

                case 2:
                    return assasianWeapon[1];

                case 3:
                    return assasianWeapon[2];

                case 4:
                    return assasianWeapon[3];

                case 5:
                    return assasianWeapon[4];
                default:
                    return "none";


            }
        } else if (character == "Warior") {
            for (int i = 1; i <= wariorWeapon.length ; i++ ){
                System.out.println(i+" "+wariorWeapon[i-1]);

            }
            System.out.print("Plase choose Your Weapon... : ");
            int charSelect = input.nextInt();

            switch (charSelect) {
                case 1:
                    return wariorWeapon[0];

                case 2:
                    return wariorWeapon[1];

                case 3:
                    return wariorWeapon[2];

                default:
                    return "none";


            }

        }else if (character == "Priest") {
            for (int i = 1; i <= priestWeapon.length ; i++ ){
                System.out.println(i+" "+priestWeapon[i-1]);

            }
            System.out.print("Plase choose Your Weapon... : ");
            int charSelect = input.nextInt();

            switch (charSelect) {
                case 1:
                    return priestWeapon[0];

                case 2:
                    return priestWeapon[1];

                case 3:
                    return priestWeapon[2];

                default:
                    return "none";


            }

        }else if (character == "Archer") {
            for (int i = 1; i <= archerWeapon.length ; i++ ){
                System.out.println(i+" "+archerWeapon[i-1]);

            }
            System.out.print("Plase choose Your Weapon... : ");
            int charSelect = input.nextInt();

            switch (charSelect) {
                case 1:
                    return archerWeapon[0];

                case 2:
                    return archerWeapon[1];

                case 3:
                    return archerWeapon[2];

                default:
                    return "none";


            }


        }else if (character == "Magician") {
            for (int i = 1; i <= mageWeapon.length ; i++ ){
                System.out.println(i+" "+mageWeapon[i-1]);

            }
            System.out.print("Plase choose Your Weapon... : ");
            int charSelect = input.nextInt();

            switch (charSelect) {
                case 1:
                    return mageWeapon[0];

                case 2:
                    return mageWeapon[1];

                case 3:
                    return mageWeapon[2];

                default:
                    return "none";


            }

        }else {
            return "none";
        }



    }



    // getler and setler


    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHealtPot() {
        return healtPot;
    }

    public int getManaPot() {
        return manaPot;
    }

    public String[] getAssasianWeapon() {
        return assasianWeapon;
    }

    public String[] getMageWeapon() {
        return mageWeapon;
    }

    public String[] getWariorWeapon() {
        return wariorWeapon;
    }

    public String[] getArcherWeapon() {
        return archerWeapon;
    }

    public String[] getPriestWeapon() {
        return priestWeapon;
    }

    public void setHealtPot(int healtPot) {
        this.healtPot = healtPot;
    }

    public void setManaPot(int manaPot) {
        this.manaPot = manaPot;
    }
}
