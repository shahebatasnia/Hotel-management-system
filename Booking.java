public class Booking {
    private Customer customer;
    private Room room;
    private int nights;

    public Booking(Customer customer, Room room, int nights) {
        this.customer = customer;
        this.room = room;
        this.nights = nights;
        room.book();
    }

    public double getTotalCost() {
        return room.getPrice() * nights;
    }

    public void showBookingDetails() {
        System.out.println("Booking for: " + customer.getName());
        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Nights: " + nights);
        System.out.println("Total Cost: $" + getTotalCost());
    }
}
