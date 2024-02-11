
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        int sum = 0;
        int count = 0, countP = 0;
        double avgPassing = 0.0;
        int gradeDist[] = {0, 0, 0, 0, 0, 0};
        while (true) {
            int grade = Integer.valueOf(scanner.nextLine());
            if (grade == -1) {
                break;
            } else if (grade < 100 && grade > -1) {

                sum += grade;
                count++;
                if (grade >= 50) {
                    avgPassing += grade;
                    countP++;
                }
                if (grade < 50) {
                    gradeDist[0]++;
                } else if (grade < 60) {
                    gradeDist[1]++;
                } else if (grade < 70) {
                    gradeDist[2]++;
                } else if (grade < 80) {
                    gradeDist[3]++;
                } else if (grade < 90) {
                    gradeDist[4]++;
                } else if (grade >= 90) {
                    gradeDist[5]++;
                }

            }

        }
        String result = countP == 0 ? "-" : String.valueOf(avgPassing / countP);
        
        System.out.println("Point average (all): " + sum / count * 1.0
                         + "\nPoint average (passing): " + result + 
                           "\nPass percentage: " + 100.0 * countP / count +
                           "\nGrade distribution:");
        

        for (int i = gradeDist.length - 1; i >= 0; i--) {
            System.out.println(i + ": " + "*".repeat(gradeDist[i]));

        }
    }
}
