
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();

        while (true) {
            System.out.print("?");
            String command = scan.nextLine();

            if (command.equals("Add")) {
                System.out.print("Name:");
                String name = scan.nextLine();
                System.out.print("Name in latin:");
                String lname = scan.nextLine();
                Bird bird = new Bird(name, lname);
                birds.add(bird);

            }
            else if (command.equals("Observation"))
            {
                System.out.print("Bird?");
                String name = scan.nextLine();
                if (!isAMember(name, birds)) {
                    System.out.println("Not a bird!");
                } else {
                    birds.forEach((bird) -> {

                        if (bird.getName().equals(name)) {
                            bird.addObservation();
                        }

                    });
                }

            } else if (command.equals("All")) {

                birds.forEach((bird) -> {

                    System.out.println(bird);
                }
                );

            } else if (command.equals("One")) {
                System.out.println("Bird? ");
                String name = scan.nextLine();
                
                 birds.forEach((bird) -> {

                        if (bird.getName().equals(name)) {
                            System.out.println(bird);
                        }

                    });

            } else if (command.equals("Quit")) {
                break;
            }

        }

    }

    public static boolean isAMember(String name, ArrayList<Bird> birds) {

        for (Bird b : birds) {
            if (b.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

}
