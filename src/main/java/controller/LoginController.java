package controller;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author NCJ
 */
@Controller
@RequestMapping("/Login")
public class LoginController {
    @RequestMapping("/")
    public String login(){
        return "login/login";
    }

    //传值方式1
    /*@RequestMapping("/login")
    public String login(String username,String password,HttpServletRequest request){
        if(username.equals("zz")&&password.equals("888")) {
            request.setAttribute("username", username);
            request.setAttribute("password", password);
            return "login/welcome";
        }
        else {
            request.setAttribute("errorMsg", "用户名或密码不正确");
            return "login/login";
        }
    }*/

    //传值方式2
    /*@RequestMapping("/login")
    public String login(User user , HttpSession httpSession){
        httpSession.setAttribute("user",user);
        return "login/welcome";
    }*/

    //model传值

    @RequestMapping("/login")
    public String login(User user, Model model){
        model.addAttribute("user",user);
        return "login/welcome";
    }

    @RequestMapping("/test")
    public String test(){
        return "login/test";
    }
    @RequestMapping("/CheckUsername")
    @ResponseBody
    public String checkUsername (String username){
        System.out.println(username);
        if (username.equals("ncj")){
            return "OK";
        }
        return "NO";
    }

    @RequestMapping("/getAllUsers")
    @ResponseBody
    public List<User> getAllUsers(){
        List<User> lst = new ArrayList<User>();
        User u1=new User();
        u1.setId(1);
        u1.setUsername("张老师");
        u1.setPassword("zz");
        lst.add(u1);
        User u2=new User();
        u2.setId(2);
        u2.setUsername("刘老师");
        u2.setPassword("qq");
        lst.add(u2);
        return lst;
    }
}
