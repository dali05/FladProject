package com.lma.flad.service.impl;

import com.lma.flad.entity.Hotel;
import com.lma.flad.repository.HotelRepository;
import com.lma.flad.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class HotelServiceImpl implements IHotelService {

    @Resource
    HotelRepository hotelRepository;

    @Override
    public void addHotel(Hotel hotel) {

        this.hotelRepository.save(hotel);
    }
}
