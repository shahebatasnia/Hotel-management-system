public class Receptionist {
    private String name;

    public Receptionist(String name) {
        this.name = name;
    }

    public void makeBooking(Hotel hotel, Customer customer, String roomType, int nights) {
        Room room = hotel.findAvailableRoom(roomType);
        if (room != null) {
            Booking booking = new Booking(customer, room, nights);
            hotel.addBooking(booking);
            System.out.println("Booking successful!");
            booking.showBookingDetails();
        } else {
            System.out.println("No available " + roomType + " rooms.");
        }
    }
}
