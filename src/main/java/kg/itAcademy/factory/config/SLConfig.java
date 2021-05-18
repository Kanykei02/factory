package kg.itAcademy.factory.config;

import kg.itAcademy.factory.service.BookRegistry;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SLConfig {
    @Bean
    public FactoryBean<?> getBean() {
        ServiceLocatorFactoryBean bean = new ServiceLocatorFactoryBean();
        bean.setServiceLocatorInterface(BookRegistry.class);
        return bean;
    }
}
