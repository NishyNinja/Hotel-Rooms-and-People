public class Main {
    
    public static void main(String[] args){
        Person Bob = new Person(5.0, 18, "Bob", "Black");
        Person Nishanth = new Person(6.0, 15, "Nishanth", "Black");

        HotelRoom room_one = new HotelRoom(1);
        HotelRoom room_two = new HotelRoom(2);

        room_one.checkIn(Bob);
        room_one.checkOut(Bob);

        room_two.checkIn(Nishanth);

        room_two.printGuestInfo();

        
    }
}
