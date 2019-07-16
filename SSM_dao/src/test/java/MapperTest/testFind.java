package MapperTest;

import cn.itcast.dao.AccountMapper;
import cn.itcast.pojo.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testFind {
    @Test
    public void find() {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("classpath:applicationContext-dao.xml");
        AccountMapper bean = applicationContext.getBean(AccountMapper.class);
        Account account = bean.findAccountByUsername("bbb");
        System.out.println(account);
//        bean.deteleAccount("aaa");
//        Account account1 = new Account();
//        account1.setUsername("bbb");
//        account1.setBalance((double) 123);
//        bean.addAccount(account1);
    }
}
