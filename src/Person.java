public class Person {
    private String name;
    private String surname;
    private int ticketCounts;

    public Person(String name, String surname, int ticketCounts) {
        this.name = name;
        this.surname = surname;
        this.ticketCounts = ticketCounts;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }

    public boolean noTickets() {
        if (this.ticketCounts <= 0) {
            this.ticketCounts = 0;
            return true;
        } else {
            return false;
        }
    }

    public void decTicket() {
        if (!noTickets()) {
            --this.ticketCounts;
        }
    }
}
