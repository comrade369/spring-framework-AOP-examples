package demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(basePackages = "demo")
@Configuration
@EnableAspectJAutoProxy
public class BeanConfig {
	

}
