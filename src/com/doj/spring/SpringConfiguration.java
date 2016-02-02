package com.doj.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/*
 * @Configuration annotation is used to define java based configuration this works like spring.xml  
 */
@ComponentScan(basePackages={"com.doj.spring"})
//@ComponentScan by default it search component in current package but we can also define another package also like below
//@ComponentScan(basePackages={"com.org"})//can also define more then one package here because this String array type 
public class SpringConfiguration {
	
	/*@Bean(name="car")
	public Car getCar(){
		return new Car();
	}*/
	//<bean id="car" class="com.doj.spring.Car"/>
}
