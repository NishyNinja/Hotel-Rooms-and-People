public class Main {
    
    public static void main(String[] args){
        Person Bob = new Person(5.0, 18, "Bob", "Black");
        HotelRoom room_one = new HotelRoom(1);
        room_one.checkIn(Bob);
    }
}
