
public class StarSign {
    
    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }
    
    public static void printStars(int number) {
        // first part of the exercise
        
        while (number >= 1) {
            System.out.print("*");
            number--;
        }
        System.out.println();
    }
    
    public static void printSquare(int size) {
        // second part of the exercise
        String r = "*".repeat(size);
        while (size >= 1) {
            System.out.println(r);
            size--;
        }
    }
    
    public static void printRectangle(int width, int height) {
        // third part of the exercise
        while (height >= 1) {
            int w = width;
            while (w >= 1) {
                System.out.print("*");
                w--;
            }
            System.out.println();
            height--;
        }
    }
    
    public static void printTriangle(int size) {
        // fourth part of the exercise
        int i = 1;
        while (i <= size) {
            int c = 0;
            while (c < i) {
                
                System.out.print("*");
                c++;
            }
            System.out.println();
            i++;
        }
        
    }
}
