public class Reader {
    private String firstName;
    private String lastName;
    private String ticketNumber;

    public Reader(String firstName, String lastName, String ticketNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ticketNumber = ticketNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", TicketNumber='" + ticketNumber + '\'' +
                '}';
    }
}
