import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.model.Harddisk;

public class ComputerTest {

    public static void main(String[] args) {
        // Load Spring context from XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Get the Harddisk bean
        Harddisk disk = (Harddisk) context.getBean("hardDisk", Harddisk.class);
        System.out.println(disk);
    }
}
