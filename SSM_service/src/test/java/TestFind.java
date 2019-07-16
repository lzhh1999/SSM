import cn.itcast.pojo.Account;
import cn.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFind {
    @Test
    public void findTest() {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("classpath*:applicationContext*.xml");
        AccountService bean = applicationContext.getBean(AccountService.class);
        Account account = bean.findAccountByUsername("bbb");
        System.out.println(account);
    }
}
