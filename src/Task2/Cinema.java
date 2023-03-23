package Task2;

public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats];
        for(int x = 0; x < rows; ++x){
            for(int y = 0; y < seats; ++y){
                this.seats[x][y] = "O";
            }
        }
    }

    public int getRows() {
        return seats.length;
    }

    public int getSeats() {
        return seats[0].length;
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {
        if (this.seats[row-1][seat-1].equals("O")) {
            this.seats[row-1][seat-1] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        if (seats[row-1][seat-1].equals("x")) {
            seats[row-1][seat-1] = "O";
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String[] seat : seats) {
            result.append("|");
            for (String s : seat) {
                result.append(s).append("|");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
