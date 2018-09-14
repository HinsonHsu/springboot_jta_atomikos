package cn.hinson.controller;

import cn.hinson.test01.service.Service01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private Service01 service01;

    @RequestMapping("/index")
    public String index(){
        service01.addUser1andUser2("user1", 18);
        return "tmp";
    }
}
