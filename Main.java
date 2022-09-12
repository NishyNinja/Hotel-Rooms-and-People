public class Main {
    
    public static void main(String[] args){
        //Making people with the person class. Assigned values of height, age, name, and hair color
        Person Bob = new Person(5.0, 18, "Bob", "Black");
        Person Nishanth = new Person(6.0, 15, "Nishanth", "Black");

        //Making a hotel room with a roomNum
        HotelRoom room_one = new HotelRoom(1);
        HotelRoom room_two = new HotelRoom(2);

        room_one.checkIn(Bob);
        room_one.checkOut(Bob);

        room_two.checkIn(Nishanth);

        room_two.printGuestInfo();

        
    }
}
