package com.kcvs.dao;

import com.kcvs.attribute.PortInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PortPlcReadMapper {
    void updatePortDataFromPLCBit(@Param("portId") String portId, @Param("plcRdBitData") PortInfo.PlcRdBitData plcRdBitData, @Param("portNo") String portNo)
            throws DataAccessException;
}
