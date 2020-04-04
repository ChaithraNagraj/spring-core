package com.bridgelabz.springaop.telusk;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * this class is used to configure application by using java based
 * configuration which also helps spring framework to creating object
 * ofn the class
 * @Configuration is used to configure the class and make object
 * @Componentscan is used to scan all the claqss with component object of it
 * @author admin
 *
 */
@Configuration
@ComponentScan("com.bridgelabz.springaop.demo")
public class AppConfig {

}
