package MapperTest;

import cn.itcast.dao.UserMapper;
import cn.itcast.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void userTest() {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("classpath:applicationContext-dao.xml");
        UserMapper bean = applicationContext.getBean(UserMapper.class);
        User ooo = bean.findUser("m00001", "123");
        System.out.println(ooo);
    }
}
