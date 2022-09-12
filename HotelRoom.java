public class HotelRoom {
    int roomNumber;
    int guest_total = 0;
    Person guestOne;
    Person guestTwo;

    //Creating a constructor HotelRoom and Assign a room number to a room
    HotelRoom(int roomNum){
        roomNumber = roomNum;

    }

    //guest is the person that wants to check in. If guestOne, which represents, room 1, is empty, then check guest into room 1 and add one to the total people.
    //Check the same for guestTwo and if it is open, then check the guest in and add one. If both of them are full, then print that.
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

    //There is a guest that wants to check out. We check if they are in room 1 and if they are, then we make room 1's assignment empty and decrease the guest total.
    //Do the same again for guest Two. If both of them don't have the guest's information, then we tell them they never check into the hotel.
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
    
    //Just return the guest_total. The variable was being increased as guests checked in and decreased as guests checked out.
    int checkCapacity(){
        return guest_total;
    }

    //If the room is not empty, then print all the guest info. Do that for both rooms. If a room is empty then say that the room is empty.
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
