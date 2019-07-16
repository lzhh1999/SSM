import cn.itcast.pojo.User;
import cn.itcast.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void testUser() {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("classpath*:applicationContext*.xml");
        UserService bean = applicationContext.getBean(UserService.class);
        User m00001 = bean.findUser("m00001", "123");
        System.out.println(m00001);
    }
}
