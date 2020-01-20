package com.kcvs.controller;

import com.kcvs.dao.VehicleMapper;
import com.kcvs.domain.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehicleController {
    @Autowired
    VehicleMapper vehicleMapper;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public List<Vehicle> login() {
        List<Vehicle> list = vehicleMapper.findAllVehicle();
        return list;
    }
    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public List<Integer> test1() {
        return vehicleMapper.findAllVehicleId();
    }
}