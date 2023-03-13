import java.util.Scanner;
import Inventory.Inventory;
import Player.Player;
import Location.Location;
public class Game {
    String nickName;
    Scanner input = new Scanner(System.in);

    public void start() {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Knight-Online Terminal...!");
        System.out.print("Please Enter the Character Nickname... : ");
        nickName = input.nextLine();
        System.out.println("Welcome to Knight-Online Terminal " + nickName);
        String job = selectCharacter();
        Player player = new Player(job);

        if (job.equals("Assasian")) {
            player.assasianPlayer.assignWeapon();
        } else if (job.equals("Warior")) {
            player.wariorPlayer.assignWeapon();
        } else if (job.equals("Priest")) {
            player.priestPlayer.assignWeapon();
        } else if (job.equals("Archer")) {
            player.archerPlayer.assignWeapon();
        } else if (job.equals("Magician")) {
            player.magicianPlayer.assignWeapon();
        }

        player.location.whereIam();




    }

    public String selectCharacter() {
        System.out.println("1-Assasian\n2-Warior\n3-Magician\n4-Archer\n5-Priest");
        System.out.print("Plase choose Your Character... : ");
        int charSelect = input.nextInt();

        switch (charSelect) {
            case 1:
                return "Assasian";

            case 2:
                return "Warior";

            case 3:
                return "Magician";

            case 4:
                return "Archer";

            case 5:
                return "Priest";
            default:
                return "none";

        }
    }

}
