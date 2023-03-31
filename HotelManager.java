package ua.lviv.iot.algo.part1.lab1;

import java.util.ArrayList;
import java.util.List;

public class HotelManager {

    public static void main(String[] args) {

        List<Hotel> hotels = new ArrayList<>();
        hotels.add(new ResortHotel("Eurohotel",50 ,50,4,0,3,1,2,"Beach Resort"));
        hotels.add(new Motel("Highway Motel", 23, 23, 3, 0,"E61", 540,"Lviv","Kyiv"));

        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }
    }
}