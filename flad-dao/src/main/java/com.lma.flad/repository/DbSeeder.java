//package com.lma.flad.repository;
//
//import com.lma.flad.entity.Hotel;
//import com.lma.flad.repository.HotelRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class DbSeeder implements CommandLineRunner {
//    private HotelRepository hotelRepository;
//
//    public DbSeeder(HotelRepository hotelRepository){
//        this.hotelRepository = hotelRepository;
//    }
//
//    @Override
//    public void run(String... strings) throws Exception {
//        Hotel marriot = new Hotel("Marriot", 5, true);
//        Hotel ibis = new Hotel("Ibis", 3, false);
//        Hotel goldenTulip = new Hotel("Golden Tulip", 4, true);
//
//        List<Hotel> hotels = new ArrayList<>();
//        hotels.add(marriot);
//        hotels.add(ibis);
//        hotels.add(goldenTulip);
//
//        this.hotelRepository.save(hotels);
//    }
//}
