import java.util.Random;
import java.util.Scanner;

public class Task8DieRoller {
    static void main() {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int die1;
        int die2;
        int die3;
        int sum;
        int rollCounter = 0;
        boolean done = false;
        String continueYN = "";
        System.out.println("Roll\tDie1\tDie2\tDie3\tSum");
        System.out.println("-----------------------------------");
        do {
            rollCounter++;
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            die3 = rnd.nextInt(6) + 1;
            sum = die1 + die2 + die3;
            System.out.printf("%-8d%-8d%-8d%-8d%-8d\n", rollCounter, die1, die2, die3, sum);
            if (die1 == die2 && die2 == die3) {
                done = true;
            } else {
                System.out.print("\t\t\t\t\t\t\t\t\t\tWould you like to roll again? [YN]: ");
                continueYN = in.nextLine();
            }
        } while (!done&& continueYN.equalsIgnoreCase("Y"));
    }
}
