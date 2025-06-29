package org.example.demo02.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/home/test")
    public String Test(){
        return "test";
    }
}
