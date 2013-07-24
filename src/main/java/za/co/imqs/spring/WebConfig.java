package za.co.imqs.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created with IntelliJ IDEA.
 * User: GerhardvW
 * Date: 2013/07/19
 * Time: 12:42 PM
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@Configuration
@EnableJpaRepositories(basePackages = "za.co.imqs.hero")
@EnableTransactionManagement
@ComponentScan
public class WebConfig extends WebMvcConfigurationSupport {

}
