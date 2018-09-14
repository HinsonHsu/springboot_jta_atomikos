package cn.hinson;

import cn.hinson.config.DBConfig1;
import cn.hinson.config.DBConfig2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Hello world!
 *
 */
@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
