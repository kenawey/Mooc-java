
import static java.lang.Math.abs;

public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.rooms > compared.rooms) {
            return true;
        } else if (this.rooms < compared.rooms) {
            return false;
        }
        if (this.squares > compared.squares) {
            return true;
        } else if (this.squares < compared.squares) {
            return false;
        }
        return false;

    }

    public int priceDifference(Apartment compared) {
        return abs((this.squares * this.princePerSquare) - (compared.squares * compared.princePerSquare));
    }

    public boolean moreExpensiveThan(Apartment compared) {

        return this.rooms * this.squares * this.princePerSquare > compared.rooms * compared.squares * compared.princePerSquare;
    }

}
