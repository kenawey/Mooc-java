
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        int number = Integer.parseInt(scanner.nextLine());
        int i=0;
        Random random=new Random();
        while(i<number){
            System.out.println(random.nextInt(11));
        i++;
        }
    }

}
