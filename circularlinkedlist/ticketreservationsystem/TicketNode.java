package circularlinkedlist.ticketreservationsystem;

public class TicketNode {
    private int ticketId;
    private String customerName;
    private String movieName;
    private int seatNumber;
    private String bookingTime;
    private TicketNode next;

    public TicketNode(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
    }

    @Override
    public String toString() {
        return "TicketNode{" +
                "ticketId=" + ticketId +
                ", customerName='" + customerName + '\'' +
                ", movieName='" + movieName + '\'' +
                ", seatNumber=" + seatNumber +
                ", bookingTime='" + bookingTime + '\'' +
                '}';
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    public TicketNode getNext() {
        return next;
    }

    public void setNext(TicketNode next) {
        this.next = next;
    }
}
