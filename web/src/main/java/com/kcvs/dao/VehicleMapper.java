package com.kcvs.dao;

import com.kcvs.domain.Vehicle;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper  //声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
@Repository
public interface VehicleMapper {
    List<Vehicle> findAllVehicle();
    List<Integer> findAllVehicleId();
}
