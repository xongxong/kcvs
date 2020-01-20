package com.kcvs.controller;

import com.kcvs.attribute.PortInfo;
import com.kcvs.dao.PortMapper;
import com.kcvs.dao.PortPlcReadMapper;
import com.kcvs.domain.TransferBak;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class PortController {
    @Autowired
    PortMapper portMapper;
    @Autowired
    PortPlcReadMapper portPlcReadMapper;
    private PortInfo portInfo;

    @RequestMapping(value = "/loginPort", method = RequestMethod.GET)
    public List<TransferBak> login() {
        List<TransferBak> list = portMapper.findAllPort();
        return list;
    }

    @RequestMapping(value = "/plcReader", method = RequestMethod.GET)
    public String updatePlcReader() {
        try {
            String portId = "2CEE01_P02";
            String portNo = "2";
            PortInfo.PlcRdBitData plcRdBitData = PortInfo.getPlcRdBitDataObject();
            portPlcReadMapper.updatePortDataFromPLCBit(portId, plcRdBitData, portNo);
        } catch (DataAccessException e) {
            return "wrong";
        }
        return "success";
    }

    @RequestMapping("/login1")
    public String login1() {
        return "login";
    }
}
