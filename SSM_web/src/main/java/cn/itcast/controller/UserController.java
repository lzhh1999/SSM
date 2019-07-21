package cn.itcast.controller;

import cn.itcast.pojo.User;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/Account")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    //用户登录
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password, Model model, HttpSession session) {
        User user = userService.findUser(username, password);
        if (user != null) {
            session.setAttribute("USER_SESSION", user);
            return "index";
        }
        model.addAttribute("msg", "用户或密码错误,请重新输入");
        return "login";
    }

    //退出登录
    @RequestMapping(value = "/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "login";
    }

    //注册
    @RequestMapping("/toregister")
    public String toregister() {
        return "register";
    }

    @RequestMapping("/register")
    public String register(User user, Model model) {
        User user1 = new User();
        String username = user.getUsername();
        String password = user.getPassword();
        user1.setUsername(username);
        user1.setPassword(password);
        System.out.println(username);
        System.out.println(password);
        try {
            userService.addUser(user1);
            model.addAttribute("msg", "注册成功请登录");
            return "success";
        } catch (Exception e) {
            model.addAttribute("msg", "用户名已存在");
            return "register";
        }
    }
}
