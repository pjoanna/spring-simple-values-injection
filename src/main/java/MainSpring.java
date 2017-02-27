import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by pjoanna on 2017-02-20.
 */
public class MainSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configurationSpring.xml");
        UsersRepository usersRepository = context.getBean("usersRepository", UsersRepository.class);
        User asia = usersRepository.createUser("Asiała");
    }
}
