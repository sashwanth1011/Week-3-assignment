class HallTicket {
    String studentName;
    int seatNumber;

    public HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }

    public static void main(String[] args) {
        // Step 1: Create original object
        HallTicket priya = new HallTicket("Priya", 0);

        // Step 2: Reference copy
        HallTicket copy = priya;

        // Step 3: Change field through the second variable
        copy.seatNumber = 45;

        // Step 4: Print field value via first variable and test reference identity
        System.out.println("Priya's seatNumber (via first variable): " + priya.seatNumber);
        System.out.println("copy == priya: " + (copy == priya));

        // Step 5: Create third separate object with identical values
        HallTicket separate = new HallTicket("Priya", 45);
        System.out.println("separate == priya: " + (separate == priya));
    }
}