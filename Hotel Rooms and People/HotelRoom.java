public class HotelRoom {
    int roomNumber;
    int guestTotal = 0;
    Person guestOne;
    Person guestTwo;

    HotelRoom(int roomNum){
        roomNumber = roomNum;

    }

    void checkIn(Person guest){
        if(guestTotal < 2){
            
            if(guestOne == null){
                guestOne = guest;
                System.out.println(guestOne + " has checked into Room 1");
                guestTotal++;
            }
            
            else {
                
                if(guestTwo == null){
                    guestTwo = guest;
                    System.out.println(guestTwo + " has checked into Room 2");
                    guestTotal++;
                }
                
                else {
                    System.out.print("The Hotel is Full");
                }
            }
        }
    }

    void checkOut(Person guest){
        if(guest == guestOne){
            guestOne = null;
            guestTotal--;
        }

        else {
            if(guest == guestTwo){
                guestTwo = null;
                guestTotal--;
            }
            
            else {
                System.out.print("This person isn't in the hotel!");
            }
        }

    }

    int checkCapacity(){
        return guestTotal;
    }

    void printGuestInfo(){
        if(guestOne != null){
            System.out.println("Guest One Info");
            System.out.println("__________________)");
            System.out.println(guestOne.height);
            System.out.println(guestOne.age);
            System.out.println(guestOne.name);
            System.out.println(guestOne.hairColor);
        }
        else{
            System.out.println("Room One is Open");
        }

        if(guestTwo != null){
            System.out.println("Guest Two Info");
            System.out.println("__________________)");
            System.out.println(guestTwo.height);
            System.out.println(guestTwo.age);
            System.out.println(guestTwo.name);
            System.out.println(guestTwo.hairColor);
        }
        else{
            System.out.println("Room Two is Open");
        }
    }

}
