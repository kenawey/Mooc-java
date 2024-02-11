
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonalDetails {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        List<Integer> ages = new ArrayList<>();
        List<String> names = new ArrayList<>();
        
        while (!answer.isEmpty()) {
            String[] myStrings = answer.split(",");
            int age = Integer.valueOf(myStrings[1]);
            ages.add(age);
            names.add(myStrings[0]);
            answer = scanner.nextLine();
        }
        if (ages.size() > 0) {
            System.out.println("Longest name: " + names.get(largestNameLenth(names)));
            
            System.out.println("Average of the birth years: " + avg(ages));
            
        }
        
    }
    
    public static int largestNameLenth(List<String> l) {
        int max = 0;
        for (int i = 1; i < l.size(); i++) {
            if (l.get(i).length() > l.get(max).length()) {
                max = i;
            }
        }
        return max;
    }
    
    public static double avg(List<Integer> l) {
        int sum = 0;
        for (int i = 0; i < l.size(); i++) {
            sum += l.get(i);
        }
        return sum * 1.0 / l.size();
    }
    
}
