package com.chloneda.controller;

import com.chloneda.service.DataProcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Created by chloneda
 * @Description:
 */
@RestController
public class DataProcController {
    
    @Autowired
    private DataProcService dataProcService;

    @RequestMapping(value = "/doQuery",method = RequestMethod.GET)
    public List doQuery(String sql){
        return  dataProcService.doQuery(sql);
    }
    
}