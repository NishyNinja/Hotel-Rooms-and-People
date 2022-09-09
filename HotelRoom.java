public class HotelRoom {
    int roomNumber;
    int guest_total = 0;
    Person guestOne;
    Person guestTwo;

    HotelRoom(int roomNum){
        roomNumber = roomNum;

    }

    void checkIn(Person guest){  
        if(guestOne == null){
            guestOne = guest;
            System.out.println(guestOne.name + " has checked into Room 1");
            guest_total++;
        }
            
        else {
                
            if(guestTwo == null){
                guestTwo = guest;
                System.out.println(guestTwo.name + " has checked into Room 2");
                guest_total++;
            }
                
            else {
                System.out.print("The Hotel is Full");
            }
        }
    }

    void checkOut(Person guest){
        if(guest == guestOne){
            System.out.println(guestOne.name + " has checked out");
            guestOne = null;
            guest_total--;
        }

        else {
            if(guest == guestTwo){
                System.out.println(guestTwo.name + " has checked out");
                guestTwo = null;
                guest_total--;
            }
            
            else {
                System.out.print("This person never checked into the hotel!");
            }
        }

    }

    int checkCapacity(){
        return guest_total;
    }

    void printGuestInfo(){
        if(guestOne != null){
            System.out.println("Guest One Info");
            System.out.println("__________________");
            System.out.println("Height: " + guestOne.height);
            System.out.println("Age: " + guestOne.age);
            System.out.println("Name: " + guestOne.name);
            System.out.println("Color: " + guestOne.hairColor);
        }
        else{
            System.out.println("No Guest is in Room 1");
        }

        if(guestTwo != null){
            System.out.println("Guest Two Info");
            System.out.println("__________________");
            System.out.println("Height: " + guestTwo.height);
            System.out.println("Age: " + guestTwo.age);
            System.out.println("Name: " + guestTwo.name);
            System.out.println("Color: " + guestTwo.hairColor);
        }
        else{
            System.out.println("No Guest is in Room 2");
        }
    }

}
