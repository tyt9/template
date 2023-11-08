package com.parfait.icecreamupgraded.controller;

import com.parfait.icecreamupgraded.dao.IcecreamDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IcecreamController {

    @Autowired
    private IcecreamDao icecreamDao;

    @GetMapping("/index")
    public void index(){
        System.out.println(icecreamDao.test());
    }
}
