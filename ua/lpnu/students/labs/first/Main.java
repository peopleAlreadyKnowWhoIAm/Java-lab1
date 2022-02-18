package ua.lpnu.students.labs.first;

import ua.lpnu.students.labs.first.hotel.*;

public class Main {
    public static void main(String[] args){
        Hotel[] hotelsInLviv = {
            new Hotel(),
            new Hotel("Superiority", 123, "vul. Stepana Bandery, 23"),
            new Hotel("Average choice", 43000, 329, HotelStatus.CHEAP, true, "vul. Stryjska, 234")
        };
        System.out.println("There are " + Hotel.getNumOfHotels() + " in Lviv");
        for (Hotel hotel : hotelsInLviv) {
            System.out.println(hotel);
        }
    }
}
