    import java.util.Scanner;
    public class Game {

        String nickName;
        public void start(){

            Scanner input = new Scanner(System.in);

            System.out.println("Welcome to Knight-Online Terminal...!");
            System.out.print("Please Character Nickname... : ");
            nickName = input.nextLine();
            System.out.println("Welcome to Knight-Online Terminal " + nickName);



        }
    }
