package cn.itcast.controller;

import cn.itcast.pojo.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/findAccountByUsername")
    public String findAccountByUsername(String username, Model model) {
        Account account = accountService.findAccountByUsername(username);
        System.out.println(account);
        if (account != null) {
            model.addAttribute("msg", account);
            return "index";
        }
        model.addAttribute("msg", "用户不存在，请重新查询");
        return "index";
    }

    //添加用户
    @RequestMapping("/addAccount")
    public String addAccount(Account account, Model model) {
        Account account1 = new Account();
        String username = account.getUsername();
        Double balance = account.getBalance();
        account1.setUsername(username);
        account1.setBalance(balance);
        System.out.println("username=" + username);
        System.out.println("balance=" + balance);
        try {
            accountService.addAccount(account1);
            model.addAttribute("msg", "成功插入数据");
            return "index";
        } catch (Exception e) {
            model.addAttribute("msg", "客户已存在请重新输入");
            return "index";
        }
    }

    //删除用户
    @RequestMapping("/deteleAccount")
    public String deteleAccount(String username, Model model) {
        Account account = accountService.findAccountByUsername(username);
        if (account != null) {
            accountService.deteleAccount(username);
            System.out.println("username" + username);
            model.addAttribute("msg", "成功删除数据");
            return "index";
        }
        model.addAttribute("msg", "用户不存在");
        return "index";
    }


}
