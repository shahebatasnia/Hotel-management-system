public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Sunrise Hotel");

        hotel.addRoom(new Room(101, "Single", 100));
        hotel.addRoom(new Room(102, "Double", 150));
        hotel.addRoom(new Room(103, "Suite", 300));

        Customer customer1 = new Customer("Alice", "alice@example.com", "0123456789");
        Receptionist receptionist = new Receptionist("Bob");

        receptionist.makeBooking(hotel, customer1, "Suite", 2);
        receptionist.makeBooking(hotel, customer1, "Suite", 1); // Should show no availability
    }
}
