package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author NCJ
 */
@Controller
@RequestMapping("/Home")
public class HomeController {
    @RequestMapping("/")
    public String Index(){
        return "home/index";
    }
}
