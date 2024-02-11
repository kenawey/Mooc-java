
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();
        outterloop:
        while (true) {

            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            String primitiveComand = scan.nextLine();
            String[] parts = primitiveComand.split(" ");

            String command = parts[0];
            switch (command) {
                case "add":
                    firstContainer.add(Integer.valueOf(parts[1]));
                    break;

                case "move":
                    int moveAmount;
                    moveAmount = Integer.valueOf(parts[1]);
                    if (moveAmount > 0 && firstContainer.contains() > 0) {
//                           secondContainer= secondContainer+moveAmount;
                        int old = (firstContainer.contains() < moveAmount) ? firstContainer.contains() : moveAmount;

                        if (firstContainer.contains() - moveAmount < 0) {
                            firstContainer = new Container();
                        } else {
                            firstContainer.remove(moveAmount);
                        }
                        int avaliable = 100 - secondContainer.contains();
                        if (avaliable - moveAmount >= 0 && avaliable - moveAmount <= 100) {
                            secondContainer.add(old);
                        } else {
                            secondContainer = new Container();
                            secondContainer.add(100);
                        }

                    } else {
                        if (moveAmount > 0) {

                            if (moveAmount > firstContainer.contains()) {
                                secondContainer.add(firstContainer.contains());
                            } else {
                                secondContainer.add(moveAmount);
                            }

                            if (firstContainer.contains() - moveAmount <= 0) {
                                firstContainer = new Container();
                            } else {
                                firstContainer.remove(moveAmount);
                            }

                        }
                    }

                    break;

                case "quit":
                    break outterloop;

                case "remove":
                    secondContainer.remove(Integer.valueOf(parts[1]));

                    break;

            }

        }
    }
}
