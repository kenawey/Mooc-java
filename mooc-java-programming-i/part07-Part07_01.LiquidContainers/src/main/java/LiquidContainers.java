
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;
        outterloop:
        while (true) {

            System.out.println("First: " + firstContainer + "/" + 100);
            System.out.println("Second: " + secondContainer + "/" + 100);
            String primitiveComand = scan.nextLine();
            String[] parts = primitiveComand.split(" ");

            String command = parts[0];
            switch (command) {
                case "add":

                    int amount = Integer.valueOf(parts[1]);
                    if (amount > 0) {

                        int avaliable = 100 - firstContainer;
                        if (amount < avaliable) {
                            firstContainer += amount;
                        } else {
                            firstContainer = 100;
                        }

                    }

                    break;

                case "move":
                    int moveAmount;
                    moveAmount = Integer.valueOf(parts[1]);
                    if (moveAmount > 0 && firstContainer > 0)
                    {
//                           secondContainer= secondContainer+moveAmount;
                        int old = (firstContainer < moveAmount) ? firstContainer : moveAmount;

                        firstContainer = firstContainer - moveAmount < 0 ? 0 : firstContainer - moveAmount;
                        int avaliable = 100 - secondContainer;
                        secondContainer = avaliable - moveAmount >= 0 && avaliable - moveAmount <= 100 ? secondContainer + old : 100;

                    } else
                    {
                        if (moveAmount > 0) {

                            secondContainer += moveAmount > firstContainer ? firstContainer : moveAmount;
                            firstContainer = firstContainer - moveAmount <= 0 ? 0 : firstContainer - moveAmount;

                        }
                    }

                    break;

                case "quit":
                    break outterloop;

                case "remove":

                    int removeAmount;
                    removeAmount = Integer.valueOf(parts[1]);

                    if (removeAmount > 0) {

                        secondContainer -= removeAmount > secondContainer || removeAmount > 100 ? secondContainer : removeAmount;
//                            firstContainer = firstContainer - removeAmount <= 0 ? 0 : firstContainer - removeAmount;

                    }

                    break;

            }

        }
    }

}
