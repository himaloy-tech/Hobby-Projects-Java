import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        // Rock, Paper, Scissor Game
        // 1 = Rock
        // 2 = Scissor
        // 3 = Paper
        System.out.println("Welcome");
        int i = 0;
        int computer_point = 0;
        int user_point = 0;
        while (i != 5){
            System.out.println("Type Rock or Paper or Scissor: ");
            Scanner user = new Scanner(System.in);
            String choice = user.nextLine();
            Random no = new Random();
            int number = no.nextInt(4);
            if (number == 0){
                number++;
            }
            if (choice.equals("Rock") || choice.startsWith("R") || choice.startsWith("r")){
                if (number == 2){
                    System.out.println("You got 1 point\n");
                    System.out.println("Computer Point: "+computer_point);
                    user_point++;
                    System.out.println("Your Point: "+user_point);
                    System.out.println(" ");
                    i++;
                }
                else {
                    System.out.println("Computer got 1 point\n");
                    computer_point++;
                    System.out.println("Computer Point: "+computer_point);
                    System.out.println("Your Point: "+user_point);
                    System.out.println(" ");
                    i++;
                }
            }
            else if (choice.equals("Paper") || choice.startsWith("P") || choice.startsWith("p")){
                if (number == 1){
                    System.out.println("You got 1 point\n");
                    System.out.println("Computer Point: "+computer_point);
                    user_point++;
                    System.out.println("Your Point: "+user_point);
                    System.out.println(" ");
                    i++;
                }
                else {
                    System.out.println("Computer got 1 point\n");
                    computer_point++;
                    System.out.println("Computer Point: "+computer_point);
                    System.out.println("Your Point: "+user_point);
                    System.out.println(" ");
                    i++;
                }
            }
            else if (choice.equals("Scissor") || choice.startsWith("S") || choice.startsWith("s")){
                if(number == 3){
                    System.out.println("You got 1 point\n");
                    System.out.println("Computer Point: "+computer_point);
                    user_point++;
                    System.out.println("Your Point: "+user_point);
                    System.out.println(" ");
                    i++;
                }
                else {
                    System.out.println("Computer got 1 point\n");
                    computer_point++;
                    System.out.println("Computer Point: "+computer_point);
                    System.out.println("Your Point: "+user_point);
                    System.out.println(" ");
                    i++;
                }
            }
            else {
                System.out.println("Invalid input");
            }
        }
        if (computer_point > user_point){
            System.out.println("Computer Won");
        }
        else {
            System.out.println("You Won!!!!");
        }
    }
}