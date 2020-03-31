package com.lma.flad.controller;

import com.lma.flad.entity.Hotel;
import com.lma.flad.repository.HotelRepository;
import com.lma.flad.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HotelController {

    @Resource
    private IHotelService hotelService;


    @GetMapping("/addHotel")
    public void addHotel(){
         this.hotelService.addHotel( new Hotel("Marriot", 5, true));

    }
}
